import java.util.*;

public class balancedChar{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String character;
		System.out.println("Enter String");
		character=in.next();
		checkBalanced(character);
	}
	public static void checkBalanced(String ch) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<ch.length();i++) {
			char c=ch.charAt(i);
			if(c=='('||c=='{'||c=='[') {
				 st.push(c);
			}
			else {
				if(st.isEmpty()) {
					System.out.println("The entered String has Not Balanced Brackets");
					return;
				}
				char top=st.peek();
				if((top=='('&& c==')')||(top=='{'&& c=='}')||(top=='['&& c==']')) {
					st.pop();
				}
			}
		}
		
		if(st.isEmpty()) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered String has Not Balanced Brackets");
		}
	}
}

















