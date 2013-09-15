/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.GameBoard;

/**
 *
 * @author pomobc
 */
@WebServlet(name = "updateBoard", urlPatterns = {"/updateBoard"})
public class updateBoard extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          
        String loc = request.getParameter("name");
        int locX = Integer.parseInt(loc.substring(0, 1));
        int locY = Integer.parseInt(loc.substring(1, 2));
              
        ArrayList list = new ArrayList();
        PrintWriter out = response.getWriter();
        
        if(GameBoard.getBoard()==null){
            GameBoard gb = GameBoard.getInstance();
            gb.setXorO(locX, locY);  
            gb.print();
            }
        
        else{
             String array[][] = GameBoard.getBoard();
             GameBoard gb = GameBoard.getInstance();
             if(GameBoard.getBoard()[locX][locY]==null){
                    gb.setXorO(locX, locY);
                    gb.print();
                    if(gb.checkWinner()==true){
                        if(GameBoard.getPlayer()==1){
                            String winner = "Winner!!! Player 2 won the game!";
                            System.out.println(winner);
                            request.setAttribute("winner", winner);
                            request.getRequestDispatcher("/Tic-tac-toe/index.jsp").forward(request, response);
                        }
                        else if(GameBoard.getPlayer()==2){
                            String winner = "Winner!!! Player 1 won the game!";
                            System.out.println(winner);
                            request.setAttribute("winner", winner);
                            request.getRequestDispatcher("/Tic-tac-toe/index.jsp").forward(request, response);
                        }
                       
                    }
                }
        }
        
//        String[][] resp = GameBoard.getBoard();
//        for (String[] a : resp) 
//        list.addAll(Arrays.asList(a));
//        System.out.println(list.toString());
        
//        request.setAttribute("board",list);
//        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Updating game board";
    }// </editor-fold>
}
