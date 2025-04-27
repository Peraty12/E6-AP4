/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;
import view.MainView;
import model.UserListModel;
import view.DeleteUserDialog;

/**
 *
 * @author t.xiong
 */
public class MainControl implements PropertyChangeListener{
    
    private MainView view = new MainView();
    private UserListModel userListModel;
    

    public MainControl(MainView v)  {
        this.userListModel = new UserListModel();
        this.view = v;
        this.view.addPropertyChangeListener(this);
        this.view.setTableModel(userListModel);
        
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch(evt.getPropertyName()){
            case "btnClick":
                JOptionPane.showMessageDialog(this.view, this.view.message("clic utilisateur !"));
                break;                
        }
    }
    
}
