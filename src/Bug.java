import java.sql.*;
class Bug
{
    public static void main(String args[])throws Exception
    {
        String url = "jdbc:mysql://127.0.0.1:3306/girls";
        String username = "root";
        String password = "AK0152@sdlish";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

      String insert ="insert into student values(5, 'Aaradhya', 'varanasi') ";
      st.execute(insert);
      System.out.println("query executed");
    }
}