package com.peacecorps.malaria.ui.base;

import android.arch.lifecycle.Lifecycle;

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

    /**
     * method to check if the view is attached or not
     * @return true if attached
     */
    boolean isViewAttached();

    /**
     * Used to generate any data before the presenter is called
     */
    void init();

    V getView();
}