public class wrapper{
    public static void main (String[]args){
        
        // 1. INT - Autoboxing and Auto-unboxing
        int a = 10;
        Integer i = a;// AutoBoxing
        Integer b = 120;
        int c = b;// AutoUnboxing
        System.out.println("INT - AutoBoxing: " + i);
        System.out.println("INT - AutoUnboxing: " + c);
        
        // 2. DOUBLE - Autoboxing and Auto-unboxing
        double d = 10.5;
        Double dObj = d;// AutoBoxing
        Double dObj2 = 120.75;
        double d2 = dObj2;// AutoUnboxing
        System.out.println("DOUBLE - AutoBoxing: " + dObj);
        System.out.println("DOUBLE - AutoUnboxing: " + d2);
        
        // 3. FLOAT - Autoboxing and Auto-unboxing
        float f = 10.5f;
        Float fObj = f;// AutoBoxing
        Float fObj2 = 120f;
        float f2 = fObj2;// AutoUnboxing
        System.out.println("FLOAT - AutoBoxing: " + fObj);
        System.out.println("FLOAT - AutoUnboxing: " + f2);
        
        // 4. LONG - Autoboxing and Auto-unboxing
        long l = 100L;
        Long lObj = l;// AutoBoxing
        Long lObj2 = 5000L;
        long l2 = lObj2;// AutoUnboxing
        System.out.println("LONG - AutoBoxing: " + lObj);
        System.out.println("LONG - AutoUnboxing: " + l2);
        
        // 5. BOOLEAN - Autoboxing and Auto-unboxing
        boolean bool = true;
        Boolean boolObj = bool;// AutoBoxing
        Boolean boolObj2 = false;
        boolean bool2 = boolObj2;// AutoUnboxing
        System.out.println("BOOLEAN - AutoBoxing: " + boolObj);
        System.out.println("BOOLEAN - AutoUnboxing: " + bool2);
        
        // 6. BYTE - Autoboxing and Auto-unboxing
        byte by = 10;
        Byte byObj = by;// AutoBoxing
        Byte byObj2 = 50;
        byte by2 = byObj2;// AutoUnboxing
        System.out.println("BYTE - AutoBoxing: " + byObj);
        System.out.println("BYTE - AutoUnboxing: " + by2);
        
        // 7. SHORT - Autoboxing and Auto-unboxing
        short s = 100;
        Short sObj = s;// AutoBoxing
        Short sObj2 = 200;
        short s2 = sObj2;// AutoUnboxing
        System.out.println("SHORT - AutoBoxing: " + sObj);
        System.out.println("SHORT - AutoUnboxing: " + s2);
        
        // 8. CHAR - Autoboxing and Auto-unboxing
        char ch = 'A';
        Character chObj = ch;// AutoBoxing
        Character chObj2 = 'Z';
        char ch2 = chObj2;// AutoUnboxing
        System.out.println("CHAR - AutoBoxing: " + chObj);
        System.out.println("CHAR - AutoUnboxing: " + ch2);
    }
} 
