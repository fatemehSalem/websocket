package com.example.websocket.entity;

public class PreMessage {
    private String content;

    public PreMessage(){
    }
 public PreMessage(String content){
     this.content=content;
 }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
