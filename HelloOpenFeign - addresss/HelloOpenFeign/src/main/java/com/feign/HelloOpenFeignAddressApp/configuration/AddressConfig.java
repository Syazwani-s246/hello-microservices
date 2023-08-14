package com.feign.HelloOpenFeignAddressApp.configuration;

//import.com.feign.HelloOpenFeignAddressApp.AddressService;
import com.feign.HelloOpenFeignAddressApp.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}