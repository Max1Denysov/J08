class StatClassOne {
    static int a = 3;
    static int b = 99;

    static void meth() {
        System.out.println("A = " + a);

    }




}
class StatClass {
    public static void main(String args[]){
        StatClassOne.meth();
        System.out.println("B = " + StatClassOne.b);

    }
}
