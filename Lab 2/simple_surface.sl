#include "voronoi.sl"

surface simple_surface() {

	color c1 = color(1.0,0.0,0.0);
	color c2 = color(0.0,1.0,0.0);
	
	Ci = mix(c1*s*, (1-s)*c2);
	
	Oi = 0.3;
}
