// A simple SL displacement shader to render a planet-like sphere
displacement drugs_planet_displacement(output varying float oceanblend = 0.0;) {
  float elevation = noise(2*P)-0.5;
  elevation += 0.5*(noise(4*P)-0.5);
  elevation += 0.25*(noise(8*P)-0.5);
  elevation += 0.125*(noise(16*P)-0.5);
  elevation += 0.0625*(noise(32*P)-0.5);
  elevation = max(elevation, 0.0); // Clip negative values to zero
  oceanblend = 0.0;
  if (elevation == 0.0) {
    oceanblend = 1.0;
  }
  P = P + N * 0.2 * elevation;
  N = calculatenormal(P);
}