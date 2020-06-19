package com.bmw.ptad.io.control;

import com.bmw.ptad.io.PostgresResource;
import com.bmw.ptad.openapi.model.MDDataModelUploadRequest;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@QuarkusTest
@QuarkusTestResource(PostgresResource.class)
public class UploadServiceTest {
    @Inject
    private UploadService uploadService;

    @Test
    public void testUploadNull() {
        MDDataModelUploadRequest request = null;
        assertNotNull(this.uploadService);
        Exception exception = assertThrows(NullPointerException.class, () -> {
            this.uploadService.upload(request);
        });
    }

}
