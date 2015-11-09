import com.sun.javafx.geom.*;

public class CrazyLaser extends Shader {

	private Vec2d pos;
	private Vec3d pixel;

	@Override
	void shader(double[] p, double u, double v, double t) {
		// TODO Auto-generated method stub
		pos = new Vec2d(u, v);
		
		double timeScale = 4.0;

		Vec3d c = new Vec3d(0.0, 0.0, 0.0);
/*		c += strand(pos, new Vec3d(1.0, 0, 0), 0.7934 + 1.0 + Math.sin(t) * 30.0, 1.0, 0.16, 10.0 * timeScale);
		c += strand(pos, new Vec3d(0.0, 1.0, 0.0), 0.645 + 1.0 + Math.sin(t) * 30.0, 1.5, 0.2, 10.3 * timeScale);
		c += strand(pos, new Vec3d(0.0, 0.0, 1.0), 0.735 + 1.0 + Math.sin(t) * 30.0, 1.3, 0.19, 8.0 * timeScale);
		c += strand(pos, new Vec3d(1.0, 1.0, 0.0), 0.9245 + 1.0 + Math.sin(t) * 30.0, 1.6, 0.14, 12.0 * timeScale);
		c += strand(pos, new Vec3d(0.0, 1.0, 1.0), 0.7234 + 1.0 + Math.sin(t) * 30.0, 1.9, 0.23, 14.0 * timeScale);
		c += strand(pos, new Vec3d(1.0, 0.0, 1.0), 0.84525 + 1.0 + Math.sin(t) * 30.0, 1.2, 0.18, 9.0 * timeScale);
		c += clamp(muzzle(pos, timeScale), 0.0, 1.0);
		
		*/
		
		p[0] = pixel.x;
		p[1] = pixel.y;
		p[2] = pixel.z;
	}
/*	
	Vec3d Strand(Vec3d color, float hoffset, float hscale, float vscale, float timescale)
	{
	    float glow = 0.06 * iResolution.y;
	    float twopi = 6.28318530718;
	    float curve = 1.0 - abs(fragCoord.y - (sin(mod(fragCoord.x * hscale / 100.0 / iResolution.x * 1000.0 + iGlobalTime * timescale + hoffset, twopi)) * iResolution.y * 0.25 * vscale + iResolution.y / 2.0));
	    float i = clamp(curve, 0.0, 1.0);
	    i += clamp((glow + curve) / glow, 0.0, 1.0) * 0.4 ;
	    return i * color;
	}

	Vec3d Muzzle(in vec2 fragCoord, in float timescale)
	{
	    float theta = atan(iResolution.y / 2.0 - fragCoord.y, iResolution.x - fragCoord.x + 0.13 * iResolution.x);
		float len = iResolution.y * (10.0 + sin(theta * 20.0 + float(int(iGlobalTime * 20.0)) * -35.0)) / 11.0;
	    float d = max(-0.6, 1.0 - (sqrt(pow(abs(iResolution.x - fragCoord.x), 2.0) + pow(abs(iResolution.y / 2.0 - ((fragCoord.y - iResolution.y / 2.0) * 4.0 + iResolution.y / 2.0)), 2.0)) / len));
	    return Vec3d(d * (1.0 + sin(theta * 10.0 + floor(iGlobalTime * 20.0) * 10.77) * 0.5), d * (1.0 + -cos(theta * 8.0 - floor(iGlobalTime * 20.0) * 8.77) * 0.5), d * (1.0 + -sin(theta * 6.0 - floor(iGlobalTime * 20.0) * 134.77) * 0.5));
	}
	
	*/

}
