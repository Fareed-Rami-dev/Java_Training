package com.jbs1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;
import java.sql.Connection;

public class DB_Utility {
    private Connection connection;
    private Config ref;
    private static final Logger logger= LogManager.getLogger(DB_Utility.class.getName());
    DB_Utility() {
        this.ref=new Config();
        this.getRequiredConnectionArguments();
        this.connect();
    }
    private void connect(){
        try
        {
            this.connection= DriverManager.getConnection(ref.url,ref.username,ref.password);
            logger.info("Connected to the database Successfully");
        }
        catch(Exception ex)
        {
            logger.error(ex.getMessage());
            ex.printStackTrace();
        }
    }
    int excecuteDeleteQuery(String query){
        try
        {
            Statement st= this.connection.createStatement();
            int numberOfRowsAffected=st.executeUpdate(query);
            if (numberOfRowsAffected==0)
            {
                 logger.info("No rows affected");
            }
            else
            {
               logger.info(numberOfRowsAffected+ "Rows deleted successfully");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
        return -1;
    }
    int excecuteUpdateQuery(String query){
        try
        {
            Statement st= this.connection.createStatement();
            int numberOfRowsAffected=st.executeUpdate(query);
            if (numberOfRowsAffected==0)
            {
                logger.info("No rows affected");
            }
            else
            {
               logger.info(numberOfRowsAffected+ "Rows updated successfully");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
        return -1;
    }

    int excecuteInsertQuery(String query){
        try
        {
            Statement st= this.connection.createStatement();
            int numberOfRowsAffected=st.executeUpdate(query);
            if (numberOfRowsAffected==0)
            {
               logger.info("No rows affected");
            }
            else
            {
               logger.info(numberOfRowsAffected+ "Rows inserted successfully");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
        return -1;
    }

    private ResultSet executeSQLSelectQuery(String query){
        ResultSet rs = null;
        try
        {
            Statement st= this.connection.createStatement();
            logger.info("Executing SQL Select");
            rs=st.executeQuery(query);
            return rs;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
        return rs;
    }
    private void printAllResults(ResultSet rs){
        try {
            while (rs.next()) {
                System.out.println(rs.getString("firstname") + " " +
                        rs.getString("lastname") + " " +
                        rs.getString(3) + " " + rs.getInt(4));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
           logger.error(ex.getMessage());
        }
    }
    public  void printAllResults(String query){
        printAllResults(executeSQLSelectQuery(query));
    }
    private void getRequiredConnectionArguments(){
        try
        {
            FileInputStream fstream=new FileInputStream("DB_Arguments.properties");
            BufferedReader br=new BufferedReader(new InputStreamReader(fstream));
            logger.info("Reading arguments from properties file");
            String str;
            while((str=br.readLine())!=null)
            {
                String []arr=str.split("=");
                switch(arr[0])
                {
                    case "url":
                    {
                        this.ref.url=arr[1];
                        break;
                    }
                    case "username":
                    {
                        this.ref.username=arr[1];
                        break;
                    }
                    case "password":
                    {
                        this.ref.password=arr[1];
                        break;
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }
}
