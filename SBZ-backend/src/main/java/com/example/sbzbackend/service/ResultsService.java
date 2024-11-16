package com.example.sbzbackend.service;

import org.springframework.stereotype.Service;

import com.example.sbzbackend.model.Ideas;
import com.example.sbzbackend.model.Country;
import com.example.sbzbackend.DTO.FiltersDTO;
import com.example.sbzbackend.DTO.ResultsDTO;

import java.util.List;
import java.util.ArrayList;

@Service
public class ResultsService
{
    List<Country> countries = new ArrayList<Country>();

    public ResultsService()
    {
        Ideas i1 = new Ideas(1, 2, 3, 1, 0);
        Ideas i2 = new Ideas(2, 2, 0, 1, 2);
        Ideas i3 = new Ideas(3, 1, 1, 2, 0);
        Ideas i4 = new Ideas(2, 0, 3, 1, 1);

        countries.add(new Country("Spain", "Seville", "Iberian", "Europe", 1, 2, false, false, true, i2));
        countries.add(new Country("Portugal", "Seville", "Iberian", "Europe", 2, 2, false, false, true, i4));
        countries.add(new Country("France", "Champagne", "French", "Europe", 1, 2, false, false, true, i1));
        countries.add(new Country("England", "English Channel", "British", "Europe", 1, 2, false, false, true, i4));
        countries.add(new Country("Austria", "Vienna", "German", "Europe", 2, 2, true, false, true, i1));
        countries.add(new Country("Ming", "Beijing", "Chinese", "Asia", 1, 2, true, false, true, i1));
        countries.add(new Country("Oda", "Nippon", "Japanese", "Asia", 2, 1, true, false, true, i3));
        countries.add(new Country("Ottomans", "Constantinople", "Levantine", "Europe", 1, 2, false, false, true, i3));
        countries.add(new Country("Serbia", "Ragusa", "South Slavic", "Europe", 3, 2, false, false, true, i3));
        countries.add(new Country("Caddo", "Chesapeake Bay", "Native", "America", 3, 1, true, false, false, i1));
    }

    public ResultsDTO getResults(FiltersDTO filters)
    {
        ResultsDTO results = new ResultsDTO();

        for(Country country: countries)
        {
           results.insert(country.name, score(country, filters));
        }

        return results;
    }

    private int score(Country country, FiltersDTO filters)
    {
        return 1;
    }
}
