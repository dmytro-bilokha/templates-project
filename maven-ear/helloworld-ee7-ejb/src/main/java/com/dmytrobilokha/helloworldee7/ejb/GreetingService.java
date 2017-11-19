package com.dmytrobilokha.helloworldee7.ejb;

import javax.ejb.Stateless;

@Stateless
public class GreetingService {

    public String createGreeting() {
        return "Hello, Glory Enterprise World!!!";
    }

}
