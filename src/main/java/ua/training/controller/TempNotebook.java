package ua.training.controller;


import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

public class TempNotebook {

    private View view;
    private Model model;
    private Scanner scanner;

    public TempNotebook(Model model, View view, Scanner scanner) {
        this.view = view;
        this.model = model;
        this.scanner = scanner;
    }

    public void inputData() {

    }
}
