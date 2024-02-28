package com.websocket.websocketdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//谁给谁发消息
public class Message {
    private String toName;
    private String message;
    private String fromName;
}
