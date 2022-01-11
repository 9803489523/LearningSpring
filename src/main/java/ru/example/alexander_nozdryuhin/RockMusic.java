package ru.example.alexander_nozdryuhin;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Korn - Right now";
    }
}
