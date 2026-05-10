package com.ayan.chatapp.controller;
import com.ayan.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

// For HTTP GET requests
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // HTTP REQUEST HANDLERS

    // Join page
    // URL: /
    @GetMapping("/")
    public String joinPage(){
        return "join";
    }

    // Chat page
    // URL: /chat
    @GetMapping("/chat")
    public String chatPage(){
        return "chat";
    }

    // WEBSOCKET MESSAGE HANDLERS

    // Handle chat messages
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    // NOTIFICATION SYSTEM

    // Handle notifications
    @MessageMapping("/notification")
    @SendTo("/topic/notifications")
    public String notification(String message){
        return message;
    }

}