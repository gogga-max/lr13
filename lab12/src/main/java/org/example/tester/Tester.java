package org.example.tester;

public class Tester {
    String name;
    String surname;
    String englishLevel;
    int expirienceInYears;
    double salary;
    public Tester(String name, String surname, String englishLevel, int expirienceInYears, double salary)
    {
        this(name,surname,englishLevel,expirienceInYears);
        this.salary = salary;
    }
    public Tester(String name, String surname, String englishLevel, int expirienceInYears)
    {
        this(name,surname,englishLevel);
        this.expirienceInYears = expirienceInYears;
    }
    public Tester(String name, String surname, String englishLevel)
    {
        this.name = name;
        this.surname = surname;
        this.englishLevel = englishLevel;
    }
//    public void ChangeInfo(String name, String surname)
//    {
//        this.name = name;
//        this.surname = surname;
//    }
//    public void ChangeInfo(double salary)
//    {
//        this.salary = salary;
//    }
//    public void ChangeInfo(String englishLevel, int expirienceInYears)
//    {
//        this.englishLevel = englishLevel;
//        this.expirienceInYears = expirienceInYears;
//    }
    public static void hello()
    {
        System.out.println("Hello from Tester class");
    }
    public static void hello(String name)
    {
        System.out.println("Hello "+name+" from Tester class");
    }
    public static void hello(String name,int i)
    {
        for(int j = 0;j<i;j++)
            System.out.println((j+1)+".Hello "+name+" from Tester class");

    }

    @Override
    public String toString()
    {
        return "name: "+name+"\nsurname: "+surname+"\nenglishLevel: "+englishLevel+"\nexpirience(Years): "+expirienceInYears+"\nsalary: "+salary;
    }

}
