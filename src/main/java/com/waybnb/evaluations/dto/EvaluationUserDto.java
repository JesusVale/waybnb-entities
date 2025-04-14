package com.waybnb.evaluations.dto;

import com.waybnb.users.entities.User;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EvaluationUserDto {

    @NotNull(message = "Evaluator can not be a null")
    private User evaluator;

    @NotNull(message = "Evaluated can not be a null")
    private User evaluated;

    @Min(value = 1, message = "The score can't be less than 1")
    @Max(value = 5, message = "The score can't be greater than 5")
    private Float score;

    @NotBlank(message = "Comment can not be null or empty")
    private String comment;

}
