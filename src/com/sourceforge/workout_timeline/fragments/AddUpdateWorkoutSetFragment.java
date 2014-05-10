/**
 * 
 */
package com.sourceforge.workout_timeline.fragments;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.sourceforge.workouttimeline.R;

/**
 * @author amro
 * 
 */
public class AddUpdateWorkoutSetFragment extends DialogFragment {
	private Button done;
	private Button forgetit;
	private Spinner muscle;
	private Spinner execrcise;
	private Spinner weight100;
	private Spinner weight10;
	private Spinner weight1;
	private Spinner reps10;
	private Spinner reps1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.dialog_add_update_workout_set, null);
		muscle = (Spinner) v.findViewById(R.id.muscle_value);
		execrcise = (Spinner) v.findViewById(R.id.execercise_value);

		weight100 = (Spinner) v.findViewById(R.id.weight_100_value);
		weight100.setAdapter(createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,  new Integer[]{0,1,2,3,4,5,6,7,8,9}));

		weight10 = (Spinner) v.findViewById(R.id.weight_10_value);
		weight10.setAdapter(createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,  new Integer[]{0,1,2,3,4,5,6,7,8,9}));

		weight1 = (Spinner) v.findViewById(R.id.weight_1_value);
		weight1.setAdapter(createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,  new Integer[]{0,1,2,3,4,5,6,7,8,9}));

		reps10 = (Spinner) v.findViewById(R.id.reps_10_value);
		reps10.setAdapter(createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,  new Integer[]{0,1,2,3,4,5,6,7,8,9}));

		reps1 = (Spinner) v.findViewById(R.id.reps_1_value);
		reps1.setAdapter(createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item,  new Integer[]{0,1,2,3,4,5,6,7,8,9}));

		return v;
	}

	private ArrayAdapter<Integer> createArrayAdapter(Context context, int viewId, Integer[] array) {
		return new ArrayAdapter<Integer>(context, viewId, array);
	}

}
