package com.example.michat.dto;

public record ChatMessage(String senderId, String receiverId, String content) {
}
