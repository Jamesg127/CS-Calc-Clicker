void main() {
    System.out.println("""
            Welcome to Calc Clicker!!
            ________
            |___67_|
            |[][][]|
            |[][][]|
            |[][][]|
            
            APCSA edition.
            """);
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
    }
    int number = 0;
    int add = 1;
    int speed = 333;
    Questions q = new Questions();
    Scanner scanner = new Scanner(System.in);
    while(true){
        String cur = Integer.toString(number);
        if(cur.contains("67")) {
            var question = q.getQuestion();
            System.out.println(question.getKey());
            Integer answer = scanner.nextInt();
            if(answer.equals(question.getValue())) {
                System.out.println("Correct!");
                add++;
            } else if(answer.equals(1911)) {
                System.out.println("Cheat code :D, +50 levels");
                add += 50;
            } else {
                System.out.println("Incorrect :(\nThe correct answer was "+question.getValue()+".");
                System.out.println("Press Enter to continue");
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        if(cur.contains("42")) {
            if(speed > 1) {
                speed -= 1;
                System.out.println("SPEED BOOST!!!");
            }
        }
        number += add;
        System.out.println(number + " + " + add);
        try {
            TimeUnit.MILLISECONDS.sleep(speed);
        } catch (InterruptedException e) {
            continue;
        }
    }
}
