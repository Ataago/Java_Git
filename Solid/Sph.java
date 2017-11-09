public class Sph extends Solid {
	public void SA()
	{
		System.out.println("Surface Area: "+( 4*CA(r) ));
	}
	public void V()
	{
		System.out.println("Volume: "+( (4*CA(r)*r)/3 ));
	}
}
