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
And Click on Duplicate button
When Click on Create Lead Update button
Then Changes has been done

Examples:
|fName|
|Charu|
|Trilok|
|Madhu|

Scenario Outline: Editing a lead via create lead
And Click on Create Lead
And Enter the Company name as <cName>
And Enter the First name as <fName>
And Enter the Last name as <lName>
When Click on the Create Lead button
And Click on Duplicate button
When Click on Create Lead Update button
Then Changes has been done

Examples:
|cName|fName|lName|
|Testleaf|Charu|Trilok|
