package br.com.gestor.pdv.gestorpdv.security;

import java.io.Serializable;
 
public class Client implements Serializable {
 
    private Long id; 
    private Long person; 
    private String paths;

    public Client() {
        this.id = null;
        this.person = null;
        this.paths = "";
    }

    public Client(Long id, Long person, String path) {
        this.id = id;
        this.person = person;
        this.paths = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public String getPaths() {
        return paths;
    }

    public void setPaths(String paths) {
        this.paths = paths;
    }

}
