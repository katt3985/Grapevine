package org.grapevine.core.integration.jpa.entities;

import org.grapevine.core.enums.JPABool;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
public class PasswordHash {


    private Long id;
    private String hash;
    private String salt;
    private ZonedDateTime created;

    private User user;


    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordHash password = (PasswordHash) o;
        return Objects.equals(id, password.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Password{" +
                "id=" + id +
                ", hash='" + hash + '\'' +
                ", salt='" + salt + '\'' +
                ", created=" + created +
                ", user=" + user +
                '}';
    }

    public PasswordHash() {
    }

    public PasswordHash(String hash, String salt, ZonedDateTime created, User user) {
        this.hash = hash;
        this.salt = salt;
        this.created = created;
        this.user = user;
    }

    public PasswordHash(String hash, String salt, User user) {
        this.hash = hash;
        this.salt = salt;
        this.created = ZonedDateTime.now(Clock.systemUTC());
        this.user = user;
    }
}
