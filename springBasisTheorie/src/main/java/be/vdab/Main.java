package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			System.out.println(context.getBean("classA", ClassA.class).getBoodschap());
//			System.out.println(context.getBean(InterfaceB.class).getBoodschap());
			System.out.println(context.getBean(ClassA.class).getTelefoonNrHelpDesk());
		}

	}

}
