<!-- 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively -->

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head><title>Update Status</title></head>
<body>
    <%
        String msg = request.getParameter("msg");
        if ("success".equals(msg)) {
    %>
        <h3 style="color: green;">Record updated successfully!</h3>
    <%
        } else {
    %>
        <h3 style="color: red;">Failed to update record. Check Emp No.</h3>
    <%
        }
    %>
    <a href="index.jsp">Go Back</a>| <a href="report.jsp">View Report</a>
</body>
</html>
