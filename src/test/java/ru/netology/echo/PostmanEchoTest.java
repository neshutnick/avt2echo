package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnSentData() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some body")
        // Выполняемые действия
        .when()
                .post("/post")
        // Проверки
        .then()
                .statusCode(200)
                .body("data", equalTo("some body"));
    }
} 