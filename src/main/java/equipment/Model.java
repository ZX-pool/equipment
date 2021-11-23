package equipment;
// class for working with table MODEL in database EQUIPMENT_SALES

import javax.persistence.*;


@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_type_id")
    private ModelType modelType; //type of external antenna connector: no, ts9, crc9 etc.


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "external_antenna_type_id")
    private ExternalAntennaType externalAntennaType; //type of external antenna connector: no, ts9, crc9 etc.

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supported_technologies_id")
    private SupportedTechnologies supportedTechnologies; // 3G, 4G etc.


    public Model() {
    }

    public Model(String name) {
        this.name = name;
    }

    public Model(String name, Manufacturer manufacturer, ModelType modelType, ExternalAntennaType externalAntennaType, SupportedTechnologies supportedTechnologies) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.modelType = modelType;
        this.externalAntennaType = externalAntennaType;
        this.supportedTechnologies = supportedTechnologies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public ExternalAntennaType getExternalAntennaType() {
        return externalAntennaType;
    }

    public void setExternalAntennaType(ExternalAntennaType externalAntennaType) {
        this.externalAntennaType = externalAntennaType;
    }

    public SupportedTechnologies getSupportedTechnology() {
        return supportedTechnologies;
    }

    public void setSupportedTechnologies(SupportedTechnologies supportedTechnologies) {
        this.supportedTechnologies = supportedTechnologies;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", modelType='" + modelType + '\'' +
                ", externalAntennaType='" + externalAntennaType + '\'' +
                ", supportedTechnologies='" + supportedTechnologies + '\'' +
                '}';
    }
}
