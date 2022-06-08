package com.yxy.dao.impl;

import com.yxy.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    //使用Dbutils操作数据库
    private   QueryRunner runner = new QueryRunner();

    /*
    *update 用于执行Insert  Update  Delete
    * 如果返回-1说明执行失败
     */
    public int update(String sql,Object...args){
        Connection conn = JDBCUtils.getConnection();
        try {

         return  runner.update(conn,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(conn);
        }
        return -1;
    }


    //查询返回一条javaBean的sql语句
    public <T> T  queryForOne(Class<T> type,String sql,Object... args){
        Connection conn = JDBCUtils.getConnection();
        try {
           return runner.query(conn,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            JDBCUtils.close(conn);
        }
        return null;
    }
    //查询多条数据
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection conn = JDBCUtils.getConnection();
        try {
            return runner.query(conn,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            JDBCUtils.close(conn);
        }
        return null;
    }

    //查询特殊
    public Object queryForValues( String sql, Object... args){
        Connection conn = JDBCUtils.getConnection();
        try {
            return runner.query(conn,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            JDBCUtils.close(conn);
        }
        return null;
    }
}
