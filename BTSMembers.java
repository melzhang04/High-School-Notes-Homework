
/**
 * Write a description of class BTSMembers here.
 *
 * Melisa Zhang
 * 8/27/21
 */
public class BTSMembers
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    private double height;
    private String bloodType;
    
    public BTSMembers()
    {
        // initialise instance variables
        
    }
    public int getAge()
    {
       return age;
    }
    public String getName()
    {
        return name;
    }
    public double getHeight()
    {
        return height;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public void setBloodType(String b)
    {
        bloodType = b;
    }
    public String BTSMemberInfo()
    {
        return name + "\nAge: " + age + "\nHeight: " + height + "\nBlood Type: " + bloodType;
    }
}
