<%-- 
    Document   : index
    Created on : Dec 20, 2014, 1:58:40 PM
    Author     : MEDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title> 
    </head>
    <body> 
    <form name="login" action="NewServlet" method="get">
       
       
            <h3> LOGIN </h3>
            <table border="1">
                
                <tbody>
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
             <h3> Or  </h3>
    <form name="signup" action="index2.jsp">
        <input type="submit" value="Sign Up" name="SignUp" />
    </form>
    </body>
</html>