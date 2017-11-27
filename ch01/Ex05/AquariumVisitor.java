package visitor;
//INSERT IMPORT HERE
//import aquarium.*;				//A. DOES NOT COMPILE
//import aquarium.*.Jelly;			//B. DOES NOT COMPILE
//import aquarium.jellies.Jelly;	//C. COMPILES
//import aquarium.jellies.*;		//D. COMPILES
//import aquarium.jellies.Jelly.*;	//E. DOES NOT COMPILES
public class AquariumVisitor {
	public void admire(Jelly jelly) {}
}