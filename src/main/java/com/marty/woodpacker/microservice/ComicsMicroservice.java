package com.marty.woodpacker.microservice;

import com.marty.woodpacker.entity.Comics;


public interface ComicsMicroservice {

    Comics getComics(int id);
}
