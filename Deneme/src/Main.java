class EncapsulationDemo {

	private long acc_no;
	private String name, email;
	private float amount;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	// create getters to return the value of the variables
	// buradada getterlarda call diyoruz veriyi ama return'e depoluyoruz.

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public float getAmount() {
		return amount;
	}

}

public class Main extends EncapsulationDemo {

	public static void main(String[] args) {

		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setAcc_no(7560504000l);
		obj.setAmount(500000.0f);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		System.out.println(obj.getAcc_no() + " " + obj.getName() + " " + obj.getEmail() + " " + obj.getAmount());
	}
}