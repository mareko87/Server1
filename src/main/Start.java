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
        /**tacka ulaza - main metoda
         *instanciram formu za konektovanje na bazu*/
        DBConnectionForm dbConnectionForm = new DBConnectionForm();    
        dbConnectionForm.setLocationRelativeTo(null);
        /**postaje vidljiva*/
        dbConnectionForm.setVisible(true);
    }
    
}
