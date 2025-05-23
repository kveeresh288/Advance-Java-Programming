-- 8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
-- into the table Emp of the database Employee by getting the fields through keyboard and
-- Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
-- HTML and JSP to get the fields and display the results respectively


CREATE TABLE Emp (
Emp_NO INTEGER PRIMARY KEY,
Emp_Name TEXT NOT NULL,
Basicsalary INTEGER
);
-- insert
INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);
INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);
