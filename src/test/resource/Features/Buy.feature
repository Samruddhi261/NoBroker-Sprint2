Feature: To test the NoBroker Website
Background: 
Given User is on the homepage of NoBroker website

#========================================  Scenario1  ==========================================
@SearchProperty
Scenario: Buy a property from NoBroker Website
When user selects the buy option
And user selects the city name from the dropdown list
And user types the localities
And User select a Full House radio button
And user User selects BHK type from the dropdown list
And User selects the property status from the dropdown list
And User clicks on checkbox for additional features
And User clicks on the search button
Then User should see a list of properties matching the search criteria


#========================================  Scenario2  ==========================================
@PostComment
Scenario Outline: Posting Comments on Packers and Movers Service
When User click on the Menu tab
And User click on Blog option
And User click on P & M option
And User select one of the project
And user click on Comment option
And User post comment with <Comment>,<Name>,<Email>,<Website>
And User click on post comment
Then User should receive a confirmation message
Examples: 
| Comment                                                                                                                      | Name    | Email              | Website            |
| Highly recommend the vehicle shifting service in Delhi. Smooth process and customer service, made my experience hassle-free. | Pranjaliiiii| pranjall767@gmail.com | Packers and Movers |


#========================================  Scenario3  ==========================================
@TransferLoan
Scenario: Transfer Home Loan
When User is on home loan page
When User enter details with Name, Mobile Number, Outstanding Principal Amount and Current Interest Rate
| Samruddhi | 9876543234 | 3000000 | 9.7 |
And User select Primary Bank Account
And User click on submit button
Then User should see Congratulation! message   


#========================================  Scenario4  ==========================================
@ContactUs
Scenario: Contacting NRI Parents Care Centre
When User click on Menu tab
And User click on the Blog option
And User click on the NRI option
And User selects one of the project
And User enter their <Name>
And User select City and Service
And User enters "<MobileNo>" and <Email>
And User click on Submit
Then User should receive a confirmation message that Thanks for your Response
Examples: 
| Name | MobileNo | Email |
| Samruddhi  |9234567890 | sam76@gmail.com |


#========================================  Scenario5  ==========================================
@Shortlist
Scenario: User shortlists a property and checks it in the shortlist section
When user first login using id and password
And user navigate to the Property page
And user clicks the wishlist option to add the property to their wishlist
And user clicks on My Dashboard and select shortlist
And user checks their shortlisted properties in their profile
Then selected property should be visible in the shortlist section



     
