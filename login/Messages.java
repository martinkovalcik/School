package sample;

import java.util.Date;

public class Messages {
    private int id;
    private String from;
    private String to;
    private Date date;
    private String text;

    public Messages(int id, String from, String to, Date date, String text) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
