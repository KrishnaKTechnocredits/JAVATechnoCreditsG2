package technoCredits.accessmodifiers_array_2701;

// There is no Default keyword for access modifires.
//Class can be declared as Default.

class AccessModifierDefault_1 {
	// Instance variable can be declared as default.
	int x =10;
	int y = 20;
	
	//Method can be declared as default.
	void m1(){
		// Local variable internally declared as Private.
		int z  = x+y ;
		System.out.println("z: "+z);
	}

	//Inner Class can be declared as Default.
	class InnerClassDemo{
		
	}

}
