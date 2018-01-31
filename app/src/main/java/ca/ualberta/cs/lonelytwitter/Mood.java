package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by tlazaren on 1/16/18.
 */

public abstract class Mood {
    private Date date;

    Mood(){
        date = new Date();
    }

    Mood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }
}


