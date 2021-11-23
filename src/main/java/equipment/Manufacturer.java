package equipment;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "about")
    private String about;

    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Model> models;

    public Manufacturer() {
    }

    public Manufacturer(String name, String about) {
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
