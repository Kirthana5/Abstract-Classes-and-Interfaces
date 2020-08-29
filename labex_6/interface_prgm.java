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
public class interface_prgm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner val=new Scanner(System.in);
        
        customer c[]=new employee[10];
        System.out.println("Enter the number of records to be displayed:");
        int size=val.nextInt();
        
        for(int i=0;i<size;i++)
        {
            c[i]=new employee();
            System.out.println("\n=====================================\nEnter details of Employee "+(i+1)+":");
            c[i].information();
        }
        
        System.out.println("DISPLAYING EMPLOYEE DETAILS:");
        for(int i=0;i<size;i++)
        {
            System.out.println("\n=================================\nEMPLOYEE "+(i+1));
            c[i].show();
        }
    }
    
}
interface customer
{
    float tax1=0.0F,tax2=0.1F,tax3=0.2F,tax4=0.25F;
    void information();
    void show();
    Scanner val=new Scanner(System.in);
}
class employee implements customer
{
    String name,id,gender;
    long income;
    public void information()
    {
        System.out.println("Enter name:");
        name=val.next();
        System.out.println("Enter ID:");
        id=val.next();
        System.out.println("Enter Gender (Male/Female):");
        gender=val.next();
        System.out.println("Enter Income:");
        income=val.nextLong();
        
    }
    public void show()
    {
        System.out.println("NAME: "+name+"\nID: "+id+"\nGENDER: "+gender+"\nINCOME: Rs."+income);
        if(income<=190000 && (gender.equals("Male") || gender.equals("Female")))
        {
            System.out.println("TAX PERCENTAGE: "+tax1+"%");
            System.out.println("TAX OF THE EMPLOYEE: Nil");
            System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+income+"/-");
        }
        else if(income>190000 && income<200000)
        {
            if(gender.equals("Male"))
            {
                System.out.println("TAX PERCENTAGE: "+(tax2*100)+"%");
                System.out.println("TAX OF THE EMPLOYEE: Rs."+(income*tax2)+"/-");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+(income-(income*tax2))+"/-");
            }
            else
            {
                System.out.println("TAX PERCENTAGE: "+tax1+"%");
                System.out.println("TAX OF THE EMPLOYEE: Nil");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+income+"/-");
            }
        }
        else if(income>=200000 && income<500000)
        {
            if(gender.equals("Male"))
            {
                System.out.println("TAX PERCENTAGE: "+(tax4*100)+"%");
                System.out.println("TAX OF THE EMPLOYEE: Rs."+(income*tax4)+"/-");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+(income-(income*tax4))+"/-");
            }
            else
            {
                System.out.println("TAX PERCENTAGE: "+(tax3*100)+"%");
                System.out.println("TAX OF THE EMPLOYEE: Rs."+(income*tax3)+"/-");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+(income-(income*tax3))+"/-");
            }
        }
        else
        {
            if(gender.equals("Male"))
            {
                System.out.println("TAX PERCENTAGE: "+(tax3*100)+"%");
                System.out.println("TAX OF THE EMPLOYEE: Rs."+(income*tax3)+"/-");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+(income-(income*tax3))+"/-");
            }
            else
            {
                System.out.println("TAX PERCENTAGE: "+(tax2*100)+"%");
                System.out.println("TAX OF THE EMPLOYEE: Rs."+(income*tax2)+"/-");
                System.out.println("INCOME AFTER DEDUCTING TAX: Rs."+(income-(income*tax2))+"/-");
            }
            
        }
    }
}
