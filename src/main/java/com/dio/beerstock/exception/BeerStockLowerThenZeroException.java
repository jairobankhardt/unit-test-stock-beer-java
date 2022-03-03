package com.dio.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLowerThenZeroException extends Exception {

    public BeerStockLowerThenZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed are lower then zero: %s", id, quantityToDecrement));
    }
}
