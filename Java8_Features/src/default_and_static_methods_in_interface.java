
interface Interface1 {

			void method1(String str);
			
			default void log(String str){
				System.out.println("I1 logging::"+str);
			}
			
			static void print(String str){
				System.out.println("Printing "+str);
			}
		}

public class default_and_static_methods_in_interface implements Interface1  {

	public static void main(String[] args) {
		default_and_static_methods_in_interface obj=new default_and_static_methods_in_interface();
		obj.log("Checking...1");
		Interface1.print("Checking...2");
		obj.method1("in main");

	}

	public void method1(String str) {
		
		System.out.print(str);
		
	}

}
