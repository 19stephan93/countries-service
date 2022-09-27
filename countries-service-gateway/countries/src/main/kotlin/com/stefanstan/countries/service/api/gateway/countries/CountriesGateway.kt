package com.stefanstan.countries.service.api.gateway.countries

import com.stefanstan.countries.service.api.integration.v1.dto.CountryDto


interface CountriesGateway {
    fun getCountries(): Map<String, CountryDto>
}
