package com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services;

public interface IGetByIdService<RS, ID> {
    public RS getById(ID id);
}

