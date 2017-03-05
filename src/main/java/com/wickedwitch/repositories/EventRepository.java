package com.wickedwitch.repositories;


import com.wickedwitch.pojo.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ZuZ on 2017-02-28.
 */
public interface EventRepository extends CrudRepository<Event, Integer>{
    List<Event> findAll();
    Event findByEventName(String eventName);

}
