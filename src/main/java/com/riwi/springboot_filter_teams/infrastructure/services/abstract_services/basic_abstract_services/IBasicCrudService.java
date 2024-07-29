package com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services;

public interface IBasicCrudService<RQ, RS, RBS, ID> extends
        IGetByIdService<RS, ID>,
        ICreateService<RQ, RBS>,
        IUpdateService<RQ, RS, ID>,
        IDeleteService<ID> {

}
