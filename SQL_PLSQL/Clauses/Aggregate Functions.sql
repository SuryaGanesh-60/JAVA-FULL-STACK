SUM: Calculates total

MAX: Finds the highest salary in the emp table.

MIN:Finds lowest value

AVG: Calculates the average salary of all employees.

COUNT: Counts rows 


1)Find the highest salary.
select max(sal) from emp;

2) Find the average salary for each department.
select deptno,avg(sal) from emp group by deptno;

3) Find the number of employees working in department.
select deptno,count(*) from emp group by deptno;

4) Find the total salary for each job.
select job,sum(sal) from emp group by job;
