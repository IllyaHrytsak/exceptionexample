package ua.training.controller;


import ua.training.view.View;
import java.util.Scanner;

public class UtilityController {

    private View view;

    public UtilityController(View view) {
        this.view = view;
    }

    public String inputValueStringWithRegex(Scanner sc, String regex) {
        String value = sc.next();
        while(!(value.matches(regex))) {
            view.showWrongInput();
            value = sc.next();
        }

        return value;
    }

}
