/**
 * 
 */
package com.sourceforge.workout_timeline.adapters;

import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sourceforge.workout_timeline.models.Muscle;
import com.sourceforge.workout_timeline.models.WorkoutSet;
import com.sourceforge.workouttimeline.R;

/**
 * @author amro
 * 
 */
public class MuscleGroupAdapter extends BaseAdapter {

	private List<Muscle> items;
	private LayoutInflater inflater;
	private Context context;

	public MuscleGroupAdapter(Context argContext, List<Muscle> argItems) {
		context = argContext;
		items = argItems;

	}

	public MuscleGroupAdapter(Context argContext, Muscle[] argItems) {
		context = argContext;
		items = Arrays.asList(argItems);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return items.get(position);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getView(int, android.view.View,
	 * android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View v;
		if (convertView != null) {
			v = convertView;
		} else {
			inflater = LayoutInflater.from(context);
			v = inflater.inflate(android.R.layout.simple_spinner_item, parent);
		}
		bindView(position, v);
		return null;
	}

	private void bindView(int position, View v) {
		// TODO Auto-generated method stub
		TextView text = (TextView) v.findViewById(android.R.id.text1);
		text.setText(items.get(position).getShortDesc());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
