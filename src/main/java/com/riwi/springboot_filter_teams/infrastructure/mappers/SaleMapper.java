package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

import com.riwi.springboot_filter_teams.api.dto.request.SaleRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.SaleBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.Sale;
import com.riwi.springboot_filter_teams.domain.repositories.UserRepository;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class SaleMapper {

    @Autowired
    private UserRepository userRepository;
    
    abstract public SaleBasicResponse entityToBasicResponse(Sale sale);

    @Mappings({
        @Mapping(target = "id", ignore = true)
    })
    public Sale requestToEntity(SaleRequest saleRequest){
        if ( saleRequest == null ) {
            return null;
        }

        Sale sale = new Sale();

        sale.setDate( saleRequest.getDate() );
        sale.setTotalPrice( saleRequest.getTotalPrice() );
        sale.setUser(this.userRepository.findById(saleRequest.getUserId()).orElse(null));

        return sale;
    };
}
