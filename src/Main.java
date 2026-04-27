void main() {
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
                add++;
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
