package controller;

import java.io.IOException;
//execute only once to insert Ta username and password

import dao.TaDao;
import dto.Ta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AdminRegister")
public class InsertTaController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Ta ta=new Ta();
		ta.setUserNameTa("authority");
		ta.setPassWordTa("authority");
		TaDao dao=new TaDao();
		dao.insertTa(ta);
		System.out.println("sucess");
	}

}
