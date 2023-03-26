public class DataType{
    public static void main(String[] args){

         //Primitive types
         //Build in data types
         byte byteType;
         short shortType;
         int intType;
         long longType;
         float floatType;
         double doubleType;
         char charType;
         boolean booleanTpye;
 
         //Non-Primitive types
         //Value can be null
         //String: A String is a sequence of characters. It is a commonly used reference type in Java.
        // Object: An Object is a reference to any Java object.
        // Array: An Array is a collection of values of the same type.
        // Class: A Class is a reference to a class in Java.
        // Interface: An Interface is a reference to an interface in Java.

        //Examples
         Byte byteTypeNon;
         Short shortTypeNon;
         Integer intTypeNon;
         Long longTypeNon;
         Float floatTypeNon;
         Double doubleTypeNon;
         Character charTypeNon;
         Boolean booleanTpyeNon;
 

         System.out.println("can be stored " + Byte.TYPE + " from " + Byte.MIN_VALUE +" to " + Byte.MAX_VALUE);
         System.out.println("can be stored " + Short.TYPE + " from " + Short.MIN_VALUE +" to " + Short.MAX_VALUE);
         System.out.println("can be stored " + Integer.TYPE + " from " + Integer.MIN_VALUE +" to " + Integer.MAX_VALUE);
         System.out.println("can be stored " + Long.TYPE + " from " + Long.MIN_VALUE +" to " + Long.MAX_VALUE);
         System.out.println("can be stored " + Float.TYPE + " from " + Float.MIN_VALUE +" to " + Float.MAX_VALUE);
 
    }
}