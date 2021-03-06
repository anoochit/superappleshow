package net.redlinesoft.app.superappleshowfanclub;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 4;

	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Bundle data = new Bundle();
		switch (arg0) {
		case 0:

			FragmentVideo videoFragment = new FragmentVideo();
			data.putInt("current_page", arg0 + 1);
			videoFragment.setArguments(data);
			return videoFragment;

		case 1:
			FragmentLearn learnFragment = new FragmentLearn();
			data.putInt("current_page", arg0 + 1);
			learnFragment.setArguments(data);
			return learnFragment;

		case 2:
			FragmentTwitter twitterFragment = new FragmentTwitter();
			data.putInt("current_page", arg0 + 1);
			twitterFragment.setArguments(data);
			return twitterFragment;
			
		case 3:
			FragmentAbout aboutFragment = new FragmentAbout();
			data.putInt("current_page", arg0 + 1);
			aboutFragment.setArguments(data);
			return aboutFragment;
			
		}
		
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_COUNT;
	}

}
