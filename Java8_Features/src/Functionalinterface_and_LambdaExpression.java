interface functional_interface
{
	void data(int val);
}

public class Functionalinterface_and_LambdaExpression  {

	public static void main(String[] args) {
		
		
		//Approach 1
		functional_interface obj=new functional_interface()
		{
			public void data(int val)
			{
				System.out.println("data:"+val);
			}
			
		};
		obj.data(10);
		
		
		//Approach 2
		
		/*
		functional_interface obj=(val)->
		{
			System.out.println("data:"+val);
		};
		obj.data(10);
		*/

		
		//Approach 3
		
		/*
		functional_interface obj=(val)->System.out.println("data:"+val);	
		obj.data(10);
		*/
				
				

	}

}
