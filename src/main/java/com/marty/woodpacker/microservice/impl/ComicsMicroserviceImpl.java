package com.marty.woodpacker.microservice.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marty.woodpacker.entity.Comics;
import com.marty.woodpacker.microservice.ComicsMicroservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service("comicsMicroservice")
public class ComicsMicroserviceImpl implements ComicsMicroservice {

    @Autowired
    RestTemplate restTemplate;

    public Comics getComics(int comicsIid) {
        Comics comics1 = null;
        String comics = restTemplate.getForObject("https://xkcd.com/"+ comicsIid + "/info.0.json", String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            comics1 = objectMapper.readValue(comics, Comics.class);
        } catch (IOException e) {
            System.out.println("Error while parsing JSON " + e);
        }
        return comics1;
    }
}
