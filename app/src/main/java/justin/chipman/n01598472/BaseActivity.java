package justin.chipman.n01598472;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(getString(R.string.app_info), getString(R.string.app_name));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_dial) {
            // Launch Dialer
            Intent intentDial = new Intent(Intent.ACTION_DIAL);
            intentDial.setData(Uri.parse(getString(R.string.tel_num)));
            startActivity(intentDial);
            return true;
        } else if (id == R.id.action_help) {
            // Launch website
            Intent intentBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.google)));
            startActivity(intentBrowser);
            return true;
        } else if (id == R.id.action_exit) {
            finishAffinity();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
