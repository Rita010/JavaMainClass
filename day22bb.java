package One;

public class day22bb {

	public static void main(String[] args) {
		
		//overriding - different class, same method, same signature, inheritance
	
				SBIZ pune = new SBIZ("India", "pune");

				pune.loan();
				pune.save();
				pune.displyMessage();

			}

		}

		class WorldBank {
			String country;

			// constructor

			public WorldBank(String cnt) {
				this.country = cnt;
			}

			public void save() {
				System.out.println("This is a save method form the worldbank.");
			}

			public void loan() {
				System.out.println("This is a loan method form the worldbank.");
			}

			public void displyMessage() {
				System.out.println("Welcome to worldBank.");
			}
		}

		class PNB extends WorldBank {
			String branchName;

			public PNB(String cnt, String bn) {
				super(cnt);
				this.branchName = bn;
			}
			// overloading the parent methods loan and save

			public void save() {
				System.out.println("This is save for PNB pune");
			}

			public void loan() {
				System.out.println("This is loan from PNB pune");
			}

		}

		class SBIZ extends WorldBank {

			String branchName;

			public SBIZ(String cnt, String bn) {
				super(cnt);
				this.branchName = bn;
			}

			

			// overriding the parent methods loan and save
			public void save() {
				System.out.println("This is save from SBIE pune");
			}

			public void loan() {
				System.out.println("This is loan for SBIE pune");
			}
		



	}


