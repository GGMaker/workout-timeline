/**
 * 
 */
package com.sourceforge.workout_timeline.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amro
 *
 */
public enum Exercise{

	// Chest Exercises
	
	EMPTY("","","",  new Muscle[] {Muscle.EMPTY}),
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

	PULL_UPS("Pull-Ups", "Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	CHIN_UPS("Chin-Ups","Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	LAT_PULL_DOWNS("Lat Pull Downs","Long Desc", "imageURI",new Muscle[] {Muscle.BACK}),
	BENT_OVER_BARBELL("Bent Over Barbell ", "Long Desc","imageURI", new Muscle[] {Muscle.BACK}),
	DUMBBELL_ROWS("Dumbbell Rows", "Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	T_BAR("T-Bar Rows","Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	SEATED_CABLE_ROWS("Seated Cable Rows", "Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	CHEST_SUPPORTED_BARBELL("Chest Supported Barbell", "Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	DUMBELL_ROWS("Dumbbell Rows", "Long Desc","imageURI", new Muscle[] {Muscle.BACK}),
	CHEST_SUPPORTED_MACHINE_ROWS("Chest Supported Machine Rows","Long Desc","imageURI",new Muscle[] {Muscle.BACK}),
	INVERTED_ROWS("Inverted Rows","Long Rows","imageURI",new Muscle[] {Muscle.BACK}),
	
//	A List Of The Best Shoulder Exercises
//
	SEATED_OVERHEAD_BARBELL("Seated Overhead Barbell","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	DUMBBELL_PRESS("Dumbbell Press","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	STANDING_OVERHEAD_BARBELL("Standing Overhead Barbell","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	OVERHEAD_MACHINE_PRESS("Overhead Machine Press" ,"Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	ARNOLD_PRESS_BARBELL("Arnold Press Barbell","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	ARNOLD_PRESS_DUMBBELL("Arnold Press Dumbbell","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
	MACHINE_UPRIGHT_ROWS("Machine Upright Rows","Long Desc", "imageURI",new Muscle[] {Muscle.SHOULDER}),
//	A List Of The Best Quadriceps Exercises
	
	DUMBBELL_SQUATS("Dumbbell Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	BARBELL_SQUATS("Barbell Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	DUMBBELL_FRONT_SQUATS("Dumbbell Front Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	BARBELL_FRONT_SQUATS("Barbell Front Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	DUMBBELL_SPLIT_SQUATS("Dumbbell Split Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	BARBELL_SPLIT_SQUATS("Barbell Split Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	DUMBBELL_LUNGES_SQUATS("Dumbbell Lunges Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	BARBELL_LUNGES_SQUATS("Barbell Lunges Squats", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	DUMBBELL_STEP_UPS_SQUATS("Dumbbell Step Ups", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	BARBELL_STEP_UPS_SQUATS("Barbell Step Ups", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	LEG_PRESS("Leg Press", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	MACHINE_SQUAT("Machine Squat", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	HACK_SQUAT("Hack Squat", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),
	LEG_EXTENSIONS("Leg Extensions", "Long Desc","imageURI", new Muscle[] {Muscle.QUADRICEPS}),

//	A List Of The Best Biceps Exercises

	STANDING_BARBELL("Standing Barbell", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	STANDING_DUMBBELL_CURLS("Standing Dumbbell Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	BARBELL_PREACHER_CURLS("Barbell Preacher Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	DUMBBELL_PREACHER_CURLS("Dumbbell Preacher Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	SEATED_DUMBBELL_CURLS("Seated Dumbbell Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	INCLINE_DUMBBELL_CURLS("Incline Dumbbell Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	HAMMER_CURLS("HAmmer Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	CONCENTRATION_CURLS("Concentration Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	CABEL_CURLS("Cabel Curls", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),
	BICEPS_CURL_MACHINE("Bisecps Curl Machine", "Long Desc","imageURI", new Muscle[] {Muscle.BICEPS}),

//	A List Of The Best Triceps Exercises
	DIPS("Dip", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	BENCH_DIPS("Bench Dips", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	FLAT_CLOSE_GRIP_BENCH_PRESS("Flat Close Grip Bench Press", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	DECLINE_CLOSE_GRIP_BENCH_PRESS("Decline Close Grip Bench Press", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	CLOSE_GRIP_PUSH_UPS("Close Grip Push Ups", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	LAYING_BARBELL("Laying Barbell", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	DUMBBELL_TRICEPS_EXT("Dumbbell Triceps Extensions", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	SKULL_CRUSHERS("Skull Crushers", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS}),
	CABLE_PRESS_DOWN("Cable Press-Downs", "Long Desc","imageURI", new Muscle[] {Muscle.TRICEPS});


	private String shortDesc;
	private String longDesc;
	private String imageUri;
	private Muscle[] muscleGroup;
	
	Exercise(String argShortDesc, String argLongDesc, String argUri, Muscle[] argMuscleGroup){
		shortDesc = argShortDesc;
		longDesc = argLongDesc;
		imageUri = argUri;
		muscleGroup = argMuscleGroup;
		
		for(Muscle m : argMuscleGroup){
			m.addExercise(this);
		}
		
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
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getShortDesc();
	}
	
	
	public static  Exercise[] getExercisesByMuscleGroup(String argMuscle){
		List<Exercise> result = new ArrayList<Exercise>();
		for(Exercise exercise : Exercise.values() ){
			Muscle[] exerciseMuscles = exercise.muscleGroup;
			for(Muscle muscle : exerciseMuscles){
				if(muscle.name().equalsIgnoreCase(argMuscle)){
					result.add(exercise);
				}
			}
		}
		Exercise[] arrayEx  = new Exercise[result.size()]; 
		return result.toArray(arrayEx);
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
