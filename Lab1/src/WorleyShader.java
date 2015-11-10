
public class WorleyShader extends MarcusShader{
	
	@Override
	void shader(double[] p, double u, double v, double t) {

		double red = 0.0, gre = 0.0, blu = 0.0;
		
		double at[] = {u,v,0.1};
		double[] nojs = {0.0,0.0,0.0};
		double delta[][] = null;
		int[] ID = null;
		
		WorleyNoise.noise(at, 3, nojs, delta, ID);
			
		p[0] = 0.1*nojs[0];
		p[1] = nojs[1];
		p[2] = blu*.2*nojs[2];	
	}
}