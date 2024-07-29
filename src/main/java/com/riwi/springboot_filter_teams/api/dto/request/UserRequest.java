package com.riwi.springboot_filter_teams.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @Schema(description = "Name of the User", example = "Jairo")
    @NotBlank(message = "The user name is required")
    private String name;

    @Schema(description = "lastname of the User", example = "Perez Otoniel")
    @NotBlank(message = "The user lastname is required")
    private String password;

    @Schema(description = "Email of the User", example = "JairoPerez@correo.com")
    @NotBlank(message = "The user email is required")
    private String email;
    
    @Schema(description = "Phone of the User", example = "310-000-0000")
    @NotBlank(message = "The user phone is required")
    private String phone;

    
}
