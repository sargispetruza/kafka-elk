package com.poc.kafkaelasticsearch.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PrimeNumber extends AbstractDto{

    private long primeNumber;
}