-- Last updated: 7/15/2026, 2:06:55 PM
select e.name ,
       b.bonus
from Employee e
left join Bonus b
    on e.empId = b.empId
where b.bonus < 1000 
or b.bonus is NULL;