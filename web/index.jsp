<%-- 
    Document   : index
    Created on : Aug 28, 2013, 8:56:49 AM
    Author     : pomobc
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpServletRequest;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="style.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <header>
        <h3>Tic-tac-toe!</h3>
    </header>
    <body>
        <div id="center">
            <div id="board">
                <%
           /*
                ArrayList board = (ArrayList)request.getAttribute("board");
          
            */
                %>

                <script type="text/javascript"> 
                  function f1(){
                     <%
                     ArrayList board = (ArrayList)request.getAttribute("board"); 
                     //out.print(board.get(0));
                     %>
                     document.getElementById("tb1").innerHTML=board.get(0); 
                   };
                </script>
                
                <a href="updateBoard?name=00" type="button" id="tb1" size="1" maxlength="1" on onclick="f1(); return false;"></a>
                <a href="updateBoard?name=01" type="button" id="tb2" size="1" maxlength="1" onclick="f1(); return false;"><%%></a>
                <a href="updateBoard?name=02" type="button" id="tb3" size="1" maxlength="1"></a>
                <a href="updateBoard?name=10" type="button" id="tb4" size="1" maxlength="1"></a>
                <a href="updateBoard?name=11" type="button" id="tb5" size="1" maxlength="1"></a>
                <a href="updateBoard?name=12" type="button" id="tb6" size="1" maxlength="1"></a>
                <a href="updateBoard?name=20" type="button" id="tb7" size="1" maxlength="1"></a>
                <a href="updateBoard?name=21" type="button" id="tb8" size="1" maxlength="1"></a>
                <a href="updateBoard?name=22" type="button" id="tb9" size="1" maxlength="1"></a>
            </div>
        </div>
    </body>
</html>
