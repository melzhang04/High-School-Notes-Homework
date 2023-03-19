
/**
 * We will compare Arrays and ArrayList using methods.
 * We will pass them as parameters and return different types.
 * 
 * This will also allow us to practice/review methods.
 *
 * Melisa Zhang
 * 12/7/21
 */
//import Array and ArrayList class
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayArrayListMethods
{
  public static void main(String[] args)
  {
      String[] wordArray = {"ball", "fancy", "dare", "hello", "supercalifragi", "listicexpialidocious", "administration"};
      String[] emptyWordArray = new String[wordArray.length];
      ArrayList<String> wordList = new ArrayList<String>();
      
      //print all
      System.out.println("Array/ArrayLists before assignments:");
      printArray(wordArray);
      printArray(emptyWordArray);
      printList(wordList);
      
      //assign all
      assignArray(wordArray, emptyWordArray);
      assignList(wordArray, wordList);
      
      //print all again after assignment
      System.out.println("Array/ArrayLists before assignments:");
      printArray(wordArray);
      printArray(emptyWordArray);
      printList(wordList);
      
      //numLongerThan
      System.out.println("There are " + numLongerThan(6, wordList) + " words longer than 6");
      
      //remove words longer than 6
      System.out.println();
      removeLongerThan(6,wordList);
  }
  //method to print values in Array
  public static void printArray(String[] arr)
  {
      System.out.println(Arrays.toString(arr));
  }
  //method to print values in an ArrayList
  public static void printList(ArrayList<String> list)
  {
      System.out.println(list.toString());
  }
  /**
   * Assign all values in copyFrom array to copyTo
   * Precondition: both parameters have thesame length
   */
  public static void assignArray(String[] copyFrom, String[] copyTo)
  {
      for(int i = 0; i<copyTo.length; i++)
      {
          //assign i index of copyFrom --> copyTo
          copyTo[i] = copyFrom[i];
      }
  }
  public static void assignList(String[] copyFrom, ArrayList<String> copyTo)
  {
      //clear all elements in copyTo to assure a clean copy
      copyTo.clear();
      /*
       * for(int j = 0; j<copyFrom.length; j++)
       * {
       *     copyTo.add(copyFrom[j]);
       * }
       */
      for(String s: copyFrom)
      {
          copyTo.add(s);
      }
  }
  public static void removeLongerThan(int num, ArrayList<String> list)
  {
      printList(list);
      for(int i = 0; i < list.size(); i++)
      {
          if(list.get(i).length()>num)
          {
              list.remove(i);
              i--;
          }
      }
      printList(list);
  }
  public static boolean isIdentical(String[] arr, ArrayList<String> list)
  {
      if(arr.length!= list.size())
      {
          System.out.println("The parameters are not the same size/length");
          return false;
      }
      for(int k=0; k<list.size();k++)
      {
          if(!arr[k].equals(list.get(k)))
          {
              return false;
          }
      }
      return true;
  }
  //how many words are greater than a  given length????
  public static int numLongerThan(int num, ArrayList<String> list)
  {
      int counter = 0;
      for(int i = 0; i < list.size(); i++)
      {
          if(list.get(i).length()>num)
          {
              counter++;
          }
      }
      return counter;
  }
  public static ArrayList<String> returnRemoved(int num, ArrayList<String> list)
  {
      ArrayList<String> removed = new ArrayList<String>();
      for(int i = 0; i < list.size(); i++)
      {
          if(list.get(i).length()>num)
          {
              //when we remove, it returns the element so we can add it to a new List
              removed.add(list.remove(i));
              i--;
          }
      }
      //return the list with all removed words!!!!!!!!!!!!!!
      return removed;
  }
}