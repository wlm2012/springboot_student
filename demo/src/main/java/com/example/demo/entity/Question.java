package com.example.demo.entity;


import lombok.Data;

/**
 * @author wlm
 */
@Data
public class Question {
    private String id;
    private String question;
    private String[] answers;
}
