public class palindrom {

	public static boolean palindromcheck(String s) {

		int left = 0;

		int right = s.length() - 1;

		while (left < right) {

			if (s.charAt(left) != s.charAt(right)) {

				return false;
			}

			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] wort = { "otto", "hannah", "java", "Leberversagen" };

		for (int i = 0; i < wort.length; i++) {

			boolean pali = palindromcheck(wort[i]);
			if (pali) {
				System.out.println(wort[i] + " ist ein Palindrom");
			} else {
				System.out.println(wort[i] + " ist kein Palindrom");
			}
		}
	}

}
