Feature: Edit a Lead in LeafTaps

Background:

Given Enter the Username as DemoSalesmanager
And Enter the Password as crmsfa
And Click on login
And Click on CRMSFA
And Click on Leads

Scenario Outline: Editing a Lead with positive result
And Click on Find Leads
And Enter First name as <fName>
And Click on Find Lead button
And Select the first index
And Click on Edit button
And Change the First name as <fName1>
When Click on Update button
Then Changes has been done

Examples:
|fName|fName1|
|Charu|Trilok|
|Trilok|Madhu|
|Madhu|Vignesh|

Scenario Outline: Editing a lead via create lead
And Click on Create Lead
And Enter the Company name as <cName>
And Enter the First name as <fName>
And Enter the Last name as <lName>
When Click on the Create Lead button
And Click on Edit button
And Change the First name as <fName1>
When Click on Update button
Then Changes has been done

Examples:
|cName|fName|lName|fName1|
|Testleaf|Charu|Trilok|Charulatha|
