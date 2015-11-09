import com.sun.javafx.geom.*;

public class CirclesShader extends Shader {
	private Vec2d pos;

	private Vec3d bgColor = new Vec3d(0.0, 0, 0);
	private Vec3d col1 = new Vec3d(0.216, 0.471, 0.698);
	private Vec3d col2 = new Vec3d(1.00, 0.329, 0.298);
	private Vec3d col3 = new Vec3d(0.867, 0.910, 0.247);

	private Vec3d pixel;

	void disk(Vec2d cntr, double d, Vec3d color) {
		double lenSq = (pos.x - cntr.x) * (pos.x - cntr.x) + (pos.y - cntr.y) * (pos.y - cntr.y);
		if (lenSq < d * d) {
			pixel = color;
		}
	}

	@Override
	void shader(double[] p, double u, double v, double t) {
		pos = new Vec2d(u, v);

		pixel = bgColor;
		double dt = Math.sin(t)*.5 + .5;

		disk(new Vec2d(0.1, 0.3), 0.5*dt, col3);
		disk(new Vec2d(-0.8, -0.6), 1.5*dt, col1);
		disk(new Vec2d(0.8, 0.0), .15*dt, col2);

		p[0] = pixel.x;
		p[1] = pixel.y;
		p[2] = pixel.z;
	}
}