public class Mysolid {
	public static void main(String args[]) {
		Solid c = new Cyl(7);
		System.out.print("\nCylinder ");
		c.R();
		c.SA();
		c.V();
		
		System.out.print("\nCone ");
		c = new Cone(7);
		c.R();
		c.SA();
		c.V();
		
		System.out.print("\nSphere ");
		c = new Sph();
		c.R();
		c.SA();
		c.V();
	}
}