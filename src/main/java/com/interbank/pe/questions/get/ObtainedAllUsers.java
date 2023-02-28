package com.interbank.pe.questions.get;

import com.interbank.pe.model.User;
import com.interbank.pe.tasks.get.GetAllUsers;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ObtainedAllUsers {

    private static List<User> users = GetAllUsers.listOfUsers;
    private static List<String> dataOfUser = new ArrayList<>();

    public static Question<List<String>> allTheUsersId() {

        for (User user : users
        ) {
            dataOfUser.add(Integer.toString(user.getId()));
        }
        return actor -> dataOfUser;

    }

    public static Question<List<String>> allTheUsersFirstName() {

        for (User user : users
        ) {
            dataOfUser.add(user.getFirst_name());
        }
        return actor -> dataOfUser;

    }


    public static Question<List<String>> allTheUsersLastName() {

        for (User user : users
        ) {
            dataOfUser.add(user.getLast_name());
        }
        return actor -> dataOfUser;

    }


}
