-- Last updated: 7/15/2026, 2:08:37 PM
SELECT 
    e1.name AS Employee
FROM 
    Employee e1
JOIN 
    Employee e2 ON e1.managerId = e2.id
WHERE 
    e1.salary > e2.salary;
