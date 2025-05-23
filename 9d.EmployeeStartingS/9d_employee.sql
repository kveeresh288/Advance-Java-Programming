-- 9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
-- Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
-- follows using HTML and JSP to get the field and display the results respectively

CREATE TABLE Emp (
Emp_NO INTEGER PRIMARY KEY,
Emp_Name TEXT NOT NULL,
Basicsalary INTEGER
);
-- insert
INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);
INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);
