<%-- 
    Document   : index2
    Created on : Dec 20, 2014, 5:02:54 PM
    Author     : MEDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>signup</title>
    </head>
     <body> 
    <form name="signup" action="index.jsp" method="get" >
    
            <h3> Sign Up </h3>
            <table border="1">
                
                <tbody>
                    <tr>
                        <td>Name :</td>
                        <td><input type="text" name="Name" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>email :</td>
                        <td><input type="text" name="email" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>password :</td>
                        <td><input type="password" name="password" value="" size="30" /></td>
                    </tr>
                    
                </tbody>
            </table>
            
            <input type="submit" value="Submit" name="submit" />
            
        </form>
    </body>
</html>
