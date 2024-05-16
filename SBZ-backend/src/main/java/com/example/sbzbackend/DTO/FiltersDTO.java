package com.example.sbzbackend.DTO;

public class FiltersDTO
{
    String style;
    int difficulty;
    String missions;
    String achievements;
    String continent;

    FiltersDTO()
    {
        super();
    }

    public String getStyle()
    {
        return style;
    }
    public void setStyle(String style)
    {
        this.style = style;
    }

    public int getDifficulty()
    {
        return difficulty;
    }
    public void setSDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }

    public String getMissions()
    {
        return missions;
    }
    public void setMissions(String missions)
    {
        this.missions = missions;
    }

    public String getAchievements()
    {
        return achievements;
    }
    public void setAchievements(String achievements)
    {
        this.achievements = achievements;
    }

    public String getContinent()
    {
        return continent;
    }
    public void setContinent(String continent)
    {
        this.continent = continent;
    }
}
