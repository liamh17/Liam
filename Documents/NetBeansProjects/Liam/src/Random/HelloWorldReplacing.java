package Random;
public class HelloWorldReplacing {
    public static void main(String[] args) {
    String s = "Java programming", t = "", u = "";
    System.out.println(s);
    
    int n;
    
    //Find length of string
    n = s.length();
    System.out.println("Number of charachers = " + n);
    
    //Replace characters in the string
    t = s.replace("Java", "C++");
    System.out.println(s);
    System.out.println(t);
    
    //Concat the strnig w/ another string
    u = s.concat(" is interesting and fun!");
    System.out.println(u);
    
    System.out.println();
    System.out.println("This is another one of Liam's test programs using SOP");
    
    
    
}
}
