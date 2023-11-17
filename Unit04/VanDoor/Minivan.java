import java.util.Scanner;

class DoorSystem {
     enum GearState {PARK, NEUTRAL, DRIVE, GEAR1, GEAR2, GEAR3, REVERSE} 
     boolean dashSwitchLeft;
     boolean dashSwitchRight;
     boolean childLock;
     boolean masterUnlock;
     boolean insideLeft;
     boolean insideRight;
     boolean outsideLeft;
     boolean outsideRight;
     DoorSystem.GearState currentGear;


     public boolean isLeftOpen() {
          if (currentGear == (GearState.PARK)) {
               if (masterUnlock == true) {
                    if (childLock == false && insideLeft == true) {
                         return true;
                    } else if (outsideLeft == true) {
                         return true;
                    } else if (dashSwitchLeft == true) {
                         return true;
                    } else {
                         return false;
                    }
               } else {
                    return false;
               }
          } else {
               return false;
          }
     }
     public boolean isRightOpen() {
          if (currentGear == (GearState.PARK)) {
               if (masterUnlock == true) {
                    if (childLock == false && insideRight == true) {
                         return true;
                    } else if (outsideRight == true) {
                         return true;
                    } else if (dashSwitchRight == true) {
                         return true;
                    } else {
                         return false;
                    }
               } else {
                    return false;
               }
          } else {
               return false;
          }
     }
     
     public void input() {

          String inputString;

          System.out.print("PLEASE enter your input here: ");
          inputString = in.nextLine();

               if(inputString.charAt(0) == '1') {
                    dashSwitchLeft = true;
               } else {
                    dashSwitchLeft = false;
               }
               if (inputString.charAt(1) == '1') {
                    dashSwitchRight = true;
               } else {
                    dashSwitchRight = false;
               }
               if (inputString.charAt(2) == '1') {
                    childLock = true;
               } else {
                    childLock = false;
               }
               if (inputString.charAt(3) == '1') {
                    masterUnlock = true;
               } else {
                    masterUnlock = false;
               }
               if (inputString.charAt(4) == '1') {
                    insideLeft = true;
               } else {
                    insideLeft = false;
               }
               if (inputString.charAt(5) == '1') {
                    insideRight = true;
               } else {
                    insideRight = false;
               }
               if (inputString.charAt(6) == '1') {
                    outsideLeft = true;
               } else {
                    outsideLeft = false;
               }
               if (inputString.charAt(7) == '1') {
                    outsideRight = true;
               } else {
                    outsideRight = false;
               }
               if (inputString.charAt(8) == 'P') {
                    currentGear = GearState.PARK;
               } else if (inputString.charAt(8) == 'N') {
                    currentGear = GearState.NEUTRAL;
               } else if (inputString.charAt(8) == 'D') {
                    currentGear = GearState.DRIVE;
               } else if (inputString.charAt(8) == '1') {
                    currentGear = GearState.GEAR1;
               } else if (inputString.charAt(8) == '2') {
                    currentGear = GearState.GEAR2;
               } else if (inputString.charAt(8) == '3') {
                    currentGear = GearState.GEAR3;
               } else if (inputString.charAt(8) == 'R') {
                    currentGear = GearState.REVERSE;
               }
          }
     }
public class Minivan {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          DoorSystem doorSystem = new DoorSystem();

          doorSystem.input();

          if (doorSystem.isLeftOpen() == true) {
               System.out.println("Left door is unlocked...");
          } else {
               System.out.println("Left door is locked...");
          }
          if (doorSystem.isRightOpen() == true) {
               System.out.println("Right door is unlocked...");
          } else {
               System.out.println("Right door is locked...");
          }
     }
}
