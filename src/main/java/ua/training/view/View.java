package ua.training.view;


public class View {


    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showWrongInput() {
        showMessage(StringConstants.WRONG_INPUT_DATA);
    }

}
