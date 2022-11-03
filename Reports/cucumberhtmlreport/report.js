$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DebitCardIssuance.feature");
formatter.feature({
  "line": 2,
  "name": "Debit Card Issuance End Point",
  "description": "",
  "id": "debit-card-issuance-end-point",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Issue a combi to an account",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-to-an-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am able to setup Debit Card Issuance Authentication",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am able to setup Debit Card Issuance Headers",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I set the client code as \"\u003cclientCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I set the Nominate Cheque Account as \"\u003cnominatedCQAccount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I post the Debit Card Issuance end point",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate if the combi card is returned",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get a status code of \"\u003cStatus Code\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-to-an-account;",
  "rows": [
    {
      "cells": [
        "clientCode",
        "nominatedCQAccount",
        "Status Code"
      ],
      "line": 15,
      "id": "debit-card-issuance-end-point;issue-a-combi-to-an-account;;1"
    },
    {
      "cells": [
        "BURGET 004",
        "4048902688",
        "200"
      ],
      "line": 16,
      "id": "debit-card-issuance-end-point;issue-a-combi-to-an-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Issue a combi to an account",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-to-an-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am able to setup Debit Card Issuance Authentication",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am able to setup Debit Card Issuance Headers",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I set the client code as \"BURGET 004\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I set the Nominate Cheque Account as \"4048902688\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I post the Debit Card Issuance end point",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate if the combi card is returned",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get a status code of \"200\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CCDebitCardIssuance.i_am_able_to_setup_Debit_Card_Issuance_Authentication()"
});
formatter.result({
  "duration": 598260200,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_am_able_to_setup_Debit_Card_Issuance_Headers()"
});
formatter.result({
  "duration": 56361200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BURGET 004",
      "offset": 26
    }
  ],
  "location": "CCDebitCardIssuance.i_set_the_client_code_as(String)"
});
formatter.result({
  "duration": 35181000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4048902688",
      "offset": 38
    }
  ],
  "location": "CCDebitCardIssuance.i_set_the_Nominate_Cheque_Account_as(String)"
});
formatter.result({
  "duration": 4210400,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_post_the_Debit_Card_Issuance_end_point()"
});
formatter.result({
  "duration": 2169927900,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_validate_if_the_combi_card_is_returned()"
});
formatter.result({
  "duration": 4143300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 31
    }
  ],
  "location": "CCDebitCardIssuance.i_should_get_a_status_code_of(int)"
});
formatter.result({
  "duration": 1146200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Issue a combi with an Invalid Nominated account",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-with-an-invalid-nominated-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "I am able to setup Debit Card Issuance Authentication",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I am able to setup Debit Card Issuance Headers",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I set the client code as \"\u003cclientCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I set the Nominate Cheque Account as \"\u003cnominatedCQAccount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I post the Debit Card Issuance end point",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I validate if I get the correct error message",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I should get a status code of \"\u003cStatus Code\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-with-an-invalid-nominated-account;",
  "rows": [
    {
      "cells": [
        "clientCode",
        "nominatedCQAccount",
        "Status Code"
      ],
      "line": 29,
      "id": "debit-card-issuance-end-point;issue-a-combi-with-an-invalid-nominated-account;;1"
    },
    {
      "cells": [
        "BURGET 004",
        "4048874524",
        "200"
      ],
      "line": 30,
      "id": "debit-card-issuance-end-point;issue-a-combi-with-an-invalid-nominated-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Issue a combi with an Invalid Nominated account",
  "description": "",
  "id": "debit-card-issuance-end-point;issue-a-combi-with-an-invalid-nominated-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am able to setup Debit Card Issuance Authentication",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I am able to setup Debit Card Issuance Headers",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I set the client code as \"BURGET 004\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I set the Nominate Cheque Account as \"4048874524\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I post the Debit Card Issuance end point",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I validate if I get the correct error message",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I should get a status code of \"200\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CCDebitCardIssuance.i_am_able_to_setup_Debit_Card_Issuance_Authentication()"
});
formatter.result({
  "duration": 227900,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_am_able_to_setup_Debit_Card_Issuance_Headers()"
});
formatter.result({
  "duration": 422600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BURGET 004",
      "offset": 26
    }
  ],
  "location": "CCDebitCardIssuance.i_set_the_client_code_as(String)"
});
formatter.result({
  "duration": 4857200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4048874524",
      "offset": 38
    }
  ],
  "location": "CCDebitCardIssuance.i_set_the_Nominate_Cheque_Account_as(String)"
});
formatter.result({
  "duration": 4984800,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_post_the_Debit_Card_Issuance_end_point()"
});
formatter.result({
  "duration": 264778600,
  "status": "passed"
});
formatter.match({
  "location": "CCDebitCardIssuance.i_validate_if_I_get_the_corret_error_message()"
});
formatter.result({
  "duration": 467200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 31
    }
  ],
  "location": "CCDebitCardIssuance.i_should_get_a_status_code_of(int)"
});
formatter.result({
  "duration": 73400,
  "status": "passed"
});
});