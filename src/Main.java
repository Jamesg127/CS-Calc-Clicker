//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int number = 0;
    int add = 1;
    while(true){
        if(Integer.toString(number).contains("67")) {
            add++;
        }
        number += add;
        System.out.println(number + " + " + add);
    }
}
