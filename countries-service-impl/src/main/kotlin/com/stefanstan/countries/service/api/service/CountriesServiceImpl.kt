package com.stefanstan.countries.service.api.service

import com.stefanstan.countries.service.api.gateway.countries.CountriesGateway
import org.springframework.stereotype.Service

@Service
internal class CountriesServiceImpl(
    val countriesGateway: CountriesGateway
): CountriesService {
    override fun getRoute(origin: String, destination: String): List<String> {
        val countriesMap = countriesGateway.getCountries()

        return listOf("ROU", "UKR")
    }
}