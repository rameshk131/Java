package programAskedByCompany;

public class ReverseDecimalNumber {
	//Given
	//double input = 123456.789;
	//double output = 987654.321;


    public static void main(String[] args) {

        double input = 123456.789; //double output = 987654.321;

		String in = String.valueOf(input);
		System.out.println(in);
		int len = in.length();
		char[] out = new char[len];
		System.out.println(in.indexOf('.'));
		for(int i=0,j=len-1;i<=j;i++,j--){
			if(in.charAt(j) != '.'){
				out[i] = in.charAt(j);
				out[j] = in.charAt(i);
			}else{
				out[j] = '.';
				i--;
			}
		}
		System.out.println(out);

    }
}
