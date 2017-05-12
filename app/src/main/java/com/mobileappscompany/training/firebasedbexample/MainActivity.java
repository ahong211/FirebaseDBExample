package com.mobileappscompany.training.firebasedbexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAC_TAG";
    EditText editText;
    EditText editText2;
    TextView textView;
    DatabaseReference myRef;
    Contact contact = new Contact();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);

        myRef = FirebaseDatabase.getInstance().getReference("message");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Contact value = dataSnapshot.getValue(Contact.class);
                if (value == null) {
                    return;
                }

                contact = value;
                textView.setText("Name: " + contact.getmName() + " Phone: " + contact.getmPhone());

                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }

    public void onClick(View view) {
        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        myRef = database.getReference("message");

        contact.setmName(editText.getText().toString());
        contact.setmPhone(editText2.getText().toString());
        myRef.setValue(contact);
    }
}
