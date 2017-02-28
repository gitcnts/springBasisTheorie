package be.vdab;

class ClassA implements InterfaceA {

	private String telefoonNrHelpDesk;

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}

	@Override
	public String getBoodschap() {
		return "ClassA object";
	}

}
