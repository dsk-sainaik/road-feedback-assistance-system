package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.VechileDao;
import dto.Vechile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class VechileController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String vno = req.getParameter("vno");
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pass");
		
		Vechile vechile=new Vechile();
		vechile.setName(name);
		vechile.setMobilePhno(mobile);
		vechile.setAddress(address);
		vechile.setVechileNo(vno);
		vechile.setUserName(uname);
		vechile.setPassword(pwd);
		
		VechileDao dao=new VechileDao();
		Vechile inserted=dao.registerVechile(vechile);
		if(inserted!=null)
		{
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("Vehicle.jsp");
			dispatcher.forward(req, resp);
			
		}
		
		
		
	}
	

}
