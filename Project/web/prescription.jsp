<%-- 
    Document   : success
    Created on : Mar 23, 2014, 12:25:37 AM
    Author     : slouli
--%>

<%@page import="servlets.QueryServlet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.Prescription"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prescription List</title>
    </head>
    
    
    <%! ArrayList<Prescription> prescriptionList;%>
    <% prescriptionList = (ArrayList<Prescription>) request.getAttribute("prescriptionList");%>
    
    <body>
        <%
            if (prescriptionList != null) {
        %>
        <h1>Prescriptions</h1>
        <form method="post" action="QueryServlet?query=<%= QueryServlet.PRESCRIPTIONS_QUERY %>">
            Prescription Search: <input type='text' name='prescription_query'/></br>
        <input type='submit' value='Submit Query'/>
        </form>
        <table border=1>
            <tr><th>Name</th><th>Alias</th><th>Descriptions</th></tr>
            <%
                for (Prescription p : prescriptionList) {
            %>
            <tr>
                <td><%= p.getName()%></td>
                <td><%= p.getAlias()%></td>
                <td><%= p.getDescription()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            } else {
        %>
        <p>Empty List</p>
        <%
            }
        %>        
        
    </body>
</html>
