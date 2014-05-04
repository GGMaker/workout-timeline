package com.sourceforge.workout_timeline.models;

import java.util.Date;

import android.content.Context;

import com.orm.SugarRecord;

/**
 * @author amro
 * 
 */
public class WorkoutSet extends SugarRecord<WorkoutSet> {

	public String muscle;
	public String exercise;
	public String weight;
	public String reps;
	public Date posted_date;

	public WorkoutSet(Context ctx) {
		super(ctx);
	}
}
