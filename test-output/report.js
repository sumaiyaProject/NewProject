$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/medicalRecord_Verification.feature");
formatter.feature({
  "name": "medical record system verification",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_am_in_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid credential and click on Inpatient Ward",
  "keyword": "When "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_enter_valid_credential_and_click_on_Inpatient_Ward()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify medical record system",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "verify Login in Inpatient Ward",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.verify_Login_in_Inpatient_Ward()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.click_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_am_in_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid credential and click on Inpatient Ward",
  "keyword": "When "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_enter_valid_credential_and_click_on_Inpatient_Ward()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Register a patient",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Register a patient",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_click_on_Register_a_patient()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify I am in Register a patient page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.verify_I_am_in_Register_a_patient_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Patient Demographics",
  "keyword": "And "
});
formatter.match({
  "location": "stepdifinations.medical_Patient_Record.i_enter_Patient_Demographics()"
});
formatter.result({
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: argument is not defined\n  (Session info: chrome\u003d103.0.5060.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GHGPJID\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 103.0.5060.53 (a1711811edd7..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:62884}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 361852de7f400fa334e753a4288c92f5\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat stepdifinations.medical_Patient_Record.i_enter_Patient_Demographics(medical_Patient_Record.java:130)\r\n\tat ✽.I enter Patient Demographics(file:///C:/Batch2021-JUNE-SDET/JAVA/workspace/openMRSTest/src/test/resources/features/medicalRecord_Verification.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});