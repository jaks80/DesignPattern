package com.ets.facadepattern;

import java.sql.Connection;

/**
 *
 * @author yusufakhond
 */
public class MySqlHelper {

    public static Connection getMysqlDBConnection() {
        return null;
    }

    public Report generateMySqlPDFReport(){
     return new Report();
    }
    
    public Report generateMySqlHTMLReport(){
    return new Report();
    }
}
