package io.github.yhdesai.countrycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView countryNameTextView;
    HashMap<String, String> countryCodeHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initHashmap();
    }


    public void submitButton(View view) {
        String countryCode = getCountryFromEditText();
        String countryName = getCountryNameFromCode(countryCode);
        setCountryNameTextView(countryName);
    }

    private String getCountryFromEditText() {
        return editText.getText().toString();
    }

    private void initViews() {
        editText = findViewById(R.id.codeEditText);
        countryNameTextView = findViewById(R.id.countryText);
    }

    private void initHashmap() {
        countryCodeHashMap = new HashMap<String, String>();
        countryCodeHashMap.put("004", "AFG");
        countryCodeHashMap.put("248", "ALA");
        countryCodeHashMap.put("008", "ALB");
        countryCodeHashMap.put("012", "DZA");
    }

    private String getCountryNameFromCode(String countryCode) {
        return countryCodeHashMap.get(countryCode);
    }

    private void setCountryNameTextView(String countryName) {
        countryNameTextView.setText(countryName);
    }
}
