package JavaBasics;

public class PostPreDecIncOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		System.out.println();
		
		int c = 1;
		int d = ++c;
		System.out.println(c);//2
		System.out.println(d);//2
		System.out.println();
		
		int e = 2;
		int f = e--;
		System.out.println(e);//1
		System.out.println(f);//2
		System.out.println();
		
		int g = 2;
		int h = --g;
		System.out.println(g);//1
		System.out.println(h);//1

	}

}
