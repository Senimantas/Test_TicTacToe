<%-- 
    Document   : index
    Created on : Aug 28, 2013, 8:56:49 AM
    Author     : pomobc
--%>

<%@page import="model.GameBoard"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpServletRequest;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="style.css" />
<!DOCTYPE html>
<html>
    <%GameBoard.setBoard(null);%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <header>
        <div align="center">
              <h3>Tic-tac-toe</h3>
        </div>
    </header>
    <body>
        <div id="center" align="center">
            <div id="board">              
                <a href type="button" id="tb1" size="1" maxlength="1" onclick="f1(); return false;"></a>
                <a href type="button" id="tb2" size="1" maxlength="1" onclick="f2(); return false;"></a>
                <a href type="button" id="tb3" size="1" maxlength="1" onclick="f3(); return false;"></a>
                <a href type="button" id="tb4" size="1" maxlength="1" onclick="f4(); return false;"></a>
                <a href type="button" id="tb5" size="1" maxlength="1" onclick="f5(); return false;"></a>
                <a href type="button" id="tb6" size="1" maxlength="1" onclick="f6(); return false;"></a>
                <a href type="button" id="tb7" size="1" maxlength="1" onclick="f7(); return false;"></a>
                <a href type="button" id="tb8" size="1" maxlength="1" onclick="f8(); return false;"></a>
                <a href type="button" id="tb9" size="1" maxlength="1" onclick="f9(); return false;"></a>
            </div>
                <br></br>
                <br>
                    <!-- I don't know how to make it to display the winner player -->
                    <p><%= request.getAttribute("winner") %></p>
                    <p>${winner}</p>
                </br>
                <br></br>
                <br></br>
                <a href="/Tic-tac-toe/index.jsp" type="button" id="button">Start new game</a>
        </div>
        <div id="bottom"></div>
        <script type="text/javascript"> 
                  var check = 0;
                  var X = "X";
                  var O = "O";
                  function f1(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=00' , true);
                     req.send(null);
 
                    if(check===0){
                          document.getElementById("tb1").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb1").innerHTML=O;
                         check=0;
                     }
                     
                  };
                  
                  function f2(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=01' , true);
                     req.send(null);

                     if(check===0){
                          document.getElementById("tb2").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb2").innerHTML=O;
                         check=0;
                     }
                  };
                  
                   function f3(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=02' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb3").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb3").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f4(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=10' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb4").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb4").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f5(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=11' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb5").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb5").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f6(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=12' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb6").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb6").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f7(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=20' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb7").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb7").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f8(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=21' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb8").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb8").innerHTML=O;
                         check=0;
                     }
                  };
                  
                  function f9(){
                     var req = new XMLHttpRequest();
                     req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=22' , true);
                     req.send(null);
                      
                     if(check===0){
                          document.getElementById("tb9").innerHTML=X; 
                          check = 1;
                     }
                     else{
                         document.getElementById("tb9").innerHTML=O;
                         check=0;
                     }
                  };
         </script>
    </body>
</html>
