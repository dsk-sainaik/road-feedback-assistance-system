package controller;

import java.io.IOException;

import dao.TaDao;
import dto.Ta;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AdminLogin")
public class TaLoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userNmae=req.getParameter("uname");
		String password=req.getParameter("pass");
		TaDao taDao=new TaDao();
		Ta ta=taDao.fetchByuserName(userNmae, password);
		if(ta!=null)
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("AuthorityHome.jsp");
			dispatcher.forward(req, resp);
		}
		
	}

}
