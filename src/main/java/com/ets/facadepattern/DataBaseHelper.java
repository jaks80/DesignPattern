package com.ets.facadepattern;

import java.sql.Connection;

/**
 *
 * @author yusufakhond
 */
public class DataBaseHelper {

    public static Report generateReprt(DBTypes dbType, ReportTypes reportType, String tableName) {

        Connection connection;
        Report report = null;

        switch (dbType) {
            case MYSQL:
                MySqlHelper.getMysqlDBConnection();
                MySqlHelper helper = new MySqlHelper();

                switch (reportType) {
                    case HTML:
                        return report = helper.generateMySqlHTMLReport();
                    case PDF:
                        return report = helper.generateMySqlPDFReport();
                }
                break;

            case ORACLE:
                OracleHelper.getOracleDBConnection();
                OracleHelper helper1 = new OracleHelper();

                switch (reportType) {
                    case HTML:
                        return report = helper1.generateOracleHTMLReport();
                    case PDF:
                        return report = helper1.generateOraclePDFReport();
                }
                break;
        }
        return report;
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}
