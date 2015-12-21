// A simple SL surface shader to render a planet-like sphere
surface Stars_surface() {

	float starThreshold = 0.9;
	color white = color(1.0,1.0,1.0);
	color black = color(0.0,0.0,0.0);
	
	float starNoise = cellnoise(60 * P);
	
	//if(starNoise > starThreshold) ? Ci = white : Ci = black;
	
	// unfinished shiet
	Ci = black;
}
