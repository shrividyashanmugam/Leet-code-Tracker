-- Last updated: 7/15/2026, 2:08:45 PM
# Write your MySQL query statement below
SELECT 
    (
            SELECT DISTINCT salary
                    FROM Employee
                            ORDER BY salary DESC
                                    LIMIT 1 OFFSET 1
                                        ) AS SecondHighestSalary;