// Model class for chat messages
package com.ayan.chatapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private long id;
    private String sender;
    private String content;
}
