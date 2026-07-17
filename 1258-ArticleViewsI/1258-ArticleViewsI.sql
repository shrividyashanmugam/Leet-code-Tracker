-- Last updated: 7/17/2026, 3:18:41 PM
# Write your MySQL query statement below
select author_id as id from Views where author_id=viewer_id group by author_id order by author_id asc