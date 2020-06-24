package com.example.strategypatternexamplejava.context;

import com.example.strategypatternexamplejava.strategies.MafreQuoteStrategy;
import com.example.strategypatternexamplejava.strategies.QuoteStrategy;
import com.example.strategypatternexamplejava.strategies.ZenitQuoteStrategy;

public class QuoteContext {

    private QuoteStrategy quoteStrategy;

    public QuoteContext(String strategy) {
        switch (strategy) {
            case "ZENIT":
                this.quoteStrategy = new ZenitQuoteStrategy();
                break;
            case "MAFRE":
                this.quoteStrategy = new MafreQuoteStrategy();
                break;
            default:
                this.quoteStrategy = new ZenitQuoteStrategy();
                break;
        }
    }

    public float calculate () {
        return this.quoteStrategy.calculate();
    }
    
}