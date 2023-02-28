package com.interbank.pe.questions.get;

import com.interbank.pe.model.User;
import com.interbank.pe.tasks.get.GetSingleUser;
import net.serenitybdd.screenplay.Question;

public class ObtainedSingleUser {


    private static User user = GetSingleUser.user;

    public static Question<String> firstName() {


        return actor -> user.getFirst_name();
    }

    public static Question<String> lastName() {


        return actor -> user.getLast_name();
    }

    public static Question<String> id() {

        return actor -> Integer.toString(user.getId());
    }


}
