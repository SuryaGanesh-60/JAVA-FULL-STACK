-- ============================================
-- EMPLOYEE DATABASE
-- Basic MySQL CRUD - CREATE, INSERT, SELECT
-- ============================================

-- 1. Create Database
CREATE DATABASE companydb;

-- 2. Select Database
USE companydb;


-- 3. Create Table
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    job VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50)
);


-- ============================================
-- 4. INSERT DATA
-- ============================================

-- Insert one record
INSERT INTO employees
VALUES (1, 'Ravi', 'Developer', 45000, 'Hyderabad');


-- Insert multiple records
INSERT INTO employees
VALUES
(2, 'Suresh', 'Tester', 35000, 'Vijayawada'),
(3, 'Priya', 'Developer', 50000, 'Hyderabad'),
(4, 'Anil', 'Manager', 65000, 'Chennai'),
(5, 'Sneha', 'Analyst', 40000, 'Bangalore');


-- Insert using specific columns
INSERT INTO employees
(emp_name, job, salary, city)
VALUES
('Kiran', 'Developer', 55000, 'Hyderabad');


-- Insert multiple records using specific columns
INSERT INTO employees
(emp_name, job, salary, city)
VALUES
('Arjun', 'Tester', 38000, 'Chennai'),
('Meena', 'Analyst', 42000, 'Bangalore'),
('Rahul', 'Developer', 60000, 'Hyderabad');


-- ============================================
-- 5. INSERT DATA FROM ANOTHER TABLE
-- ============================================

-- Create another table
CREATE TABLE old_employees (
    emp_id INT,
    emp_name VARCHAR(50),
    job VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50)
);


-- Insert data into old_employees
INSERT INTO old_employees
VALUES
(101, 'Vijay', 'Developer', 48000, 'Hyderabad'),
(102, 'Lakshmi', 'Tester', 36000, 'Chennai');


-- Copy data from old_employees to employees
INSERT INTO employees
(emp_id, emp_name, job, salary, city)
SELECT emp_id, emp_name, job, salary, city
FROM old_employees;


-- ============================================
-- 6. SELECT QUERIES
-- ============================================

-- Select specific columns
SELECT emp_id, emp_name, job
FROM employees;


-- Select all columns
SELECT *
FROM employees;
