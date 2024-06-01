
public class Hello {
	public static void main(String[] args) {
		//정수끼리 곱,나눗셈 할때 double, float 필요한지 잘 보기
//		char c = 'a';
//		System.out.println(c+1);
//		System.out.println("\t");
//		c=(char)(c+1);
//		System.out.println(c+1);
		double sum = 0.0;
		
		for(int i = 0; i<args.length; i++) {
			sum+=Double.parseDouble(args[i]);
		}
		System.out.println("sum = " + sum);
	}
}
