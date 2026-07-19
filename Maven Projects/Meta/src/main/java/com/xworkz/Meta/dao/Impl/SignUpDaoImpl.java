package com.xworkz.Meta.dao.Impl;

import com.xworkz.Meta.dao.SignUpDao;
import com.xworkz.Meta.dto.SignUpDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

public class SignUpDaoImpl implements SignUpDao {

    String url ="jdbc:mysql://localhost:3306/meta_db";
    String user = "root";
    String password = "Pajju#123";



    @Override
    public boolean register(SignUpDto user) {

        Connection connection = null;
        Statement statement = null;
        System.out.println("DAO register() Invoked");

        try {

            forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

             connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meta_db",
                    "root",
                    "Pajju#123"
            );

            System.out.println("Database Connected");

            connection.setAutoCommit(false);
             statement = connection.createStatement();

            String sql = "INSERT INTO signup(username,age,mobile_no,password,nationality) VALUES('"
                    + user.getUserName() + "',"
                    + user.getAge() + ",'"
                    + user.getMobileNo() + "','"
                    + user.getPassword() + "','"
                    + user.getNationality() + "')";

            System.out.println(sql);

            boolean save = statement.execute(sql);
            connection.commit();
            return save;


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(statement !=null){
                    statement.close();
                }
                if(connection !=null){
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;

    }


    public void getAllData(){
        System.out.println("DAO getAlldata() invoked");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meta_db",
                "root",
                "Pajju#123"
        );
        Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT  * from signup");

        ){


            forName("com.mysql.cj.jdbc.Driver");

//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meta_db",
//                    "root",
//                    "Pajju#123"
//            );

//            Statement statement = connection.createStatement();
//            String sql = "SELECT  * from signup";

//            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println("-------------------------------");
                System.out.println("ID :"+resultSet.getInt("id"));
                System.out.println("Username    : " + resultSet.getString("username"));
                System.out.println("Age         : " + resultSet.getInt("age"));
                System.out.println("Mobile No   : " + resultSet.getString("mobile_no"));
                System.out.println("Password    : " + resultSet.getString("password"));
                System.out.println("Nationality : " + resultSet.getString("nationality"));
            }

//            resultSet.close();
//            statement.close();
//            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
     public List<SignUpDto> retrieveData(){

        System.out.println("DAO retrieveData()  invoked");
    List<SignUpDto> list = new ArrayList<>();
    try{
        forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meta_db",
                "root",
                "Pajju#123"
        );

        System.out.println("Database is connected");
        Statement statement = connection.createStatement();
        String sql = "SELECT * from signup";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){

            SignUpDto dto = new SignUpDto();

            dto.setUserName(resultSet.getString("username"));
            dto.setAge(resultSet.getInt("age"));
            dto.setMobileNo(resultSet.getString("mobile_no"));
            dto.setPassword(resultSet.getString("password"));
            dto.setNationality(resultSet.getString("nationality"));

            list.add(dto);

        }
        resultSet.close();
        statement.close();
        connection.close();
    }
    catch(Exception e){
        e.printStackTrace();

    }
    return list;
    }

    @Override
    public void getById(int id) {

        System.out.println("getById in DAO");

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meta_db",
                    "root",
                    "Pajju#123"
            );

            String sql = "SELECT * FROM signup WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                System.out.println("ID           : " + resultSet.getInt("id"));
                System.out.println("Username     : " + resultSet.getString("username"));
                System.out.println("Age          : " + resultSet.getInt("age"));
                System.out.println("Mobile No    : " + resultSet.getString("mobile_no"));
                System.out.println("Password     : " + resultSet.getString("password"));
                System.out.println("Nationality  : " + resultSet.getString("nationality"));

            } else {

                System.out.println("No Record Found for ID : " + id);

            }

            resultSet.close();
            statement.close();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try {

                if (connection != null) {
                    connection.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void getByIdAndName(int id, String name) {

        System.out.println("getByIdAndName in DAO");

        Connection connection = null;

        try{
            forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meta_db",
                    "root",
                    "Pajju#123"
            );

            String sql = "select * from signup where id=? and UserName= ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setString(2,name);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                System.out.println("ID           : " + resultSet.getInt("id"));
                System.out.println("Username     : " + resultSet.getString("username"));
                System.out.println("Age          : " + resultSet.getInt("age"));
                System.out.println("Mobile No    : " + resultSet.getString("mobile_no"));
                System.out.println("Password     : " + resultSet.getString("password"));
                System.out.println("Nationality  : " + resultSet.getString("nationality"));
            }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
            try{
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update() {

        System.out.println("update () invoked in DAO");

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);

            String sql = "UPDATE signup set userName = ? where id=?";

            statement= connection.prepareStatement(sql);

            statement.setString(1,"shankar");
            statement.setInt(2,7);

            int row = statement.executeUpdate();
            if(row >0){
                System.out.println("Update done" + row);
            }
            else {
                System.out.println("Update failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if (statement != null){
                    statement.close();
                }
                if(connection != null){
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("delete method invoked in DAO");

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url,user,password);
            String sql ="DELETE FROM signup WHERE id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,2);
            int row = statement.executeUpdate();
            if(row >0){
                System.out.println("Deleted successfuly  : " + row);
            }
            else {
                System.out.println("sory i couldn't find");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(statement != null){
                    statement.close();
                }
                if(connection != null){
                    connection.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void save(SignUpDto user) {

        System.out.println("DAO register() Invoked");

        try {

            forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meta_db",
                    "root",
                    "Pajju#123"
            );

            System.out.println("Database Connected");

            String sql = "INSERT INTO signup(username,age,mobile_no,password,nationality) VALUES(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, "xyz");
            statement.setInt(2, 23);
            statement.setString(3, "9902178976");
            statement.setString(4, "Pajju#908");
            statement.setString(5, "Indian");
            statement.addBatch();

            statement.setString(1, "pqr");
            statement.setInt(2, 23);
            statement.setString(3, "778906543");
            statement.setString(4, "kalu#908");
            statement.setString(5, "Indian");
            statement.addBatch();


            System.out.println(sql);

            statement.executeBatch();

            System.out.println("Data Inserted Successfully");

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int dropTabel() {

        try(Connection connection = DriverManager.getConnection(url,user,password);
        PreparedStatement statement = connection.prepareStatement("drop table signup"))

        {
            forName("com.mysql.cj.jdbc.Driver");
            int row = statement.executeUpdate();
            if(row >0){
                return 1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }


}
