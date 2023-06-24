package com.niraj.app.service;

public interface MessageSender {
    void sendMessage(String number, String message) throws Exception;
}
