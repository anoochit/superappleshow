package net.redlinesoft.app.superappleshowfanclub;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuInflater;

public class FragmentAbout extends SherlockFragment {

	@Override
	public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu,
			MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public SherlockFragmentActivity getSherlockActivity() {
		// TODO Auto-generated method stub
		return super.getSherlockActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_about, container, false);
		Log.d("VLOG", "onCreateView"); 
		
		Button button1=(Button) view.findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intentWeb("http://www.superappleshow.com");
			}
		});
		
		Button button2=(Button) view.findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intentWeb("http://www.youtube.com/user/superappleshow");
			}
		});
		
		Button button3=(Button) view.findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intentWeb("http://www.facebook.com/fanappleshow");
			}
		});
		
		Button button4=(Button) view.findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intentWeb("http://www.twitter.com/superappleshow");
			}
		});
		
		return view;
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	public void intentWeb(String url) {
		Intent fanPageIntent = new Intent(Intent.ACTION_VIEW);
		fanPageIntent.setType("text/url");
		fanPageIntent.setData(Uri.parse(url));
		startActivity(fanPageIntent);
	}

}
