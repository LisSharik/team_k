package com.riwi.springboot_filter_teams.infrastructure.abstract_services.basic_abstract_services;

public interface ICreateService<RQ, RS> {
    public RS create(RQ rq);
    
}
