package br.com.gestor.pdv.gestorpdv.security;

import java.io.Serializable;
 
public class LevelUser implements  Serializable {

   
    private Long id; 
    private LevelUser levelUser;    
    private String name;     
    private String nickname;   
    private String details;   
    private Integer numberLevel;

    public LevelUser() {
        this.id = null;
        this.levelUser = null;
        this.name = "";
        this.nickname = "";
        this.details = "";
        this.numberLevel = 0;
    }

    public LevelUser(Long id, LevelUser levelUser, String name, String nickname, String details, Integer numberLevel) {
        this.id = id;
        this.levelUser = levelUser;
        this.name = name;
        this.nickname = nickname;
        this.details = details;
        this.numberLevel = numberLevel;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LevelUser getLevelUser() {
        return levelUser;
    }

    public void setLevelUser(LevelUser levelUser) {
        this.levelUser = levelUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getNumberLevel() {
        return numberLevel;
    }

    public void setNumberLevel(Integer numberLevel) {
        this.numberLevel = numberLevel;
    }

     

}
