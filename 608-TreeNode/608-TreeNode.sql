-- Last updated: 7/15/2026, 2:06:41 PM
# Write your MySQL query statement below

select id, case 
    when p_id  is null then 'Root'
    when id  In (select distinct p_id from tree where p_id is not null) then 'Inner'
    else 'Leaf'
    end as  type  
    from  Tree order by id