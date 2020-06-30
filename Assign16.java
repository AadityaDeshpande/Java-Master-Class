
public class Assign16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String target = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog";
		
		String s2 = processing(target, "fox", "frog");
		
		System.out.println(s2);
		

	}
	
	public static String processing (String target, String src, String dest)
	{
		String s2 = target.replace(src, dest);
		
		return s2;
		
	}
	
	
}
