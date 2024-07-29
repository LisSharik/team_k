package com.riwi.springboot_filter_teams.infrastructure.services;

import com.riwi.springboot_filter_teams.api.dto.request.ProductRequest;
import com.riwi.springboot_filter_teams.api.dto.response.ProductResponse;
import com.riwi.springboot_filter_teams.infrastructure.abstract_services.IProductService;

public class ProductService implements IProductService{

    @Override
    public ProductResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public ProductResponse create(ProductRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ProductResponse update(Long id, ProductRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
