package com.backend.ecommerce.Core.ErrorHandling.RuntimeExceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EmptyAreaException extends RuntimeException{
    private final int statusCode;
    private final String message;
}