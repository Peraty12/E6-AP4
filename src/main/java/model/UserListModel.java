/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.UserDao;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author t.xiong
 */
public class UserListModel extends AbstractTableModel {
    
    //Attributs
    
    private UserDao userdao = new UserDao();
    //Column name in a String array
    String[] columnNames = {"Id_utilisateur", "Identifiant", "Nom", "Prenom", "Email", "Mot_de_passe"
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//            nouvel attributs
//            , "Attributs"
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    };
    
    
    
    private ArrayList<User> usersList = new ArrayList<User>();

    public UserListModel() {
        this.usersList = userdao.getAll();
    }
    
    public void addUserList(String identifiant, String nom, String prenom, String email, String motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//            nouvel attributs
//            ,String attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    )
    {
        User dbUser = this.userdao.insertUser(new User(identifiant, nom, prenom, email, motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                nouvel attributs
//        ,attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ));
        usersList.add(dbUser);
        this.usersList = userdao.getAll();
        this.fireTableDataChanged();
    }
    
    public void updateUser(int id, String identifiant, String nom, String prenom, String email, String motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//            nouvel attributs
//            ,String attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    )
    {
        User dbuser = this.userdao.updateUser(new User(id, identifiant, nom, prenom, email, motDePasse
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                nouvel attributs
//                ,attributs
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ));
        this.usersList = userdao.getAll();
        this.fireTableDataChanged();
    }
    
    public void userDelete(int identifiant){
        this.userdao.deleteUser(identifiant);
        this.usersList = userdao.getAll();
        this.fireTableDataChanged();
    }
    
    public String getColumnName(int column){
        return this.columnNames[column];
    }
    
    public int getRowCount(){
        return this.usersList.size();
    }
    
    public int getColumnCount(){
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User i = usersList.get(rowIndex);
        switch (columnIndex) {
            case 0 :
                return i.getId();
            case 1 :
                return i.getIdentifant();
            case 2 :
                return i.getNom();
            case 3 :
                return i.getPrenom();
            case 4 :
                return i.getEmail();
            case 5 :
                return i.getMotDePasse();
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                
//                nouvel attributs
//            case 6 :
//                return i.getAttributs();
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                
        }
        return null;
    }
}
