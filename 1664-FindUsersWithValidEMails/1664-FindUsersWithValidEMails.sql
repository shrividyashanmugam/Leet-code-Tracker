-- Last updated: 7/31/2026, 10:16:29 AM
SELECT 
    user_id, 
    name, 
    mail
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$'
  AND BINARY mail LIKE '%@leetcode.com';