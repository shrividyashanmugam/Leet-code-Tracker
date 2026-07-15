-- Last updated: 7/15/2026, 2:06:03 PM
# Write your MySQL query statement below
select player_id , MIN(event_date) as first_login
from Activity 
group by player_id;