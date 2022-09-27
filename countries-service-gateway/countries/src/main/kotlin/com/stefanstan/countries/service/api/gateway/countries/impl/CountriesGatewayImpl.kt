package com.stefanstan.countries.service.api.gateway.countries.impl

import com.stefanstan.countries.service.api.gateway.countries.CountriesGateway
import com.stefanstan.countries.service.api.gateway.countries.client.CountryClient
import com.stefanstan.countries.service.api.integration.v1.dto.CountryDto
import org.springframework.stereotype.Service
import java.util.Locale


@Service
internal class CountriesGatewayImpl(
    val countryClient: CountryClient
): CountriesGateway {
    override fun getCountries(): Map<String, CountryDto> {
        val result = mutableMapOf<String, CountryDto>()
        countryClient.getCountries().forEach {
            val symbol = it.symbol.uppercase(Locale.getDefault())
            result[symbol] = CountryDto(
                name = it.name.official,
                symbol = symbol,
                borders = it.borders
            )
        }
        return result
    }
}
