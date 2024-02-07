package justin.chipman.n01598472;
// justin chipman n01598472
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        long data = getIntent().getLongExtra(getString(R.string.userinput), -1000);
       // Log.d(getString(R.string.secondactivity),getString(R.string.recieved_data) + data);
        TextView textView = findViewById(R.id.textView);
        String newText = getString(R.string.number) + data;
        textView.setText(newText);
    }
}