public class Calculator {
    int a;
    int b;
    char action;
    String res;

    public static void printCalc() {
        System.out.println("This is a calculator");
    }

    public void calc (int a, int b, char action){
       switch (action){
           case '+': res = String.valueOf(a+b); break;
           case '-': res = String.valueOf(a-b); break;
           case '*': res = String.valueOf(a*b); break;
           case '/': res = String.valueOf(a/b); break;
       }
       System.out.println(res);
    }
}
