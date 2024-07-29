package com.riwi.springboot_filter_teams.infrastructure.abstract_services;

import com.riwi.springboot_filter_teams.api.dto.request.UserRequest;
import com.riwi.springboot_filter_teams.api.dto.response.UserResponse;
import com.riwi.springboot_filter_teams.infrastructure.abstract_services.basic_abstract_services.ICreateService;
import com.riwi.springboot_filter_teams.infrastructure.abstract_services.basic_abstract_services.IGetByIdService;

public interface IUserService extends ICreateService<UserRequest, UserResponse>, IGetByIdService<UserResponse, Long> {
    
}
