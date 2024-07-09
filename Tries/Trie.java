package Tries;

import java.util.HashMap;

public class Trie {
private class Node{
	char data;
	HashMap<Character,Node>child=new HashMap<>();
	boolean IsTerminal;
	int count=0;
}
private Node root;
public Trie() {
	Node nn=new Node();
	nn.data='*';
	root=nn;
}
public void insert(String word) {
	Node temp=root;
	for(int i=0;i<word.length();i++) {
		char ch=word.charAt(i);
		if(temp.child.containsKey(ch)) {
			//temp.count++;
			temp=temp.child.get(ch);
			temp.count++;
		}else {
			Node nn=new Node();
			nn.data=ch;
			nn.count=1;
			temp.child.put(ch, nn);
			temp=nn;
		}
	}
	temp.IsTerminal=true;
}
public boolean search(String word) {
	Node temp=root;
	for(int i=0;i<word.length();i++) {
		char ch=word.charAt(i);
		if(!temp.child.containsKey(ch)) {
			return false;
		}
		temp=temp.child.get(ch);
	}
	return temp.IsTerminal;
}
public int startsWith(String prefix) {
	Node temp=root;
	for(int i=0;i<prefix.length();i++) {
		char ch=prefix.charAt(i);
		if(!temp.child.containsKey(ch)) {
			return 0;
		}
		temp=temp.child.get(ch);
	}
	return temp.count;
}
public static void main(String []args) {
	
}
}
