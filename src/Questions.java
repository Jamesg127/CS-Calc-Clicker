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
                """, 4)
        questions.put("""
                What is the default value for any object reference?
                (1) 0
                (2) 0.0
                (3) null
                (4) It is impossible to have a default value, you must initialize the object
                """, 3)
        questions.put("""
                How do you find a value in a 2D array?
                arr[ i ][ j ]
                arr.get(value)
                arr[ i ][ value ]
                arr[ value ][ j ]
                """, 1)
        questions.put("""
                How do you turn an int into a String?
                (1) Integer.parseInt(str)
                (2) int.parseInteger(str)
                (3) Integer.parseInteger(str)
                (4)int.parseInt(str)
                """, 1)
        questions.put("""
                How do you find the amount of columns in a 2D array?
                (1) arr[ i ].size()
                (2) arr[ i ].length()
                (3) arr[ i ].length
                (4) arr.getCols()
                """, 2)
        questions.put("""
                What is 2,147,483,647 equivalent to?
                (1) 2^31
                (2) 2^(32) - 1
                (3) 2^(31) - 1
                (4) 2^32
                """, 3)
        





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
