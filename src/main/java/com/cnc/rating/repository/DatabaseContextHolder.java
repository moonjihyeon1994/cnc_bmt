package com.cnc.rating.repository;

import org.springframework.util.Assert;

public class DatabaseContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setCurrentDb(DatabaseType databaseType) {
        Assert.notNull(databaseType, "cannot be null");
        contextHolder.set(databaseType);
    }

    public static DatabaseType getCurrentDb() {
        return contextHolder.get();
    }

    public static void clear() {
        contextHolder.remove();
    }

}
