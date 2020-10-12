$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US1000%20Google%20search%20test.feature");
formatter.feature({
  "name": "US1000 Google search test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.background({
  "name": "User is on the google page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_is_on_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01 Verify Iphone search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "name": "user search for \"school bag\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the result has \"schol bag\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.verify_the_result_has(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertTrue(Assert.java:53)\n\tat stepdefinitions.GoogleSearchStepDefinitions.verify_the_result_has(GoogleSearchStepDefinitions.java:63)\n\tat ✽.verify the result has \"schol bag\"(file:///Users/mehmetali/IdeaProjects/mycucumberfreamwork3/src/test/resources/features/US1000%20Google%20search%20test.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshoots");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the google page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_is_on_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02 Verify tea pot search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "name": "user search for tea pot",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_search_for_tea_pot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the result has tea pot",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.verify_the_result_has_tea_pot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the google page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_is_on_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03 Verify flower search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "name": "user search for flower",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_search_for_flower()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the result has flower",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.verify_the_result_has_flower()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});