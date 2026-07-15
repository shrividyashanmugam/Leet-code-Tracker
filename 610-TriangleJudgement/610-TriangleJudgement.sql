-- Last updated: 7/15/2026, 2:06:40 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle