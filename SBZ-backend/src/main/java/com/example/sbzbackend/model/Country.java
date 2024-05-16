package com.example.sbzbackend.model;

public class Country
{
    public String name, tradeNode, culture, continent;
    public int difficulty, missions;
    public boolean diplomaticSystem, pirate, achievements;
    public Ideas ideas;

    public Country(String n, String tn, String cu, String co, int d, int m, boolean ds, boolean p, boolean a, Ideas i)
    {
        name = n;
        tradeNode = tn;
        culture = cu;
        continent = co;
        difficulty = d;
        missions = m;
        diplomaticSystem = ds;
        pirate = p;
        achievements = a;
        ideas = i;
    }
}
