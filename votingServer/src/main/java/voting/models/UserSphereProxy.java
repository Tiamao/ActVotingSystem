package voting.models;

import javax.persistence.*;

/**
 * Created by Kamil on 10.04.2017.
 */

@Entity
@Table(name = "usersphereproxy")
public class UserSphereProxy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uspID;
    private int userID;
    private int sphereID;
    private int proxyID;

    public UserSphereProxy() {
    }

    public UserSphereProxy(int uspID, int userID, int sphereID, int proxyID) {
        this.uspID = uspID;
        this.userID = userID;
        this.sphereID = sphereID;
        this.proxyID = proxyID;
    }

    public int getUspID() {
        return uspID;
    }

    public void setUspID(int uspID) {
        this.uspID = uspID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSphereID() {
        return sphereID;
    }

    public void setSphereID(int sphereID) {
        this.sphereID = sphereID;
    }

    public int getProxyID() {
        return proxyID;
    }

    public void setProxyID(int proxyID) {
        this.proxyID = proxyID;
    }
}
