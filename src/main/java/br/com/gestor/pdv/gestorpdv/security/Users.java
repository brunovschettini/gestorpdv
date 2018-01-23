package br.com.gestor.pdv.gestorpdv.security;

import br.com.gestor.pdv.gestorpdv.person.Person; 
import java.io.Serializable;

public class Users implements Serializable {

    private Long id;
    private Person person;
    private String email;
    private String password;
    private boolean active;
    private String confirmCode;
    private String nickname;
    private Client client;
    private LevelUser levelUser;

    public Users() {
        this.id = null;
        this.person = new Person();
        this.email = "";
        this.password = "";
        this.active = false;
        this.confirmCode = "";
        this.nickname = "";
        this.client = null;
        this.levelUser = null;
    }

    public Users(Long id, Person person, String email, String password, boolean active, String confirmCode, String nickname, Client client, LevelUser levelUser) {
        this.id = id;
        this.person = person;
        this.email = email;
        this.password = password;
        this.active = active;
        this.confirmCode = confirmCode;
        this.nickname = nickname;
        this.client = client;
        this.levelUser = levelUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LevelUser getLevelUser() {
        return levelUser;
    }

    public void setLevelUser(LevelUser levelUser) {
        this.levelUser = levelUser;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
