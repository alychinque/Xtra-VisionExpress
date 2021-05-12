/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;


/**
 *
 * @author alych
 */
public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection conn) {
        this.connection = conn;
    }

    
}
