/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author t.xiong
 */
public class User {
    private int id;
    private String identifant;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!    
//    ajout d'un nouvel attributs
    private String attributs;
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    public User(int id, String identifant, String nom, String prenom, String email, String motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!            
//            nouvel attributs
//            ,String attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!            
    ){
        this.id = id;
        this.identifant = identifant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.attributs = attributs;
    }
    
    public User(String identifant, String nom, String prenom, String email, String motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!            
//            nouvel attributs
//            ,String attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!    
    ) {
        this.identifant = identifant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!        
//        nouvel attributs
//        this.attributs = attributs;
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!        
    }
    
    public User(){};
    
//    --------------------------------------------------------------------------------
//    Methodes setter
    
    public void setId(int id) {
        this.id = id;
    }
    public void setIdentifant(String identifant) {
        this.identifant = identifant;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setMotDepasse(String motDePasse){
        this.motDePasse = motDePasse;
    }
    
//    --------------------------------------------------------------------------------
//    Methodes getter
    
    public int getId() {
        return this.id;
    }
    public String getIdentifant() {
        return this.identifant;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getEmail(){
        return this.email;
    }
    public String getMotDePasse(){
        return this.motDePasse;
    }

//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    methodes pour un nouvel attribut
    
//    public String getAttributs(){
//        return this.attributs;
//    }
//    public void setAttributs(String attributs){
//        this.attributs = attributs;
//    }
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
}
