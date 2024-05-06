package annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(congigur.class);
		Address a=(Address) con.getBean("add");
		Company c=(Company) con.getBean("com");
		Organization o=(Organization) con.getBean("org");
		System.out.println(a);
		System.out.println(c);
		System.out.println(o);
		
	}

}
