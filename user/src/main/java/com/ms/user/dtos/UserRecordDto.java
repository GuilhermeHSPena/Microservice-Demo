package com.ms.user.dtos;

import jakarta.validation.constraints.Email; //Email validation
import jakarta.validation.constraints.NotBlank; //Not null

public record UserRecordDto(@NotBlank String name,
                            @NotBlank @Email String email) {
}