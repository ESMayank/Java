public class StringMethod {
    public static void main(String[] args) {
        String name = "My name is Mayank";
        System.out.println(name.trim());///trim the starting and ending whitespace
        System.out.println(name.length());///return the lenght of a string
        System.out.println(name.toUpperCase());///Convert String to upper
        System.out.println(name.toLowerCase());///'''' to lower
        System.out.println(name.charAt(0));///return the character at a specified index
        String name2 = name.intern();///Copy a String To another
        System.out.println(name2);
        System.out.println(name.replace(" ","_"));//Replace the Word of string
        int a = 20;
        String value = String.valueOf(a);//convert a int ,float,and any numeric value to string
        System.out.println(name + value);
        System.out.println(name.substring(3,7));//substring returns a new string which start and end with given index
        System.out.println(name.indexOf("f"));//return a Specified index of given char if it is not present it gives -1
        System.out.println(name.lastIndexOf("M"));//returns the last index of char
        System.out.println(name.equals(name2));//return true if both string are True
        System.out.print("Thanks For Using My Java Code!");
    }
}
