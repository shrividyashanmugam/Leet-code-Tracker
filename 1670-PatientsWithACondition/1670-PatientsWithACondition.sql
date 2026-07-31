-- Last updated: 7/31/2026, 10:16:28 AM
# Write your MySQL query statement below
SELECT 
    patient_id, 
    patient_name, 
    conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' 
   OR conditions LIKE '% DIAB1%';