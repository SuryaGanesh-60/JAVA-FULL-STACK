1.Find departments having more than 3 employees.
select deptno,count(deptno) from emp group by deptno having count(deptno) >=3;

2)Find jobs having more than 2 employees.
select job, count(*) from emp group by job having count(*)>=2; 

3)Find departments where the average salary is greater than 2000.
select deptno,avg(sal) from emp group by deptno having avg(sal)>=2000;

