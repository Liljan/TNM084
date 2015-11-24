// A simple SL surface shader to render a planet-like sphere
surface Mustafar_surface() {

	color colorLava = color(0.9,0.1,0.0);
	color colorLavaGlow = (1.0,1.0,0.0);
	color colorMtn1 = color(0.05,0.01,0.03);
	color colorMtn2 = color(0.4,0.30,0.34);
	
	color mixLava = mix(colorLava,colorLavaGlow, float noise(9*P)*0.8);
	mixLava += specular(N,normalize(-I), 0.05);		//specularity in lava
	color mixMtn = mix(colorMtn1,colorMtn2, float noise(P));
	//mixMtn += specular(N,normalize(-I), 0.01);	//specularity for mountains
	
	float surfaceLevel = 0.0;
	
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
	
	Ci = colorDiffuse * diffuse(N);	//diffuse shading.
}
