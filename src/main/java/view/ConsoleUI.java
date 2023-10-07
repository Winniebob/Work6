package view;

import model.ArrayLists;
import presenter.Presenter;

public class ConsoleUI {
    private ArrayLists arrayLists = new ArrayLists();
    private View view = new View();
    private Presenter presenter = new Presenter(arrayLists, view);

    public void start() {
        presenter.processLists();
    }

}
