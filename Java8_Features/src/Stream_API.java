
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++)
			myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		//using lambda with Stream API, filter example
		Stream<Integer> num_sequential = sequentialStream.filter(val -> val > 80);
		//using lambda in forEach
		num_sequential.forEach(val -> System.out.println("Nums sequential="+val));
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		Stream<Integer> num_parallel = parallelStream.filter(val -> val > 80);
		num_parallel.forEach(val -> System.out.println("Nums parallel="+val));
		
		

	}

}
