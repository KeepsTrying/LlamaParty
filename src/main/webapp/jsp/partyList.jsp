<%-- 
    Document   : partyList
    Created on : Jun 22, 2017, 11:38:27 AM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RSVP'd ballas!</title>
    </head>
    <body>
        <h1>Here's the other cool peeps coming to the party:</h1>
        
        <hr/>
        
        <p>
            <c:forEach var="guest" items="${partyGoers}">
                <c:out value="${guest}"/><br/>
            </c:forEach>
        </p>
        
        <br/>
        
        <a href="/LlamaParty/">Click Here</a> to RSVP a friend!
        
        
    </body>
</html>
