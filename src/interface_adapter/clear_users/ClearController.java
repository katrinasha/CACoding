package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {

    final ClearInputBoundary clearInterator;

    public ClearController(ClearInputBoundary clearInputInterator) {
        this.clearInterator = clearInputInterator;
    }

    public void execute() {
        clearInterator.execute();
    }
}
