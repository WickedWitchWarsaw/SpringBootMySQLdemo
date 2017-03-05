package com.wickedwitch.pojo;

import lombok.Data;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZuZ on 2017-02-28.
 */
@Data
@Entity
@Table(name = "events")
public class Event{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String eventName;
    private String eventHost;
    private String eventDescription;
    private Date eventDate;

    @Transient
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");


    public Event() throws ParseException {
    }

    public Event(String eventName, String eventHost, String eventDescription, String eventDate) throws ParseException {
        this.id = id;
        this.eventName = eventName;
        this.eventHost = eventHost;
        this.eventDescription = eventDescription;
        this.eventDate = simpleDateFormat.parse(eventDate);
    }
}
