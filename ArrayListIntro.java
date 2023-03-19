/**
 *          ---ArrayList versus Array---
 *  -ArrayLists can not hold primitive data
 *  -Arraylists do not have a "fixed" size like Arrays do. 
 *  -ArrayLists can dynamically grow and shrink using .add(element) or .remove(index) 
 *  -Like an Array, an ArrayList is mutuable: All references point to the same location in memory
 *  
 *          ---Creating a new ArrayList---
 *  ArrayList<Integer> = new ArrayList<Integer>();
 *  ArrayList<Double> = new ArrayList<Double>();
 *  ArrayList<Boolean> = new ArrayList<Boolean>();
 *  ArrayList<String> = new ArrayList<String>();
 *  ArrayList<Object> = new ArrayList<Object>();
 *  
 *            ---ArrayList Methods---
 *  add( Object o)          
 *  This method adds an object o to the arraylist.
 *  ----------------------------------------------------------------
 *  add(int index, Object o)
 *  It adds the object o to the array list at the given index.
 *  ----------------------------------------------------------------
 *  Object remove(Object o)
 *  Removes the object o from the ArrayList.
 *  ----------------------------------------------------------------
 *  Object remove(int index)
 *  Removes element from a given index.
 *  ----------------------------------------------------------------
 *  set(int index, Object o)
 *  Used for updating an element. It replaces the element present at the specified index with the Object o.
 *  ----------------------------------------------------------------
 *  int indexOf(Object o)
 *  Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
 *  ----------------------------------------------------------------
 *  Object get(int index)
 *  It returns the object of list which is present at the specified index.
 *  ----------------------------------------------------------------
 *  int size()
 *  It gives the size of the ArrayList – Number of elements of the list.
 *  ----------------------------------------------------------------
 *  boolean contains(Object o)
 *  It checks whether the given object o is present in the ArrayList 
 *  if its there then it returns true else it returns false.
 *  ----------------------------------------------------------------
 *  clear()
 *  It is used for removing all the elements of the array list in one go.
 *  BE VERY CAREFUL
 *  ----------------------------------------------------------------
 *          ---Sorting an ArrayList---
 *  Collections.sort(arraylist) 
 *  
 *          ---Printing an ArrayList---
 *  ** for each loop
 *  
 *  for (Object o: arraylist)
 *  {
 *      System.out.println(o);    
 *  }
 *  for (int i = 0; i<arraylist.size(); i++)
 *  {
 *      System.out.println(arraylist.get(i);   
 *  }
 *  
 *  ** 
 *  
 *  
 * @Kelley
 * @ArrayList Notes - 12/3/2020
 */
import java.util.ArrayList;
public class ArrayListIntro
{
    public static void main (String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println(nums.toString());
        pause(5000); 
        
        nums.add(2);
        System.out.println(nums.toString());
        pause(5000);
        
        nums.add(31);
        System.out.println(nums.toString());
        pause(5000);
        
        nums.add(155);
        System.out.println(nums.toString());
        pause(5000);
        
        nums.add(-85);
        System.out.println(nums.toString());
        pause(5000);
        
        System.out.println("the element "+ nums.remove(1)+ " was removed");
        System.out.println(nums.toString());
        pause(5000);
        
        nums.add(45); 
        nums.add(58);
        System.out.println(nums.toString());
        pause(5000);
        
        nums.add(1,-21);
        System.out.println(nums.toString());
        pause(5000);
        
        nums.set(4,1000);
        System.out.println(nums.toString());
        pause(5000);
        
        isMutable(nums);
        System.out.println(nums.toString());
        pause(5000);
    }
    public static void pause(int mil)
    {
        try {
            Thread.sleep(mil);
        }
        catch (Exception e) {
            System.out.println(e);  
        }
    }
    public static void isMutable(ArrayList<Integer> a)
    {
        a.add(123456789);
    }
    
}
