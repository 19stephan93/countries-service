package com.stefanstan.countries.service.api.exception

open class CountryServiceException(message: String, var markerDescriptor: MarkerDescriptor, cause: Throwable? = null) :
    RuntimeException(message, CountryServiceCauseExceptionWrapper(message, cause))

open class CountryServiceCauseExceptionWrapper(message: String, cause: Throwable? = null) :
    RuntimeException(message, cause)
