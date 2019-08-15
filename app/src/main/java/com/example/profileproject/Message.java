package com.example.profileproject;

public class Message {
    private String name;
    private int avatar;
    private String message;
    private String time;
    private int id;

    public Message(String name, int avatar, String message, String time) {
        this.name = name;
        this.avatar = avatar;
        this.message = message;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }
}
