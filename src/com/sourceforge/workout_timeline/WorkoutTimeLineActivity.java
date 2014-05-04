package com.sourceforge.workout_timeline;

import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.sourceforge.workout_timeline.models.Exercise;
import com.sourceforge.workout_timeline.models.Muscle;
import com.sourceforge.workout_timeline.models.WorkoutSet;
import com.sourceforge.workouttimeline.R;

public class WorkoutTimeLineActivity extends ListActivity {

	private TimeLineAdapter adapter_;
	private static final String TAG = "Workout-timeline";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		WorkoutSet set = new WorkoutSet(this);
		set.exercise = Exercise.CABLE_CROSS_OVER.getShortDesc();
		set.muscle = Muscle.CHEST.name();
		set.reps = "7";
		set.weight = String.valueOf("25");
		set.save();

		List<WorkoutSet> data = WorkoutSet.listAll(WorkoutSet.class);

		adapter_ = new TimeLineAdapter(this, data);

		setListAdapter(adapter_);

		super.onCreate(savedInstanceState);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.

		// getMenuInflater().inflate(R.menu.workout_time_line, menu);
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.activity_workout_timeline_menu, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	public void onAdd(){
		Log.i(TAG, "Add Item pressed");
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		return super.onOptionsItemSelected(item);
	}

}
