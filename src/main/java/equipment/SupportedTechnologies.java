package equipment;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supported_technologies")
public class SupportedTechnologies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "about")
    private String about;

    @OneToMany(mappedBy = "supportedTechnologies", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Model> models;

    public SupportedTechnologies() {
    }

    public SupportedTechnologies(String name, String about) {
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return "SupportedTechnologies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
