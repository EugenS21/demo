package com.skeleton.ui.core.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Storage {

    public static Storage storageInstance;

    public static Storage getStorage() {
        if (Objects.isNull(storageInstance)) {
            storageInstance = new Storage();
        }
        return storageInstance;
    }

    Map<StorageKey, Object> storage;

    private Storage() {
        storage = new HashMap<>();
    }

    public void add(StorageKey storageKey, Object object) {
        storage.put(storageKey, object);
    }

    public Object get(StorageKey storageKey) {
        return storage.get(storageKey);
    }

    public <T> T getAndCast(StorageKey storageKey, Class<T> clazz) {
        return clazz.cast(storage.get(storageKey));
    }

}
