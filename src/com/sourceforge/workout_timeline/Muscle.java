/**
 * 
 */
package com.sourceforge.workout_timeline;

/**
 * @author amro
 * 
 */
public enum Muscle {
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

	Muscle(String argShortDesc, String argLongDesc, String argImageUri) {
		shortDesc = argShortDesc;
		longDesc = argLongDesc;
		imageUri = argImageUri;

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


}
