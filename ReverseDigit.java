public class Reverse {

	public static void main(String[] args) {
		String sb = new String("123454321");
		StringBuffer sb1 = new StringBuffer(sb);
		StringBuffer s = sb1.reverse();
		String str = new String(s);
		System.out.println(str);
	}
}
