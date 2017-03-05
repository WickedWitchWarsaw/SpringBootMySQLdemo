package com.wickedwitch.service;

import com.wickedwitch.pojo.Event;
import com.wickedwitch.repositories.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * Created by ZuZ on 2017-02-28.
 */
@Service
public class EventServiceDB {
    /** The class logger */
    private static final Logger LOG = LoggerFactory.getLogger(EventServiceDB.class);

    @Autowired
    private EventRepository eventRepository;

    public void insertMySQLdata() throws ParseException{

        LOG.info("###Inserting EVENT date...");

        Event eventParty = new Event("Party1", "Witch", "Halloween party", "20/10/2016");
        Event eventConference = new Event("Movie Conference", "King", "Promotion show regarding new movie", "02/02/2017");
        Event eventTraining = new Event("Training Session", "Nobody",  "Management training", "01/01/2017");

        eventRepository.save(eventParty);
        eventRepository.save(eventConference);
        eventRepository.save(eventTraining);

        LOG.info("### Complete... data inserted...");

    }

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public Event findByEventName(String eventName){
        return eventRepository.findByEventName(eventName);
    }

}
