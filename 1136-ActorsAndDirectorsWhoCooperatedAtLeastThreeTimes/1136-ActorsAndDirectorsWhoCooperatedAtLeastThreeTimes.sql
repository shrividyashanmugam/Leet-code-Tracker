-- Last updated: 7/15/2026, 2:06:09 PM
# Write your MySQL query statement below

select actor_id, director_id
from ActorDirector
group by actor_id, director_id
having count(*) >=3