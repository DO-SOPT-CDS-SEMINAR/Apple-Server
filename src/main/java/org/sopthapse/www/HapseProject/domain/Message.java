package org.sopthapse.www.HapseProject.domain;

public record Message(
        boolean success,
        String msg,
        Object data
) {
    public static Message of(boolean success, String msg, Object data) {
        return new Message(success, msg, data);
    }
}