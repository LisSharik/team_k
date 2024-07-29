package com.riwi.springboot_filter_teams.infrastructure.abstract_services;

import com.riwi.springboot_filter_teams.api.dto.request.ProductRequest;
import com.riwi.springboot_filter_teams.api.dto.response.ProductResponse;
import com.riwi.springboot_filter_teams.infrastructure.abstract_services.basic_abstract_services.IBasicCrudService;

public interface IProductService extends IBasicCrudService<ProductRequest, ProductResponse, ProductResponse, Long>{

}
