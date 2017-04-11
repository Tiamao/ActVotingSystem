package voting.models;

import javax.persistence.*;

/**
 * Created by Kamil on 10.04.2017.
 */
@Entity
@Table(name = "sphere")
public class Sphere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sphereID;
    private String name;
    private String description;

    public Sphere() {
    }

    public Sphere(int sphereID, String name, String description) {
        this.sphereID = sphereID;
        this.name = name;
        this.description = description;
    }

    public int getSphereID() {
        return sphereID;
    }

    public void setSphereID(int sphereID) {
        this.sphereID = sphereID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
