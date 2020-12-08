package main;

import java.util.ArrayList;
import java.util.Random;

public class MainMOdel
{
    final private ArrayList<String> answers = new ArrayList<>();

    public MainMOdel ()
    {
        answers.add("It is certain.");
        answers.add("It is decidedly so.");
        answers.add("Without a doubt.");
        answers.add("Yes - definitely.");
        answers.add("You may rely on it.");
        answers.add("As I see it, yes.");
        answers.add("Most likely.");
        answers.add("Outlook good.");
        answers.add("Yes.");
        answers.add("Signs point to yes.");
        answers.add("Reply hazy, try again.");
        answers.add("Ask again later.");
        answers.add("Better not tell you now.");
        answers.add("Cannot predict now.");
        answers.add("Concentrate and ask again.");
        answers.add("Don't count on it.");
        answers.add("My reply is no.");
        answers.add("My sources say no.");
        answers.add("Outlook not so good.");
        answers.add("Very doubtful");
    }
    public String getAnswer (String a)
    {
        if (a.equals(""))
        {
            return "No question...";
        }
        else if(a.contains("SEW"))
        {
            return "Yes - definitely.";
        }
        else
        {
            return getAllAnswer();
        }

    }
    public String getAllAnswer()
    {
        Random rd = new Random();
        return answers.get(rd.nextInt(answers.size()));
    }
}
