#version 430

in vec2 tc;// added
in vec3 vNormal, vLightDir, vVertPos, vHalfVec;
in vec4 shadow_coord;
out vec4 fragColor;

 
struct PositionalLight
{	vec4 ambient, diffuse, specular;
	vec3 position;
};

struct Material
{	vec4 ambient, diffuse, specular;
	float shininess;
};

uniform vec4 globalAmbient;
uniform PositionalLight light;
uniform Material material;
uniform mat4 mv_matrix; 
uniform mat4 proj_matrix;
uniform mat4 normalMat;
uniform mat4 shadowMVP;
layout (binding=0) uniform sampler2DShadow shadowTex;
layout (binding=1) uniform sampler2D texSamp; // added

void main(void)
{	vec3 L = normalize(vLightDir);
	vec3 N = normalize(vNormal);
	vec3 V = normalize(-vVertPos);
	vec3 H = normalize(vHalfVec);
	
	vec4 texColor = texture(texSamp, tc);
	vec4 lightColor = (light.ambient * material.ambient) + (light.diffuse * material.diffuse) + light.specular;
	
	// ADDED FOR BUMP MAPPING
	float a = 0.25;		// controls depth of bumps
	float b = 100.0;	// controls width of bumps
	float x = vVertPos.x;
	float y = vVertPos.y;
	float z = vVertPos.z;
	N.x = vNormal.x + a*sin(b*x);
	N.y = vNormal.y + a*sin(b*y);
	N.z = vNormal.z + a*sin(b*z);
	N = normalize(N);
	// compute light reflection vector, with respect N:
	vec3 R = normalize(reflect(-L, N));
	
	// get the angle between the light and surface normal:
	float cosTheta = dot(L,N);
	
	// angle between the view vector and reflected light:
	float cosPhi = dot(V,R);
	
	if(vVertPos.x > 1)
	{
	
		// compute ADS contributions (per pixel):
		fragColor = globalAmbient * material.ambient
		+ light.ambient * material.ambient
		+ light.diffuse * material.diffuse * max(cosTheta,0.0)
		+ light.specular  * material.specular *
			pow(max(cosPhi,0.0), material.shininess);
	
	}
	else
	{	//else #1
	
	
	
	
	
	
	
	
	float inShadow = textureProj(shadowTex, shadow_coord);
	
	//fragColor = globalAmbient * material.ambient
				+ light.ambient * material.ambient;
				
	fragColor = (globalAmbient * material.ambient) * 0.8 + (texColor) * 0.4;
		


	
	if (inShadow != 0.0)
	{ //else#2
		//fragColor += texColor * (globalAmbient + light.ambient + light.diffuse * max(dot(L, N), 0.0))
				+ light.specular * pow(max(dot(H,N), 0.0), material.shininess * 3.0);
		
		fragColor += light.diffuse * material.diffuse * max(dot(L,N),0.0)
				+ light.specular * material.specular
				* pow(max(dot(H,N),0.0),material.shininess*3.0);
			
		//fragColor = (globalAmbient * material.ambient) * 0.6 + (texColor) * 0.4;	
			
		//fragColor = texColor * (globalAmbient + light.ambient + light.diffuse * max(dot(L,N),0.0))
					+ light.specular * pow(max(dot(H,N),0.0), material.shininess * 3.0);
				

	
		
	}// else #2
	
	}// else #1
}
