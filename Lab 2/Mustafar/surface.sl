// A simple SL surface shader to render a planet-like sphere
surface Mustafar_surface() {

	color colorLava = color(1.0,0.1,0.0);
	color colorLavaGlow = color (0.8,0.8,0.0);
	color colorMtn1 = color(0.05,0.01,0.03);
	color colorMtn2 = color(0.2,0.2,0.2);
	
	color mixLava = mix(colorLava, float noise(2*P) * colorLavaGlow, float noise(9*P)*0.8);
	mixLava += specular(N,normalize(-I), 0.05);		//specularity for lava
	color mixMtn = mix(colorMtn1,colorMtn2, float noise(P));
	
	float surfaceLevel = 0.0;
	Os = 1.0;
	
	// output color
	color colorDiffuse;	// diffuse color
  
  // Message passing between the displacement and surface shader
	if(displacement("surfaceLevel", surfaceLevel) == 1)
	{
		colorDiffuse = mix(mixLava,mixMtn,surfaceLevel);
	}
	else
	{
		colorDiffuse = colorLava;
	}
	
	
	if(surfaceLevel < 0.0)
	{
		Os = 0.6;
	}
	
	Ci = colorDiffuse * Os * diffuse(N);	//diffuse shading.
}
