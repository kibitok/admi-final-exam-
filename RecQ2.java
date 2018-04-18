public class RecQ2{
    public static int counter(int n, int x) {
        int count = 0;
        String c = String.valueOf(n); // changing interger n to a string.
        if (c != null && c.length() > 0) { 
            String ch = String.valueOf(c.charAt(0)); // String valueOf 1st char
         if (x == Integer.parseInt(ch)) { // Compare the int values
            count++; // Add one to the count.
        }
        c = c.substring(1); // substring from 1.
        if (c.length() > 0) {
            count += counter(Integer.parseInt(c), x); // add recursive result
        }
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(counter(231421, 2)); 
    }
}