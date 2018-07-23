$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cheese.feature");
formatter.feature({
  "line": 2,
  "name": "Cheese Test",
  "description": "",
  "id": "cheese-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 7486594544,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Implementation 1"
    }
  ],
  "line": 5,
  "name": "Check if all the three categories of cheese are displayed",
  "description": "",
  "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Validate all the three categories of cheese are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_have_launched_the_app_and_home_page_title_is_displayed()"
});
formatter.result({
  "duration": 593836534,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.validate_all_the_three_categories_of_cheese_are_displayed()"
});
formatter.result({
  "duration": 605647813,
  "status": "passed"
});
formatter.after({
  "duration": 2995469386,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 9,
      "value": "#Implementation 2"
    }
  ],
  "line": 10,
  "name": "Check if all the three categories of cheese are displayed",
  "description": "",
  "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Validate all the three categories of cheese \"\u003cCategory One\u003e\" \"\u003cCategory Two\u003e\" \"\u003cCategory Three\u003e\" are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed;",
  "rows": [
    {
      "cells": [
        "Category One",
        "Category Two",
        "Category Three"
      ],
      "line": 15,
      "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed;;1"
    },
    {
      "cells": [
        "CATEGORY 1",
        "CATEGORY 2",
        "CATEGORY 3"
      ],
      "line": 16,
      "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6949160376,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check if all the three categories of cheese are displayed",
  "description": "",
  "id": "cheese-test;check-if-all-the-three-categories-of-cheese-are-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Validate all the three categories of cheese \"CATEGORY 1\" \"CATEGORY 2\" \"CATEGORY 3\" are displayed",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_have_launched_the_app_and_home_page_title_is_displayed()"
});
formatter.result({
  "duration": 581551533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CATEGORY 1",
      "offset": 45
    },
    {
      "val": "CATEGORY 2",
      "offset": 58
    },
    {
      "val": "CATEGORY 3",
      "offset": 71
    }
  ],
  "location": "HomePageStepDef.validate_all_the_three_categories_of_cheese_are_displayed(String,String,String)"
});
formatter.result({
  "duration": 803838751,
  "status": "passed"
});
formatter.after({
  "duration": 2946488552,
  "status": "passed"
});
formatter.before({
  "duration": 6927760769,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Check if all the three sections are displayed for the selected cheese",
  "description": "",
  "id": "cheese-test;check-if-all-the-three-sections-are-displayed-for-the-selected-cheese",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Select a cheese",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Validate Info Section is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Validate Friends Section is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Validate Related Section is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_have_launched_the_app_and_home_page_title_is_displayed()"
});
formatter.result({
  "duration": 605407945,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.select_a_cheese()"
});
formatter.result({
  "duration": 2721690714,
  "status": "passed"
});
formatter.match({
  "location": "CheeseDescriptionStepDef.validate_Info_Section_is_displayed()"
});
formatter.result({
  "duration": 91984868,
  "status": "passed"
});
formatter.match({
  "location": "CheeseDescriptionStepDef.validate_Friends_Section_is_displayed()"
});
formatter.result({
  "duration": 74960062,
  "status": "passed"
});
formatter.match({
  "location": "CheeseDescriptionStepDef.validate_Related_Section_is_displayed()"
});
formatter.result({
  "duration": 1404856485,
  "status": "passed"
});
formatter.after({
  "duration": 2908497894,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Change the mode of the App",
  "description": "",
  "id": "cheese-test;change-the-mode-of-the-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 26,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Click the Ellipsis on top right of the app and select night mode",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Change the mode to \"\u003cMode\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "cheese-test;change-the-mode-of-the-app;",
  "rows": [
    {
      "cells": [
        "Mode"
      ],
      "line": 31,
      "id": "cheese-test;change-the-mode-of-the-app;;1"
    },
    {
      "cells": [
        "Night (always)"
      ],
      "line": 32,
      "id": "cheese-test;change-the-mode-of-the-app;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6835625116,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Change the mode of the App",
  "description": "",
  "id": "cheese-test;change-the-mode-of-the-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I have launched the app and Home page title is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Click the Ellipsis on top right of the app and select night mode",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Change the mode to \"Night (always)\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_have_launched_the_app_and_home_page_title_is_displayed()"
});
formatter.result({
  "duration": 673806382,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.click_the_Ellipsis_on_top_right_of_the_app_and_select_night_mode()"
});
formatter.result({
  "duration": 1306406708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Night (always)",
      "offset": 20
    }
  ],
  "location": "HomePageStepDef.change_the_mode_to(String)"
});
formatter.result({
  "duration": 5190797459,
  "status": "passed"
});
formatter.after({
  "duration": 3202743057,
  "status": "passed"
});
});