class stack{
    private int Mstack[]; //Объявляем стек.
    private int last; // пороговое значение.

    stack(int size){
        last = -1;// Номер последнего элемента, значение -1 означает пустой стек, так как при i++( -1 + 1 = 0 ).
        Mstack = new int[size];// Инициализируем стек указываем его размер.
    }

    void push(int item){ // Метод добавления в стек
        if(last == Mstack.length - 1) // Если последний равен размеру стека то выводем сообщение что стек заполнен.
            System.out.println("Full stack");
        else
             Mstack[++last] = item; // Иначе увеличиваем последнее значение на 1.
    }

    int pop(){  // извлекаем из стека
        if(last < 0) { // Условие если номер последнего элемента меньше нуля.
            System.out.println(" stack empty");
            return 0;

        }

        else
           return Mstack[last--]; // Иначе возвращаем элементы от наибольшего номера до наименьшего.
    }
}

public class MyStack {
    public static void main(String args[]){
        stack mystack1 = new stack(5); // Создаем обьект стек размером 5.
        stack mystack2 = new stack(11); // Создаем обьект стек размером 11.


        for(int i = 0; i < 6; i++)mystack1.push(i); // Пушим 5 элементов от 0 до 4 в первый стэк.  
        for(int i = 10; i < 20 ; i++)mystack2.push(i);// Пушим 10 элементов от 10 до 19 в первый стэк.

        System.out.println("Stack one have:");
<<<<<<< HEAD
        for(int i = 0;i < 6 ; i++) {
            System.out.print(mystack1.pop() + " ");
=======
        for(int i = 0;i < 5 ; i++) {
            System.out.print(mystack1.pop() + " "); // Выводим из первого стека  5 элементов от 4 до 0.
>>>>>>> 4753d3ed407311ba881b7c09ffcd91bb1531dce1
        }


        System.out.println("\nStack two have:");
        for(int i = 0;i < 10 ; i++) {
            System.out.print(mystack2.pop() + " ");// Выводим из второго стека  10 элементов от 19 до 10.
        }
    }
}
