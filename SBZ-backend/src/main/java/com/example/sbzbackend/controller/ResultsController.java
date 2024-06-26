package com.example.sbzbackend.controller;


import com.example.sbzbackend.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sbzbackend.DTO.FiltersDTO;
import com.example.sbzbackend.DTO.ResultsDTO;


@RestController
@RequestMapping("api/results")

public class ResultsController
{
    @Autowired
    private ResultsService resultsService;

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<?> GetResults(@RequestBody FiltersDTO filters)
    {
        ResultsDTO results = resultsService.getResults(filters);
        return new ResponseEntity<ResultsDTO>(results, HttpStatus.OK);
    }
}
