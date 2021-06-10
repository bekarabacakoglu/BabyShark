package Test_Automation.API;

import java.sql.*;

public class DBConnection {

    public static String selectSql(String sql,Integer columnindex) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {


        //Ahmet Mesut Erçıkan
        String hostName = "192.168.0.40";
        String dbName = "SALCATEST_MSCRM";
        String user = "CrmSqlUser";
        String password = "CrmSqlPass";
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;loginTimeout=30;", hostName, dbName, user, password);//Database erişim bilgileri


        String value = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        //Database e bağlantıyı sağlar
        conn = DriverManager.getConnection(url);
        stmt = conn.createStatement();

        // SQL sorgusunu çalıştırır ve ResultSet içerisine atar.
        resultSet = stmt.executeQuery(sql);
        while (resultSet .next()) {
            //Çalışan sorgudan dönen sonucun hangi index'inin(tablolardaki kolonlar) alnınacağının kararı verilir.
            value = resultSet.getString(columnindex);
        }
        return value;
    }
//    public static void updateSql(String sql) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
//
//        String UserName = "gmop_user";
//        String PassWord = "gm-507Vuk";
//        String value = null;
//        Connection conn = null;
//        Statement stmt = null;
//        Class.forName("org.postgresql.Driver").newInstance();
//        String url = "jdbc:postgresql://192.168.2.49:5432/GMOP";
//        conn = DriverManager.getConnection(url,UserName,PassWord);
//        stmt = conn.createStatement();
//        stmt.executeUpdate(sql);
//    }
}
