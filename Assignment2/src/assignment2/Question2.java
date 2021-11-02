package assignment2;

// 3 output screen
import java.util.Scanner; // import scanner class

public class Question2 {
    
    // go to all rows, row 0 to 12, use i variable
    // go to all column, column 0 to 5, use j variablle
    // use outer for loop for row (i = 0 to 12)
    // use inner for loop for column (j = 0 to 5)
    public static void initiailzeSeatPlan(char[][] sPlan)
    {
    	for (int i = 0; i < sPlan.length; i++)  // i = 0 to 12
         	for (int j = 0; j < sPlan[0].length; j++)
              	sPlan[i][j] = '*';  // j = 0 to 5
    }
    
    // this method receives a 2D arrays of char type
    // used to display all the seat in the flight
    // display all the 2D array contents
    // value i is used for outer for loop, row 0 to 12
    // value j is used for inner for loop, column 0 to 5
    // sPlan[0].length is to go to each column(From A1 to B1)
    public static void showSeatAssignments(char[][] sPlan)
    {
        int i, j;

        System.out.println("        A B C  D E F");

      	for (i = 0; i < sPlan.length; i++) // go to all rows, 0 to 12
        {
         	if(i < 9)  // for row 0 to 9 no need space
              	System.out.print("Row " + (i + 1) + "   ");
            else
                System.out.print("Row " + (i + 1) + "  ");

           	for (j = 0; j < sPlan[0].length; j++)  // go to each columns, 0 to 5
                {
             	System.out.print(sPlan[i][j] + " ");
                if (j == 2)  // after column C, column = 2, give extra space
               	System.out.print(" ");
                }
           	System.out.println();
        }

       	System.out.println("* -- available seat");
    	System.out.println("X -- occupied seat");
      	System.out.println();
    }

    // display menu of choices
    // call the above method
    // receives 2D array of char type
    public static void showMenu(char[][] sPlan)
    {
      	System.out.println("This program assigns seats for a commercial airplane.");
       	System.out.println("The current seat assignments is as follows.");
      	showSeatAssignments(sPlan);
      	System.out.println("Rows 1 and 2 are for first class passengers.");
      	System.out.println("Rows 3 through 7 are for business class passengers.");
      	System.out.println("Rows 8 through 13 are for economy class passengers");
    }
    
    // this method receives a 2D array of char type
    // used to check whether all the seat in first class
    // is taken or not, check for any available seat
    // value i is for outer for loop, check row 0 to 1 only
    // value j is for inner for loop, check colm 0 to 5
    public static boolean isFirstClassFull(char[][] sPlan)
    {
       	int i, j;

       	int assignedSeats = 0; // if 12 means no more seats

      	for (i = 0; i < 2; i++)  // row 0 to 1 only
          	for (j = 0; j < sPlan[0].length; j++)
           		if (sPlan[i][j] == 'X')  // colm 0 to 5
                 	assignedSeats++;  // increment by 1
        // return true if 12 == 2 * 6 (2 rows, 6 cols)
      	return (assignedSeats == 2 * sPlan[0].length);
    }
    
    // next same use back the same logic to check business
    // class seat is full or not
    // i is for outer for loop, row, row 3 to 7 or 2 to 6
    // j is for inner for loop, column A to F or 0 to 5
    public static boolean isBusinessClassFull(char[][] sPlan)
    {
       	int i, j;

      	int assignedSeats = 0; // if 30 means full already

      	for (i = 2; i < 7; i++) // go to row 2 to 6
          	for (j = 0; j < sPlan[0].length; j++)
             	if (sPlan[i][j] == 'X')  // go to colm 0 to 5
               		assignedSeats++;  // increment by 1
        // return true if 30 == 30 (5 rows * 6 colmn)
        // If 30 == 30, return true
        return (assignedSeats == 5 * sPlan[0].length);
    }
    
    // use back the same logic to check whether economy class is full or not
    public static boolean isEconomyClassFull(char[][] sPlan)
    {
       	int assignedSeats = 0;

        for (int i = 7; i < 13; i++)  // row 7 to 12
         	for (int j = 0; j < sPlan[0].length; j++)
              	if (sPlan[i][j] == 'X')  // colmn 0 to 5
                  	assignedSeats++;
        // return true if 36 == 36 (6 rows * 6 cols) 
      	return (assignedSeats == 6 * sPlan[0].length);
    }
    
    // when the user input rown number 1 to 13
    // when the user input column A to F
    // send the data to this method
    // this method will receive row number and column
    // startRow and endRow, depending on the class
    // row 0 to 1 is for first class
    // column A to F in row 0 to 1 is first class
    public static int selectSeatNumber(int startRows, int endRows, StringBuffer columnNo)
    {
        int rowNo;
        Scanner console = new Scanner(System.in);
        
        // prompt for rowNo, get rowNo
     	System.out.print("Enter Row number " + startRows + " - "
                        + endRows + ": ");
  		rowNo = console.nextInt();

  		console.nextLine(); //discard newline character

      	System.out.println();
        
        // check row number within the value 
        // first class row 0 to 1 only for example
      	while (rowNo < startRows || rowNo > endRows)
      	{
          	System.out.print("Enter Row number " + startRows + " - "
                            + endRows + ": ");
                rowNo = console.nextInt();
          	console.nextLine(); //discard newline character
        	System.out.println();
       	}

        // prompt for column A to F ,get column
      	System.out.print("Enter seat number (A - F): ");
        columnNo.setCharAt(0, console.nextLine().charAt(0));
      	System.out.println();

        // check column is A to F only
      	while (columnNo.charAt(0) < 'A' || columnNo.charAt(0) > 'F')
       	{
          	System.out.print("Enter seat number (A - F): ");
           	columnNo.setCharAt(0, console.nextLine().charAt(0));
         	System.out.println();
     	}

     	return rowNo;
    }    
    
    public static void assignFirstClassSeat(char[][] sPlan)
    {
       	int rowNum;
       	char colPos;
       	StringBuffer columnPos = new StringBuffer(" ");

        // if first class seat is not full yet
        // get the row no and column value
        if (!isFirstClassFull(sPlan))
        {
           	rowNum = selectSeatNumber(1, 2, columnPos); // row 1 and 2 is for first class seat
           	colPos = columnPos.charAt(0);
               
                // while the first class seat is taken
                // prompt the user to input another first class seat
                // 65 is ascii code char for A
                // rowNo -1 because computer start at row 0
         	while (sPlan[rowNum - 1][(int) colPos - 65] != '*')
          	{
             	System.out.println("*#*#*#*# This seat is occupied *#*#*#*#");
              	System.out.println("Make another selection");

              	showSeatAssignments(sPlan);

               	rowNum = selectSeatNumber(1, 2, columnPos); // row 1 and 2 is for first class seat
           	    colPos = columnPos.charAt(0); // get A to F
           	}

                // if the seat is not taken yet
                // go to row and column, mark X for the user
           	sPlan[rowNum - 1][(int) colPos - 65] = 'X';
           	System.out.println("This seat is reserved for you");
        }
    else // all seat in first class is taken 
        System.out.println("Sorry!!! First Class is Full");
    }
    
    // same logic as above, except different row only
    // row 3 to 7, row i = 2 to 6
    // same columns A to F, column = 0 to 5
    public static void assignBusinessClassSeat(char[][] sPlan)
    {
           int rowNum; // row index 2 to 6
           char colPos; // column A to F
           StringBuffer columnPos = new StringBuffer(" "); // whitespace

           if (!isBusinessClassFull(sPlan)) // check if business class seat is not full, seat still available
          {
              rowNum = selectSeatNumber(3, 7, columnPos); // call this methods to allow user to choose seat number
              colPos = columnPos.charAt(0); // get column value 'A' to 'F'

              // use while loop to check the seat is available or not
              // rownum -1 and colPos - 65 is = *, then the seat is taken already
              // 65 in ascii code refer to A (ascii table)
             while (sPlan[rowNum - 1][(int)colPos - 65] != '*')
            {
                System.out.println("*#*#*#*# This seat is occupied *#*#*#*#");
                System.out.println("Make another selection");

                showSeatAssignments(sPlan);

                rowNum = selectSeatNumber(3, 7, columnPos); // call this method again row 3 to 7 is business class seat
                colPos = columnPos.charAt(0);
            }

              sPlan[rowNum - 1][(int)colPos - 65] = 'X'; // book the seat mark with X
              System.out.println("This seat is reserved for you"); // display message
        }
         else
               System.out.println(" Business class is Full");
    }
    
    // same logic as above, except different row only, row 8 to 13
    public static void assignEconomyClassSeat(char[][] sPlan)
    {
        int rowNum;
        char colPos;
        StringBuffer columnPos = new StringBuffer(" ");

        if (!isEconomyClassFull(sPlan)) // check if economy class is not full
        {
            rowNum = selectSeatNumber(8, 13, columnPos); // call this method to allow user to choose a seat
            colPos = columnPos.charAt(0); // get column A to F

            // check all seat is taken or not, row -1 because computer start at row 0
            // colPos - 65 because A in decimals is 65, ascii table
            while (sPlan[rowNum - 1][(int)colPos - 65] != '*')
            {
                System.out.println("*#*#*#*# This seat is occupied *#*#*#*#");
                System.out.println("Make another selection");

                showSeatAssignments(sPlan);

                rowNum = selectSeatNumber(8, 13, columnPos);
                colPos = columnPos.charAt(0);
            }

            sPlan[rowNum - 1][(int)colPos - 65] = 'X';
            System.out.println("This seat is reserved for you");
        }
        else
            System.out.println(" Economy class is Full");
    }
    
    // this method allows the user to choose the types of seat they want
    // if they choose F/f or B/b or E/e, we use switch case block here
    public static void assignSeat(char[][] sPlan) 
    {
      
        Scanner console = new Scanner(System.in); // create a scanner object
        
        char ticketType;
        char resp;

        // prompt for ticket type, get ticket type
        System.out.print("Enter ticket type: F/f (first class); "
                          + " (B/b) (business class); E/e (economy class): ");
        ticketType = console.nextLine().charAt(0);
        System.out.println();

        switch (ticketType)
        {
            // if the user choose first class seat
            // check first class seat if full not not
            // if not full assign seat for the user
            // else prompt the user to choose another class
            // since first class is full already
        case 'f':
        case 'F':
            if (!isFirstClassFull(sPlan)) // check mate sure first class is not full
                assignFirstClassSeat(sPlan); // allow user to book first class seat, call this method
            
            else
            {
                System.out.println("Sorry!!! First class is full"); // first class seat is full already
                System.out.print("Press Y/y to continue: ");
                resp = console.nextLine().charAt(0);
                System.out.println();
            }

            break;

        case 'b': // if the user choose business class seat
        case 'B':
               if (!isBusinessClassFull(sPlan)) // check business class seat is full or not
                 assignBusinessClassSeat(sPlan); // allow user to choose business class seat, call this method
            else
            {
                System.out.println("Sorry!!! Business class is full."); // business class seat is full already
                System.out.print("Press Y/y to continue: ");
                resp = console.nextLine().charAt(0);
                System.out.println();
            }

            break; // stop

           case 'e': // if the user choose economy class
           case 'E':
               if (!isEconomyClassFull(sPlan)) // check if the seat is full or not
                assignEconomyClassSeat(sPlan);
            else
            {
                System.out.println("Sorry!!! Economic Class is Full"); // economy class seat is full already
                System.out.print("Press Y/y to continue: ");
                resp = console.nextLine().charAt(0);
                System.out.println();
             }
           }

          showSeatAssignments(sPlan); // call this method to display the seat layout, display 2D arrays contents
    }
    
    public static void main(String[] args) {
        // create scanner object
        
        Scanner console = new Scanner(System.in);

        final int ROWS = 13;
        final int COLUMNS = 6;
     
        char[][] seatPlan = new char[ROWS][COLUMNS];
       	char resp;

      	initiailzeSeatPlan(seatPlan); // call this method
      	showMenu(seatPlan); // call this method
        
        // we need to prompt the user to choose the types of seat they want
        System.out.println("To reserve a seat enter Y/y(Yes), N/n(No): ");
        resp = console.nextLine().charAt(0);
        System.out.println();
        
        // continue here
        // while loop, while the resp value is y/Y, keep running
        while (resp == 'y' || resp == 'Y')
        {
               assignSeat(seatPlan);
               showMenu(seatPlan);
            System.out.println("Reserve another seat Y/y(Yes), N/n(No): ");
               resp = console.nextLine().charAt(0);
               System.out.println();
        }  // end of while loop
    }
    
}
