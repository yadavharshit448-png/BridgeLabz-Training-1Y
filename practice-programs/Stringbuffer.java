class Stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append("HALO");
        System.out.println(sb);

        // insert() adds text at a specified index
        sb.insert(5, "halo");
        System.out.println("insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("replace: " + sb);

        sb.delete(5, 6);
        System.out.println("delete: " + sb);
		
		
		sb.reverse();
		System.out.println("reverse"+ sb);
		
	System.out.println("length:" + sb.length());
	
	System.out.println("charAT(2); " + sb.charAt(2));
	
	
	sb.setCharAt(2,'X');
	System.out.println("setCharAt:" + sb);
	
	System.out.println("Substring:" + sb.substring(1,4));
    }
}
