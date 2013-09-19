/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.servlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        PrintWriter out = null;
        
         try{
            String path = getServletContext().getRealPath("/winner.txt");
            out = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
           
            } catch (IOException ex) {

         }
                     
        if(GameBoard.getBoard()==null){
            GameBoard gb = GameBoard.getInstance();
            gb.setXorO(locX, locY);  
            gb.print();
            }
        
        else{
             GameBoard gb = GameBoard.getInstance();
             if(GameBoard.getBoard()[locX][locY]==null){
                    gb.setXorO(locX, locY);
                    gb.print();
                    if(gb.checkWinner()==true){
                        if(GameBoard.getPlayer()==1){
                            String winner = "Winner!!! Player 2 won the game!";
                            System.out.println(winner);
                            out.print(winner); out.close();
                        }
                        else if(GameBoard.getPlayer()==2){
                            String winner = "Winner!!! Player 1 won the game!";
                            System.out.println(winner);
                            out.print(winner); out.close();
                        }
                    }
                }
        }
               
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
