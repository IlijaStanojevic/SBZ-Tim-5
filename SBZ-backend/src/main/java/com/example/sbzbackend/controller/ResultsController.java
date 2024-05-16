package com.example.sbzbackend.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sbzbackend.DTO.FiltersDTO;
import com.example.sbzbackend.DTO.ResultsDTO;


@RestController
@RequestMapping("api/results")
public class ResultsController
{
    @GetMapping
    public ResponseEntity<?> GetResults(@RequestBody FiltersDTO filters)
    {
        ResultsDTO results = new ResultsDTO();
        return new ResponseEntity<ResultsDTO>(results, HttpStatus.OK);
    }
}
