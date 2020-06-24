package com.example.strategypatternexamplejava;

import com.example.strategypatternexamplejava.context.QuoteContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternExampleJavaApplication {

	public static void main(String[] args) {

		
		QuoteContext mafreQuote = new QuoteContext("MAFRE");
		System.out.println("Seguro de vida en Mafre cuesta: " + mafreQuote.calculate());

		QuoteContext zenitQuote = new QuoteContext("ZENIT");
		System.out.println("Seguro de vida en Zenit cuesta: " + zenitQuote.calculate());
		
		
	}

}
