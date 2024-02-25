package controller;

import java.io.IOException;

import org.hibernate.boot.model.source.spi.CascadeStyleSource;

import dao.AddVechileDao;
import dto.Add_Vechile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/transfer")
public class Transfer extends HttpServlet {
	@Override

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);

		AddVechileDao addVechileDao = new AddVechileDao();

		Add_Vechile add_Vechile = addVechileDao.findById(id);
		add_Vechile.setStatus("authority");
		Add_Vechile add_Vechile2 = addVechileDao.update(id, add_Vechile);
		System.out.println(add_Vechile2);
		RequestDispatcher dispatcher = req.getRequestDispatcher("RSU_VehicleData.jsp");
		dispatcher.forward(req, resp);



	}
}
