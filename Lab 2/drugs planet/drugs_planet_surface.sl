// A simple SL surface shader to render a planet-like sphere
surface drugs_planet_surface() {

  float oceanblend = 0.0;
  color groundcolor = noise(13*P); // Drugs color
  color oceancolor = color(0.2, 0.0, 1.0) * noise(2*P);
  color Cd;
  // Message passing between the displacement and surface shader
  if(displacement("oceanblend", oceanblend) == 1) {
    Cd =  mix(groundcolor, oceancolor, oceanblend);
  }
  else {
    Cd = color(1.0, 0.0, 0.0); // Value not found, signal error
  }
  Ci = Cd * diffuse(N);
}
