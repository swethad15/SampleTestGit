package sample;

import java.util.Stack;

public class Parentheses {
public static void main(String[] args) {
	String s="{()}[{}]";
	char[] charArray = s.toCharArray();
	int len=charArray.length;
	boolean parentheses = parentheses(charArray,len);
	if(parentheses)
		System.out.println("balanced");
	else
		System.out.println("Not balanced");
}

private static boolean parentheses(char[] charArray, int len) {
		Stack<Character> s= new Stack<Character>();
	for(int i=0;i<len-1;i++){
		if(charArray[i]=='{' || charArray[i]=='[' ||charArray[i]=='('){
			s.push(charArray[i]);
		}else if(charArray[i]=='}' || charArray[i]==']' ||charArray[i]==')'){
			if(s.isEmpty())
				return false;
			else if(!matches(s.pop(),charArray[i])){
				return false;
			}
		}
	}
	if(s.isEmpty())
		return true;
	
	else
		return false;
}

private static boolean matches(char c1, char c2) {
	// TODO Auto-generated method stub
	if(c1=='[' && c2==']')
		return true;
	else if(c1=='{' && c2=='}')
		return true;
	else if(c1=='(' && c2==')')
		return true;
	else
	return false;
}

}
