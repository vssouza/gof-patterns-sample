package br.com.udemy.gof.creational.singleton;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CacheStorage {

    private Map<String, String> storage;
    private static CacheStorage cacheStorage;

    private CacheStorage() {
        storage = new HashMap<String, String>();
    }

    public static CacheStorage getInstance(){
        if(cacheStorage == null) {
            cacheStorage = new CacheStorage();
        }
        return cacheStorage;
    }

    public void addItem(String key, String value) {
        storage.put(key, value);
    }

    public void removeItem(String key) {
        storage.remove(key);
    }

    public final String getItem(String key) {
        return storage.get(key);
    }

    public final Map<String, String> getCacheItems() {
        return Collections.unmodifiableMap(storage);
    }
}
