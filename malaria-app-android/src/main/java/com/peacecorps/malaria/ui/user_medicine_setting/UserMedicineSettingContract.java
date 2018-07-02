package com.peacecorps.malaria.ui.user_medicine_setting;

import com.peacecorps.malaria.ui.base.BasePresenter;
import com.peacecorps.malaria.ui.base.MvpPresenter;
import com.peacecorps.malaria.ui.base.MvpView;

public interface UserMedicineSettingContract {
    interface View extends MvpView {
        void startMainActivity();
        void setSelectedTime(String time);
        void enableDoneButton();
    }

    interface Presenter<V extends View> extends MvpPresenter<V> {
        void checkInitialAppInstall();
        void convertToTwelveHours(int hour, int minute);
        void setUserAndMedicationPreference(int hour, int minute, int drugPickedNo);
    }
}
