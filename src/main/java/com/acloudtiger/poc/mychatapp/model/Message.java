package com.acloudtiger.poc.mychatapp.model;

public class Message {

    private String content;
    private String sender;
    private MessageType type;

    public Message() {
    }

    public Message(String content, String sender, MessageType type) {
        this.content = content;
        this.sender = sender;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }
}
