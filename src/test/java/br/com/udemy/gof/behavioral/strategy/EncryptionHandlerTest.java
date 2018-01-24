package br.com.udemy.gof.behavioral.strategy;

import br.com.udemy.gof.behavioral.strategy.concrete.DESStrategy;
import br.com.udemy.gof.behavioral.strategy.concrete.RC4Strategy;
import br.com.udemy.gof.behavioral.strategy.concrete.RSAStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncryptionHandlerTest {

    private AlgorithmStrategy algorithmStrategy;
    private EncryptionHandler encryptionHandler;

    @Before
    public void setup(){
        encryptionHandler = new EncryptionHandler();
    }

    @Test
    public void testDefaultEncryption() {
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with RSA"));
    }

    @Test
    public void testRC4Encryption() {
        encryptionHandler.setEncryptionAlgorithm(new RC4Strategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with RC4"));
    }

    @Test
    public void testDESEncryption() {
        encryptionHandler.setEncryptionAlgorithm(new DESStrategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with DES"));
    }

    @Test
    public void testRSAEncryption() {
        encryptionHandler.setEncryptionAlgorithm(new RSAStrategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with RSA"));
    }

    @Test
    public void testAlgorithmRuntimeSelection() {
        encryptionHandler.setEncryptionAlgorithm(new RC4Strategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with RC4"));
        encryptionHandler.setEncryptionAlgorithm(new DESStrategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with DES"));
        encryptionHandler.setEncryptionAlgorithm(new RSAStrategy());
        Assert.assertTrue(encryptionHandler.encryptContent("Secret").equals("Secret encrypted with RSA"));

    }
}
