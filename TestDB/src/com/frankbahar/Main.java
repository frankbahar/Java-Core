package com.frankbahar;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Public\\Fikret\\JavaPrograms\\TestDB\\"+ DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_phone = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//	    try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Public\\Fikret\\JavaPrograms\\TestDB\\testjava.db");
        //          Statement statement = conn.createStatement();) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
         //   conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                   " (" + COLUMN_NAME +  " TEXT, " +
                                          COLUMN_phone + " INTEGER, " +
                                          COLUMN_EMAIL + " TEXT)");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                " (" + COLUMN_NAME + ", " +
//                                       COLUMN_phone + ", " +
//                                       COLUMN_EMAIL + " )" +
//                                       " VALUES('Frank ',+6545678, 'frank@oe@email.com')");
            insertContact(statement,"Frank",6545678, "frank@oe@email.com");
            insertContact(statement,"Joe",45632, "joe@anywhere.com");
            insertContact(statement,"Jane",4829484, "jane@somewhere.com");
            insertContact(statement, "Fido",90384, "dog@email.com");
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                            COLUMN_phone + " =5566789 WHERE " + COLUMN_NAME + "='Jane'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + "='Joe'");

//
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    " VALUES('Joe',45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    " VALUES('Jane',4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    " VALUES('Fido',90384, 'dog@email.com')");
//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name ='Jane'");
 //           statement.execute("DELETE FROM contacts WHERE name='Joe'");
  //          statement.execute("SELECT * FROM contacts");
    ///        ResultSet results = statement.getResultSet();
       //    ResultSet results = statement.executeQuery("SELECT * FROM contacts");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                    results.getInt(COLUMN_phone) + " " +
                                    results.getString(COLUMN_EMAIL));
            }
            results.close();
            statement.close();
            conn.close();

            //older version of JDBC Class.name(org.sql.JDBC);
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws  SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_phone + ", " +
                COLUMN_EMAIL + " )" +
                " VALUES('" + name + "', " + phone + ", '" + email + "')");

    }
}
