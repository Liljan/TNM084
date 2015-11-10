
public class DrugsShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t) {
		
		double red = 0.0, gre = 0.0, blu = 0.0;
		
		red = .8 + .8*SimplexNoise.noise((u-.2)*16.0*sint(t), (0.2- v)*16.0, t);
		gre = .8 + .8*PerlinSimplexNoise.noise((u-.2*t)*16.0, (0.2- v)*16.0*sint(t), 0.0);
		blu = .8 + .8*ImprovedNoise.noise((8*u-.2)*16.0*sint(t), (0.2- v*3.0)*16.0, sint(t));
		
		p[0] = red;
		p[1] = gre;
		p[2] = blu;	
	}
}