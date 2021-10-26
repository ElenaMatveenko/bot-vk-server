package ru.justai.task.controller;


import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.justai.task.request.RequestHandler;
import ru.justai.task.request.receiving.BaseRequest;

@RestController
@RequestMapping("/callback")
@RequiredArgsConstructor
public class BotController {

    Logger logger = LoggerFactory.getLogger(BotController.class);
    private final RequestHandler handler;

    @PostMapping()
    public ResponseEntity<String> handleRequest(@RequestBody BaseRequest request) {
        logger.info("Got request " + request);
        return handler.handleBotRequest(request);
    }
}