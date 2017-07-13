<%-- 
    Document   : rsvpSplash
    Created on : Jun 22, 2017, 10:58:59 AM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>rsvp initial form</title>
    </head>
    <body>
        <h1>RSVP to my AWESOME Llama Party</h1>
        <hr/>
        
        <form method="POST" action="rsvp">
            <label for="userName">Your Name:</label>
            <input type="text" name="userName" placeholder="Your name here!"/><br/>
            <label for="numOfLlamas"># of Llamas bringing:</label>
            <input type="number" name="numOfLlamas"/><br/>
            
            <input type="radio" name="attending" value="yes" checked/>Hell yeah!
            <br/>
            <input type="radio" name="attending" value="no"/>No =(
            <br/>
            <input type="submit" value="Submit" name="submitButton"/>
        </form>
        
        
        
        
    </body>
</html>
