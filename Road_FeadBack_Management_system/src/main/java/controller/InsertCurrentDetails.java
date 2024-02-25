package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.AddVechileDao;
import dto.Add_Vechile;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AddVechileDetails")
public class InsertCurrentDetails extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String vno = req.getParameter("vno");
        String clocation = req.getParameter("clocation");
        String roadCondition = req.getParameter("road");
        String trafficCongestion = req.getParameter("traffic");
        String speed = req.getParameter("speed");
        
        // Date
        Date d = new Date();
        SimpleDateFormat smp = new SimpleDateFormat("dd:MM:yyyy");
        String dd = smp.format(d);
        
        Add_Vechile add_vechiles = new Add_Vechile();
        add_vechiles.setVechileNo(vno); // Corrected line
        add_vechiles.setLocation(clocation);
        add_vechiles.setRoadCondition(roadCondition);
        add_vechiles.setSpeed(speed);
        add_vechiles.setDate(dd);
        add_vechiles.setTraffic(trafficCongestion);
        
        System.out.println(add_vechiles.getVechileNo());
        
         AddVechileDao addVechileDao = new AddVechileDao();
         Add_Vechile add_Vechile = addVechileDao.addVechileData(add_vechiles);
         if (add_Vechile != null) {
             RequestDispatcher dispatcher = req.getRequestDispatcher("AddDetails.jsp");
             dispatcher.forward(req, resp);
         }
    }
}
