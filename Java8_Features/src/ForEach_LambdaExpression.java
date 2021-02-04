import java.util.ArrayList;
import java.util.Arrays;

public class ForEach_LambdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		al.forEach(v->System.out.println(v));
		//System.out.println(al);

	}

}
