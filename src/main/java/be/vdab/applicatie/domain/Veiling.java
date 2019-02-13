package be.vdab.applicatie.domain;

public class Veiling {
	private int hoogsteBod;
	public void doeBod(int bedrag) {
		if(bedrag > hoogsteBod) {
			hoogsteBod = bedrag;
		};
	}
	public int getHoogsteBod() {
		return hoogsteBod;
	}
}
