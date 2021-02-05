package pages.cucumber_practice;

public class LoginPage {

    private boolean flag = false;
    private boolean isClicked = false;
    private String page = null;

    public void enterCredentials(String username, String password) {
        if (username.equals("poonam") && password.equals("p1234") && page.equals("login"))
            flag = true;
    }

    public void clickOnSubmit() {
        isClicked = true;
    }

    public String getCurrentPage() {
        if (flag && isClicked)
            page = "home";
        return page;
    }

    public void navigateToPage(String page) {
        this.page = page;

    }

    public void setUser(String name, String email, String twitter) {
        System.out.println("The name is " + name + " email is " + email + " the twitter handle is " + twitter);
    }
}
