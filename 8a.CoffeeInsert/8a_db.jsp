<!-- 
8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively

code: JSP 
-->


<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test"; // XAMPP MySQL
    String user = "root"; // XAMPP default MySQL user
    String password = ""; // XAMPP MySQL has no password by default

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, user, password);
%>
