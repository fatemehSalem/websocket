package com.example.websocket.controller;
import com.example.websocket.entity.Message;
import com.example.websocket.entity.PreMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
@Controller
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/preMessage")
    public PreMessage messaging(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        PreMessage preMessage = new PreMessage();
        preMessage.setContent(message.getMessage());
        return  preMessage;
       // return new PreMessage("Hello, " + HtmlUtils.htmlEscape(message.getMessage()) + "!");
    }
}
