class Cyl extends Solid {
	float h;
	Cyl(double h)
	{
		this.h = h;
	}
	public void SA()
	{
		System.out.println("Surface area: "+(2*CA(r) + 2*Math.PI*r*h));
	}
	public void V()
	{
		System.out.println("Volume: "+(CA(r)*h));
	}
}
