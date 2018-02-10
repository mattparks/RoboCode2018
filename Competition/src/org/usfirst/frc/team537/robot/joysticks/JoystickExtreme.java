package org.usfirst.frc.team537.robot.joysticks;

import org.usfirst.frc.team537.robot.joysticks.IJoystick.ValueUsage;

public class JoystickExtreme extends IJoystick {
	public class Keys {
		public static final int INDEX_TRIGGER = 1;
		public static final int THUMB_TRIGGER = 2;
		public static final int STICK_3 = 3;
		public static final int STICK_4 = 4;
		public static final int STICK_5 = 5;
		public static final int STICK_6 = 6;
		public static final int BASE_7 = 7;
		public static final int BASE_8 = 8;
		public static final int BASE_9 = 9;
		public static final int BASE_10 = 10;
		public static final int BASE_11 = 11;
		public static final int BASE_12 = 12;
	}

	public class Axis {
		public static final int STICK_X = 0;
		public static final int STICK_Y = 1;
		public static final int STICK_Z = 2;
		public static final int SLIDER = 3;
	}
	
	public JoystickExtreme(int port) {
		super(port);
		add("DriveRotation", new ValueUsage(Axis.STICK_Z, false));
		add("DriveStrafe", new ValueUsage(Axis.STICK_X, false));
		add("DriveForward", new ValueUsage(Axis.STICK_Y, true));
		add("DriveLock", new ValueUsage(Keys.INDEX_TRIGGER, false));
		add("Pivot0", new ValueUsage(Keys.STICK_5, false));
		add("Pivot90", new ValueUsage(Keys.STICK_6, false));
		add("Pivot180", new ValueUsage(Keys.STICK_4, false));
		add("Pivot270", new ValueUsage(Keys.STICK_3, false));
		add("Speed", new ValueUsage(Keys.BASE_8, false));
		add("Rate", new ValueUsage(Keys.BASE_10, false));
		add("Dist", new ValueUsage(Keys.BASE_12, false));
	}
	
	@Override
	public String getJoystickType() {
		return "Extreme";
	}
}
