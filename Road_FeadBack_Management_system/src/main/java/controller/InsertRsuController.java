package controller;

import java.io.IOException;



//execute only once to insert rsu username and password

//   "/RsuRegister" place this in rsu.jsp in form action




import dao.RsuDao;
import dto.Rsu;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RsuRegister")
public class InsertRsuController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Rsu rsu=new Rsu();
		rsu.setUserNameRsu("rsu");
		rsu.setPassWordRsu("rsu");
		RsuDao dao=new RsuDao();
		dao.insertRsu(rsu);
		System.out.println("sucess");
	}
	
	
	

}
