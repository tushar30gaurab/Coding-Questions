# Write your MySQL query statement below
# SELECT Department, Employee, Salary FROM(
# SELECT d.name AS Department, e.name AS Employee,  
# RANK() OVER(ORDER BY e.salary DESC), e.salary AS Salary
# FROM Employee e LEFT JOIN Department d 
# ON e.departmentId = d.id
# )  as t

# SELECT d.name AS Department, e.name AS Employee, MAX(Salary) as Salary
# FROM Employee e LEFT JOIN Department d
# ON e.departmentId = d.id
# Group BY Salary;


SELECT d.name as Department, e.name as Employee, Salary
FROM Employee e LEFT JOIN Department d 
ON e.departmentId = d.id
WHERE (departmentId, Salary) IN (SELECT departmentId, MAX(Salary) 
FROM Employee GROUP BY departmentId);