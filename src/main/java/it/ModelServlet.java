package it;

import equipment.Model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/models")
public class ModelServlet extends HttpServlet {
    private ModelServices modelServices;


    public ModelServlet() {
        modelServices = ModelServices.getModelServices();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        String manufacturer = req.getParameter("manufacturer");

        List<Model> models = modelServices.getModels();
        models.stream().filter(model -> model.getManufacturer().equals(manufacturer)).forEach(System.out :: println);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String manufacturer = req.getParameter("manufacturer");
        System.out.println(manufacturer);
        List<Model> models = modelServices.getModels();
        models.stream().forEach(System.out :: println);
        //models.stream().filter(model -> model.getManufacturer().toString().equalsIgnoreCase(manufacturer)).forEach(System.out :: println);


    }
}
