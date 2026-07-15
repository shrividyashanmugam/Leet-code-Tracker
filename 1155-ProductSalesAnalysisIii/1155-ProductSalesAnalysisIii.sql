-- Last updated: 7/15/2026, 2:06:07 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (select  product_id, min(year) from Sales group by product_id)