package kyu8;


import java.util.HashMap;

/*
Your start-up's BA has told marketing that your website has a large audience
in Scandinavia and surrounding countries. Marketing thinks it would be great
to welcome visitors to the site in their own language.
Luckily you already use an API that detects the user's location, so this is an easy win.
The Task

    Think of a way to store the languages as a database (eg an object).
    The languages are listed below so you can copy and paste!
    Write a 'welcome' function that takes a parameter 'language' (always a string),
    and returns a greeting - if you have it in your database.
    It should default to English if the language is not in the database, or in the event of an invalid input.

The Database

english: "Welcome", czech: "Vitejte", danish: "Velkomst",
dutch: "Welkom", estonian: "Tere tulemast", finnish: "Tervetuloa",
flemish: "Welgekomen", french: "Bienvenue", german: "Willkommen",
irish: "Failte", italian: "Benvenuto", latvian: "Gaidits",
lithuanian: "Laukiamas", polish: "Witamy", spanish: "Bienvenido",
swedish: "Valkommen", welsh: "Croeso"

Possible invalid inputs include:

IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied

Categories : Fundamentals, Hashes, Data Structures, Objects
 */
public class Welcome {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionGreet("english"));
        System.out.println(YevgeniySolutionGreet("czech"));
        System.out.println(YevgeniySolutionGreet("danish"));
    }

    static String YevgeniySolutionGreet(String language) {

        var map = new HashMap<String, String>();

        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");

        if (map.containsKey(language)) {
            return map.get(language);
        }
        return map.get("english");
    }

}