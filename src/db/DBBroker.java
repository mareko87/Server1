/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author marek
 */
public class DBBroker {
    private static DBBroker instance;
    private Connection connection;
    
    public static String jdbc;
    public static String localhost;
    public static String dbName;
    public static String username;
    public static String password;
    
/**privatni konstruktor*/
private DBBroker(){
        try {
            connection = DriverManager.getConnection("jdbc:" + "://localhost:" + localhost + "/" + dbName, username, password);
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
            connection = null;
        }

}

/**dohvatanje konekcije*/
public Connection getConnection(){
    return connection;
}

/**instanciranje brokera*/
public static DBBroker getInstance(){
    if(instance == null)
        instance = new DBBroker();
    return instance;
    
    /**
     * CRUD operacije nad bazom
     */
}
//public List<AbstractDomainObject> select(AbstractDomainObject ado){
////    implementirati
//return ado.getList(rs);
//}
//   
//public PreparedStatement insert(AbstractDomainObject ado){
////    implementirati
//return ps;
//}
//
//public void update(AbstractDomainObject ado){
////    implementirati
//s.executeUpdate(query);
//}
//
//public void delete(AbstractDomainObject ado){
////    implementirati
//s.executeUpdate(query);
//}




}


        