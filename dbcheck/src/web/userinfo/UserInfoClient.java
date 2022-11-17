package web.userinfo;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.mysql.UserInfoMySqlDao;
import domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        
        userInfo.setUserId("TestUser");
        userInfo.setPassword("heh");
        userInfo.setUserName("테스트우저");
        
        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            throw new IOException("올바르지 않은 DB 타입입니다.");
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
