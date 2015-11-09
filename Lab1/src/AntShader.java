
public class AntShader extends Shader {

	// The war of the ants has begun

	double mRed, mGre, mBlu;
	boolean hasColor;

	public AntShader() {
		mRed = mGre = mBlu = 1.0;
		hasColor = true;
	}
	public AntShader(boolean _hasColor) {
		mRed = mGre = mBlu = 1.0;
		hasColor = _hasColor;
	}

	public AntShader(double _r, double _g, double _b, boolean _hasColor) {
		mRed = clamp(_r);
		mGre = clamp(_g);
		mBlu = clamp(_b);
		hasColor = _hasColor;
	}

	@Override
	void shader(double[] p, double u, double v, double t) {
		if (hasColor) {

			// factor [0,1] times random value [0,1]
			p[0] = mRed * Math.random();
			p[1] = mGre * Math.random();
			p[2] = mBlu * Math.random();

		} else {
			// b/w pic.
			double c = Math.random();
			p[0] = mRed * c;
			p[1] = mRed * c;
			p[1] = mRed * c;
		}
	}
}
