// A simple SL displacement shader to render a planet-like sphere
displacement Mustafar_displacement(output varying float surfaceLevel = 0.0;) {
  
  // Controller constants
  float minElevation = -0.5;	// controller constant for minimum elevation
  float frq = 4.0;
  float dmp = 0.5;
  float altitude_modifier = 0.15;
  
  /* The noise function returns a pseudo-random value from [0,1] from an input
  seed. noise -0.5 renders a value between [-dmp,1 - dmp]. */
  
  float elevation = noise(frq*P)- dmp;
  elevation += 1.0/2.0*(noise(2*frq*P) - dmp);
  elevation += 1.0/4.0*(noise(4*frq*P) - dmp);
  elevation += 1.0/8.0*(noise(8*frq*P)- dmp);
  elevation += 1.0/16.0*(noise(16*frq*P) - dmp);
  elevation += 1.0/32.0*(noise(32*frq*P) - dmp);
  elevation += 1.0/64.0*(noise(64*frq*P) - dmp);
  
  //elevation = max(elevation, minElevation); // Clip negative values to zero
  
  if(elevation == 0)
  {
	surfaceLevel = 0.0;
  }
  else if(elevation < 0.0)
  {
	surfaceLevel = -1.0;
  }
  else if(elevation > 0.0)
  {
	surfaceLevel = 1.0;
  }
  
  P = P + N * altitude_modifier * elevation;
  N = calculatenormal(P);
}
