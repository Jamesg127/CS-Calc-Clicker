import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Questions {
    HashMap<String, Integer> questions = new HashMap<>();

    public Questions() {
        questions.put("""
                Q1
                (1) True
                (2) False
                """, 2);
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
