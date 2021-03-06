package database.dao;

import java.io.*;
import java.util.*;

import database.entity.*;

/**
 * MsgDao
 * 
 * @author Xin Yifei
 * @version 0.9
 */
public interface MsgDao {
    public List<Msg> findMsgAll(String userID) throws IOException;

    public List<Msg> findMsgOverdue(String userID) throws IOException;

    public List<Msg> findMsgOther(String userID) throws IOException;

    public void addOverdueMsg(Record overdueRecord) throws IOException;

    public boolean addOtherMsg(String userID, String text) throws IOException;

    public void deleteMsg(String msgID) throws IOException;
}