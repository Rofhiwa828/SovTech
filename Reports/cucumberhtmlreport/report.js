$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateAndLink.feature");
formatter.feature({
  "line": 1,
  "name": "Create and Link an account",
  "description": "",
  "id": "create-and-link-an-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Create and link a Cheque account to a profile",
  "description": "",
  "id": "create-and-link-an-account;create-and-link-a-cheque-account-to-a-profile",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am able to setup the Create and Link API with a cif key of \"\u003cCif Key\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I set the account to link as \"\u003cCif Key\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The product code I would like to add is \"\u003cProduct Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Post Request to link an account",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should get a status code of \"\u003cStatus Code\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "create-and-link-an-account;create-and-link-a-cheque-account-to-a-profile;",
  "rows": [
    {
      "cells": [
        "Cif Key",
        "Product Code",
        "Status Code"
      ],
      "line": 13,
      "id": "create-and-link-an-account;create-and-link-a-cheque-account-to-a-profile;;1"
    },
    {
      "cells": [
        "MOKGOOV001",
        "11032",
        "200"
      ],
      "line": 14,
      "id": "create-and-link-an-account;create-and-link-a-cheque-account-to-a-profile;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Create and link a Cheque account to a profile",
  "description": "",
  "id": "create-and-link-an-account;create-and-link-a-cheque-account-to-a-profile;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am able to setup the Create and Link API with a cif key of \"MOKGOOV001\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I set the account to link as \"MOKGOOV001\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The product code I would like to add is \"11032\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Post Request to link an account",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should get a status code of \"200\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "MOKGOOV001",
      "offset": 62
    }
  ],
  "location": "CreateAndLinkAPI.i_am_able_to_setup_the_Create_and_Link_API_with_a_cif_key_of(String)"
});
formatter.result({
  "duration": 604364300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MOKGOOV001",
      "offset": 30
    }
  ],
  "location": "CreateAndLinkAPI.i_set_the_account_to_link_as(String)"
});
formatter.result({
  "duration": 4274700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11032",
      "offset": 41
    }
  ],
  "location": "CreateAndLinkAPI.the_product_code_I_would_like_to_add_is(String)"
});
formatter.result({
  "duration": 4916800,
  "status": "passed"
});
formatter.match({
  "location": "CreateAndLinkAPI.i_Post_Request_to_link_an_account()"
});
formatter.result({
  "duration": 2436693100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 31
    }
  ],
  "location": "CreateAndLinkAPI.i_should_get_a_status_code_of(int)"
});
formatter.result({
  "duration": 2532100,
  "status": "passed"
});
});