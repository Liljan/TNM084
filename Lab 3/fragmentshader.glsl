#version 330 core

uniform float time;
uniform sampler2D tex;

in vec3 interpolatedNormal;
in vec2 st;
in float height;

out vec4 color;

void main() {

		// Pre-defined colors
	vec3 colorMtn1(0.05,0.01,0.03);
	vec3 colorMtn2(0.30,0.3,0.30);
	vec3 colorLava(1.0,0.1,0.0);
	vec3 colorGlow(1.0,1.0,0.0);

	//vec3 mixLava = mix(colorLava,colorGlow,cnoise( vec3(time,time,time) * 0.8));
	// vec3 mixMtn = mix(colorMtn1,colorMtn2, cnoise( 2.0 * vec3(10.0*height, 10.0*height,10.0*height) ) );

	//vec3 groundcolor = texture(tex,st).rgb;
	//float alpha = texture(tex, st+vec2(-0.02*time, 0.0)).a;
	//vec3 cloudcolor = vec3(1.0, 1.0, 1.0);
	//vec3 diffusecolor = mix(mixLava,mixMtn,clamp(0,1,height));

	//vec3 diffusecolor = mixLava;
	vec3 diffusecolor = colorMtn1;

	vec3 nNormal = normalize(interpolatedNormal);
	float diffuselighting = max(0.0, nNormal.z);

	color = vec4(diffusecolor*diffuselighting, 1.0);
}