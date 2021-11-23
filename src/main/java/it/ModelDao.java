package it;

import equipment.Model;
import java.util.List;

public class ModelDao {
    String READ_ALL = "SELECT " +
            "    mn.name AS manufacturer," +
            "    m.name AS model_name," +
            "    mt.name AS model_type," +
            "    eat.name AS external_antenna_type," +
            "    st.name AS supported_technologies" +
            "      FROM model m" +
            "        JOIN manufacturer mn ON m.manufacturer_id = mn.id" +
            "        JOIN model_type mt ON m.model_type_id = mt.id" +
            "        JOIN external_antenna_type eat ON m.external_antenna_type_id = eat.id" +
            "        JOIN supported_technologies st ON m.supported_technologies_id = st.id ;";
    public List<Model> findAll() {
        return (List<Model>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Model").list();
    }
}
