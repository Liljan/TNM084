
public class SineShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t) {
		double red = 0.0, gre = 0.0, blu = 0.0;
		
		red = sint(2*t);
		gre = sint(t);
		blu = sint(0.5*t);
		
		p[0] = red;
		p[1] = gre;
		p[2] = blu;
	}
}