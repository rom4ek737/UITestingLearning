package test.company.uitestinglearning.business;

public enum User {

    BASIC("roman.zdrok.test4@gmail.com", "HRA8mNw2EaxGxrc"),
    PREMIUM("roman.zdrok.test3@gmail.com", "HRA8mNw2EaxGx12");

    private final String email;
    private final String password;

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
