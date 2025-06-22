package StepsDefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Products {

    public int StatusCode;
    public RequestSpecification httpRequest;
    public Response response;
    public int ResponseCode;
    public ResponseBody body;
    public JSONObject requestParams;
    public JsonPath jsnpath;
    public String s;


//    @Given("I set the base URI for the products API")
//    public void i_set_the_base_uri_for_the_products_api() {
//        RestAssured.baseURI = "https://fakestoreapi.com/";
//        System.out.println("Step hit");
//    }
//
//    @When("I send a GET request to the products endpoint")
//    public void i_send_a_get_request_to_the_products_endpoint() {
//        httpRequest = RestAssured.given();
//        response = httpRequest.get("products");
//        System.out.println("Step hit");
//    }
//
//    @Then("I should receive a status code of {int}")
//    public void i_should_receive_a_status_code_of(Integer int1) {
//        ResponseCode = response.statusCode();
//        assertEquals(ResponseCode, int1);
//        System.out.println("Step hit");
//    }
//
//    @Then("I verify that the rate of the first product is {}")
//    public void i_verify_that_the_rate_of_the_first_product_is(Double double1) {
//        body = response.getBody();
//        //convert response body to string
//        String responseBody = body.asString();
//        //JSON Representation from Response Body
//         jsnpath = response.jsonPath();
//        s = jsnpath.getJsonObject("rating[0].rate").toString();
//        double rate = Double.parseDouble(s);
//        assertEquals(double1, rate);
//        System.out.println("Step hit");
//    }

    @Given("I set the base URI for the products API")
    public void iSetTheBaseURIForTheProductsAPI() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
        httpRequest  = RestAssured.given()
                .header("Content-Type", "application/json");
      //  requestParams = new JSONObject();
        System.out.println("Step hit");
    }

    @When("I pass the request body of product title {string}")
    public void i_pass_the_request_body_of_product_title(String title)  {
        requestParams.put("title", title);
        requestParams.put("price",13.5);
        requestParams.put("description","lorem ipsum set");
        requestParams.put("image","https://i.pravatar.cc");
        requestParams.put("category","electronic");
        httpRequest.body(requestParams.toJSONString());
        System.out.println("Step hit");
    }

    @And("I send a Post request to the products endpoint")
    public void i_send_a_post_request_to_the_products_endpoint() {
        response = httpRequest.post("products");
        System.out.println("Step hit");
    }


    @Then("I should receive a status code of {int}")
    public void iShouldReceiveAStatusCodeOf(int arg0) {
        body = response.getBody();
        jsnpath = response.jsonPath();
        ResponseCode = response.statusCode();
        assertEquals(ResponseCode,arg0);
        System.out.println("Step hit");
    }



}
