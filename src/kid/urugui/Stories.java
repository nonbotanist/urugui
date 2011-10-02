package kid.urugui;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ant.liao.GifView;

import android.R.color;
import android.app.Activity;
import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class Stories extends ListActivity implements OnScrollListener {
	private LayoutParams WClayoutParams = new LinearLayout.LayoutParams(
			LinearLayout.LayoutParams.WRAP_CONTENT,
			LinearLayout.LayoutParams.WRAP_CONTENT);
	private LayoutParams FFlayoutParams = new LinearLayout.LayoutParams(
			LinearLayout.LayoutParams.FILL_PARENT,
			LinearLayout.LayoutParams.FILL_PARENT);
	 private ProgressBar progressBar; 
	 private int lastItem = 0;  
	 private SimpleAdapter adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		adapter = new SimpleAdapter(this, getData(),
				R.layout.vlist, new String[] { "title", "info", "img" },
				new int[] { R.id.title, R.id.info, R.id.img });
		setListAdapter(adapter);
		
	    progressBar = new ProgressBar(this);  
         //进度条显示位置  
        progressBar.setPadding(0, 0, 12, 0);  
        LinearLayout layout = new LinearLayout(this);  
        layout.addView(progressBar, WClayoutParams);
        
        TextView textView = new TextView(this);  
        textView.setText("loading...");  
        textView.setGravity(Gravity.CENTER_VERTICAL);  
        
        layout.addView(textView, FFlayoutParams);  
        layout.setGravity(Gravity.CENTER);  
        
        LinearLayout loadingLayout = new LinearLayout(this);  
        loadingLayout.addView(layout, WClayoutParams);  
        loadingLayout.setGravity(Gravity.CENTER);  
        
        ListView listView = getListView();  
        //添加到脚页显示  
        listView.addFooterView(loadingLayout);  
        //  
        registerForContextMenu(listView);  
        //  
        setListAdapter(adapter);  
        listView.setOnScrollListener(this);
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.welcome_menu, menu);
		menu.findItem(R.id.preference).setOnMenuItemClickListener(
				new WelMenuListener(this));
		return super.onCreateOptionsMenu(menu);
	}

	public List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G1");
		map.put("info", "google 1");
		map.put("img", R.drawable.pp);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G2");
		map.put("info", "google 2");
		map.put("img", R.drawable.pp);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.pp);
		list.add(map);

		map.put("title", "G1");
		map.put("info", "google 1");
		map.put("img", R.drawable.pp);
		list.add(map);

//		map = new HashMap<String, Object>();
//		map.put("title", "G2");
//		map.put("info", "google 2");
//		map.put("img", R.drawable.pp);
//		list.add(map);
//
//		map = new HashMap<String, Object>();
//		map.put("title", "G3");
//		map.put("info", "google 3");
//		map.put("img", R.drawable.pp);
//		list.add(map);

//		map.put("title", "G1");
//		map.put("info", "google 1");
//		map.put("img", R.drawable.pp);
//		list.add(map);
//
//		map = new HashMap<String, Object>();
//		map.put("title", "G2");
//		map.put("info", "google 2");
//		map.put("img", R.drawable.pp);
//		list.add(map);
//
//		map = new HashMap<String, Object>();
//		map.put("title", "G3");
//		map.put("info", "google 3");
//		map.put("img", R.drawable.pp);
//		list.add(map);
		return list;
	}

	public List<String> getFiles() {
		File f = new File("/sdcard/urugui/story");
		if (!f.exists()) {
			f.mkdirs();
		}
		List<String> rFiles = new ArrayList();
		for (String ff : f.list()) {
			rFiles.add(ff);
		}
		return rFiles;
	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		// TODO Auto-generated method stub
		 if (lastItem == adapter.getCount()  
	                && scrollState == OnScrollListener.SCROLL_STATE_IDLE) {  
	           // adapter.getCount() += 10;  
	           // adapter.notifyDataSetChanged();  
	              
	        }  
	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		// TODO Auto-generated method stub
		 lastItem = firstVisibleItem + visibleItemCount - 1;  
	        System.out.println("lastItem:" + lastItem);  
	        
	}
}