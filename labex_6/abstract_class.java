/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class abstract_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        //DYNAMIC METHOD DISPATCH
        Employee e;
        

        //1st object of MANAGER class
        e=new manager("Mr.S.Chandran",40,38.75);
        System.out.println("\nIst MANAGER DETAILS:\n"+e);
       
        
        //2nd object of MANAGER class
        e=new manager("Mr.R.Gupta",33,47.32);
        System.out.println("\nIInd MANAGER DETAILS:\n"+e);
      
        
        //Object of CLERK class
        e=new clerk("MR.D.Ravi",45,52.25);
        System.out.println("\nCLERK DETAILS:\n"+e);
     
        
    }
    
}
abstract class Employee
{
    String name;
    int age;
    double hourRate,hours;
    abstract double CalcSalary(double hours);
    Scanner val=new Scanner(System.in);
    @Override
    public String toString()
    {
        return "\nNAME:"+name+"\nAGE:"+age+"\nHOUR RATE:Rs."+hourRate+"\nNO. OF WORKING HOURS:"+hours+"\nSALARY:Rs."+(CalcSalary(hours))+"\n=====================";
    }
}
class manager extends Employee
{
    manager(String n,int a,double h)
    {
        name=n;
        age=a;
        hours=h;
        hourRate=175.8;
    }
    double CalcSalary(double hours)
    {
        return hours*hourRate;
    }
}
class clerk extends Employee
{
    clerk(String n,int a,double h)
    {
        name=n;
        age=a;
        hours=h;
        hourRate=100.75;
    }
    double CalcSalary(double hours)
    {
        return hours*hourRate;
    }
}