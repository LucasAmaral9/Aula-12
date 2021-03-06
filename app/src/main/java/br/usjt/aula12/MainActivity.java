package br.usjt.aula12;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public final static String EXTRA_MESSAGE = "a";

    public void pesquisarDestino(View view)
    {
        try
        {
         Intent intent = new Intent(this, SecondaryActivity.class);
         Spinner spin = (Spinner) findViewById(R.id.estados_spinner);
        String x = "" + spin.getSelectedItem().toString();

            if(x.equals(""))
            {

            }
            else{

                intent.putExtra(EXTRA_MESSAGE, x);
                startActivity(intent);
            }

        }
        catch(Exception e)
        {

        }

    }
}
