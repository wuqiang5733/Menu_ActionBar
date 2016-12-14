package xuxiaoxiao.com.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

//import android.support.v7.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

//        MenuItem menuItem = menu.findItem(R.id.action_share);
//        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
//        setIntent("This is example text");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                //Code to run when the Create Order item is clicked
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_share:
                //Code to run when the settings item is clicked

                Intent shareIntent = ShareCompat.IntentBuilder
                        .from(this)
                        .setType("text/plain")
                        .setText("Hello World !")
                        .getIntent();

                          startActivity(shareIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    void configureMenuItem(Menu menu, int menuItemId, ShareCompat.IntentBuilder shareIntent) {

    }
}
