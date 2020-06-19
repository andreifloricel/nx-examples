package com.bmw.ptad.io;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.Collections;
import java.util.Map;

public class PostgresResource implements QuarkusTestResourceLifecycleManager {

    private PostgreSQLContainer db;

    @Override
    public Map<String, String> start() {
        this.db = new PostgreSQLContainer<>("postgres:11-alpine")
                .withDatabaseName("md_elements")
                .withUsername("postgres")
                .withPassword("postgres")
                .withExposedPorts(5432);

        this.db.start();

        return Collections.emptyMap();
    }

    @Override
    public void stop() {
        if (this.db != null) {
            this.db.stop();
        }
    }
}
