
public class LabPrompt {
/* Lab ­ 21
	Write an INTERFACE called DiamondInterface which inherits from ShapeInterface
	 Create the following method definitions
	◦ setWidth – this method is used to set the width of the diamond
	 Write a Java class called Diamond that DOES NOT HAVE a main method
	 This class implements the DiamondInterface and inherits from ShapeBasics
	 Some of the attributes of Diamond are
	◦ width – that represents the width of the diamond that has to be odd  Create the following Constructors
	◦ Default – sets everything to default values ▪ width = 0
	◦ One that has the parameters
	▪ Offset – used in the parent class ▪ width
	 Accessors and Mutators for each variable
	◦ MAKE SURE THE MUTATORS CHECK FOR VALID VALUES!
	 Create the following Methods
	◦ setWidth – this sets the width of the diamond. This must be implemented just like the
	interface. This number must be odd.
	◦ drawHere – this draws the diamond and overrides the method in ShapeBasics
	◦ drawTopV – this private method draws the top part of the diamond
	◦ drawBottomV – this private method draws the bottom part of the diamond
	◦ skipSpaces – this takes in a certain number of spaces to skip which means drawing “ “.
	Sample Output:
	Welcome to the diamond drawer! Enter the diamond size:
	7
	Enter the offset:
	1
	* ** **
	** ** **
	*
	Submission:
	 Compress all .java files
	 Upload the compressed folder to Blackboard
	Lab Report Questions:
	1. Draw a UML class diagram to represent the ShapeBasics and Diamond classes.
	2. How many classes can any class inherit? Can a class implement more than 1 interface?