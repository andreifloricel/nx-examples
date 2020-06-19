package com.bmw.ptad.io.boundary;

import com.bmw.ptad.io.PostgresResource;
import com.bmw.ptad.openapi.model.MDDataModelUploadResponse;
import io.quarkus.launcher.shaded.org.apache.http.HttpStatus;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@QuarkusTest
@QuarkusTestResource(PostgresResource.class)
public class UploadResourceTest {

    @Test
    public void testPOSTUploadEndpointWoApplicationJsonHeader() {
        given()
                .when().post("/upload")
                .then()
                .statusCode(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
    }

    @Test
    public void testPOSTUploadEndpointWoBody() {
        given()
                .contentType("application/json")
                .when().post("/upload")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testPOSTUploadEndpoint() {
        MDDataModelUploadResponse response = given()
                .contentType("application/json")
                .body("{\"packages\":[], \"classes\":[], \"properties\":[], \"enumerations\":[], \"associations\":[]}")
                .when().post("/upload")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(MDDataModelUploadResponse.class);

        assertNotNull(response);
        assertEquals(UploadResource.MESSAGE_OK, response.getMessage());
    }
}
