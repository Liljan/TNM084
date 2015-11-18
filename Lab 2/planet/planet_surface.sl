// A simple SL surface shader to render a planet-like sphere
surface planet_surface() {

  float oceanblend = 0.0;
  color groundcolor = color(0.0, 1.0, 0.0); // Garish green
  color oceancolor = color(0.0, 0.0, 1.0);  // Blaring blue
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