package com.sourceforge.workout_timeline;

import java.util.Date;

import android.content.Context;

import com.orm.SugarRecord;

/**
 * @author amro
 * 
 */
public class WorkoutSet extends SugarRecord<WorkoutSet> {

	String muscle;
	String exercise;
	String reps;
	Date posted_date;

	public WorkoutSet(Context ctx) {
		super(ctx);
	}
}
