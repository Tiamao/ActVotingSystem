package voting.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kamil on 10.04.2017.
 */

@Entity
@Table(name = "vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int voteID;
    private int actID;
    private Date deadline;
    private boolean vote;
    private int userID;
    private boolean isProxy;

    public Vote() {
    }

    public Vote(int actID, Date deadline, boolean vote, int userID, boolean isProxy) {
        this.actID = actID;
        this.deadline = deadline;
        this.vote = vote;
        this.userID = userID;
        this.isProxy = isProxy;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }

    public int getActID() {
        return actID;
    }

    public void setActID(int actID) {
        this.actID = actID;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isProxy() {
        return isProxy;
    }

    public void setProxy(boolean proxy) {
        isProxy = proxy;
    }
}

