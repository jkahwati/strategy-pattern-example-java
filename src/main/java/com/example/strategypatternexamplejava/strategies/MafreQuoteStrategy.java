package com.example.strategypatternexamplejava.strategies;

public class MafreQuoteStrategy implements QuoteStrategy {

    @Override
    public float calculate() {
        return 25;
    }
    

}