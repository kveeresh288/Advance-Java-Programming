<!-- 
 8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively -->

<%@ page import="java.sql.*, db.DBConnection" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    Connection con = null;
    PreparedStatement ps = null;

    try {
        con = DBConnection.getConnection();
        ps = con.prepareStatement("INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)");
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, salary);

        ps.executeUpdate();
        out.println("<p>Record inserted successfully!</p>");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }
%>
<a href="index.jsp">Back</a> | <a href="report.jsp">View Report</a>
