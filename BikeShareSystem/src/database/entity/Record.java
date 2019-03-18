package database.entity;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Record
 * 
 * @author Xin Yifei
 * @version 0.6
 */
public class Record {
    private String userID;
    private Date startDate;
    private Date endDate;
    private long duration;
    private int bill;

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * @return the duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(int bill) {
        this.bill = bill;
    }

    /**
     * @return the bill
     */
    public int getBill() {
        return bill;
    }

    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd;HH:mm:ss");
        return userID + " " + sf.format(startDate) + " " + sf.format(endDate);
    }

}