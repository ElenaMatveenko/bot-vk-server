package ru.justai.task.request;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.justai.task.config.BotConfig;
import ru.justai.task.request.receiving.BaseRequest;
import ru.justai.task.request.sending.SenderRequest;
import ru.justai.task.request.sending.parameters.QuoteRequestParametersSet;

import java.security.InvalidParameterException;

@Service
@RequiredArgsConstructor
public class RequestHandler {
    private final BotConfig configProperties;
    private final SenderRequest<QuoteRequestParametersSet> senderRequest;

    public ResponseEntity<String> handleBotRequest(BaseRequest request) {
        ResponseEntity<String> response;

        String typeRequest = request.getType();
        switch (typeRequest){
            case "confirmation":
                response = new ResponseEntity<>(configProperties.getConfirmation(), HttpStatus.OK);
                break;
            case "message_new":
                response = new ResponseEntity<>("ok", HttpStatus.OK);
                validateSecret(request);
                handleNewMessage(request);
                break;
            default:
                response = new ResponseEntity<>("Request type does not support", HttpStatus.BAD_REQUEST);
                break;
        }

        return response;
    }

    private void validateSecret(BaseRequest request) {
        if (!configProperties.getSecret().equals(request.getSecret())) {
            throw new InvalidParameterException("Invalid secret value");
        }
    }

    private void handleNewMessage(BaseRequest request) {
        QuoteRequestParametersSet parametersSet = new QuoteRequestParametersSet();
        parametersSet.setPeerId(request.getObject().getMessage().getPeerId());
        parametersSet.setGroupId(request.getGroupId());
        parametersSet.setMessage("Вы сказали: ".concat(request.getObject().getMessage().getText()));

        senderRequest.send(parametersSet);
    }
}
