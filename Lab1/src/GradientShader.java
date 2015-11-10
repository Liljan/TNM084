
public class GradientShader extends MarcusShader{

	@Override
	void shader(double[] p, double u, double v, double t) {
		
		p[0] = u;
		p[1] = v;
		p[2] = sint(t);
	}
}