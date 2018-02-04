package br.com.udemy.gof.creational.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CacheStorageTest {

    private static CacheStorage cacheStorage;

    @Before
    public void setup() {
        cacheStorage = CacheStorage.getInstance();
    }


    @Test
    public void addStartupCacheItem(){
        cacheStorage.addItem("startup", "fast");
        Assert.assertEquals(1, cacheStorage.getCacheItems().size());
        Assert.assertTrue(cacheStorage.getItem("startup").equals("fast"));
    }

    @Test
    public void addModeCacheItem() {
        cacheStorage.addItem("mode", "key-value");
        Assert.assertEquals(2, cacheStorage.getCacheItems().size());
        Assert.assertTrue(cacheStorage.getItem("startup").equals("fast"));
    }
}
