package com.aidan_oconnor_cv;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;
import android.app.Activity;

//extends ActionBarActivity did not allow icons in the ActioBar to display correctly
//public class MainActivity extends ActionBarActivity implements android.view.View.OnClickListener {
public class MainActivity extends Activity implements android.view.View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//create buttons
		Button aboutButton = (Button) findViewById(R.id.about_button);
        Button personalDetailsButton = (Button) findViewById(R.id.personal_details_button);
        Button academicButton = (Button) findViewById(R.id.academic_button);
        Button portfolioButton = (Button) findViewById(R.id.portfolio_button);
        Button careerButton = (Button) findViewById(R.id.career_button);
		
        //make buttons clickable
        aboutButton.setOnClickListener(this);
        personalDetailsButton.setOnClickListener(this);
        academicButton.setOnClickListener(this);
        portfolioButton.setOnClickListener(this);
        careerButton.setOnClickListener(this);
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

	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {	
		int timeduration = 3;
		//switch statement
		switch(v.getId()){
		case R.id.about_button:
			//Toast.makeText(this, "About clicked", timeduration).show();
			Intent aboutIntent = new Intent(this, AboutActivity.class);
			startActivity(aboutIntent);
			break;
		
		case R.id.personal_details_button:
			//Toast.makeText(this, "Personal Details clicked", timeduration).show();
			Intent personalDetailsIntent = new Intent(this, PersonalDetailsActivity.class);
			startActivity(personalDetailsIntent);
			break;
		
		case R.id.career_button:
			//Toast.makeText(this, "Work Experience clicked", timeduration).show();
			Intent careerIntent = new Intent(this, CareerActivity.class);
			startActivity(careerIntent);
			break;
		
		case R.id.academic_button:
			//Toast.makeText(this, "Academic Button clicked", timeduration).show();
			Intent academicButtonIntent = new Intent(this, AcademicActivity.class);
			startActivity(academicButtonIntent);
			break;
	
		default:
			//Toast.makeText(this, "Portfolio Button clicked", timeduration).show();
			Intent portfolioIntent = new Intent(this, PortfolioActivity.class);
			startActivity(portfolioIntent);
			break;
		}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
}
