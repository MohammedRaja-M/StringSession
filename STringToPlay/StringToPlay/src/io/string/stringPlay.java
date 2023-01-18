package io.string;

public class stringPlay {

	public static void main(String[] args) {
		stringPlay sp = new stringPlay();
		String[] name = {"Vijay" , "Sai" , "DevarKonda"};
		sp.wordsJoin(name);
	}

	private void wordsJoin(String[] name) {
		String sen = "";
		StringBuffer bf = new StringBuffer();
		for (String bb:name) {
			bf.append(bb);
			System.out.println("String buffer hascode: "+bf.hashCode());
			sen += bb;
			System.out.println("String hashcode: "+sen.hashCode());
		}
		System.out.println(sen);
		
	}

}
