# Write your MySQL query statement below
SELECT Customers.name AS Customers
FROM
Customers
WHERE
Customers.id NOT IN
(
SELECT Orders.CustomerId FROM Orders
);