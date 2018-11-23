package connect;

import java.sql.*;


public class SqlConnection {

    public static void connect(String query) throws SQLException {
        //Syndesh me vash
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/project?autoReconnect=true&useSSL=false","root","0123456789");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Dhmiourgia statement
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Dhmiourgia query kai apostolh
        ResultSet rs = null;


        try {
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Dhmiourgia resultset
        while(rs.next())
        {
            try {
                System.out.println(rs.getString(1));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }




        try {
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }



}


