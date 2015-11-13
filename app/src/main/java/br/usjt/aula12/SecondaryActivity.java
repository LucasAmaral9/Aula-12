package br.usjt.aula12;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent intent = getIntent();

        String x = "" + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if(x.equals("São Paulo"))
        {

            TextView t1 = new TextView(this);
            t1.setTextSize(40);
            t1.setText(getString(R.string.carro1) + "\n" + getString(R.string.carro2));

            setContentView(t1);
        }
        if(x.equals("Bahia"))
        {
            TextView t1 = new TextView(this);
            t1.setTextSize(40);
            t1.setText(getString(R.string.carro3) + "\n" + getString(R.string.carro4));

            setContentView(t1);
        }
        if(x.equals("Acre"))
        {
            TextView t1 = new TextView(this);
            t1.setTextSize(40);
            t1.setText(getString(R.string.carro5) + "\n" + getString(R.string.carro2) + "\n" + getString(R.string.carro3));

            setContentView(t1);

        }












    }


    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }


        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_secondary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
