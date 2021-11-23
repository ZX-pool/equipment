package equipment;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "model_type")
public class ModelType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "about")
    private String about;

    @OneToMany(mappedBy = "modelType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Model> models;

    public ModelType() {
    }

    public ModelType(String name, String about) {
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return "ModelType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
