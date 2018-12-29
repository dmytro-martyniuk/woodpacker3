package com.marty.woodpacker.microservice;

import com.marty.woodpacker.dto.ComicsDTO;
import com.marty.woodpacker.entity.Comics;
import org.springframework.http.ResponseEntity;


public interface ComicsMicroservice {

    ResponseEntity<ComicsDTO> getComics(int id);
}
