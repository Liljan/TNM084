#include "voronoi.sl"

displacement simple_displacement() {
//  point Ptex = P + noise(P*2);
//  P = P + N * 0.05 * float noise(20*Ptex);
  N = calculatenormal(P);  
}
