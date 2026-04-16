public class Q8 {
    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        
       
        if (str1.length() != str2.length()) {
            return false;
        }
        
      
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        

        return java.util.Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        String str1 = "elbow";
        String str2 = "below";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}