package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Message {

    String message;

    LocalDateTime timestamp;
    public Message(String message) {

        this.message = message;
        timestamp = LocalDateTime.now();

    }
}
