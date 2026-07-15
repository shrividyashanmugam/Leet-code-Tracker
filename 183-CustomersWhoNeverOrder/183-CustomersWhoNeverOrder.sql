-- Last updated: 7/15/2026, 2:08:34 PM
# Write your MySQL query statement below

Select name AS Customers From Customers 
left join orders on Customers.id = orders.customerId 
where Orders.customerId is NUll;