package br.com.udemy.gof.behavioral.strategy.concrete;

import br.com.udemy.gof.behavioral.strategy.AlgorithmStrategy;

public class RC4Strategy implements AlgorithmStrategy {
    public String encrypt(String content) {
        return "RC4";
    }
}
