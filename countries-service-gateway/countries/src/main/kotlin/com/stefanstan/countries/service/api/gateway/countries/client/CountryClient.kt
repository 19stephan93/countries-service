package com.stefanstan.countries.service.api.gateway.countries.client

import com.stefanstan.countries.service.api.gateway.countries.dto.CountryResponseDto

interface CountryClient {
    fun getCountries(): List<CountryResponseDto>
}
