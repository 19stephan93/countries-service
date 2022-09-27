package com.stefanstan.countries.service.api.service

interface CountriesService {
    fun getRoute(origin: String, destination: String): List<String>
}
