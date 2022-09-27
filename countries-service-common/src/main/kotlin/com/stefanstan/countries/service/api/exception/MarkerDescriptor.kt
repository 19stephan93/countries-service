package com.stefanstan.countries.service.api.exception

import org.springframework.http.HttpStatus

@Suppress("MagicNumber", "MaxLineLength")
enum class MarkerDescriptor(
    val httpStatus: HttpStatus,
    val reason: String
) {
    UNHANDLED_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error."),
    NOT_IMPLEMENTED_ERROR(HttpStatus.NOT_IMPLEMENTED, "Operation not implemented."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected error in application"),
    INVALID_INPUT_ERROR(HttpStatus.BAD_REQUEST, "Input is invalid."),

    HTTP_GATEWAY_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected error when calling external service"),
    HTTP_GATEWAY_INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error in external service"),
    HTTP_SERVER_CONTRACT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Invalid payload received from an external service"),
    UNKNOWN_STATE_ERROR(HttpStatus.NOT_FOUND, "Request couldn't be mapped to a resource state"),
    HTTP_CLIENT_CONTRACT_ERROR(HttpStatus.BAD_REQUEST, "Invalid payload send to an external service"),

    LOG_MESSAGE_LOST(HttpStatus.INTERNAL_SERVER_ERROR, "Log message was lost"),
}
