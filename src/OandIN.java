class level_one{
    int x = 100;

    void test_one(){
        for(int i = 0; i < 10; i++){
            class level_two{
                void display(){
                    System.out.println("x = "+ x);
                }
            }
            level_two one = new level_two();
            one.display();
        }
    }

}



public class OandIN {

    public static void main(String args[]){
        level_one two = new level_one();
        two.test_one();


    }
}
