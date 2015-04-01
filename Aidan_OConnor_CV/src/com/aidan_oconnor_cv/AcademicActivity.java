package com.aidan_oconnor_cv;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class AcademicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_academic);
		
		//display formatted html
		TextView view = (TextView)findViewById(R.id.academic_textview);
		String formattedText = getString(R.string.academic_details);
		Spanned result = Html.fromHtml(formattedText);
		view.setText(result);
		
		//make text view scrollable
		view.setMovementMethod(new ScrollingMovementMethod());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch(item.getItemId()){
		case R.id.action_search:
			openSearch();
			return true;
		case R.id.action_settings:
			openSettings();
			return true;
		case R.id.action_share:
			openShare();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	private void openShare() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "openShare", 90).show();
	}

	private void openSettings() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "openSettings", 90).show();
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "openSearch", 90).show();
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */

}
