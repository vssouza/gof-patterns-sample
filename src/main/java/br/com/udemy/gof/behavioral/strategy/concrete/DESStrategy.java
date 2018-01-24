package br.com.udemy.gof.behavioral.strategy.concrete;

import br.com.udemy.gof.behavioral.strategy.AlgorithmStrategy;

public class DESStrategy implements AlgorithmStrategy {
    public String encrypt(String content) {
        return "DES";
    }
}
