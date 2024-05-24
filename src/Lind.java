import java.sql.*;
class Lind
{
    public static void main(String args[])throws Exception
    {
        String url = "jdbc:mysql://127.0.0.1:3306/product";
        String username = "root";
        String password = "AK0152@sdlish";
//        String query = "create table college(ID int(10), name char(50), LOC char(50))";
        String update = "select name from product where id=6";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(update);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        System.out.println("Query Executed");

    }
}