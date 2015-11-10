import com.sun.javafx.geom.*;

public abstract class MarcusShader extends Shader {

	Vec2d pos;
	Vec3d pixel;
	Vec2d worldSize;

	public double clamp(double value) {
		return Math.max(0.0, Math.min(1.0, value));
	}

	public double sint(double t) {
		return 0.5 + 0.5 * Math.sin(t);
	}

}
