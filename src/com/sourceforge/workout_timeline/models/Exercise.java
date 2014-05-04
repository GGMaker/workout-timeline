/**
 * 
 */
package com.sourceforge.workout_timeline;

/**
 * @author amro
 *
 */
public enum Exercise {

	FLAT_BARBELL("Flat Barbell ","Long Description","imageURI",  new Muscle[] {Muscle.CHEST}),
	DUMBBELL_BENCH_PRESS("Dumbbell Bench Press","Long Description","imageURI", new Muscle[] {Muscle.CHEST}),
	INCLINE_BARBELL("Incline Barbell","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	DUMBBELL_BENCH("Dumbbell Bench Press","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	DECLINE_BARBELL("Decline Barbell", "Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	FLAT_CHEST_PRESS_MACHINE("Flat Chest Press Machine","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	INCLINE_CHEST_PRESS_MACHINE("Incline Chest Press Machine","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	DECLINE_CHEST_PRESS_MACHINE("Decline Chest Press Machine","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	DIPS_LEAN_FORWARD("Dips (on parallel bars with slight forward lean)","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	PUSH_UPS("Push-Ups","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	FLAT_DUMBBELL_FLYES("Flat Dumbbell Flyes","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	INCLINE_DUMBBELL_FLYES("Incline Dumbbell Flyes","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	DECLINE_DUMBBELL_FLYES("Decline Dumbbell Flyes","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	PEC_DECK_MACHINE("Pec Deck Machine","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),
	CABLE_CROSS_OVER("Cable Crossovers/Cable Flyes","Long Description", "imageURI", new Muscle[]{Muscle.CHEST});
	
	private String shortDesc;
	private String longDesc;
	private String imageUri;
	private Muscle[] muscleGroup;
	
	Exercise(String argShortDesc, String argLongDesc, String argUri, Muscle[] argMuscleGroup){
		shortDesc = argShortDesc;
		longDesc = argLongDesc;
		imageUri = argUri;
		muscleGroup = argMuscleGroup;
		
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public String getImageUri() {
		return imageUri;
	}

	public Muscle[] getMuscleGroup() {
		return muscleGroup;
	}
	
	
//
//	A List Of The Best Back Exercises
//
//	Pull-Ups
//	Chin-Ups
//	Lat Pull-Downs
//	Bent Over Barbell or 
//	Dumbbell Rows
//	T-Bar Rows
//	Seated Cable Rows
//	Chest Supported Barbell or 
//	Dumbbell Rows
//	Chest Supported Machine Rows
//	Inverted Rows
//	Barbell, Dumbbell or Machine Shrugs
//
//	A List Of The Best Shoulder Exercises
//
//	Seated Overhead Barbell or 
//	Dumbbell Press
//	Standing Overhead Barbell or 
//	Dumbbell Press
//	Overhead Machine Press
//	Arnold Press
//	Barbell, Dumbbell or 
//	Machine Upright Rows
//	Dumbbell, Cable or 
//	Machine Lateral Raises
//	Dumbbell, Cable or 
//	Machine Front Raises
//	Barbell, Dumbbell, or 
//	Machine Rear Delt Rows, Raises or Flyes
//
//	A List Of The Best Quadriceps Exercises
//
//	Barbell or 
//	Dumbbell Squats
//	Barbell or 
//	Dumbbell Front Squats
//	Barbell or 
//	Dumbbell Split Squats
//	Barbell or 
//	Dumbbell Lunges
//	Barbell or 
//	Dumbbell Step-Ups
//	Leg Press
//	Machine Squat/Hack Squat
//	Leg Extensions
//
//	A List Of The Best Hamstring Exercises
//
//	Barbell or 
//	Dumbbell Romanian Deadlifts
//	Barbell or 
//	Dumbbell Straight Leg Deadlifts
//	Barbell or 
//	Dumbbell Sumo Deadlifts
//	Glute-Ham Raises
//	Hyperextensions
//	Cable Pull-Throughs
//	Good-Mornings
//	Leg Curls
//	(Compound hamstring exercises also target a significant portion of the lower body/posterior chain.)
//
//	A List Of The Best Biceps Exercises
//
//	Standing Barbell or 
//	Dumbbell Curls
//	Barbell or 
//	Dumbbell Preacher Curls
//	Seated Dumbbell Curls
//	Incline Dumbbell Curls
//	Hammer Curls
//	Concentration Curls
//	Cable Curls
//	Biceps Curl Machine
//
//	A List Of The Best Triceps Exercises
//
//	Dips (on parallel bars, elbows close to body, without forward lean)
//	Flat Close Grip Bench Press
//	Decline Close Grip Bench Press
//	Close Grip Push-Ups
//	Laying Barbell or 
//	Dumbbell Triceps Extensions
//	Skull Crushers
//	Overhead Barbell or 
//	Dumbbell Triceps Extensions
//	Cable Press-Downs
//	Bench Dips


}
