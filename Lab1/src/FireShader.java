
public class FireShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t) {
		
		double red = 0.0, gre = 0.0, blu = 0.0;
		
		red = .5 + .5*PerlinSimplexNoise.noise(8*u - .8*v, v - .6*t, 0.1*t);
		
		gre = red / 2.0;
			
		p[0] = red;
		p[1] = gre;
		p[2] = blu;
	}
}