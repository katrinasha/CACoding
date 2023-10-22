package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;
import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputData;

import java.beans.PropertyChangeListener;

import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("Clear");

    }

    public void setState(ClearState state){
        this.state = state;
    }
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("users deleted", null, this.state);

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);

    }
    public ClearState getState() {
        return state;
    }
}
