// Example JDBC Connection
Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/mydb", "username", "password");
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");

while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}
conn.close();
