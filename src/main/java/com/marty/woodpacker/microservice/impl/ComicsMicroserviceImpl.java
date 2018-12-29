package com.marty.woodpacker.microservice.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marty.woodpacker.dao.ComicsDao;
import com.marty.woodpacker.dto.ComicsDTO;
import com.marty.woodpacker.entity.Comics;
import com.marty.woodpacker.mapper.ComicsMapper;
import com.marty.woodpacker.microservice.ComicsMicroservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.List;


@Service("comicsMicroservice")
public class ComicsMicroserviceImpl implements ComicsMicroservice {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ComicsDao comicsDao;

    @Autowired
    @Qualifier("mapper")
    ObjectMapper mapper;

    @Value("${externalWoodpackerURL}")
    String externalURL;

    public ResponseEntity<ComicsDTO> getComics(int comicsIid) {
        Comics comics = null;
        String jsonOutput = restTemplate.getForObject(externalURL, String.class, comicsIid);
//        ResponseEntity<String> jsonOutput = restTemplate.getForEntity(externalURL, String.class, comicsIid);
        try {
            comics = mapper.readValue(jsonOutput, Comics.class);
        } catch (IOException e) {
            System.out.println("Error while parsing JSON " + e);
        }
        ComicsDTO comicsDTO = ComicsMapper.comicsMapper.comicsToComicsDTO(comics);
        return new ResponseEntity<ComicsDTO>(comicsDTO, HttpStatus.OK);
    }
}
