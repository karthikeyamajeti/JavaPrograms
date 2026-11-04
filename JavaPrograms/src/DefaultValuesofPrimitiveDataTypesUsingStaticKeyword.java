//Write a Java program that demonstrates the default values of different data types.
public class DefaultValuesofPrimitiveDataTypesUsingStaticKeyword {
    
    //Static variables of different primitive data types
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;
    
    //Static variable of String reference type
    static String defaultString;
    
    public static void main(String args[]){
        
        // Printing the default values of primitive data types
        System.out.println("byte: "+defaultByte);
        System.out.println("short: "+defaultShort);
        System.out.println("int: "+defaultInt);
        System.out.println("long: "+defaultLong);
        System.out.println("float: "+defaultFloat);
        System.out.println("double: "+defaultDouble);
        System.out.println("char: ["+defaultChar+"]");
        System.out.println("boolean: "+defaultBoolean);
        
        // Printing the default value of String
        System.out.println("String: "+defaultString);
        
    }
}
