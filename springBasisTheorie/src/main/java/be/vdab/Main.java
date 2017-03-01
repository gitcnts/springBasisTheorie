package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
//			System.out.println(context.getBean("classA", ClassA.class).getBoodschap());
//			System.out.println(context.getBean(InterfaceB.class).getBoodschap());

//			System.out.println(context.getBean(ClassA.class).getTelefoonNrHelpDesk());
			
			ClassA objectA = context.getBean(ClassA.class);
			System.out.println(objectA.getTelefoonNrHelpDesk());
			System.out.println(objectA.getKoersenURL());
			System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			System.out.println(objectA.getDefaultBladRichting());	// enum geeft problemen als geen public
			System.out.println("----------------------------------------------------");
			
			ClassB objectB = context.getBean(ClassB.class);
			System.out.println(objectB.getTelefoonNrHelpDesk());
			System.out.println(objectB.getAantalPogingenUpdateKlant());
			System.out.println("----------------------------------------------------");
			
			System.out.println(context.getBean(HelpdeskMedewerkers.class));
			System.out.println("----------------------------------------------------");

		}

	}

}
