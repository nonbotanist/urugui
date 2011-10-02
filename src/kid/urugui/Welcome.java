package kid.urugui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Welcome extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView listView = (ListView) this.findViewById(android.R.id.list);
		String[] from = new String[] { "title", "info", "img" };
		int[] to = new int[] { R.id.title, R.id.info, R.id.img };
		
		SimpleAdapter adapter = new SimpleAdapter(this, getData(),R.layout.vlist,from,to);
		listView.setAdapter(adapter);	
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

}
