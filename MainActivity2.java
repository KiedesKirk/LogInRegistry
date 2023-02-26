package com.example.loginregistry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button register =findViewById(R.id.register);
        final EditText fname =findViewById(R.id.fName);
        final EditText lName =findViewById(R.id.lName);
        final EditText userName =findViewById(R.id.uName);
        final EditText password =findViewById(R.id.pwrd);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                final String fnameTxt =fname.getText().toString();
                final String lNameTxt =lName.getText().toString();
                final String userNameTxt =userName.getText().toString();
                final String passwordTxt =password.getText().toString();

                if(fnameTxt.isEmpty() || lNameTxt.isEmpty() || userNameTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(MainActivity2.this, "Fill the fields", Toast.LENGTH_SHORT).show();
                }else{
                    Map<String, Object> user = new HashMap<>();
                    user.put("First name", fnameTxt);
                    user.put("Last Name", lNameTxt);
                    user.put("Username",userNameTxt);
                    user.put("Password",passwordTxt);
                    db.collection("Accounts").add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(MainActivity2.this, "Registered", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }
}
