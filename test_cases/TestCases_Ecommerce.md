# Test Cases – E-Commerce Cart & Checkout

| ID   | Test Case Description                      | Steps                                                                 | Expected Result |
|------|-------------------------------------------|-----------------------------------------------------------------------|----------------|
| TC01 | Add single product to cart                 | Select a product, click Add to Cart                                    | Product appears in cart |
| TC02 | Add multiple products                       | Add multiple items                                                    | All items appear, total updated |
| TC03 | Update product quantity                     | Change quantity in cart                                               | Total price recalculated correctly |
| TC04 | Remove product from cart                     | Click remove on item                                                 | Item removed, total updated |
| TC05 | Empty cart checkout                         | Click checkout with empty cart                                        | Error/notification: "Cart is empty" |
| TC06 | Apply valid promo code                       | Enter promo code, click apply                                         | Discount applied correctly |
| TC07 | Apply invalid promo code                     | Enter invalid code                                                   | Error: "Invalid promo code" |
| TC08 | Checkout with missing required fields       | Leave shipping/payment fields empty                                    | Error messages displayed |
| TC09 | Checkout with valid info                     | Fill all required info, click submit                                   | Order confirmed, thank you page displayed |
| TC10 | Edge case: large quantity                   | Add very high quantity of product                                     | Stock limit warning or handled correctly |
