Where Clause Operators:
  =	>	<	>=	<=	!=	<>
and
or
in			simplified version of or		in (list of values)
between	including starting and including ending value
not			not between, not in
is null		=null  - do not compare null with equality operator


1.Display employees whose salary is greater than 1500 and department number is 30.
  select * from emp where sal>1500 and deptno=10;


2)Display employees whose salary is between 1000 and 2500.
  select * from emp where sal between 1000 and 2500;


3)Display employees who are not working in department 10.
  select * from emp where deptno !=10;

4)Display employees whose commission is NULL.
  select * from emp where comm is null

  
5)Display employees whose name starts with S.
  select * from emp where ename like 'S%';


6)Display employees whose name starts with A.
  select * from emp where ename like 'A%';
  


