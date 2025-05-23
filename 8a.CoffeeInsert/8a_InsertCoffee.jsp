<!-- 
8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively

code: JSP 
-->

<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>
<%
    try {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        PreparedStatement ps = conn.prepareStatement("INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);

        int result = ps.executeUpdate();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        conn.close();
    }

    // Redirect back to main page
    response.sendRedirect("index.jsp");
%>
