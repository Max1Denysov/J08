class param{
    private int age;
    private String name;
    void setter(int a,String n){
        this.age = a;
        this.name = n;
    }
    public String getter(){
        return("Age: "+ age + "\nname: "+ name);
    }
}
class Factorial {
     public static void main(String args[]){
         param obj = new param();
         obj.setter(26,"max");
         System.out.println(obj.getter());

     }
}
