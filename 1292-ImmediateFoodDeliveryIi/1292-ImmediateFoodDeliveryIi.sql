-- Last updated: 7/31/2026, 10:16:44 AM
# Write your MySQL query statement below
select round(sum(case when order_date=customer_pref_delivery_date then 1 else 0 end)/count(*)*100,2) as immediate_percentage
from (select *, rank() over ( partition by customer_id order by order_date asc) as rnk from delivery) d
where rnk=1