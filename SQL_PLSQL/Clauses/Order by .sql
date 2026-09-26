Create an Emp table with following columns:
empid  
ename  
deptno  
sal 
Mgr
Comm
Hiredate 
Establish  relation between two tables using foreign key constraint 

ORDER BY Operations:

Display all employees in ascending order of salary.
select * from emp order by sal asc;

Display all employees in descending order of salary.
select * from emp order by sal desc;

Display employees in descending order of joining date.
select * from emp order by hiredate desc;

Display employees first by department in ascending order and then by salary in descending order.
select * from emp order by deptno asc , sal desc;

Field Function():

select * from emp order by 
field(job,
'manager','president','analyst','Salesman','clerk'
);
