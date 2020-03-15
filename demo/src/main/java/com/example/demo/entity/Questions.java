package com.example.demo.entity;


import lombok.Data;

import java.util.List;

/**
 * @author wlm
 */
@Data
public class Questions {

    private String student_id;
    private String shijuan_id;
    private List<Answer> questionList;


}
