package org.max;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TenDaysTest extends AccuweatherAbstractTest {

    @Test
    void getTenDays_shoulReturn401() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 287606)
                .when()
                .get(getBaseUrl()+"/forecatsts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }
}
