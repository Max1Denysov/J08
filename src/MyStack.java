class stack{
    private int Mstack[]; //обьявляем стек
    private int last; // пороговое значение

    stack(int size){
        last = -1;// номер последнего элемента, значение -1 означает пустой стек, так как при i++( -1 + 1 = 0 )
        Mstack = new int[size];// инициализируем стек указываем его размер
    }

    void push(int item){ // метод токания в стек
        if(last == Mstack.length - 1) // если последний равен размеру стека то выводем сообщение что стек заполнен
            System.out.println("Full stack");
        else
             Mstack[++last] = item; // иначе увеличиваем последнее значение на 1
    }

    int pop(){
        if(last < 0) {
            System.out.println(" stack empty");
            return 0;

        }

        else
           return Mstack[last--];
    }
}

public class MyStack {
    public static void main(String args[]){
        stack mystack1 = new stack(5);
        stack mystack2 = new stack(11);


        for(int i = 0; i < 6; i++)mystack1.push(i);
        for(int i = 10; i < 20 ; i++)mystack2.push(i);

        System.out.println("Stack one have:");
        for(int i = 0;i < 6 ; i++) {
            System.out.print(mystack1.pop() + " ");
        }


        System.out.println("\nStack two have:");
        for(int i = 0;i < 10 ; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }
}
