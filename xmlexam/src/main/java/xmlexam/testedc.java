package xmlexam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testedc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("xmlconfigs.xml");

		Department d1=(Department)context.getBean("dep");
		Department d2=(Department)context.getBean("dep");
		
		Employees  e=(Employees)context.getBean("emps");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(e);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());			
	}

}
