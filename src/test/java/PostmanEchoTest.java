import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class PostmanEchoTest {

    @Test
    void mustReturnWhatSent() {
        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .body("cat")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("dog"))
        ;

    }
}
