package ua.training.controller;


import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        TempNotebook tempNotebook = new TempNotebook(model, view, new UtilityController(view, scanner));

        tempNotebook.saveDataToModel();


    }
}
