package br.com.gestor.pdv.gestorpdv.person;

import com.sun.jersey.api.client.Client;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person implements Serializable {

    private Long id;

    private String name;

    private String dddPhone;

    private String phone;

    private String dddMobilePhone;

    private String mobilePhone;

    private String document;

    private Date recordDate;

    private DocumentType documentType;

    private Client client;

    private String email;

    public Person() {
        this.id = null;
        this.name = "";
        this.phone = "";
        this.mobilePhone = "";
        this.document = "";
        this.recordDate = new Date();
        this.documentType = null;
        this.client = null;
        this.email = "";
    }

    public Person(Long id, String name, String midleName, String phone, String mobilePhone, String document, Date recordDate, DocumentType documentType, Client client, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.document = document;
        this.recordDate = recordDate;
        this.documentType = documentType;
        this.client = client;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            email = "";
        }
        if (email.length() < 10) {
            email = "";
        }
        this.email = email;
    }

      
    public String getDddPhone() {
        return dddPhone;
    }

    public void setDddPhone(String dddPhone) {
         
        this.dddPhone = dddPhone;
    }

    public String getDddMobilePhone() {
        if (dddMobilePhone != null) {
            if (dddMobilePhone.length() < 2) {
                dddMobilePhone = "";
            }
            try {
                if (Integer.parseInt(dddPhone) < 10) {
                    dddPhone = "";
                }
            } catch (NumberFormatException e) {

            }
        }
        return dddMobilePhone;
    }

    public void setDddMobilePhone(String dddMobilePhone) {
        this.dddMobilePhone = dddMobilePhone;
    }

     

    public List getListDDDs() {
        List list = new ArrayList();
        for (int i = 10; i < 99; i++) {
            list.add("" + i);
        }
        return list;
    }

}
