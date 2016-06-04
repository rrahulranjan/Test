import java.util.ArrayList;
import java.util.List;


public class Employee {
private final String name;
private  Address add;
private final List l1;
Employee(Address e, String name,List x)
{
	this.name=name;
	this.add=e;
	l1=x;
}
public List getL1() {
	return new ArrayList(l1);
}
public Address getAdd() {
	return add;
}
public String getName() {
	return name;
}

}
