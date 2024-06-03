public class Main
{
	public static void main(String[] args) {
		String s= "Hello This is ";
		String rev = "";
		int len = s.length();
		System.out.println(len);
		char st[] = s.toCharArray();
		for (int i=len-1;i>=0;i--){
		    rev = rev+st[i];
		} 
		System.out.println(rev);
		
	}
}
