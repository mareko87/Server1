/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import form.DBConnectionForm;

/**
 *
 * @author marek
 */
public class Start {
    
    public static void main(String[] args) {
        DBConnectionForm dbConnectionForm = new DBConnectionForm();
        dbConnectionForm.setLocationRelativeTo(null);
        dbConnectionForm.setVisible(true);
    }
    
}
