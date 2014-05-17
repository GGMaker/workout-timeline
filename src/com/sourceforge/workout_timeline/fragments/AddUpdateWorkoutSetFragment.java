/**
 * 
 */
package com.sourceforge.workout_timeline.fragments;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
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
	private boolean preSelectedExecrcise = false;
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

					workoutSet.muscle = ((Muscle)muscleSpnr.getSelectedItem()).name();
					workoutSet.exercise = ((Exercise)execrciseSpnr.getSelectedItem()).name();
					workoutSet.setReps((Integer)reps10.getSelectedItem(), (Integer)reps1.getSelectedItem());
					workoutSet.setWeight((Integer)weight100.getSelectedItem(), (Integer)weight10.getSelectedItem(), (Integer)weight1.getSelectedItem());

					workoutSet.save();
				if (isAdd) {
					
					timeLine.addWorkoutSet(workoutSet);
				}
				timeLine.notifyDataSetChanged();
				Toast.makeText(getActivity(), "New Workout Set Added",
						Toast.LENGTH_LONG);
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
		ArrayAdapter<Muscle> muscleAdp = new ArrayAdapter<Muscle>( getActivity(), android.R.layout.simple_spinner_item, Muscle.values());
		muscleSpnr.setAdapter(muscleAdp);

		muscleSpnr.setSelection(muscleAdp.getPosition(workoutSet.getMuscle()));

		execrciseSpnr = (Spinner) v.findViewById(R.id.execercise_value);
		ArrayAdapter<Exercise> exerciseAdp = new ArrayAdapter<Exercise>( getActivity(), android.R.layout.simple_spinner_item, Exercise.getExercisesByMuscleGroup(workoutSet.muscle));
		execrciseSpnr.setAdapter(exerciseAdp);
		if(workoutSet.getExercise() != null){
		execrciseSpnr.setSelection(exerciseAdp.getPosition(workoutSet.getExercise()));
		preSelectedExecrcise = true;
		}
		
		int[] weightParts = workoutSet.getWeight();

		weight100 = (Spinner) v.findViewById(R.id.weight_100_value);
		ArrayAdapter<Integer> weight100Adp = createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		weight100.setAdapter(weight100Adp);
		weight100.setSelection(weight100Adp.getPosition(weightParts[0]));

		ArrayAdapter<Integer> weight10Adp = createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		weight10 = (Spinner) v.findViewById(R.id.weight_10_value);
		weight10.setAdapter(weight10Adp);
		weight10.setSelection(weight10Adp.getPosition(weightParts[1]));

		weight1 = (Spinner) v.findViewById(R.id.weight_1_value);
		ArrayAdapter<Integer> weight1Adp = createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		weight1.setAdapter(weight1Adp);
		weight1.setSelection(weight10Adp.getPosition(weightParts[2]));

		int[] repsParts= workoutSet.getReps();
		reps10 = (Spinner) v.findViewById(R.id.reps_10_value);
		ArrayAdapter<Integer> reps10Adp = createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		reps10.setAdapter(reps10Adp);
		reps10.setSelection(reps10Adp.getPosition(repsParts[0]));

		reps1 = (Spinner) v.findViewById(R.id.reps_1_value);
		ArrayAdapter<Integer> reps1Adp = createArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		reps1.setAdapter(reps1Adp);
		reps1.setSelection(reps1Adp.getPosition(repsParts[1]));

		
		muscleSpnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				if(preSelectedExecrcise){
					// The execrcise is pre selected so igonre the event this time
					preSelectedExecrcise = false;
				}else{
				Muscle muscle = (Muscle) parent.getAdapter().getItem( position);
				ArrayAdapter<Exercise> exerciseAdp = new ArrayAdapter<Exercise>( getActivity(), android.R.layout.simple_spinner_item, Exercise.getExercisesByMuscleGroup(muscle .name()));
				execrciseSpnr.setSelection(exerciseAdp.getPosition(workoutSet.getExercise()));
				execrciseSpnr.setAdapter(exerciseAdp);
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		
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
