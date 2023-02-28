package com.interbank.pe.questions.post;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class StatusOfThePost {

    public static Question<String> value() {
        return actor -> Integer.toString(SerenityRest.lastResponse().getStatusCode());

    }

}
