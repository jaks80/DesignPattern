package com.ets.facadepattern;

/**
 *
 * @author yusufakhond
 */
public class FacadeMain {
    public static void main(String[] args) {
      
        Report customerHTMLReport = DataBaseHelper.generateReprt(DataBaseHelper.DBTypes.ORACLE, DataBaseHelper.ReportTypes.HTML, "Customer");
        Report agetnPDFReport = DataBaseHelper.generateReprt(DataBaseHelper.DBTypes.MYSQL, DataBaseHelper.ReportTypes.PDF, "Agent");
      
    }
}
