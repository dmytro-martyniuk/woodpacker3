package com.marty.woodpacker.controller;

import com.marty.woodpacker.dto.ComicsDTO;
import com.marty.woodpacker.entity.Comics;
import com.marty.woodpacker.microservice.ComicsMicroservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Qualifier("comicsMicroservice")
    @Autowired
    private ComicsMicroservice comicsService;

    @RequestMapping("/test")
    public ResponseEntity<Comics> getComics1 () {
        Comics comics = new Comics();
        comics.setNum(22);
        comics.setDay("33");
        return new ResponseEntity<Comics>(comics, HttpStatus.OK);
    }

    @RequestMapping(value = "/getComics/{comicsId}", method = RequestMethod.GET)
    public ResponseEntity<ComicsDTO> getComics (@PathVariable(value = "comicsId") int comicsId) {
        return this.comicsService.getComics(comicsId);
    }

}
