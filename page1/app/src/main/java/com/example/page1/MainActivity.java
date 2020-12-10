package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText address;
    EditText DoB;
    EditText sex;
    EditText HT;
    EditText WT;
    EditText nationality;
    EditText restriction;
    EditText condition;
    EditText agy;
    EditText expiration;
    EditText licenseNo;
    Button page2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        name=findViewById(R.id.txtName);
        address=findViewById(R.id.txtAddress);
        DoB=findViewById(R.id.txtDnB);
        sex=findViewById(R.id.txtSex);
        HT=findViewById(R.id.txtHeight);
        WT=findViewById(R.id.txtWeight);
        nationality=findViewById(R.id.txtNationality);
        restriction=findViewById(R.id.txtRestriction);
        agy=findViewById(R.id.txtAGY);
        condition=findViewById(R.id.txtCondition);
        expiration=findViewById(R.id.txtExpiration);
        licenseNo=findViewById(R.id.txtLicenseNo);
        page2=findViewById(R.id.btnGO);
        page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Alert Dialog");
                builder.setMessage("Click Yes if you want to show your drivers license");
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String pName = name.getText().toString();
                        String pAddress = address.getText().toString();
                        String pDoB = DoB.getText().toString();
                        String pSex = sex.getText().toString();
                        String pHT = HT.getText().toString();
                        String pWT = WT.getText().toString();
                        String pNationality = nationality.getText().toString();
                        String pRestriction = restriction.getText().toString();
                        String pAGY = agy.getText().toString();
                        String pCondition = condition.getText().toString();
                        String pExpiration = expiration.getText().toString();
                        String pLicenseNo = licenseNo.getText().toString();

                        Intent p2 = new Intent(getApplicationContext(), page2.class);
                        p2.putExtra("strName",pName);
                        p2.putExtra("strAddress",pAddress);
                        p2.putExtra("strDoB",pDoB);
                        p2.putExtra("strSex",pSex);
                        p2.putExtra("strHT",pHT);
                        p2.putExtra("strWT",pWT);
                        p2.putExtra("strNationality",pNationality);
                        p2.putExtra("strRestriction",pRestriction);
                        p2.putExtra("strCondition",pCondition);
                        p2.putExtra("strAGY",pAGY);
                        p2.putExtra("strExpiration",pExpiration);
                        p2.putExtra("strLicenseNo",pLicenseNo);
                        startActivity(p2);
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String pName = name.getText().toString();
                        String pAddress = address.getText().toString();
                        String pDoB = DoB.getText().toString();
                        String pSex = sex.getText().toString();
                        String pHT = HT.getText().toString();
                        String pWT = WT.getText().toString();
                        String pNationality = nationality.getText().toString();
                        String pRestriction = restriction.getText().toString();
                        String pAGY = agy.getText().toString();
                        String pCondition = condition.getText().toString();
                        String pExpiration = expiration.getText().toString();
                        String pLicenseNo = licenseNo.getText().toString();

                        Intent p2 = new Intent(getApplicationContext(), page2.class);
                        p2.putExtra("strName",pName);
                        p2.putExtra("strAddress",pAddress);
                        p2.putExtra("strDoB",pDoB);
                        p2.putExtra("strSex",pSex);
                        p2.putExtra("strHT",pHT);
                        p2.putExtra("strWT",pWT);
                        p2.putExtra("strNationality",pNationality);
                        p2.putExtra("strRestriction",pRestriction);
                        p2.putExtra("strCondition",pCondition);
                        p2.putExtra("strAGY",pAGY);
                        p2.putExtra("strExpiration",pExpiration);
                        p2.putExtra("strLicenseNo",pLicenseNo);
                    }
                });
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        name.setText(" ");
                        address.setText(" ");
                        DoB.setText(" ");
                        sex.setText(" ");
                        HT.setText(" ");
                        WT.setText(" ");
                        nationality.setText(" ");
                        restriction.setText(" ");
                        condition.setText(" ");
                        agy.setText(" ");
                        expiration.setText(" ");
                        licenseNo.setText(" ");
                    }
                });
                builder.show();
            }
        });
    }

}