
package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/* aknowledgements; 

-"Joystick" refers to a controller, like an xbox or ps4 controller
-The term joystick is interchangeable with "stick", "controller", "jstick", and other abrieviations you may see in code
-The sticks are connected to the driver station laptop and show up on a certain port when you connect them
-one driver station can have up to ten joysticks, but two are only really ever used


*/
public class OI { // the operator interface class
 
public static Joystick driverStick;  //these lines create joysticks and give them names, we use two sticks to control the bot
public static Joystick operatorStick;

public static JoystickButton commandButton;


public void oiInit(){  // this method will initialize the joysticks andother parts of the OI


driverStick = new Joystick(0);  //constructs driverStick and indicates it is the controller on port zero in the driver station software
operatorStick = new Joystick(1);

commandButton = new JoystickButton(driverStick, 1); //constructs a joystick button and specifies the stick its on and the button number


}//ends init

//-----------------------------------------driver buttons 
public static JoystickButton driverA = new JoystickButton(driverStick,1);
public static JoystickButton driverB= new JoystickButton(driverStick,2);
public static JoystickButton driverX= new JoystickButton(driverStick,3);
public static JoystickButton driverY= new JoystickButton(driverStick,4);  
public static JoystickButton driverRMB= new JoystickButton(driverStick,8);
public static JoystickButton driverLMB= new JoystickButton(driverStick,7);
public static JoystickButton driverRSB= new JoystickButton(driverStick,10);
public static JoystickButton driverLSB= new JoystickButton(driverStick,9);   
public static JoystickButton driverRB= new JoystickButton(driverStick,6);
public static JoystickButton driverLB= new JoystickButton(driverStick,5);



//-----------------------------------------operator buttons 
public static JoystickButton operatorA= new JoystickButton(operatorStick,1);
public static JoystickButton operatorB= new JoystickButton(operatorStick,2);
public static JoystickButton operatorX= new JoystickButton(operatorStick,3);
public static JoystickButton operatorY= new JoystickButton(operatorStick,4);  
public static JoystickButton operatorRMB= new JoystickButton(operatorStick,8);
public static JoystickButton operatorLMB= new JoystickButton(operatorStick,7);
public static JoystickButton operatorRSB= new JoystickButton(operatorStick,10);
public static JoystickButton operatorLSB= new JoystickButton(operatorStick,9);   
public static JoystickButton operatorRB= new JoystickButton(operatorStick,6);
public static JoystickButton operatorLB= new JoystickButton(operatorStick,5);

  
  





















}











/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
 //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand()); 

  /*
//---------------------------------------------driver buttons
   public static JoystickButton driverA;
   public static JoystickButton driverB;
   public static JoystickButton driverX;
   public static JoystickButton driverY;  
   public static JoystickButton driverRMB;
   public static JoystickButton driverLMB;
   public static JoystickButton driverRSB;
   public static JoystickButton driverLSB;   
   public static JoystickButton driverRB;
   public static JoystickButton driverLB;
 
   
   
   //-----------------------------------------operator buttons 
   public static JoystickButton operatorA;
   public static JoystickButton operatorB;
   public static JoystickButton operatorX;
   public static JoystickButton operatorY;  
   public static JoystickButton operatorRMB;
   public static JoystickButton operatorLMB;
   public static JoystickButton operatorRSB;
   public static JoystickButton operatorLSB;   
   public static JoystickButton operatorRB;
   public static JoystickButton operatorLB;
     
    
   
   public void oiRUN() {
   

driverA = new JoystickButton(driverStick,1);
driverB= new JoystickButton(driverStick,2);
driverX= new JoystickButton(driverStick,3);
driverY= new JoystickButton(driverStick,4);  
driverRMB= new JoystickButton(driverStick,8);
driverLMB= new JoystickButton(driverStick,7);
driverRSB= new JoystickButton(driverStick,10);
driverLSB= new JoystickButton(driverStick,9);   
driverRB= new JoystickButton(driverStick,6);
driverLB= new JoystickButton(driverStick,5);




operatorA= new JoystickButton(operatorStick,1);
operatorB= new JoystickButton(operatorStick,2);
operatorX= new JoystickButton(operatorStick,3);
operatorY= new JoystickButton(operatorStick,4);  
operatorRMB= new JoystickButton(operatorStick,8);
operatorLMB= new JoystickButton(operatorStick,7);
operatorRSB= new JoystickButton(operatorStick,10);
operatorLSB= new JoystickButton(operatorStick,9);   
operatorRB= new JoystickButton(operatorStick,6);
operatorLB= new JoystickButton(operatorStick,5);

}

  */