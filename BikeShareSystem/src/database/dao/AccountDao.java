package database.dao;

import java.io.*;

import database.entity.*;

/**
 * AccountDao
 * 
 * @author Xin Yifei
 * @version 0.9
 */
public interface AccountDao {
    public Account findAccountByUserID(String userID) throws IOException;

    public Account findAccountByUsername(String username) throws IOException;

    public boolean addNewAccount(Account account) throws IOException;

    public boolean modifyAccount(Account accountModified) throws IOException;
}