package it;

import equipment.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelServices {
    private List<Model> models;
    private ModelDao modelDao;

    //Singleton
    private static ModelServices modelServices;

    private ModelServices() {
        List<Model> models  = new ArrayList<>();
        modelDao = new ModelDao();
    }

    public static ModelServices getModelServices() {
        if (modelServices == null) {
            modelServices = new ModelServices();
        }
        return modelServices;
    }

    public List<Model> getModels() {
        models = modelDao.findAll();
        return models;
    }
}
