package controller;

import java.io.IOException;

import dao.VechileDao;
import dto.Vechile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String vno = req.getParameter("vno");
		String pwd = req.getParameter("pass");
		VechileDao dao=new VechileDao();
		Vechile vechileDataBase=dao.fetechByUserName(vno, pwd);
		if(vechileDataBase!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("vno",vno);
			RequestDispatcher dispatcher=req.getRequestDispatcher("VehicleHome.jsp");
			dispatcher.forward(req, resp);
		}
			
		
	}
	

}
