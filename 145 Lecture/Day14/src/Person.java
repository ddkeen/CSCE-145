
public class Person {

		private String name;
		private int age;
		
		public Person()
		{
			this.name = "no name yet";
			this.age = 1;
		}
		
		public Person(String name, int age)
		{
			this.setName(name);
			this.setAge(age);
		}
		
		public String getName()
		{
			return this.name;
		}
		public int getAge()
		{
			return this.age;
		}
		public void setName(String xName)
		{
			this.name = xName;
		}
		public void setAge(int xAge)
		{
			if (xAge>0)
			{
				this.age = xAge;
			}
			else 
			{
				System.out.println("Invalid value for age!");
			}
		}
		
		public boolean equals(Person p)
		{
			return (p.getName().equalsIgnoreCase(this.name)) && (p.getAge()==this.age);
		}
		
		public void writeOutput()
		{
			System.out.println("Name: "+this.name+ "\nAge: " +this.age+ " years");
		}
		
		
}
