
/**
 * Write a description of class BTSMemberCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BTSMemberCreator
{
    public static void main (String[] args)
    {
        BTSMembers one = new BTSMembers();
        BTSMembers two = new BTSMembers();
        BTSMembers three = new BTSMembers();
        BTSMembers four = new BTSMembers();
        BTSMembers five = new BTSMembers();
        BTSMembers six = new BTSMembers();
        BTSMembers seven = new BTSMembers();
        
        one.setName("RM");
        one.setAge(26);
        one.setHeight(181);
        one.setBloodType("A");
        System.out.println(one.BTSMemberInfo() + "\n");
        
        two.setName("Suga");
        two.setAge(28);
        two.setHeight(174);
        two.setBloodType("O");
        System.out.println(two.BTSMemberInfo() + "\n");
        
        three.setName("V");
        three.setAge(25);
        three.setHeight(179);
        three.setBloodType("AB");
        System.out.println(three.BTSMemberInfo() + "\n");
        
        four.setName("Jimin");
        four.setAge(25);
        four.setHeight(174);
        four.setBloodType("A");
        System.out.println(four.BTSMemberInfo() + "\n");
        
        five.setName("Jungkook");
        five.setAge(23);
        five.setHeight(179);
        five.setBloodType("A");
        System.out.println(five.BTSMemberInfo() + "\n");
        
        six.setName("J-Hope");
        six.setAge(27);
        six.setHeight(177);
        six.setBloodType("A");
        System.out.println(six.BTSMemberInfo() + "\n");
        
        seven.setName("Jin");
        seven.setAge(28);
        seven.setHeight(178.3);
        seven.setBloodType("O");
        System.out.println(seven.BTSMemberInfo());
        
        
    }
}
