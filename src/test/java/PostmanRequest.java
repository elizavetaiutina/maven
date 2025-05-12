import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.*;

import io.restassured.RestAssured;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


class PostmanRequest {

    @DisplayName("Проверка статуса")
    @Test
    void test() {
        given().baseUri("https://postman-echo.com").when().get("/cookies").then().assertThat().statusCode(200);
    }

    @DisplayName("Проверка GET запроса")
    @Test
    void testGet() {
        given().when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").then().log().body().statusCode(HttpStatus.SC_OK).and().body("args.foo1", equalTo("bar1")).and().body("args.foo2", equalTo("bar2"));
    }

    @DisplayName("Проверка POST запроса RawText")
    @Test
    void testPostRawText() {
        given().log().body().contentType(ContentType.JSON).body("This is expected to be sent back as part of response body.").when().post("https://postman-echo.com/post").then().log().body().statusCode(HttpStatus.SC_OK).and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @DisplayName("Проверка POST запроса Form Data")
    @Test
    void testPostFormData() {
        HashMap<String, String> json = new HashMap<>();
        json.put("foo1", "bar1");
        json.put("foo2", "bar2");
        given().log().body().contentType(ContentType.JSON).body(json).when().post("https://postman-echo.com/post").then().log().body().statusCode(HttpStatus.SC_OK).and().body("data.foo1", equalTo("bar1")).and().body("data.foo2", equalTo("bar2"));
    }

    @DisplayName("Проверка PUT запроса")
    @Test
    void testPut() {
        given().log().body().contentType(ContentType.TEXT).body("This is expected to be sent back as part of response body.").when().put("https://postman-echo.com/put").then().log().body().statusCode(HttpStatus.SC_OK).and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }


    @DisplayName("Проверка PATCH запроса")
    @Test
    void testPatch() {
        given().body("This is expected to be sent back as part of response body.").when().patch("https://postman-echo.com/patch").then().log().body().statusCode(HttpStatus.SC_OK).and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @DisplayName("Проверка DELETE запроса")
    @Test
    void testDelete() {
        given().baseUri("https://postman-echo.com").body("This is expected to be sent back as part of response body.").when().delete("/delete").then().log().body().statusCode(HttpStatus.SC_OK).and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}
