package com.ets.facadepattern;

import java.sql.Connection;

/**
 *
 * @author yusufakhond
 */
public class OracleHelper {

    public static Connection getOracleDBConnection() {
        return null;
    }

    public Report generateOraclePDFReport() {
        return new Report();
    }

    public Report generateOracleHTMLReport() {
        return new Report();
    }
}
