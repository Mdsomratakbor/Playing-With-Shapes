package com.Lab8.Interface;

public class Main {

	public static void main(String[] args) {
		Object[] arrayOfObjects = new Object[4];
		arrayOfObjects[0] = new SmokeAlarm();
		arrayOfObjects[1] = new SmokeAlarm();
		arrayOfObjects[2] = new FireEmergency();
		arrayOfObjects[3] = new FireEmergency();
		for(int i=0; i<arrayOfObjects.length; i++) {
			if (isEmergency.class.isAssignableFrom(arrayOfObjects[i].getClass())) {

				isEmergency isEmergencyObject = (isEmergency) arrayOfObjects[i];
				isEmergencyObject.soundSiren();
			}
		}
	}
}
