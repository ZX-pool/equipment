package equipment;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "external_antenna_type")
public class ExternalAntennaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "about")
    private String about;

    @OneToMany(mappedBy = "externalAntennaType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Model> models;

    public ExternalAntennaType() {
    }

    public ExternalAntennaType(String name, String about) {
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return "ExternalAntennaType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
