public class Testthree {
    //object --->String and String to object
    public static void main (String[]args) {
        String s1 ="100";
        String s2 ="100.5";
        Integer a = Integer.valueOf(s1);
        Double  d = Double.valueOf(s2);
        System.out.println(a);
        System.out.println(d);
    }
    
}
