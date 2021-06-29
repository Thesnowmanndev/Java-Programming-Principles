import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficApplet
{
	public final int WIDTH = 300;
	public final int HEIGHT = 400;

	public final int X_TRAFFICLIGHT = WIDTH/3;
	public final int Y_TRAFFICLIGHT = HEIGHT/7;
	public final int TRAFFICLIGHT_WIDTH = WIDTH/2;
	public final int TRAFFICLIGHT_HEIGHT = HEIGHT*3/5;
	public final int LIGHT_DIAMETER = TRAFFICLIGHT_HEIGHT/5;
	public final int HOOD_START_ANGLE = 20;
	public final int HOOD_ANGLE_SWEPT = 140;
	public final int X_LIGHTS = TRAFFICLIGHT_WIDTH/3 + X_TRAFFICLIGHT;
	public final int Y_REDLIGHT = TRAFFICLIGHT_HEIGHT/10 + Y_TRAFFICLIGHT;
	public final int Y_ORANGELIGHT = TRAFFICLIGHT_HEIGHT*4/10 + Y_TRAFFICLIGHT;
	public final int Y_GREENLIGHT = TRAFFICLIGHT_HEIGHT*7/10 + Y_TRAFFICLIGHT;
	public final int TIME_DELAY = 1000;

	private String status = "green";	//start with the green light
	private Timer timer;	//will allow lights to cycle


}

