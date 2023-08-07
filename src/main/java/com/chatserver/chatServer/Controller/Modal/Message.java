package com.chatserver.chatServer.Controller.Modal;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String recieverName;
    private String message;
    private String date;
    private Status status;
}
