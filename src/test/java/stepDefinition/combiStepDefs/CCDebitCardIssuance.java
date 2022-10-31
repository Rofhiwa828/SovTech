package stepDefinition.combiStepDefs;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import utilities.HelperMethods;
import utilities.JsonParameterController;

public class CCDebitCardIssuance {

    private static final String BASE_URI = "https://zconnuat.absa.co.za:9445/";
    RequestSpecification request;
    Response res;
    String responseMessage = "";
   @Test
    public void i_am_able_to_setup_the_Create_and_Link_API_with_a_cif_key_of() throws Throwable {

        request = RestAssured.given()
                .auth().basic("abks580","nono@001")
                .header("Content-Type", "application/json")
                .header("applicationID", "swagger")
                .header("userid", "ab020xd")
                .header("deviceid", "api");
        request.body(JsonParameterController.JsonBody());
        request.baseUri(BASE_URI);
        res = request.post("ccdebitcardissuancev2api/CCDebitCardIssuanceV2");
        System.out.println(res.prettyPrint());

    }
}
