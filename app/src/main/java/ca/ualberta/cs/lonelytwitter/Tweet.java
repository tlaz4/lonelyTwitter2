package ca.ualberta.cs.lonelytwitter;


import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tlazaren on 1/16/18.
 */

public abstract class Tweet{
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    Tweet(String message){
        this.message = message;
        date = new Date();
        moods = new ArrayList<Mood>();
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        moods = new ArrayList<Mood>();
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() < 140) {
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    public abstract Boolean isImportant();
}
