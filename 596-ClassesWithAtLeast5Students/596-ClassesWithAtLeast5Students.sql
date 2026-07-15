-- Last updated: 7/15/2026, 2:06:46 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select class from Courses group by class having count(class) >= 5;