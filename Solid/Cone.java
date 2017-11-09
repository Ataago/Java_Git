class Cone extends Solid {
	double h;
	Cone(double h)
	{
		this.h = h;
	}
	public void SA()
	{
		double l = Math.sqrt( (r*r) + (h*h) );
		System.out.println("Surface Area: "+( (Math.PI*r*l) + (CA(r)) ));
	}
	public void V()
	{
		System.out.println("Volume: "+( (CA(r)*h)/3 ));
	}
}
