package com.sourceforge.workout_timeline.models;

import android.content.Context;

import com.orm.SugarRecord;

/**
 * @author amro
 * 
 */
public class WorkoutSet extends SugarRecord<WorkoutSet> implements
		Comparable<WorkoutSet> {

	public String muscle;
	public String exercise;
	public int weight;
	public int reps;
	public long posted_date;
	public Context ctx;

	public WorkoutSet(Context ctx) {
		super(ctx);
		this.ctx = ctx;
	}

	public Muscle getMuscle() {
		return Muscle.valueOf(muscle);
	}

	public Exercise getExercise() {
		return Exercise.valueOf(exercise);
	}

	public static WorkoutSet clone(WorkoutSet original)
			throws CloneNotSupportedException {
		return (WorkoutSet) original.clone();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		WorkoutSet copy = new WorkoutSet(ctx);

		copy.muscle = muscle;
		copy.exercise = exercise;
		copy.weight = weight;
		copy.reps = reps;
		// copy.posted_date = (Date) posted_date.clone();
		copy.posted_date = System.currentTimeMillis();
		return copy;
	}

	@Override
	public int compareTo(WorkoutSet another) {
		return -1 * getId().compareTo(another.getId());
	}

	public static WorkoutSet createWorkoutSet(Context ctx) {
		WorkoutSet w = new WorkoutSet(ctx);
		w.muscle = Muscle.EMPTY.name();
		w.exercise = Exercise.EMPTY.name();
		w.posted_date = System.currentTimeMillis();
		return w;
	}

	public Integer setWeight(int hunders, int tens, int units) {
		int result = 0;
		if (hunders != 0) {
			result += 100 * hunders;
		}
		if (tens != 0) {
			result += 10 * tens;
		}
		if (units != 0) {
			result += units;
		}
		weight = result;
		return result;
	}

	public int[] getWeight() {
		int[] result = new int[3];
		int number = weight;
		result[0] = (number >= 100)? number / 100 : 0;
		number %= 100;
		result[1] = (number >= 10)? number / 10 : 0;
		number %= 10;
		result[2] = number;
		return result;
	}

	public int[] getReps() {
		int[] result = new int[2];
		int number = reps;
		result[0] = (number >= 10)? number / 10 : 0;
		number %= 10;
		result[1] = number;
		return result;
	}

	public Integer setReps(int tens, int units) {
		int result = 0;
		if (tens != 0) {
			result += 10 * tens;
		}
		if (units != 0) {
			result += units;
		}
		reps = result;
		return result;
	}

}
