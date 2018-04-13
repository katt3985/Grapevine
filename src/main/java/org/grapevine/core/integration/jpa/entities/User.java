package org.grapevine.core.integration.jpa.entities;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class User {


    private String username;

    private List<Rights> rights;

    private String flare;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Rights> getRights() {
        return rights;
    }

    public void setRights(List<Rights> rights) {
        this.rights = rights;
    }

    public String getFlare() {
        return flare;
    }

    public void setFlare(String flare) {
        this.flare = flare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", rights=" + rights +
                ", flare='" + flare + '\'' +
                '}';
    }
}
