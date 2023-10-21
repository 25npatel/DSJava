import java.util.Scanner;

class DoorSystem {
     enum GearState {PARK, NEUTRAL, DRIVE, GEAR1, GEAR2, GEAR3, REVERSE} 
     boolean dashSwitchLeft = false;
     boolean dashSwitchRight = false;
     boolean childLock = false;
     boolean masterUnlock = false;
     boolean insideLeft = false;
     boolean insideRight = false;
     boolean outsideLeft = false;
     boolean outsideRight = false;
     DoorSystem.GearState currentGear;
     
     void updateState(String inputString) {
          if (inputString.length() == 9) {
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
               } 
               if (inputString.charAt(8) == 'N') {
                    currentGear = GearState.NEUTRAL;
               } 
               if (inputString.charAt(8) == 'D') {
                    currentGear = GearState.DRIVE;
               }
               if (inputString.charAt(8) == '1') {
                    currentGear = GearState.GEAR1;
               }
               if (inputString.charAt(8) == '2') {
                    currentGear = GearState.GEAR2;
               }
               if (inputString.charAt(8) == '3') {
                    currentGear = GearState.GEAR3;
               }
               if (inputString.charAt(8) == 'R') {
                    currentGear = GearState.REVERSE;
               }
          }
     }
}

public class Minivan {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          System.out.println("Input 0 to turn off dashSwitchLeft or 1 to activate. Enter below: ");
          String dashSwitchLeft = in.nextLine();

          System.out.println("Input 0 to turn off dashSwitchRight or 1 to activate. Enter below: ");
          String dashSwitchRight = in.nextLine();

          System.out.println("Input 0 to turn off child lock or 1 to activate. Enter below: ");
          String childLock = in.nextLine();

          System.out.println("Input 0 to turn off master unlock or 1 to activate. Enter below: ");
          String masterUnlock = in.nextLine();

          System.out.println("Input 0 to turn off locks in the inside left handles or 1 to activate. Enter below: ");
          String insideLeftHandles = in.nextLine();

          System.out.println("Input 0 to turn off locks in the inside right handles or 1 to activate. Enter below: ");
          String insideRightHandles = in.nextLine();

          System.out.println("Input 0 to turn off locks in the outside left handles or 1 to activate. Enter below: ");
          String outsideLeftHandles = in.nextLine();

          System.out.println("Input 0 to turn off locks in the outside right handles or 1 to activate. Enter below: ");
          String outsideRightHandles = in.nextLine();

          System.out.println("Please enter gear setting below: ");
          String GearState = in.nextLine();

          if (dashSwitchLeft == "0" && dashSwitchRight == "0" && childLock == "0" && masterUnlock == "1" && insideLeftHandles == "0" && insideRightHandles == "0" && outsideLeftHandles == "0" && outsideRightHandles == "0" && GearState == "P") {
               System.out.println("both doors can be opened");
          }
          if (dashSwitchLeft == "1" && insideLeftHandles == "1" && childLock == "1") {
               System.out.println("left door cannot be opened");
          }
          if (dashSwitchRight == "1" && insideRightHandles == "1" && childLock == "1") {
               System.out.println("Right door cannot be opened");
          }
          if (GearState != "P") {
               System.out.println("Both doors cannot be opened");
          }
     }
}