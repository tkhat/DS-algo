package designbrowserhistory;

public class Test {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory("linkedIn");
        browserHistory.visit("facebook");
        browserHistory.visit("youTube");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook");

    }
}
