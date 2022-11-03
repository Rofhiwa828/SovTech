package stepDefinition.combiStepDefs;

import ResponseMessages.CombiResponseMessageConstants;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.CardIssuanceJsonController;

import static org.junit.Assert.assertNotEquals;

public class CCDebitCardIssuance {

    private static final String BASE_URI = "https://zconnuat.absa.co.za:9445/";
    RequestSpecification request;
    Response res;
    String responseMessage = "";

    @Given("^I am able to setup Debit Card Issuance Authentication$")
    public void i_am_able_to_setup_Debit_Card_Issuance_Authentication() {

        request = RestAssured.given()
                .auth().basic("abks580","nono@001");
    }

    @Given("^I am able to setup Debit Card Issuance Headers$")
    public void i_am_able_to_setup_Debit_Card_Issuance_Headers() {

        request.header("Content-Type", "application/json")
                .header("applicationID", "swagger")
                .header("userid", "ab020xd")
                .header("deviceid", "api");

    }

    @Given("^I set the client code as \"([^\"]*)\"$")
    public void i_set_the_client_code_as(String clientCode) {

        CardIssuanceJsonController.SetParameter("clientCode",clientCode);
    }

    @Given("^I set the Nominate Cheque Account as \"([^\"]*)\"$")
    public void i_set_the_Nominate_Cheque_Account_as(String nominatedCQAccount) {

        CardIssuanceJsonController.SetParameter("nominatedCQAccount",nominatedCQAccount);
    }

    @When("^I post the Debit Card Issuance end point$")
    public void i_post_the_Debit_Card_Issuance_end_point() {
        request.baseUri(BASE_URI);
        request.body(CardIssuanceJsonController.JsonBody());
        res = request.post("ccdebitcardissuancev2api/CCDebitCardIssuanceV2");
        responseMessage= res.prettyPrint();
        System.out.println("Combi Card number:  "+CardIssuanceJsonController.ReadCombiOutPut(responseMessage));
    }

    @Then("^I validate if the combi card is returned$")
    public void i_validate_if_the_combi_card_is_returned() throws Throwable {

        String cardNo = CardIssuanceJsonController.ReadCombiOutPut(responseMessage);
        assertNotEquals("0",cardNo);
        Reporter.addStepLog("Card Number: "+cardNo);
    }
    



    @Then("^I validate if I get the correct error message$")
    public void i_validate_if_I_get_the_corret_error_message() throws Throwable {

        String errorMessage = CardIssuanceJsonController.ReadErrorMessage(responseMessage);
        Assert.assertEquals(CombiResponseMessageConstants.invalidAccountError,errorMessage);
        Reporter.addStepLog(" Error message: "+errorMessage);
    }

    @Then("^I should get a status code of \"([^\"]*)\"$")
    public void i_should_get_a_status_code_of(int statusCode) {

        Assert.assertEquals(statusCode, res.getStatusCode());
    }
}
