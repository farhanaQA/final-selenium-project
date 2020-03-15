$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darkskyRegister.feature");
formatter.feature({
  "line": 3,
  "name": "Verify dark sky feature",
  "description": "",
  "id": "verify-dark-sky-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@temperature"
    }
  ]
});
formatter.before({
  "duration": 3785679805,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 24,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "verify-dark-sky-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Scenario-4"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am on the darksky Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I verify I am on Register page by asserting Register header",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkyRegisterHomePageSD.iAmonDarkSkyRegisterPage()"
});
formatter.result({
  "duration": 9693616711,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyRegisterHomePageSD.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 2082649043,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyRegisterHomePageSD.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 2051257501,
  "status": "passed"
});
formatter.after({
  "duration": 127144553,
  "status": "passed"
});
});