package stepDefinition.chequesStepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.HelperMethods;
import utilities.JsonParameterController;
import utilities.ResponseMessageConstants;


public class CreateAndLinkAPI {

    //Base url for the api under test
    private static final String BASE_URI = "https://esb.api.uat.absa.co.za:1001/enterprise-uat/uat/rbb/";
    RequestSpecification request;
    Response res;
    String responseMessage = "";
    @Given("^I am able to setup the Create and Link API with a cif key of \"([^\"]*)\"$")
    public void i_am_able_to_setup_the_Create_and_Link_API_with_a_cif_key_of(String cifKey) throws Throwable {


        request = RestAssured.given()
                .header("X-IBM-Client-Id", "36650eb3-92dc-40fd-9842-3fc91393e711")
                .header("X-IBM-Client-Secret", "dJ8dF8mQ0tC6kM3uH8qO8kC5wB8kK7dG2eK3bC2vB7iY6oJ3yX")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("applicationID", "BDP")
                .header("userid", "ab020xd")
                .header("deviceid", "22");
        request.body(JsonParameterController.SetCreateAndLinkJsonParameter("effectiveDate", HelperMethods.GetTodaysDate()));

    }

    @Given("^I set the account to link as \"([^\"]*)\"$")
    public void i_set_the_account_to_link_as(String cifKey)  {

        request.body(JsonParameterController.SetCreateAndLinkJsonParameter("cifKey", cifKey));
    }

    @Given("^The product code I would like to add is \"([^\"]*)\"$")
    public void the_product_code_I_would_like_to_add_is(String productCode) {

        request.body(JsonParameterController.SetCreateAndLinkJsonParameter("product", Integer.parseInt(productCode)));
    }

    @When("^I Post Request to link an account$")
    public void i_Post_Request_to_link_an_account() {

        request.baseUri(BASE_URI);
        res = request.post("cqcreateandlinkaccountv9api/CQcreateAndLinkAccountV9");
        System.out.println(res.prettyPrint());
    }


    @Given("^I set the date to over eight days before$")
    public void i_set_the_date_to_over_eight_days_before() throws Throwable {

        request.body(JsonParameterController.SetCreateAndLinkJsonParameter("effectiveDate", HelperMethods.Get8DaysBeforeCurrentDate()));
    }

    @When("^I should get an Invalid category code response$")
    public void i_should_get_an_Invalid_category_code_response(){

        responseMessage= JsonParameterController.ReadResponseMessage(res.prettyPrint());
        Assert.assertEquals(ResponseMessageConstants.invalidCategoryCodeResponse,responseMessage);

    }

    @When("^I get the response message that client type is incompatible$")
    public void i_get_the_response_message_that_client_type_is_incompatible() {

        responseMessage= JsonParameterController.ReadResponseMessage(res.prettyPrint());
        Assert.assertEquals(ResponseMessageConstants.clientTypeIncompatible,responseMessage);
    }

    @When("^I get the response message from the account creation module$")
    public void i_get_the_response_message_from_the_account_creation_module() {

        responseMessage= JsonParameterController.ReadResponseMessage(res.prettyPrint());
        Assert.assertEquals(ResponseMessageConstants.backDateResponse,responseMessage);
    }

    @When("^I get the response message that the open date may only be back-dated 7 days$")
    public void i_get_the_response_message_that_the_open_date_may_only_be_back_dated_days() {

        responseMessage= JsonParameterController.ReadResponseMessage(res.prettyPrint());
        Assert.assertEquals(ResponseMessageConstants.backDateResponse,responseMessage);
    }

    @Then("^I should get a status code of \"([^\"]*)\"$")
    public void i_should_get_a_status_code_of(int statusCode) {

        System.out.println(responseMessage);
        Assert.assertEquals(statusCode, res.getStatusCode());
    }



}
