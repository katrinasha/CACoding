package interface_adapter.clear_users;


import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    public final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareClearedView(ClearOutputData usersDeleted) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsersDeleted(usersDeleted.getUsersDeleted());
        clearViewModel.firePropertyChanged();
    }
}
