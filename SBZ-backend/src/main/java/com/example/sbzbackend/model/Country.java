package com.example.sbzbackend.model;

public class Country
{
    public String name, tradeNode, culture, continent;
    public int difficulty;
    public boolean diplomaticSystem, pirate;
    public Ideas ideas;

    public Country(String n, String tn, String cu, String co, int d, boolean ds, boolean p, Ideas i)
    {
        name = n;
        tradeNode = tn;
        culture = cu;
        continent = co;
        difficulty = d;
        diplomaticSystem = ds;
        pirate = p;
        ideas = i;
    }
}
