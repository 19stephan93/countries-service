package com.stefanstan.countries.service.api.gateway.countries.client

import com.stefanstan.countries.service.api.gateway.countries.config.CountryClientFeignConfig
import com.stefanstan.countries.service.api.gateway.countries.dto.CountryResponseDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

// I could have simply downloaded the json file and loaded from resources, but decided to get it instead from URL
@FeignClient(value = "countries", url = "https://raw.githubusercontent.com/", configuration = [CountryClientFeignConfig::class])
internal interface CountryClient {
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/mledoze/countries/master/countries.json"]
    )
    fun getCountries(): List<CountryResponseDto>
}
