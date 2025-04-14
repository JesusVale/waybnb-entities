package com.waybnb.evaluations.dto;

import com.waybnb.users.dto.UserNameDto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EvaluationUserDataDto {

    private Integer evaluationUserId;

    private UserNameDto evaluator;

    private Integer evaluated;

    private LocalDate date;

    private Float score;

    private String comment;

}
