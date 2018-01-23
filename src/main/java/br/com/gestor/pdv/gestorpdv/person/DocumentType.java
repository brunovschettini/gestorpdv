package br.com.gestor.pdv.gestorpdv.person;

import java.io.Serializable;

 
public class DocumentType implements  Serializable {

 
    private Long id;    
    private String name;

    public DocumentType() {
        this.id = null;
        this.name = "";
    }

    public DocumentType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 

}
