package LinkedList2;

public class Test {

	private String prof;
	private String code;
	private int credit;

	public Test(String prof, String code, int credit) {

		this.prof = prof;
		this.code = code;
		this.credit = credit;
	}

	public void setProf(String pr) {
		this.prof = pr;
	}

	public void setCode(String co) {
		this.code = co;
	}

	public void setCredit(int cr) {
		this.credit = cr;
	}

	public String getProf() {
		return prof;
	}

	public String getCode() {
		return code;
	}

	public int getCredit() {
		return credit;
	}

	public boolean equals(Link other) {

		if (other != null) {
			if (getProf().equals(getProf()) && getCode().equals(getCode()) && getCredit() == getCredit()) {
				return true;
			}
		}

		return false;

	}

	public static int div(int a, int b) {
		int q = 0;
		while (a >= b) {
			a -= b;
			q++;
		}
		return q;
	}

	public static void main(String[] args) {
		
		System.out.println(div(50,10));
		

	}

}
