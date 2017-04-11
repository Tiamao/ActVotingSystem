package voting.models;

import javax.persistence.*;

/**
 * Created by Kamil on 10.04.2017.
 */
@Entity
@Table(name = "proxy")
public class Proxy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int proxyID;
    private int ownUserID;
    private int sphereID;

    public Proxy() {
    }

    public Proxy(int proxyID, int ownUserID, int sphereID) {
        this.proxyID = proxyID;
        this.ownUserID = ownUserID;
        this.sphereID = sphereID;
    }

    public int getProxyID() {
        return proxyID;
    }

    public void setProxyID(int proxyID) {
        this.proxyID = proxyID;
    }

    public int getOwnUserID() {
        return ownUserID;
    }

    public void setOwnUserID(int ownUserID) {
        this.ownUserID = ownUserID;
    }

    public int getSphereID() {
        return sphereID;
    }

    public void setSphereID(int sphereID) {
        this.sphereID = sphereID;
    }
}
