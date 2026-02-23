Feature: Appointment Creation


Scenario Outline: Application Check

Given user is on the homepage
When user clicks on the Make Appointment
And user is on the Login Page
And user enters username "<username>"
And user enters password "<password>"
And user clicks on login
And user is on the Appointment Page
And user selects facility "<facility>"
And user needs readmission "<readmission>"
And user selects the healthcare program "<healthprog>"
And user enters the visit date "<visit_date>"
And user enters the comments "<comments>"
And user clicks on the Book Apoointment
And user is on the Confirmation Page
And user clicks on option button
And user found logout button
And user clicks on History
And user is on the History Page
And user verifies appoiontment details "<date>"
And user clicks on option button
And user found logout button
And user cicks on Profile
And user is on the Profile Page
And user clicks on option button
And user found logout button
And user clicks on Home
And user is on the homepage
And user clicks on option button
And User clicks on Logout
Then user is on the homepage
And user clicks on option button
And user found login option

Examples:
|username|password|facility|healthprog|visit_date|comments|date|readmission|
|John Doe|ThisIsNotAPassword|Tokyo CURA Healthcare Center|Medicare|25/02/2002|I want and Appointment|25/02/2002|yes|
|John Doe|ThisIsNotAPassword|Hongkong CURA Healthcare Center|Medicaid|18/08/2000|I wish I can get one|18/08/2000|no|
|John Doe|ThisIsNotAPassword|Seoul CURA Healthcare Center|None|29/06/1997|Blahhhhhhh|29/06/1997|yes|