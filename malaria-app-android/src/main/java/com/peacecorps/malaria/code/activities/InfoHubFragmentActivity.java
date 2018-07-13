package com.peacecorps.malaria.code.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.peacecorps.malaria.R;
import com.peacecorps.malaria.code.model.SharedPreferenceStore;
import com.peacecorps.malaria.db.DatabaseSQLiteHelper;
import com.peacecorps.malaria.ui.user_medicine_setting.MedicineSettingsActivity;

/**
 * Created by Chimdi on 7/18/14.
 */
public class InfoHubFragmentActivity extends FragmentActivity {

    Button  btnPeaceCorpsPolicy, btnPercentSideEffects, btnSideEffectsPCV,
            btnSideEffectsNPCV, btnVolunteerAdherence, btnEffectiveness;
    TextView ihLabel;

    private Dialog dialog = null;
    static SharedPreferenceStore mSharedPreferenceStore;

    //TextView internetIsConnected;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_hub_screen);

        /**Declaring Views**/
//        ihLabel= (TextView)findViewById(R.id.ih);



        btnPeaceCorpsPolicy = (Button) findViewById(R.id.btn_peace_corps_policy);
        btnPercentSideEffects = (Button) findViewById(R.id.btn_percent_side_effects);
        btnSideEffectsPCV = (Button) findViewById(R.id.btn_side_effects_pcv);
        btnSideEffectsNPCV = (Button) findViewById(R.id.btn_side_effects_non_pcv);
        btnVolunteerAdherence = (Button) findViewById(R.id.btn_volunteer_adherence);
        btnEffectiveness = (Button) findViewById(R.id.btn_effectiveness);


        /**Setting fonts**/
        Typeface cf = Typeface.createFromAsset(getAssets(),"fonts/garreg.ttf");
        ihLabel.setTypeface(cf);

        addListeners();

    }


    public void addListeners() {

        btnPeaceCorpsPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), PeaceCorpsPolicyFragmentActivity.class));
            }
        });

        btnPercentSideEffects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), PercentSideEffectsFragmentActivity.class));
            }
        });

        btnSideEffectsPCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), SideEffectsPCVFragmentActivity.class));
            }
        });

        btnSideEffectsNPCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), SideEffectsNPCVFragmentActivity.class));
            }
        });

        btnVolunteerAdherence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), VolunteerAdherenceFragmentActivity.class));
            }
        });

        btnEffectiveness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication().getApplicationContext(), EffectivenessFragmentActivity.class));
            }
        });

//        btnSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                addDialog();
//            }
//        });

    }


    /*public boolean isConnected(){
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }*/

    public void addDialog()
    {
        /**Reset Dialog**/
        dialog = new Dialog(InfoHubFragmentActivity.this,android.R.style.Theme_DeviceDefault_Dialog_NoActionBar);
        dialog.setContentView(R.layout.resetdata_dialog);
        dialog.setTitle("Reset Data");

       // final RadioGroup btnRadGroup = (RadioGroup) dialog.findViewById(R.id.radioGroupReset);
        Button btnOK = (Button) dialog.findViewById(R.id.btn_dialog_reset_okay);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           /*     // get selected radio button from radioGroup
                int selectedId = btnRadGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton btnRadButton = (RadioButton) dialog.findViewById(selectedId);

                String ch = btnRadButton.getText().toString();

                if (ch.equalsIgnoreCase("yes")) {
                    DatabaseSQLiteHelper sqLite = new DatabaseSQLiteHelper(getApplicationContext());
                    sqLite.resetDatabase();
                    mSharedPreferenceStore.mEditor.clear().commit();
                    startActivity(new Intent(getApplication().getApplicationContext(),
                            MedicineSettingsActivity.class));

                } else {
                    dialog.dismiss();
                }*/
                DatabaseSQLiteHelper sqLite = new DatabaseSQLiteHelper(getApplicationContext());
                sqLite.resetDatabase();
                mSharedPreferenceStore.mEditor.clear().commit();
                startActivity(new Intent(getApplication().getApplicationContext(),
                        MedicineSettingsActivity.class));
            }
        });

        Button btnCancel = (Button) dialog.findViewById(R.id.btn_dialog_reset_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}

