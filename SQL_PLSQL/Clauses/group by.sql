GROUP BY
•	GROUP BY is used to group rows that have the same values in one or more columns.
•	It is mainly used with aggregate functions.
•	Common aggregate functions used with GROUP BY are:
o	COUNT()
o	SUM()
o	AVG()
o	MIN()
o	MAX()
•	Each group produces one result row when aggregate functions are used.
•	GROUP BY can group data based on one column.
•	GROUP BY can also group data based on multiple columns.
•	WHERE filters individual rows before grouping.
•	HAVING filters groups after grouping.
•	ORDER BY can be used to sort grouped results.
•	GROUP BY does not modify the original table data.
•	Columns used in the SELECT list should generally be grouped columns or used inside aggregate functions.

1)Find the maximum salary for each job.
2)Find the minimum salary for each job.
3)Find the number of employees in the table.
4)Find the total commission for each dept wise.
5) Find the highest salary in each dept wise*/

1.select job, max(sal) from emp group by job;

2.select  job, min(sal) from emp group by job;

3.select count(*) from emp;

4.select deptno, sum(comm) from emp group by deptno;

5.select deptno, sum(sal) from emp group by deptno;
  
•	MySQL's handling of nonaggregated columns can be affected by the ONLY_FULL_GROUP_BY SQL mode.
•	NULL values are grouped together as one group.
•	Grouping can be performed on numeric, character, date, and other compatible expressions.
2. Multiple-Column GROUP BY
•	Multiple-column GROUP BY groups rows based on combinations of column values.
•	Multiple grouping columns are separated by commas.
•	The first column is the primary grouping level.
•	The second column creates subgroups within the first grouping level.
•	Additional columns create further levels of grouping.
•	Aggregate functions are calculated separately for each unique combination.
•	WHERE filters rows before multiple-column grouping.
•	HAVING filters the resulting groups.
•	ORDER BY can sort the grouped result.
•	Multiple-column grouping is useful for hierarchical or category-based analysis.

Examples
select job from emp;
select count(job) from emp;
select distinct job from emp;
select job from emp group by job;              
select distinct job, count(job) from emp; -- error
select job, count(job) from emp; -- error
select job, count(job) from emp group by job;
select deptno, job, count(job) from emp group by job; -- error
select deptno, job, count(job) from emp group by job, deptno; 
select deptno, job, sal, count(job) from emp group by job, deptno, sal; 
select job, count(job) from emp group by job having count(job)>=3;
 
from - where - group by - having - select - distinct - order by - limit

1)Find the maximum salary for each job.
2)Find the minimum salary for each job.
3)Find the number of employees in the table.
4)Find the total commission for each dept wise.
5) Find the highest salary in each dept wise*/

select job, max(sal) from emp group by job;

select  job, min(sal) from emp group by job;

select count(*) from emp;

select deptno, sum(comm) from emp group by deptno;

select deptno, sum(sal) from emp group by deptno;
