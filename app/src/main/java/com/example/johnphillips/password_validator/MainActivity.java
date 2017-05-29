package com.example.johnphillips.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static String pw ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick(View view){
        EditText text = (EditText)findViewById(R.id.editText);
        pw = text.getText().toString();
        if(checkLength(pw))
            if(checkForCapital(pw))
                if(checkNotPassword(pw))
                    if(checkNoPassword(pw))
                        if(checkForNumber(pw))
                            if(checkNoSemicolon(pw)){
                                TextView resultText = (TextView)findViewById(R.id.resultText);
                                resultText.setText("Valid");
                            }
                            else{
                                TextView resultText = (TextView)findViewById(R.id.resultText);
                                resultText.setText("Not Valid");
                            }
                        else{
                            TextView resultText = (TextView)findViewById(R.id.resultText);
                            resultText.setText("Not Valid");
                        }
                    else{
                        TextView resultText = (TextView)findViewById(R.id.resultText);
                        resultText.setText("Not Valid");
                    }
                else{
                    TextView resultText = (TextView)findViewById(R.id.resultText);
                    resultText.setText("Not Valid");
                }
            else{
                TextView resultText = (TextView)findViewById(R.id.resultText);
                resultText.setText("Not Valid");
            }
        else{
            TextView resultText = (TextView)findViewById(R.id.resultText);
            resultText.setText("Not Valid");
        }

    }

    public boolean checkLength(String password){
        return (password.length()>=8);
    }
    public boolean checkForCapital(String password){
        return (!(password.toLowerCase().equals(password))&&!(password.equals(password.toUpperCase())));
    }
    public boolean checkNotPassword(String password){
        return(!(password.toLowerCase().equals("password")));
    }
    public boolean checkNoPassword(String password){
        return(!(password.toLowerCase().contains("password")));
    }
    public boolean checkForNumber(String password){
        return (password.toLowerCase().contains("1")||password.toLowerCase().contains("2")||password.toLowerCase().contains("3")||password.toLowerCase().contains("4")||password.toLowerCase().contains("5")||password.toLowerCase().contains("6")||password.toLowerCase().contains("7")||password.toLowerCase().contains("8")||password.toLowerCase().contains("9")||password.toLowerCase().contains("0"));
    }
    public boolean checkNoSemicolon(String password) {
        return ((!password.contains(";")) && (!password.contains("\"")) && (!password.contains("\'")));
    }
}
