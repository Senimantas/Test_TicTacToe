<%-- 
    Document   : index
    Created on : Aug 28, 2013, 8:56:49 AM
    Author     : pomobc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.GameBoard"%>
<%@page import="java.util.*"%>
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
        <div align="center" id="title">
              Tic-tac-toe
        </div>
    </header>
    <body>
        <div id="center" align="center">
            <div id="board">              
                <a href type="button" id="tb1" size="1" maxlength="1" onclick="f1(); win(); return false;"></a>
                <a href type="button" id="tb2" size="1" maxlength="1" onclick="f2(); win(); return false;"></a>
                <a href type="button" id="tb3" size="1" maxlength="1" onclick="f3(); win(); return false;"></a>
                <a href type="button" id="tb4" size="1" maxlength="1" onclick="f4(); win(); return false;"></a>
                <a href type="button" id="tb5" size="1" maxlength="1" onclick="f5(); win(); return false;"></a>
                <a href type="button" id="tb6" size="1" maxlength="1" onclick="f6(); win(); return false;"></a>
                <a href type="button" id="tb7" size="1" maxlength="1" onclick="f7(); win(); return false;"></a>
                <a href type="button" id="tb8" size="1" maxlength="1" onclick="f8(); win(); return false;"></a>
                <a href type="button" id="tb9" size="1" maxlength="1" onclick="f9(); win(); return false;"></a>
            </div>
                <br></br>
                <br>
                <div id="winner"></div>
                </br>
                <br></br>
                <br></br>
                <a href type="button" id="button" onclick="sessioninvalidate(); return false;">Start new game</a>
        </div>
        <div id="bottom"></div>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
        </script>
        <script>

        </script>
        <script type="text/javascript"> 
                  var check = 0;
                  var X = "X";
                  var O = "O";
                  var func1 = 0;
                  var func2 = 0;
                  var func3 = 0;
                  var func4 = 0;
                  var func5 = 0;
                  var func6 = 0;
                  var func7 = 0;
                  var func8 = 0;
                  var func9 = 0;
                  

                  function win(){
                         $("#tb1").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb2").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb3").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb4").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb5").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb6").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb7").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb8").click(function(){
                            $("#winner").load("winner.txt");
                         });
                         $("#tb9").click(function(){
                            $("#winner").load("winner.txt");
                         });
                  }
                  
                  function sessioninvalidate(){
                      request.getSession().invalidate();
                      response.sendRedirect(request.getContextPath() + "/index.jsp");
                      return;
                  }
                  function f1(){
                     if(func1===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=00' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb1").innerHTML=X; 
                              check = 1;
                              func1++;
                         }
                         else{
                             document.getElementById("tb1").innerHTML=O;
                             check=0;
                             func1++;
                         }
                     }
                  };
                  
                  function f2(){
                     if(func2===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=01' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb2").innerHTML=X; 
                              check = 1;
                              func2++;
                         }
                         else{
                             document.getElementById("tb2").innerHTML=O;
                             check=0;
                             func2++;
                         }
                     }
                  };
                  
                   function f3(){
                     if(func3===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=02' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb3").innerHTML=X; 
                              check = 1;
                              func3++;
                         }
                         else{
                             document.getElementById("tb3").innerHTML=O;
                             check=0;
                             func3++;
                         }
                     }
                  };
                  
                  function f4(){
                     if(func4===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=10' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb4").innerHTML=X; 
                              check = 1;
                              func4++;
                         }
                         else{
                             document.getElementById("tb4").innerHTML=O;
                             check=0;
                             func4++;
                         }
                     }
                  };
                  
                  function f5(){
                     if(func5===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=11' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb5").innerHTML=X; 
                              check = 1;
                              func5++;
                         }
                         else{
                             document.getElementById("tb5").innerHTML=O;
                             check=0;
                             func5++;
                         }
                     }
                  };
                  
                  function f6(){
                     if(func6===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=12' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb6").innerHTML=X; 
                              check = 1;
                              func6++;
                         }
                         else{
                             document.getElementById("tb6").innerHTML=O;
                             check=0;
                             func6++;
                         }
                     }
                   };
                  
                  function f7(){
                     if(func7===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=20' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb7").innerHTML=X; 
                              check = 1;
                              func7++;
                         }
                         else{
                             document.getElementById("tb7").innerHTML=O;
                             check=0;
                             func7++;
                         }
                     }
                  };
                  
                  function f8(){
                     if(func8===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=21' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb8").innerHTML=X; 
                              check = 1;
                              func8++;
                         }
                         else{
                             document.getElementById("tb8").innerHTML=O;
                             check=0;
                             func8++;
                         }
                     }
                  };
                  
                  function f9(){
                     if(func9===0){
                         var req = new XMLHttpRequest();
                         req.open('GET', 'http://localhost:8080/Tic-tac-toe/updateBoard?name=22' , true);
                         req.send(null);

                         if(check===0){
                              document.getElementById("tb9").innerHTML=X; 
                              check = 1;
                              func9++;
                         }
                         else{
                             document.getElementById("tb9").innerHTML=O;
                             check=0;
                             func9++;
                         }
                     }
                  };
         </script>
    </body>
</html>
