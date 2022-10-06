package com.web.leehyundong.wmswebproject.persistence;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTests {
    static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void testConn(){
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "ora_user",
                "hong")) {
            System.out.println("Connection -> " + conn);
        }catch(Exception e){

            System.out.println("Error Message :" + e.getMessage());
        }
    }
}
