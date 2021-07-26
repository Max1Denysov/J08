
class test{
    int stck[] = new int[10];
    int tos;
    test(){
        tos = -1;

    }
    void push(int item){
        if (tos == 9)
            System.out.println("Stack full");

        else
            stck[++tos] = item;


    }
    int pop(){
        if(tos < 0){
            System.out.println("Stack not loaded");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class Stack {
    public static void main(String args[]){
        test mystack1 = new test();
        test mystack2 = new test();

        for(int i = 0 ; i < 10 ; i++) mystack1.push(i);
        for(int i = 10 ; i < 20 ; i++) mystack2.push(i);

        System.out.println("Context of stack one : ");
        for(int i = 0 ; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Context of stack two : ");
        for(int i = 0 ; i < 10; i++)
            System.out.println(mystack2.pop()) ;


    }
}
