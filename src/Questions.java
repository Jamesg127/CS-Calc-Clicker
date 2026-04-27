import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Questions {
    HashMap<String, Integer> questions = new HashMap<>();

    public Questions() {
        questions.put("""
                Which of the following finds the length of an ArrayList?
                (1) arr.length
                (2) arr.length()
                (3) arr.size
                (4) arr.size()
                """, 4);
        questions.put("""
                What does this statement evaluate to? TRUE || FALSE && TRUE
                (1) True
                (2) False
                """, 2);
        questions.put("""
                What does this statement evaluate to? 9 % 5 + 8 / 2 
                (1) 6
                (2) 4.5
                (3) 4
                (4) 8
                """, 4);
        questions.put("""
                What is the default value for any object reference?
                (1) 0
                (2) 0.0
                (3) null
                (4) It is impossible to have a default value, you must initialize the object
                """, 3);
        questions.put("""
                How do you find a value in a 2D array?
                (1) arr[ i ][ j ]
                (2) arr.get(value)
                (3) arr[ i ][ value ]
                (4) arr[ value ][ j ]
                """, 1);
        questions.put("""
                How do you turn an int into a String?
                (1) Integer.parseInt(str)
                (2) int.parseInteger(str)
                (3) Integer.parseInteger(str)
                (4)int.parseInt(str)
                """, 1);
        questions.put("""
                How do you find the amount of columns in a 2D array?
                (1) arr[ i ].size()
                (2) arr[ i ].length()
                (3) arr[ i ].length
                (4) arr.getCols()
                """, 3);
        questions.put("""
                What is 2,147,483,647 equivalent to?
                (1) 2^31
                (2) 2^(32) - 1
                (3) 2^(31) - 1
                (4) 2^32
                """, 3);
        questions.put("""
                How do you find the element at index i in ArrayList arr?
                (1) arr(i);
                (2)arr.get(i);
                (3) arr[i];
                (4) There is no way to get an element in an ArrayList;
                """, 2);
        questions.put("""
                What is !(a > b && c < d) equivalent to?
                (1) (a & 1) || b
                (2) !(a <= b) || !(c >= d)
                (3) !(a > b) || !(c < d)
                (4) !(a && b) || (c && d)
                """, 2);
        questions.put("""
                What is the value of: 9 + (9 % 9)?
                (1) 0
                (2) 3
                (3) 9
                (4) 10
                """, 3);
        questions.put("""
                The following array arr is given: {6, 7, 4, 5, 2, 9, 8, 1, 3}
                What is arr after three iterations of selection sort?
                (1) {1, 2, 3, 5, 7, 9, 8, 6, 4}
                (2) {4, 5, 6, 7 , 2, 9, 8, 1, 3}
                (3) {2, 4, 5, 6,7, 9, 8, 1, 3}
                (4) {1, 2, 4, 5, 7, 9, 8, 6, 3}
                """, 1);
        questions.put"""
                public class Date
{
	private int day;
	private int month;
	private int year;
	public Date() { //no arguments
		//implementation not shown//
	}
	public Date(int mo, int da, int yr) { 		
//implementation not shown//
	}
	//returns month
public int getMonth() {
	…
}
	//returns year
public int getYear() {
	…
}
	//returns day
public int getDay() {
	…
}
//Returns representation of string
//month, day, year
public void toString() {
	…
}
The following code appears in a class other than Date.

Int mo = 7;
Int da = 9:
Int ye = 2027;
Date tate = new Date(mo, da, ye);
tate.toString();

What error, if any, is caused while compiling this segment
                    (1) Runtime error
                    (2) Syntax error
                    (3) indexOutOfBounds() exception
                    (4) No error is present in this segment
                    """, 2);
        questions.put("""
                      public class Date
{
	private int day;
	private int month;
	private int year;
	public Date() { //no arguments
		//implementation not shown//
	}
	public Date(int mo, int da, int yr) { 		
//implementation not shown//
	}
	//returns month
public int getMonth() {
	…
}
	//returns year
public int getYear() {
	…
}
	//returns day
public int getDay() {
	…
}
//Returns representation of string
//month, day, year
public void toString() {
	…
}


The following code appears in a class other than Date.

Date da = new Date(6, 7, 1670);
double d = (double) da.getDay();
d *= 6;
d = d + d / d;

What is the value of d after executing this code segment.
                (1) 1
                (2) 43
                (3) 7
                (4) 0
                """, 2);
        questions.put("""
                This expression is equivalent to which of the following?  !(j && k) || (!a && !b)
                (1) + k
                (2) j && k - !a && !b
                (3) !(j || k) || !a && !b
                (4) All of the above
                """, 3);
        questions.put("""
                Trace the following code segment

for (int i = 0; i <= 16; i++) {
	for (int j = i; j < 2; i++) {
		System.out.print(“.”)
	}
	System.out.println(“”);
}

How many times is “.” printed?
                (1) 34
                (2) 17
                (3) 6
                (4) It runs in an infinite loop
                """, 4);
        questions.put("""
                 What does this statement print out? System.out.pritnln(“Croissant”.substring(0, 5));
                 (1) “Croissant”
                 (2) “C”
                 (3) “Crois”
                 (4) “Croi”
                """, 4);
        questions.put("""
                What is the maximum value of an integer in Java?
                (1) 67
                (2) 2^16
                (3) 2^32
                (4) 2^31
                (5) 2^31 - 1
                """, 5);
        questions.put("""
                Suppose the String constant myString is defined as the literal “SIXX SEVEENN!!?!”. What is the value of myString.substring(6, 7)?
                (1) “S”
                (2) “E”
                (3) “VEE”
                (4) “ENN!” 
                """, 2);
        questions.put("""
                arr is a 2D array of String:  {{“Six”, “Sev”, “en”}, {“Croi”, “SSSS”, “ANT”}}
                What is arr[0][2]?
                (1) “Six”
                (2) “en”
                (3) “SSSS”
                (4) “Sev”
                """, 2);
        questions.put("""
                True or false: Strings are a primitive data type.
                (1) True
                (2) False
                """, 2);
        questions.put("""
                The following code segment is intended to print the numbers 1 - 20 inclusive with a space in between each.

for (int i = 1; i <= 22; i++) {
	System.out.print(i + “ “);
}

The code segment does not work as intended. Suggest a solution to make it work as intended.
                (1) Change int i = 1 to int i = 0
                (2) Change i <= 22 to i <= 21
                (3) Change i <= 22 to i < 22
                (4) The code segment should work fine
                """, 3);
        questions.put("""
                Which of the following converts a String s to a double?
                (1) Integer.parseInt(s);
                (2) String.parseString(double s);
                (3) It is impossible to convert a String to a double
                (4) Double.parseDouble(s);
                """, 4);
        questions.put("""
                The method Factorial is defined as:

public int Factorial(int num) {
	if (num <= 1) {
		return 1;
	}
	return n * Factorial(n - 1);
}

What is the value of the call Factorial(5) ?
                (1) 120
                (2) 25
                (3) 100
                (4) 720
                """, 1);







 




        





        





    }

    public Map.Entry<String, Integer> getQuestion() {
        var set = questions.entrySet();
        int item = new Random().nextInt(set.size());
        int i = 0;
        for(Map.Entry<String, Integer> e : set) {
            if(i == item) {
                return e;
            }
            i++;
        }
        return null;
    }
}
