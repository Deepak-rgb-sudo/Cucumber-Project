Feature:
As Admin user add emp
Scenario Outline:
Validate add emp with multiple data
Given user navigate orange hrm url"http://orangehrm.qedgetech.com/"
When user logs in as "Admin" and password as "Qedge123!@#"
When user click login button
When user click pim 
When user click add button
When  user enter as"<FirstName>" and "<MiddleName>" and "<LastName>"
When user click save button
Then user validates url
Then user close browser
Examples:
|FirstName|MiddleName|LastName|
|akhilesh|selenium|testing|
|akhilesh1|selenium|testing|
|akhilesh2|selenium|testing|
|akhilesh5|selenium|testing|
|akhilesh8|selenium|testing|
|akhilesh9|selenium|testing|
Scenario Outline:
