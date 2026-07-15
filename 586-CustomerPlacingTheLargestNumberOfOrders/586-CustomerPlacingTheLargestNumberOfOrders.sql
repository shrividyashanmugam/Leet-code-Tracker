-- Last updated: 7/15/2026, 2:06:49 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;