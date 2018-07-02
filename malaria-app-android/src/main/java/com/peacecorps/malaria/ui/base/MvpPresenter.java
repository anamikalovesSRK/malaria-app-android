package com.peacecorps.malaria.ui.base;

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */

public interface MvpPresenter <V extends MvpView> {

    /**
     * called when view is attached to presenter
     * @param view
     */
    void attachView(V view);

    /**
     * called when view is detached from presenter
     */
    void detachView();
}