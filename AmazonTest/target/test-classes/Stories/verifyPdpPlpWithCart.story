Meta:
@PdpPlpWithCart
@FullSuite

Narrative:
In order to test the adding product to cart and update cart
As a tester
I want to be able to verify PLP page PDP page and full cart page

Scenario:To validate adding product to cart and update quantity on cart
Given the user is on amazon home page
When the user search for Electronics from departments
Then the user click on HEADPHONES from the page
When the user select first available product and click on add to cart
Then the user verify product successfully added to cart
When the user search for the product from search bar
Then the user click on second product from the search list
When the user select quantity two and click on add to cart
Then the user verify product successfully added to cart
When the user click on cart icon on top nav
Then the user should navigate to full cart page
And the user remove the first added product
And reduce the quantity to one for the first product
When the user click on proceed to checkout button on full cart page
Then verify the user is on login page
When the user enter <SubscribedID> and <ValidPassword>
And click on sign in button
When the user fill the billing address and click on continue
Then the user navigate to shipping page

Examples:
General.table