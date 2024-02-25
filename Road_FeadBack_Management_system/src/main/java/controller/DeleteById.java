package controller;

import java.io.IOException;

import dao.AddVechileDao;
import dto.Add_Vechile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteById extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
     int id= Integer.parseInt( req.getParameter("id"));
     System.out.println(id);
     
     AddVechileDao addVechileDao=new AddVechileDao();
     Add_Vechile add_Vechile=addVechileDao.deleteById(id);
     if(add_Vechile!=null)
     {
    	 RequestDispatcher dispatcher = req.getRequestDispatcher("ViewDetails.jsp");
         dispatcher.forward(req, resp); 
     }

        
    }
}
