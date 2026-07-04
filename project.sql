create database universe;
use universe;

create table employee(
emp_id int primary key,
emp_name varchar(50),
department_id int,
salary int);

insert into employee values
(1, "ram",01,45000),
(2,"shyam",02,46000),
(3,"gita",03,32000),
(4, "simran",04,50000);

create table department(
department_id int primary key,
department_name varchar(50));

insert into department values
(01, "finance"),
(02,"marketing"),
(03,"finace"),
(04, "marketing");

select emp_name,department_name ,salary from employee as a
JOIN department as b
on a.department_id = b.department_id
ORDER BY salary desc
LIMIT 3;

select department_name,SUM(a.salary) from employee as a 
JOIN department as b
on a.department_id =  b.department_id
group by department_name;


ALTER table employee
ADD COLUMN emp_hours int ;

UPDATE employee
SET emp_hours = 4
where emp_id =1;

UPDATE employee
SET emp_hours=
CASE 
   WHEN emp_id = 2 THEN 4
   END;

 
 