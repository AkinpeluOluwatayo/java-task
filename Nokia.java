import java.util.Scanner;
public class Nokia { 
public static void main(String [] args) {

Scanner inputCollector = new Scanner(System.in);
System.out.print("""

	   Welcome to Nokia 3310
	1.  Phonebook
	2.  Messages
	3.  Chat
	4.  Call register
	5.  Tones
	6.  Settings
	7.  Call divert
	8.  Games 
	9.  Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. Sim services                             
					 """);

System.out.println("Select option");
int userInput = inputCollector.nextInt();

switch(userInput){
case 1:System.out.println("""

    PHONEBOOK

	1. Search;
	2. Service Nos
	3. Add name
	4. Erase
	5. Edit
	6. Assign tone
	7. Send b card
	8. Option
	9. Speed dials
	10. Voice tags
		    """);
  }

System.out.println("Select option");
int phoneBook = inputCollector.nextInt();

switch(phoneBook) {
case 8: System.out.println("""
	
	Option

	1.Type of view
	2.Memory status
			""");
  }

switch(userInput) {
case 2:System.out.println("""
     Message

     1. Write message
     2. Inbox 
     3. Outbox
     4. Picture messages
     5. Templates
     6. Smileys
     7. Message setting
     8. Info service
     9. Voice mailbox number
     10. Service command editor
			      """);
     }
System.out.println("Select option");
int messageInput = inputCollector.nextInt();

switch(messageInput) {
case 7:System.out.println("""
     Message setting
 
     1. Set 1
     2.Common
	      """);

     }
switch(userInput) {
case 3:System.out.println("Chat");
     }

switch(userInput) {
case 4:System.out.println("""
      Call register
     1. Missed calls
     2. Recieved calls
     3. Dialled numbers
     4. Erase recent call lists
     5. Show call duration
     6. Show call cost
     7. Call cost settings
     8. Prepaid credit
			  """);
     }

System.out.println("Select option");
int callRegister = inputCollector.nextInt();

switch (callRegister) {
case 5: System.out.println("""
       Show call duration
    1. Last call duration
    2. All calls duration
    3. Recieved calls duration
    4. Clear timers
			   """);
     }


switch(callRegister) {
case 6: System.out.println("""
       Show call costs
    1. Last call cost
    2. All calls cost
    3. Clear counters
			   """);
     }
switch (callRegister) {
case 7: System.out.println("""
       Call cost settings
    1. call cost limit
    2. Show cost in
    			   """);
     }

switch(userInput) {
case 5:System.out.println("""
       Tones
    1. Ringing tone
    2. Ringing volume
    3. Incoming call alert          
    4. Composer 
    5. Message alert 
    6. Keypad tones 
    7. Warning and games tones 
    8. Vibrating alert 
    9. Screen saver
		           """);

     }

switch(userInput) {
case 6:System.out.println("""
       Settings
    1. Call settings 
    2. Phone settings
    3. Security settings         
    4. Restore factory settings 
    
		           """);
     }
System.out.println("Select option");
int Settings = inputCollector.nextInt();

switch (Settings) {
case 1: System.out.println("""
     Call settings

     1.Automatic redial
     2.Speed dialling
     3.Call waiting options
     4.Own nymber sending
     5.Phone line in use
     6.Automatic answer
			   """);
     }

switch (Settings) {
case 2: System.out.println("""
     Phone settings

     1.Language
     2.Cell info display
     3.Welcome note
     4.Network selection
     5.Lights
     6.Confirm SIM service options
			   """);
     }

switch (Settings) {
case 3: System.out.println("""
     Security settings

     1.PIN code request
     2.Call barring service
     3.Fixed dialling
     4.Closed user group
     5.Phone security
     6.Change access codes
			   """);
     }

switch(userInput) {
case 11:System.out.println("""
     Clock

     1. Alarm Clock
     2. Clock settings
     3. Date setting
     4. Stopwatch
     5. Countdown timer
     6. Auto update of date and time                          """);
     }



























}
}

	