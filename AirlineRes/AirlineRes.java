// Exercise 7.19 Airline Reservations System
// 

import java.util.Scanner;
import java.io.BufferedReader;
import java.util.InputMismatchException;

public class AirlineRes {


private boolean seatsBooked;
private boolean arrSeats[];
private int CAPACITY = 10;
private int availSeats = CAPACITY;
private Scanner input;
private int userChoice;
private int current;

// constructor
public AirlineRes() {
this.arrSeats = new boolean[CAPACITY];
initSeats();
this.seatsBooked = true;
}

// Initialize all the elements of the array to false for all empty seats.
private void initSeats() {
for (int i = 0; i < arrSeats.length; i++) {
arrSeats[i] = false;
}
}

// Display the menu for user choice
public void displayMenu() {
do {

// if no more seats available in the flight, display the message
if (availSeats == 0) {
System.out.println();
System.out.println("No more available seats in this flight.");
System.out.println("Thank you for using our system");
break;
}
System.out.println("***** Airline Reservation System *****");
System.out.println(" Menu Options ");
System.out.println(" 1 - First Class ");
System.out.println(" 2 - Economy Class ");
System.out.println(" 3 - Exit ");
System.out.println("**************************************");
System.out.println("Please choose your option: ");
input = new Scanner(System.in);

// try to get the user choice
try {
userChoice = input.nextInt();
while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
System.out.println("Please choose either '1', '2' or '3'");
displayMenu();
}

} catch (InputMismatchException ex) {
System.err.println("Not a valid number: " + userChoice);
}
seatsBooked = assignSeats(userChoice);
} while (seatsBooked);

}

// Assign the seats based from the user's choice for the class
public boolean assignSeats(int userChoice) {

switch (userChoice) {

// First class section
case 1:

for (current = 0; current < 5; current++) {
if (arrSeats[current] == false) {
arrSeats[current] = true;
printBoardingPass(current + 1);
availSeats--;
seatsBooked = true;

break;
}

}

// if first class section is full, prompt user to choose other class
if (current == 5) {
chooseOtherClass();
}
break;

// Economy class section
case 2:
for (current = 5; current < 10; current++) {
if (arrSeats[current] == false) {
arrSeats[current] = true;
printBoardingPass(current + 1);
availSeats--;
seatsBooked = true;
break;
}
}

// if economy class section is full, prompt user to choose other
// class
if (current == 10) {
chooseOtherClass();
}
break;
case 3:
System.out.println("Thank you for using our system. Goodbye!");
System.exit(0);

default:
System.out.println("Invalid input. Please type again");
seatsBooked = true;
}
return seatsBooked;

}

// If the chosen class is full, ask the user whether want to choose other
// class section
private boolean chooseOtherClass() {
do {
System.out
.println("There are no more seats available for the chosen class.n");
System.out
.println("Do you want to choose another class? Type 'Y' for Yes or 'N' for No");

String ans = input.next();
if (ans.equalsIgnoreCase("Y")) {
seatsBooked = true;
} else if (ans.equalsIgnoreCase("N")) {
System.out.println("Next flight leaves in 3 hours.");
System.out.println();
break;
} else {
System.out.println("nInvalid input.");
}

} while (!seatsBooked);
return seatsBooked;

}

// Print the boarding pass with the seat number and class section
public void printBoardingPass(int seatNum) {

System.out.println("***** Boarding Pass *****");
System.out.println();
System.out.println("Seat number: " + (seatNum));
if (seatNum <= 5) {
System.out.println("You've been assigned to first class.");
} else {
System.out.println("You've been assigned to economy class.");
}
System.out.println("Thank you for using our system. Have a safe flight!");
System.out.println();
System.out.println("*************************");
System.out.println();

}
}