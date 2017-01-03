$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 1,
  "name": "User Check Customer",
  "description": "As a valid user\r\nI should be able to check my customer",
  "id": "user-check-customer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check Customer",
  "description": "",
  "id": "user-check-customer;check-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open Browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a user has logged in user id \"mngr56734\" and password \"vydApEj\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user is on the Edit Customer page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he submits \"96942\" as customer id",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "ensures the customer name is \"Triveni\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "ensures the customer gender is \"female\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "ensures that DoB is \"1988-01-08\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close the application.",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_Browser_and_start_application()"
});
formatter.result({
  "duration": 11601558564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr56734",
      "offset": 30
    },
    {
      "val": "vydApEj",
      "offset": 55
    }
  ],
  "location": "SmokeTest.a_user_has_logged_in_user_id_and_password(String,String)"
});
formatter.result({
  "duration": 2101156934,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.the_user_is_on_the_Edit_Customer_page()"
});
formatter.result({
  "duration": 530926193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96942",
      "offset": 12
    }
  ],
  "location": "SmokeTest.he_submits_as_customer_id(String)"
});
formatter.result({
  "duration": 380122670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triveni",
      "offset": 30
    }
  ],
  "location": "SmokeTest.ensures_the_customer_name_is(String)"
});
formatter.result({
  "duration": 62181062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "female",
      "offset": 32
    }
  ],
  "location": "SmokeTest.ensures_the_customer_gender_is(String)"
});
formatter.result({
  "duration": 83401284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1988-01-08",
      "offset": 21
    }
  ],
  "location": "SmokeTest.ensures_that_DoB_is(String)"
});
formatter.result({
  "duration": 41649346,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_the_application()"
});
formatter.result({
  "duration": 2311652333,
  "status": "passed"
});
});