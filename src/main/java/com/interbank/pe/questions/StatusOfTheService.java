package com.interbank.pe.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.get;

public class StatusOfTheService {

    public static Question<String> is() {

        int statuscode = get("https://reqres.in/api/users/").getStatusCode();
        return actor -> Integer.toString(statuscode);

    }
}
