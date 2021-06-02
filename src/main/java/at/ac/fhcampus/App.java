package at.ac.fhcampus;

public class App {
    public boolean checkPassword(String pw){
        return pw.matches("^(?=.{8,25})(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[()#$?!%/@]).+$");
    }
}


/*
Regex

^                   = match start of the string
$                   = match end of the string
?                   = positive look-ahead
(?=.{8,25})         = should have 8-25 characters
(?=.*[a-z])         = should have small characters
(?=.*[A-Z])         = should include at least 1 cap character
(?=.[0-9])          = should include at least 1 number
(?=.[()#$?!%/@])    = should include at least 1 special character

 */