import java.util.ArrayList;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(400076,"Mumbai");
		//a.setCity();
		//a.setPin();
		List l1=new ArrayList();
		l1.add("Rahul");
		l1.add("Pankaj");
		Employee e=new Employee(a, "Rahul",l1);
		List l2=e.getL1();
		System.out.println(l2.hashCode());
		System.out.println(l1.hashCode());
		l2.add("Suresh");
		System.out.println(a.hashCode());
		Address a1=e.getAdd();
		//System.out.println(a1.hashCode());
		//System.out.println(a1==a);
		//a1.setCity("PATNA");
		//System.out.println(a1==a);
		System.out.println(e.getL1().toString());
		System.out.println(l1==l2);

	}

}
