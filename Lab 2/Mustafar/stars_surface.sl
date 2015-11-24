// A simple SL surface shader to render a planet-like sphere
surface Stars_surface() {

	float starThreshold = 0.99;
	color white = color(1.0,1.0,1.0);
	color black = color(0.0,0.0,0.0);

	float starNoise = noise(P);
	
	if(starNoise > starThreshold)
	{
		Ci = white; 
	}
	else
	{
		Ci = black;
	}
}
