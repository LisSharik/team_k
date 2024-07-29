package com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services;

public interface IUpdateService<RQ, RS, ID> {
    public RS update(ID id, RQ rq);
}
