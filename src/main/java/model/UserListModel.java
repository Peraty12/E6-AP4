/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author t.xiong
 */
public class UserListModel extends AbstractTableModel {
    
    //Attributs
    
    //Column name in a String array
    String[] columnNames = {"Id", "Nom", "Prenom", "Mail"};
    
    
    
    private ArrayList<User> usersList = new ArrayList<User>();

    public UserListModel() {
        this.usersList.add(new User(1,"Xiong","Teddy","t.xiong@gmail.com"));
        this.usersList.add(new User(2,"Sage","Mateo","m.sage@gmail.com"));
        this.usersList.add(new User(3,"Ethane","Zimmermann","e.zimmermann@gmail.com"));
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
                return i.getNom();
            case 2 :
                return i.getPrenom();
            case 3 :
                return i.getMail();
        }
        return null;
    }
}
