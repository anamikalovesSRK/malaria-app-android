package com.peacecorps.malaria.ui.trip_reminder.trip_select_item;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peacecorps.malaria.R;
import com.peacecorps.malaria.ui.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by Anamika Tripathi on 29/7/18.
 */
// Still need to implement this fragment!
public class SelectItemFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_select_trip_item, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected int getContentResource() {
        return R.layout.trip_indicator_packing_dialog;
    }

    @Override
    protected void init() {
        // Todo still need to implement this fragment
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}