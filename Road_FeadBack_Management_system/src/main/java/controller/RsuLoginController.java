package controller;

import java.io.IOException;

import dao.RsuDao;
import dto.Rsu;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RsuLogin")
public class RsuLoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("uname");
		String password=req.getParameter("pass");
		RsuDao dao=new RsuDao();
		Rsu rsuDb=dao.fetechByUserName(userName, password);
		if(rsuDb.getUserNameRsu().equals(userName)&&rsuDb.getPassWordRsu().equals(password))
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("RSUHome.jsp");
			dispatcher.forward(req, resp);
		}
		
	}

}
