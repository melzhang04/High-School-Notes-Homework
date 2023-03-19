
public class Parent
{
   private String name;
   private int age;
   private boolean isSingle;
   private boolean isMale;
   private String childName;
   private int childAge;
   private int childNumPokemon;
   private int childLevel;
   public Parent(){
      name = "Jessica";
       age = 35;
       isSingle = true;
       isMale = false;
       childName = "Timmy";
       childAge = 11;
       childNumPokemon = 1;
       childLevel = 1;
   }
   public Parent(Trainer t){
       name = "Jessica";
       age = 35;
       isSingle = true;
       isMale = false;
       childName = t.getName();
       //childAge = t.getAge();
       childNumPokemon = t.getTrainerList().size();
       childLevel = t.getLevel();
   }
   public Parent(String n, int a, boolean single, boolean male, Trainer t){
       name = n;
       age = a;
       isSingle = single;
       isMale = male;
       childName = t.getName();
       //childAge = t.getAge();
       childNumPokemon = t.getTrainerList().size();
       childLevel = t.getLevel();
   }
   public int socialServicesScore(Parent p){
       double modifier = 1;
       if(isSingle){
           modifier = 0.75;
        }
       int parentScore = 100 - (int)((modifier)*(childNumPokemon + (childLevel*5)));
       return parentScore;
   }
   public String getVerdict(Parent p){
       int score = socialServicesScore(p);
       if(score > 66){
           return "Parent should be allowed to keep their child";
       } else if(score > 33){
           return "Parent should be surveyed and investigated for child neglect/abuse";
       } else if(score > 0){
           return "Child should be removed from home until parent can demonstrate they are capable of caring for the child";
       }
       return "Child should be removed from home immediately. Parents should be brought up on criminal charges";
   }
   public String toString(){
       if(isMale){
           return name + ": " + "Age: " + age + " Sex: M";
       }
       return name + ": " + "Age: " + age + " Sex: F";
   }
   public void setName(String n){
       name = n;
   }
   public void setAge(int a){
       age = a;
   }
   public void setIsSingle(boolean s){
       isSingle = s;
   }
   public void setIsMale(boolean m){
       isMale = m;
   }
   public void setChildName(String c){
       childName = c;
   }
   public void setChildAge(int a){
       childAge = a;
   }
   public void setChildNumPokemon(int p){
       childNumPokemon = p;
   }
   public void setcChildLevel(int l){
       childLevel = l;
   }
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;
   }
   public boolean getIsSingle(){
      return isSingle;
   }
   public boolean getIsMale(){
      return isMale;
   }
   public String getChildName(){
      return childName;
   }
   public int getChildAge(){
      return childAge;
   }
   public int getChildNumPokemon(){
      return childNumPokemon;
   }
   public int getChildLevel(){
      return childLevel;
             }
}
