
class test{
    private int stck[] ;
    private int tos;
    test(int size){
        stck = new int[size];
        tos = -1;

    }
    void push(int item){
        if (tos == stck.length - 1)
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
        test mystack1 = new test(5);
        test mystack2 = new test(8);


        for(int i = 0 ; i < 5 ; i++) mystack1.push(i);
        for(int i = 0 ; i < 8 ; i++) mystack2.push(i);


        System.out.println("Context of stack one : ");
        for(int i = 0 ; i < 5; i++) {
            System.out.print(mystack1.pop() + " ");
        }

        System.out.println("Context of stack two : ");
        for(int i = 0 ; i < 8; i++) {
            System.out.print(mystack2.pop() + " ");
        }





    }
}
