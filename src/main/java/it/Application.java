package it;

import equipment.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Application {
    public static void main(String[] args)  {



        ModelServices modelServices = ModelServices.getModelServices();
        List<Model> listModels = modelServices.getModels();

        // if FetchType is LAZY - first reading is incorrect
        System.out.println("____________First reading______________");
        listModels.forEach(System.out::println);

        System.out.println("____________SecondReading______________");
        listModels.forEach(System.out::println);

    }

}
