<!-- 9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively -->

<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<%
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

        boolean hasData = false;
        while (rs.next()) {
            hasData = true;
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getDouble("price") %></td>
    </tr>
<%
        }
        if (!hasData) {
%>
    <tr><td colspan="3" style="text-align:center;">No records found.</td></tr>
<%
        }

        rs.close();
        stmt.close();
    } catch (Exception e) {
        out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
    } finally {
        conn.close();
    }
%>
</table>
