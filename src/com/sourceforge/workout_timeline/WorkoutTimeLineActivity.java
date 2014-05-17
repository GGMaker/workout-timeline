package com.sourceforge.workout_timeline;

import java.util.Collections;
import java.util.List;

import android.app.FragmentManager;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.sourceforge.workout_timeline.fragments.AddUpdateWorkoutSetFragment;
import com.sourceforge.workout_timeline.models.WorkoutSet;
import com.sourceforge.workouttimeline.R;

public class WorkoutTimeLineActivity extends ListActivity {

	private TimeLineAdapter timeLine;
	private static final String TAG = "Workout-timeline";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		List<WorkoutSet> data = WorkoutSet.listAll(WorkoutSet.class);
		Collections.sort(data);

		timeLine = new TimeLineAdapter(this, data);

		setListAdapter(timeLine);

		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				onUpdate((WorkoutSet)timeLine.getItem(position));
			}
		});

		super.onCreate(savedInstanceState);

	}

	public void onAdd(MenuItem item) throws CloneNotSupportedException {
		Log.e(TAG, "OnAdd is Clicked");
		FragmentManager manager = getFragmentManager();
		
		WorkoutSet lastSet = (timeLine.getCount() > 0) ? (WorkoutSet) WorkoutSet.clone((WorkoutSet) timeLine.getItem(0)) : WorkoutSet.createWorkoutSet(this);
		AddUpdateWorkoutSetFragment dialog = new AddUpdateWorkoutSetFragment();
		dialog.setAdd(true);
		dialog.setTimeline(timeLine);
		dialog.setWorkoutSet(lastSet);
		dialog.show(manager, "ADD_WORKOUT_SET");
	}

	public void onUpdate(WorkoutSet argWorkoutSet) {
		Log.e(TAG, "onUpdate is Clicked");
		FragmentManager manager = getFragmentManager();
		AddUpdateWorkoutSetFragment dialog = new AddUpdateWorkoutSetFragment();
		dialog.setTimeline(timeLine);
		dialog.setWorkoutSet(argWorkoutSet);
		dialog.show(manager, "UPDATE_WORKOUT_SET");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.

		// getMenuInflater().inflate(R.menu.workout_time_line, menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_workout_timeline_menu, menu);
		return super.onCreateOptionsMenu(menu);
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
