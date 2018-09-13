package com.cagmeini.serviciosya.dao.jdbc;

import com.cagmeini.serviciosya.dao.DaoException;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConectionBD {


    private static final BasicDataSource dataSource;


    static {

        dataSource = new BasicDataSource ();

        try {

            Properties pop = new Properties();
            pop.load(ConectionBD.class.getClassLoader().
                    getResourceAsStream ("jdbc.properties"));


            dataSource.setUrl(pop.getProperty ("jdbc.url"));
            dataSource.setUsername (pop.getProperty ("jdbc.user"));
            dataSource.setPassword (pop.getProperty ("jdbc.pw"));
            dataSource.setDriverClassName(pop.getProperty ("jdbc.driver"));
            dataSource.setMinIdle (Integer.parseInt (pop.getProperty ("jdbc.pool.min")));
            dataSource.setMaxIdle (Integer.parseInt (pop.getProperty ("jdbc.pool.max")));

        } catch (Exception e) {

            throw new DaoException(e);
        }
    }


    private ConectionBD () {

        super ();
    }


    protected static Connection getConnection () throws SQLException {

        return dataSource.getConnection();
    }
}
