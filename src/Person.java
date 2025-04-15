class Person{
    String fullName;
    int age;

    static double taxRate = 0.08;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public static double getTaxRate(){
        return taxRate;
    }


    public void greet(){
        System.out.printf("Hello my name is %s, and I am %d years old. My rate is %.2f\n",
                this.fullName,
                this.age,
                getTaxRate());
    }

}
