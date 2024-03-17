//Magic8Ball.java
package org.derryfield.toys;

import java.util.ArrayList;

public class Magic8Ball implements ResponseProvider {

    public String getRandomResponse() {

        ArrayList<String> responses = new ArrayList<>();

        responses.add("It is certain");

        responses.add("It is decidedly so");

        responses.add("Without a doubt");

        responses.add("Yes definitely");

        responses.add("You may rely on it");

        responses.add("As I see it, yes");

        responses.add("Most likely");

        responses.add("Outlook good");

        responses.add("Yes");

        responses.add("Signs point to yes");

        responses.add("Reply hazy, try again");

        responses.add("Ask again later");

        responses.add("Better not tell you now");

        responses.add("Cannot predict now");

        responses.add("Concentrate and ask again");

        responses.add("Don't count on it");

        responses.add("My reply is no");

        responses.add("My sources say no");

        responses.add("Outlook not so good");

        responses.add("Very doubtful");

        int randomIndex = (int) (Math.random() * responses.size());

        return responses.get(randomIndex);
    }
}



    