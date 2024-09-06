package com.ms.user.DTO;

import java.util.UUID;

public class EmailDTO {
    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailTo() {
        return this.emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }    
}
