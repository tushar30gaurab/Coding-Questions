# Write your MySQL query statement below
SELECT DISTINCT(num) AS ConsecutiveNums from logs
where ((id+1, num) in (select id,num from logs) and
(id+2, num) in (select id, num from logs));