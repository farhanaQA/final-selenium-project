$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
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
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 4467047418,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 170260391,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify Invalid Login",
  "description": "",
  "id": "login-feature;verify-invalid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@login-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter mohammad@technosoftacademy.io into username text fields on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter test1234 into password text fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mohammad@technosoftacademy.io",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 43
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 249096234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1234",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 95110364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "LoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 30471608915,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifyInvalidLoginPage()"
});
formatter.result({
  "duration": 21049595304,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown (tried for 15 second(s) with 1000 milliseconds interval)\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:315)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\n\tat framework.webPages.BasePage.webAction(BasePage.java:29)\n\tat framework.webPages.BasePage.getTextFromElement(BasePage.java:47)\n\tat framework.webPages.LoginPage.getPageHeader(LoginPage.java:11)\n\tat stepdefinition.LoginSD.verifyInvalidLoginPage(LoginSD.java:64)\n\tat ✽.Then I verify that i am an invalid login page(login.feature:12)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027content\u0027]/div/div/div[1]/span\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Farhanas-MBP.hsd1.ca.comcast.net\u0027, ip: \u00272601:204:cc80:a3c0:0:0:0:9943%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u00271.8.0_232\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: /var/folders/sd/vpdsxlk93tz...}, goog:chromeOptions: {debuggerAddress: localhost:49723}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5be1e7581b574c93ec044f5936b0bee5\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027content\u0027]/div/div/div[1]/span}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat framework.webPages.BasePage$1.apply(BasePage.java:31)\n\tat framework.webPages.BasePage$1.apply(BasePage.java:29)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\n\tat framework.webPages.BasePage.webAction(BasePage.java:29)\n\tat framework.webPages.BasePage.getTextFromElement(BasePage.java:47)\n\tat framework.webPages.LoginPage.getPageHeader(LoginPage.java:11)\n\tat stepdefinition.LoginSD.verifyInvalidLoginPage(LoginSD.java:64)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.after({
  "duration": 119843997,
  "status": "passed"
});
});