package hclprograms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmloyeeComparisionUsingRole implements Comparator<EmloyeeComparisionUsingRole> {

	String role;
	public EmloyeeComparisionUsingRole() {
		// TODO Auto-generated constructor stub
	}
	public EmloyeeComparisionUsingRole(String role) {
		this.role=role;
	}
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		EmloyeeComparisionUsingRole other = (EmloyeeComparisionUsingRole) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	public static void main(String[] args) {
		Set<EmloyeeComparisionUsingRole> comparisionUsingRoles=new TreeSet<EmloyeeComparisionUsingRole>(new EmloyeeComparisionUsingRole());
		comparisionUsingRoles.add(new EmloyeeComparisionUsingRole("admin"));
		comparisionUsingRoles.add(new EmloyeeComparisionUsingRole("manager"));
		comparisionUsingRoles.add(new EmloyeeComparisionUsingRole("clerk"));
		comparisionUsingRoles.add(new EmloyeeComparisionUsingRole("officeboy"));
		comparisionUsingRoles.add(new EmloyeeComparisionUsingRole("accountant"));
		
		System.out.println(comparisionUsingRoles);
	}

	public int compare(EmloyeeComparisionUsingRole obj1, EmloyeeComparisionUsingRole obj2) {
		// TODO Auto-generated method stub
		return obj1.getRole().compareToIgnoreCase(obj2.getRole());
	}
   
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+role;
	}
	
}

