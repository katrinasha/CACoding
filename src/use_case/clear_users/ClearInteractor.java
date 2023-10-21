package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearUserDataAccessObject;

    final ClearOutputBoundary clearPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.clearUserDataAccessObject = clearUserDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        String usersDeleted;
        usersDeleted = clearUserDataAccessObject.clearAll();
        ClearOutputData outputMessage = new ClearOutputData(usersDeleted);
        clearPresenter.prepareClearedView(outputMessage);

        ;
    }

}
