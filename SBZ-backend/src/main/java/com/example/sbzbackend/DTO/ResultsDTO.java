package com.example.sbzbackend.DTO;

public class ResultsDTO
{
    String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;
    int score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;

    public ResultsDTO()
    {
        super();
        name1 = "Nista";
        score1 = 0;
        name2 = "Nista";
        score2 = 0;
        name3 = "Nista";
        score3 = 0;
        name4 = "Nista";
        score4 = 0;
        name5 = "Nista";
        score5 = 0;
        name6 = "Nista";
        score6 = 0;
        name7 = "Nista";
        score7 = 0;
        name8 = "Nista";
        score8 = 0;
        name9 = "Nista";
        score9 = 0;
        name10 = "Nista";
        score10 = 0;
    }

    public void insert(String name, int score)
    {
        if(score > score10)
        {
            name10 = name;
            score10 = score;
        }
        if(score > score9)
        {
            name10 = name9;
            score10 = score9;
            name9 = name;
            score9 = score;
        }
        if(score > score8)
        {
            name9 = name8;
            score9 = score8;
            name8 = name;
            score8 = score;
        }
        if(score > score7)
        {
            name8 = name7;
            score8 = score7;
            name7 = name;
            score7 = score;
        }
        if(score > score6)
        {
            name7 = name6;
            score7 = score6;
            name6 = name;
            score6 = score;
        }
        if(score > score5)
        {
            name6 = name5;
            score6 = score5;
            name5 = name;
            score5 = score;
        }
        if(score > score4)
        {
            name5 = name4;
            score5 = score4;
            name4 = name;
            score4 = score;
        }
        if(score > score3)
        {
            name4 = name3;
            score4 = score3;
            name3 = name;
            score3 = score;
        }
        if(score > score2)
        {
            name3 = name2;
            score3 = score2;
            name2 = name;
            score2 = score;
        }
        if(score > score1)
        {
            name2 = name1;
            score2 = score1;
            name1 = name;
            score1 = score;
        }
    }

    public String getName1()
    {
        return name1;
    }
    public void setName1(String name1)
    {
        this.name1 = name1;
    }
    public String getName2()
    {
        return name2;
    }
    public void setName2(String name2)
    {
        this.name2 = name2;
    }
    public String getName3()
    {
        return name3;
    }
    public void setName3(String name3)
    {
        this.name3 = name3;
    }
    public String getName4()
    {
        return name4;
    }
    public void setName4(String name4)
    {
        this.name4 = name4;
    }
    public String getName5()
    {
        return name5;
    }
    public void setName5(String name5)
    {
        this.name5 = name5;
    }
    public String getName6()
    {
        return name6;
    }
    public void setName6(String name6)
    {
        this.name6 = name6;
    }
    public String getName7()
    {
        return name7;
    }
    public void setName7(String name7)
    {
        this.name7 = name7;
    }
    public String getName8()
    {
        return name8;
    }
    public void setName8(String name8)
    {
        this.name8 = name8;
    }
    public String getName9()
    {
        return name9;
    }
    public void setName9(String name9)
    {
        this.name9 = name9;
    }
    public String getName10()
    {
        return name10;
    }
    public void setName10(String name1)
    {
        this.name10 = name10;
    }

    public int getScore1()
    {
        return score1;
    }
    public void setScore1(int score1)
    {
        this.score1 = score1;
    }
    public int getScore2()
    {
        return score2;
    }
    public void setScore2(int score2)
    {
        this.score2 = score2;
    }
    public int getScore3()
    {
        return score3;
    }
    public void setScore3(int score3)
    {
        this.score3 = score3;
    }
    public int getScore4()
    {
        return score4;
    }
    public void setScore4(int score4)
    {
        this.score4 = score4;
    }
    public int getScore5()
    {
        return score5;
    }
    public void setScore5(int score5)
    {
        this.score5 = score5;
    }
    public int getScore6()
    {
        return score6;
    }
    public void setScore6(int score6)
    {
        this.score6 = score6;
    }
    public int getScore7()
    {
        return score7;
    }
    public void setScore7(int score7)
    {
        this.score7 = score7;
    }
    public int getScore8()
    {
        return score8;
    }
    public void setScore8(int score8)
    {
        this.score8 = score8;
    }
    public int getScore9()
    {
        return score9;
    }
    public void setScore9(int score9)
    {
        this.score9 = score9;
    }
    public int getScore10()
    {
        return score10;
    }
    public void setScore10(int score10)
    {
        this.score10 = score10;
    }
}
