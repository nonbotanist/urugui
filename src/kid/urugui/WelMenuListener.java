/**
 * 
 */
package kid.urugui;

import kid.urugui.preferences.MyPreference;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/**
 * @author Administrator
 *
 */
public class WelMenuListener implements OnMenuItemClickListener {
	private Activity activity;
	/**
	 * 
	 */
	public WelMenuListener(Activity act) {
		this.activity = act;
	}

	/* (non-Javadoc)
	 * @see android.view.MenuItem.OnMenuItemClickListener#onMenuItemClick(android.view.MenuItem)
	 */
	@Override
	public boolean onMenuItemClick(MenuItem item) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		intent.setClass(this.activity, MyPreference.class);
		this.activity.startActivity(intent);
		return true;
	}

}
