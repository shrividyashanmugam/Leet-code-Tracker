-- Last updated: 7/15/2026, 2:08:39 PM
select distinct l1.num as ConsecutiveNums 
from logs as l1
join logs as l2 on l2.id = l1.id +1
join logs as l3 on l3.id = l2.id +1
where l2.num = l1.num and l3.num = l2.num





