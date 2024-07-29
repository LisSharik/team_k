package com.riwi.springboot_filter_teams.api.dto.response.basics_responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class UserBasicResponse {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String Phone;
}
