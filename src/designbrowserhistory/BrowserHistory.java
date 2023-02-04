package designbrowserhistory;

import java.util.ArrayList;
import java.util.LinkedList;

class BrowserHistory {

    private ArrayList<String> history;
    private int currentPage = 0;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
    }

    public void visit(String url) {
        if (currentPage != history.size() - 1) {
            clearFrom(currentPage);
        }
        history.add(url);
        currentPage++;
    }

    public String back(int steps) {
        if (steps > currentPage) {
            currentPage = 0;
        } else {
            currentPage -= steps;
        }
        return history.get(currentPage);
    }

    public String forward(int steps) {
        if (currentPage + steps < history.size()) {
            currentPage += steps;
        } else {
            currentPage = history.size() - 1;
        }
        return history.get(currentPage);
    }

    private void clearFrom(int index) {
        for (int i = history.size()-1; i > index; i--) {
            history.remove(i);
        }
    }
}