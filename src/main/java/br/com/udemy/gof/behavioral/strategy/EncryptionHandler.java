package br.com.udemy.gof.behavioral.strategy;

import br.com.udemy.gof.behavioral.strategy.concrete.RSAStrategy;

public class EncryptionHandler {
    private AlgorithmStrategy encryptionAlgorithm;

    public EncryptionHandler() {
        this.encryptionAlgorithm = new RSAStrategy();
    }

    public EncryptionHandler(final AlgorithmStrategy encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(final AlgorithmStrategy algorithmStrategy) {
        this.encryptionAlgorithm = algorithmStrategy;
    }

    public String encryptContent(String contentToEncrypt) {;
        return contentToEncrypt + " encrypted with " + encryptionAlgorithm.encrypt(contentToEncrypt);
    }
}
