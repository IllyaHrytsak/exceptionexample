package ua.training.model;


public enum Login {

    Login1("KlliK"),
    Login2();

    private String login;

    Login() {

    }

    Login(String login) {
        this.login = login;
    }

    public void setLogin(String login) throws IllegalLoginException {
        for (Login temp : Login.values()) {
            if (login == null || login.equals(temp.getLogin())) {
                throw new IllegalLoginException();
            }
        }
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}
