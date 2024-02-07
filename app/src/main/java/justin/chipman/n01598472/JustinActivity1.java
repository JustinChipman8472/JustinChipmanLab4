package justin.chipman.n01598472;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
// Justin Chipman n01598472
public class JustinActivity1 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = findViewById(R.id.displayButton);
        final EditText inputEditText = findViewById(R.id.inputEditText);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEditText.getText().toString();
                long data = input.isEmpty() ? -1000 : Long.parseLong(input);

                // Show Snackbar
                Snackbar snackbar = Snackbar
                        .make(view, getString(R.string.my_name), Snackbar.LENGTH_INDEFINITE)
                        .setAction(R.string.start, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Start SecondActivity and pass the data
                                Intent intent = new Intent(JustinActivity1.this, ChipmanActivity2.class);
                                intent.putExtra(getString(R.string.userinput), data);
                                startActivity(intent);
                            }
                        });
                snackbar.show();
            }
        });

    }


}