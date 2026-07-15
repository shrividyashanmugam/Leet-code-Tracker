-- Last updated: 7/15/2026, 2:08:35 PM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;