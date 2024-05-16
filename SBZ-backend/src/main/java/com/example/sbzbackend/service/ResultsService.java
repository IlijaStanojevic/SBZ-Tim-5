package com.example.sbzbackend.service;

import org.springframework.stereotype.Service;

import com.example.sbzbackend.DTO.FiltersDTO;
import com.example.sbzbackend.DTO.ResultsDTO;

@Service
public class ResultsService
{
    public ResultsService()
    {
        System.out.println("tekst");
    }

    public ResultsDTO getResults(FiltersDTO filters)
    {
        ResultsDTO results = new ResultsDTO();



        return results;
    }
}
