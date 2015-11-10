
public class SmokeShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t){
		
		p[0]=0.5 + 0.5*SimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		p[1]=0.5 + 0.5*SimplexNoise.noise((u-0.5)*8.0, (0.5-v)*8.0, t*0.3);
		p[2]=0.5 + 0.5*SimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
	}

}
