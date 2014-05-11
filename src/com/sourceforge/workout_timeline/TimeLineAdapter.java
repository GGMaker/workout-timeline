/**
 * 
 */
package com.sourceforge.workout_timeline;

import java.util.Date;
import java.util.List;

import org.ocpsoft.pretty.time.PrettyTime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sourceforge.workout_timeline.models.WorkoutSet;
import com.sourceforge.workouttimeline.R;

/**
 * @author amro
 * 
 */
public class TimeLineAdapter extends BaseAdapter {

	private List<WorkoutSet> workoutList_;
	private LayoutInflater mInflater;
	private Context context;
	private static PrettyTime PT = new PrettyTime();

	TimeLineAdapter(Context argContext, List<WorkoutSet> argList) {
		workoutList_ = argList;
		context = argContext;
	}

	public void addWorkoutSet(WorkoutSet value) {
		workoutList_.add(0, value);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return workoutList_.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return workoutList_.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return workoutList_.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v;
		if (convertView == null) {
			mInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = mInflater.inflate(R.layout.activity_workout_timeline_item,
					parent, false);
		} else {
			v = convertView;
		}

		bindView(position, v);

		return v;
	}

	private void bindView(int position, View v) {
		// TODO Auto-generated method stub
		TextView muscle = (TextView) v.findViewById(R.id.timeline_muscle);
		TextView excercise = (TextView) v.findViewById(R.id.timeline_excercise);
		TextView reps = (TextView) v.findViewById(R.id.timeline_reps);
		TextView time = (TextView) v.findViewById(R.id.timeline_posted_time);
		TextView weight = (TextView) v.findViewById(R.id.timeline_weight);

		WorkoutSet set = (WorkoutSet) getItem(position);
		muscle.setText(set.getMuscle().getShortDesc());
		excercise.setText(set.getExercise().getShortDesc());
		reps.setText(set.reps);
		if(set.posted_date != null){
		time.setText(PT.format(new Date(set.posted_date.getTime())));
		}
		weight.setText(set.weight);

	}

}
