/**
 * 
 */
package com.sourceforge.workout_timeline.models;

/**
 * @author amro
 *
 */
public enum Exercise {

	// Chest Exercises
	
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
	CABLE_CROSS_OVER("Cable Crossovers/Cable Flyes","Long Description", "imageURI", new Muscle[]{Muscle.CHEST}),

	
        //	A List Of The Best Back Exercises

	PULL_UPS("Pull-Ups", "Long Desc","imageURI",null),
	CHIN_UPS("Chin-Ups","Long Desc","imageURI",null),
	LAT_PULL_DOWNS("Lat Pull Downs","Long Desc", "imageURI",null),
	BENT_OVER_BARBELL("Bent Over Barbell ", "Long Desc","imageURI", null),
	DUMBBELL_ROWS("Dumbbell Rows", "Long Desc","imageURI",null),
	T_BAR("T-Bar Rows","Long Desc","imageURI",null),
	SEATED_CABLE_ROWS("Seated Cable Rows", "Long Desc","imageURI",null),
	CHEST_SUPPORTED_BARBELL("Chest Supported Barbell", "Long Desc","imageURI",null),
	DUMBELL_ROWS("Dumbbell Rows", "Long Desc","imageURI", null),
	CHEST_SUPPORTED_MACHINE_ROWS("Chest Supported Machine Rows","Long Desc","imageURI",null),
	INVERTED_ROWS("Inverted Rows","Long Rows","imageURI",null),
	
//	A List Of The Best Shoulder Exercises
//
	SEATED_OVERHEAD_BARBELL("Seated Overhead Barbell","Long Dex", "imageURI",null),
	DUMBBELL_PRESS("Dumbbell Press","Long Dex", "imageURI",null),
	STANDING_OVERHEAD_BARBELL("Standing Overhead Barbell","Long Dex", "imageURI",null),
	OVERHEAD_MACHINE_PRESS("Overhead Machine Press" ,"Long Dex", "imageURI",null),
	ARNOLD_PRESS_BARBELL("Arnold Press Barbell","Long Dex", "imageURI",null),
	ARNOLD_PRESS_DUMBBELL("Arnold Press Dumbbell","Long Dex", "imageURI",null),
	MACHINE_UPRIGHT_ROWS("Machine Upright Rows","Long Dex", "imageURI",null),
//	A List Of The Best Quadriceps Exercises
	
	DUMBBELL_SQUATS("Dumbbell Squats", "Long Desc","imageURI", null),
	BARBELL_SQUATS("Barbell Squats", "Long Desc","imageURI", null),
	DUMBBELL_FRONT_SQUATS("Dumbbell Front Squats", "Long Desc","imageURI", null),
	BARBELL_FRONT_SQUATS("Barbell Front Squats", "Long Desc","imageURI", null),
	DUMBBELL_SPLIT_SQUATS("Dumbbell Split Squats", "Long Desc","imageURI", null),
	BARBELL_SPLIT_SQUATS("Barbell Split Squats", "Long Desc","imageURI", null),
	DUMBBELL_LUNGES_SQUATS("Dumbbell Lunges Squats", "Long Desc","imageURI", null),
	BARBELL_LUNGES_SQUATS("Barbell Lunges Squats", "Long Desc","imageURI", null),
	DUMBBELL_STEP_UPS_SQUATS("Dumbbell Step Ups", "Long Desc","imageURI", null),
	BARBELL_STEP_UPS_SQUATS("Barbell Step Ups", "Long Desc","imageURI", null),
	LEG_PRESS("Leg Press", "Long Desc","imageURI", null),
	MACHINE_SQUAT("Machine Squat", "Long Desc","imageURI", null),
	HACK_SQUAT("Hack Squat", "Long Desc","imageURI", null),
	LEG_EXTENSIONS("Leg Extensions", "Long Desc","imageURI", null),

//	A List Of The Best Biceps Exercises

	STANDING_BARBELL("Standing Barbell", "Long Desc","imageURI", null),
	STANDING_DUMBBELL_CURLS("Standing Dumbbell Curls", "Long Desc","imageURI", null),
	BARBELL_PREACHER_CURLS("Barbell Preacher Curls", "Long Desc","imageURI", null),
	DUMBBELL_PREACHER_CURLS("Dumbbell Preacher Curls", "Long Desc","imageURI", null),
	SEATED_DUMBBELL_CURLS("Seated Dumbbell Curls", "Long Desc","imageURI", null),
	INCLINE_DUMBBELL_CURLS("Incline Dumbbell Curls", "Long Desc","imageURI", null),
	HAMMER_CURLS("HAmmer Curls", "Long Desc","imageURI", null),
	CONCENTRATION_CURLS("Concentration Curls", "Long Desc","imageURI", null),
	CABEL_CURLS("Cabel Curls", "Long Desc","imageURI", null),
	BICEPS_CURL_MACHINE("Bisecps Curl Machine", "Long Desc","imageURI", null),

//	A List Of The Best Triceps Exercises
	DIPS("Dip", "Long Desc","imageURI", null),
	BENCH_DIPS("Bench Dips", "Long Desc","imageURI", null),
	FLAT_CLOSE_GRIP_BENCH_PRESS("Flat Close Grip Bench Press", "Long Desc","imageURI", null),
	DECLINE_CLOSE_GRIP_BENCH_PRESS("Decline Close Grip Bench Press", "Long Desc","imageURI", null),
	CLOSE_GRIP_PUSH_UPS("Close Grip Push Ups", "Long Desc","imageURI", null),
	LAYING_BARBELL("Laying Barbell", "Long Desc","imageURI", null),
	DUMBBELL_TRICEPS_EXT("Dumbbell Triceps Extensions", "Long Desc","imageURI", null),
	SKULL_CRUSHERS("Skull Crushers", "Long Desc","imageURI", null),
	CABLE_PRESS_DOWN("Cable Press-Downs", "Long Desc","imageURI", null);


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


}
