# Write your MySQL query statement below
SELECT a.name AS Employee FROM employee AS a, employee AS b
WHERE
a.managerId = b.Id
    AND
    a.salary > b.salary;


