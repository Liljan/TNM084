
public class LavaShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t) {
		
		double red = 0.0, gre = 0.0, blu = 0.0;
		
		// layers
		double lavaLayer = 0.0, glowLayer = 0.0;
		lavaLayer = 0.4 + 0.6*PerlinSimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.2);
		
		double glowNoise = 0.5 + 0.5*SLSimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.4);
		glowLayer = (lavaLayer > .85) ? glowNoise : 0.0;	
		
		// The final composite
		
		red = lavaLayer;
		gre = glowLayer;
		
		p[0] = red;
		p[1] = gre;
		p[2] = blu;	
	}
}