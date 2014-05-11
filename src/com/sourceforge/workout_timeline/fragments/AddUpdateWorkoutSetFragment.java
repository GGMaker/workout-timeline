/**
 * 
 */
package com.sourceforge.workout_timeline.fragments;

import javax.xml.datatype.Duration;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.sourceforge.workout_timeline.TimeLineAdapter;
import com.sourceforge.workout_timeline.models.Exercise;
import com.sourceforge.workout_timeline.models.Muscle;
import com.sourceforge.workout_timeline.models.WorkoutSet;
import com.sourceforge.workouttimeline.R;

/**
 * @author amro
 * 
 */
@SuppressLint("ShowToast")
public class AddUpdateWorkoutSetFragment extends DialogFragment {
	private Button done;
	private Button forgetIt;
	private Spinner muscleSpnr;
	private Spinner execrciseSpnr;
	private Spinner weight100;
	private Spinner weight10;
	private Spinner weight1;
	private Spinner reps10;
	private Spinner reps1;
	private WorkoutSet workoutSet;
	private boolean isAdd;
	private TimeLineAdapter timeLine;

	@SuppressWarnings("unchecked")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setDialogTitle();

		View v = inflater.inflate(R.layout.dialog_add_update_workout_set, null);
		done = (Button) v.findViewById(R.id.dialog_done_button);

		done.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stubdone.getId() == which){
				if (isAdd) {
					
					workoutSet.muscle = ((Muscle)muscleSpnr.getSelectedItem()).name();
					workoutSet.exercise = ((Exercise)execrciseSpnr.getSelectedItem()).name();


					workoutSet.save();
					timeLine.addWorkoutSet(workoutSet);
					timeLine.notifyDataSetChanged();
				}
				Toast.makeText(getActivity(), "New Workout Set Added",
						Toast.LENGTH_SHORT);
				dismiss();
			}
		});
		forgetIt = (Button) v.findViewById(R.id.dialog_forgetit_button);
		forgetIt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dismiss();
			}

		});
		muscleSpnr = (Spinner) v.findViewById(R.id.muscle_value);
		ArrayAdapter<Muscle> muscleAdp = new ArrayAdapter<Muscle>(
				getActivity(), android.R.layout.simple_spinner_item,
				Muscle.values());
		muscleSpnr.setAdapter(muscleAdp);
		muscleSpnr
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						Muscle muscle = (Muscle) parent.getAdapter().getItem(
								position);
						ArrayAdapter<Exercise> exerciseAdp = new ArrayAdapter<Exercise>(
								getActivity(),
								android.R.layout.simple_spinner_item, Exercise
										.getExercisesByMuscleGroup(muscle
												.name()));
						execrciseSpnr.setAdapter(exerciseAdp);

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

		execrciseSpnr = (Spinner) v.findViewById(R.id.execercise_value);
		ArrayAdapter<Exercise> exerciseAdp = new ArrayAdapter<Exercise>(
				getActivity(), android.R.layout.simple_spinner_item,
				Exercise.getExercisesByMuscleGroup(workoutSet.muscle));
		execrciseSpnr.setAdapter(exerciseAdp);
		execrciseSpnr.setSelection(exerciseAdp.getPosition(workoutSet
				.getExercise()));

		weight100 = (Spinner) v.findViewById(R.id.weight_100_value);
		weight100.setAdapter(createArrayAdapter(getActivity(),
				android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2,
						3, 4, 5, 6, 7, 8, 9 }));

		weight10 = (Spinner) v.findViewById(R.id.weight_10_value);
		weight10.setAdapter(createArrayAdapter(getActivity(),
				android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2,
						3, 4, 5, 6, 7, 8, 9 }));

		weight1 = (Spinner) v.findViewById(R.id.weight_1_value);
		weight1.setAdapter(createArrayAdapter(getActivity(),
				android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2,
						3, 4, 5, 6, 7, 8, 9 }));

		reps10 = (Spinner) v.findViewById(R.id.reps_10_value);
		reps10.setAdapter(createArrayAdapter(getActivity(),
				android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2,
						3, 4, 5, 6, 7, 8, 9 }));

		reps1 = (Spinner) v.findViewById(R.id.reps_1_value);
		reps1.setAdapter(createArrayAdapter(getActivity(),
				android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2,
						3, 4, 5, 6, 7, 8, 9 }));

		return v;
	}

	private void setDialogTitle() {
		if (isAdd) {
			getDialog().setTitle("Add Workout Set");
		} else {

			getDialog().setTitle("Update Workout Set");
		}
	}

	private ArrayAdapter<Integer> createArrayAdapter(Context context,
			int viewId, Integer[] array) {
		return new ArrayAdapter<Integer>(context, viewId, array);
	}

	public WorkoutSet getWorkoutSet() {
		return workoutSet;
	}

	public void setWorkoutSet(WorkoutSet workoutSet) {
		this.workoutSet = workoutSet;

	}

	public boolean isAdd() {
		return isAdd;
	}

	public void setAdd(boolean isAdd) {
		this.isAdd = isAdd;
	}

	public TimeLineAdapter getTimeline() {
		return timeLine;
	}

	public void setTimeline(TimeLineAdapter timeline) {
		this.timeLine = timeline;
	}

}
