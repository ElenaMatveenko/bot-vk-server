package ru.justai.task.request.sending;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import ru.justai.task.config.BotConfig;
import ru.justai.task.request.sending.parameters.QuoteRequestParametersSet;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class UriGenerator {

    private final BotConfig botConfig;

    public URI generateMessageResponseUri(QuoteRequestParametersSet requestParameters, String method) {
        return UriComponentsBuilder.fromHttpUrl("https://api.vk.com/method/" + method)
                .queryParam("access_token", botConfig.getToken())
                .queryParam("v", botConfig.getVersion())
                .queryParams(requestParameters.toMultiValueMap())
                .build()
                .toUri();
    }
}
