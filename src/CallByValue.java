class Test{
    int a;
    Test(int i){
        this.a = i;
    }
    Test incrbyten(){
        Test temp = new Test(a + 10);
        return temp;
    }
}


public class CallByValue {

    public static void main(String args[]){
        Test ob1 = new Test(2);
        Test ob2 = ob1.incrbyten();;




        System.out.println(" ob: " + ob1.a + " , "+ ob2.a);
        ob2 = ob2.incrbyten();
        System.out.println(" ob: " + ob2.a);
    }
}
