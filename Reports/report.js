$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/BookingAdactin.feature");
formatter.feature({
  "name": "validating the Booking function of AdactinHotel Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating the Adactin LoginPage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user is open Adactin Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "premkumar7264",
        "Sivavis@4437"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the Adactin LoginPage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user is open Adactin Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepReference.user_is_open_Adactin_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"premkumar7264\" and \"Sivavis@4437\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepReference.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepReference.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepReference.user_should_verify_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating the Search and select hotel test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user select \"\u003cLocation\u003e\" and \"\u003cHotels\u003e\" and \"\u003cRoom Type\u003e\" and \"\u003cNumber of Rooms\u003e\" and \"\u003cAdults per Room\u003e\" and \"\u003cChildren per Room\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click Search",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotels",
        "Room Type",
        "Number of Rooms",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Paris",
        "Hotel Creek",
        "Double",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the Search and select hotel test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user select \"Paris\" and \"Hotel Creek\" and \"Double\" and \"1 - One\" and \"1 - One\" and \"1 - One\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepReference.user_select_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Search",
  "keyword": "And "
});
formatter.match({
  "location": "StepReference.click_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select hotel and radiobutton then continue button click",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Adhoc"
    }
  ]
});
formatter.step({
  "name": "click the radiobutton and continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepReference.click_the_radiobutton_and_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepReference.user_verify_the_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating the Book hotel test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user select \"\u003cFirst Name\u003e\" and \"\u003cLast Name\u003e\" and \"\u003cAddress\u003e\" and \"\u003cCard No\u003e\" and \"\u003cCard Type\u003e\" and \"\u003cSelect Month\u003e\" and \"\u003cSelect Year\u003e\" and \"\u003cCVV Num\u003e\" and click Search",
  "keyword": "Then "
});
formatter.step({
  "name": "click the BookNow button",
  "keyword": "Then "
});
formatter.step({
  "name": "user check get order id or not",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Address",
        "Card No",
        "Card Type",
        "Select Month",
        "Select Year",
        "CVV Num"
      ]
    },
    {
      "cells": [
        "Prem",
        "Kumar",
        "India",
        "4545454565656565",
        "VISA",
        "March",
        "2022",
        "007"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the Book hotel test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user select \"Prem\" and \"Kumar\" and \"India\" and \"4545454565656565\" and \"VISA\" and \"March\" and \"2022\" and \"007\" and click Search",
  "keyword": "Then "
});
formatter.match({
  "location": "StepReference.user_select_and_and_and_and_and_and_and_and_click_Search(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the BookNow button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepReference.click_the_BookNow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check get order id or not",
  "keyword": "And "
});
formatter.match({
  "location": "StepReference.user_check_get_order_id_or_not()"
});
formatter.result({
  "status": "passed"
});
});