@US12, @smoketest
Feature:US12_Add Products in Cart

Scenario:TC1201_Add Products in Cart

Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click 'Products' button
And Hover over first product and click 'Add to cart'
And Click 'Continue Shopping' button
And Hover over second product and click 'Add to cart'
And Click 'View Cart' button
Then Verify both products are added to Cart
Then Verify their prices, quantity and total price