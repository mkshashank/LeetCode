SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE SALARY <> ( SELECT MAX(salary) FROM Employee);