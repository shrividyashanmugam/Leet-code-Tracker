-- Last updated: 7/17/2026, 3:18:24 PM
# Write your MySQL query statement below
SELECT 
    teacher_id, 
    COUNT(DISTINCT subject_id) AS cnt
FROM 
    Teacher
GROUP BY 
    teacher_id;