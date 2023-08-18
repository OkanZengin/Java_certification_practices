package part_one;

public class VariableTypes {

	public static void main(String[] args) {

		byte var1min = -128;
		byte var1max = 127;
		short var2min = -32768;
		short var2max = 32767;
		int var3min = -2147483648;
		int var3max = 2147483647;
		long var4min = -9223372036854775808L;
		long var4max = 9223372036854775807L;
		double var5ex = -7.1934564576;
		double var5exm = 7.1934564576;
		float var6min = -6.2342234234234f;
		float var6max = 6.2372234234234f;
		boolean var7a = true;
		boolean var7b = false;
		char var8 = 'a';	
		String var9 = "A sentence";
		
		System.out.println(var1min);
		System.out.println(var1max);
		System.out.println(var2min);
		System.out.println(var2max);
		System.out.println(var3min);
		System.out.println(var3max);
		System.out.println(var4min);
		System.out.println(var4max);
		System.out.println(var5ex);
		System.out.println(var5exm);
		System.out.println(String.format("%.5f", var5ex));
		System.out.println(String.format("%.5f", var5exm));
		System.out.println(String.format("%.4f", var5ex));
		System.out.println(String.format("%.4f", var5exm));
		System.out.println(String.format("%.3f", var5ex));
		System.out.println(String.format("%.3f", var5exm));
		System.out.println(String.format("%.2f", var5ex));
		System.out.println(String.format("%.2f", var5exm));
		System.out.println(String.format("%.2f",var6min));
		System.out.println(String.format("%.2f",var6max));
		System.out.println(var7a);
		System.out.println(var7b);
		System.out.println(var8);
		System.out.println(var9);
	}

}
