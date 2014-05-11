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
public enum Muscle {
	EMPTY("","", ""),
	CHEST("Chest","Long Description", "tumbnail_address"),
	SHOULDER("Shoulder", "Long Description","tumbnail_address"), 
	BACK( "Back", "Long Description","tumbnail_address"), 
	BICEPS("Biceps", "Long Description","tumbnail_address"), 
	TRICEPS( "Triceps", "Long Description","tumbnail_address"), 
	HAMSTRING("Hamstring", "Long Description","tumbnail_address"), 
	QUADRICEPS("Quadriceps", "Long Description","tumbnail_address");

	private String shortDesc;
	private String longDesc;
	private String imageUri;
	private List<Exercise> exercises;

	Muscle(String argShortDesc, String argLongDesc, String argImageUri) {
		shortDesc = argShortDesc;
		longDesc = argLongDesc;
		imageUri = argImageUri;
		exercises = new ArrayList<Exercise>();

	}
	
	
	
	
	public List<Exercise> getExercises(){
		return exercises;
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

	
	public void addExercise(Exercise argExercise){
		exercises.add(argExercise);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getShortDesc();
	}

}
