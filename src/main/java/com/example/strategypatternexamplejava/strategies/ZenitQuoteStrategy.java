package com.example.strategypatternexamplejava.strategies;

public class ZenitQuoteStrategy implements QuoteStrategy {

    @Override
    public float calculate() {
        return 40;
    }
    
}