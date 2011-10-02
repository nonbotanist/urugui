/**
 * 
 */
package kid.urugui.preferences;

import kid.urugui.R;
import android.os.Bundle;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;

/**
 * @author Administrator
 * 
 */
public class MyPreference extends PreferenceActivity implements
		OnPreferenceChangeListener, OnPreferenceClickListener {

	/**
	 * 
	 */
	public MyPreference() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
	}

	@Override
	public boolean onPreferenceClick(android.preference.Preference preference) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onPreferenceChange(android.preference.Preference preference,
			Object newValue) {
		// TODO Auto-generated method stub
		return false;
	}

}
