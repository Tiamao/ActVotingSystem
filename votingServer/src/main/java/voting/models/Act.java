package voting.models;

import javax.persistence.*;

/**
 * Created by Kamil on 10.04.2017.
 */
@Entity
@Table(name = "act")
public class Act {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int actID;
    private String name;
    private String description;
    private int sphereID;

    public Act() {
    }

    public Act(int actID, String name, String description, int sphereID) {
        this.actID = actID;
        this.name = name;
        this.description = description;
        this.sphereID = sphereID;
    }

    public int getActID() {
        return actID;
    }

    public void setActID(int actID) {
        this.actID = actID;
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

    public int getSphereID() {
        return sphereID;
    }

    public void setSphereID(int sphereID) {
        this.sphereID = sphereID;
    }
}
