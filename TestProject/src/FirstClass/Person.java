package FirstClass;

public class Person 
{
  int person_id;
  String person_name;
  String person_dept;
  
  
public Person(int person_id, String person_name, String person_dept) {
	super();
	this.person_id = person_id;
	this.person_name = person_name;
	this.person_dept = person_dept;
}
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public String getPerson_name() {
	return person_name;
}
public void setPerson_name(String person_name) {
	this.person_name = person_name;
}
public String getPerson_dept() {
	return person_dept;
}
public void setPerson_dept(String person_dept) {
	this.person_dept = person_dept;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((person_dept == null) ? 0 : person_dept.hashCode());
	result = prime * result + person_id;
	result = prime * result + ((person_name == null) ? 0 : person_name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (person_dept == null) {
		if (other.person_dept != null)
			return false;
	} else if (!person_dept.equals(other.person_dept))
		return false;
	if (person_id != other.person_id)
		return false;
	if (person_name == null) {
		if (other.person_name != null)
			return false;
	} else if (!person_name.equals(other.person_name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_dept=" + person_dept + "]";
}
  
  
}
