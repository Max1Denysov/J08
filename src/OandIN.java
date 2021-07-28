class level_one{
    int one_x = 100;

    void test_one(){
        level_two one =new level_two();
        one.test_two();
    }
    class level_two{
        void test_two(){
            System.out.println("one_x = " + one_x);
        }
    }
}



public class OandIN {

    public static void main(String args[]){
        level_one two = new level_one();
        two.test_one();


    }
}
