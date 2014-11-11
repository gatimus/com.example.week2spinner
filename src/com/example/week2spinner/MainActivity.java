package com.example.week2spinner;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	Spinner spinner;
	TextView tvSelected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner =(Spinner) findViewById(R.id.spinner);
		tvSelected = (TextView) findViewById(R.id.tvValue);
		String[] deserts = {"Cupcake", "Donut", "Ecliar", "Froyo", "Ginger Bread", "H"};
		ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,deserts);
		adapter_state.setDropDownViewResource(android.R.layout.simple_spinner_item);
		spinner.setAdapter(adapter_state);
		spinner.setSelection(5);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				spinner.setSelection(position);
				String str = (String) spinner.getSelectedItem();
				tvSelected.setText(str);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// from git
				// from eclipse
				
				
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
