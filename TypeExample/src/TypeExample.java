
public class TypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=0,i2=1; //32 bits; 8 bytes
		long l1=0,l2=1; //64 bits;16 bytes;
		double d1=0,d2=0; //32 bits
		boolean b1=true,b2=true; // byte ?
		char c1='A',c2='A'; 
		
		// arithmetic operators for int: +,-,*,/,%, priority {*,/,%}>{+,-}
		int i=i1+i2;
		i=i1*i2;
		i=i1/i2; //round up result.
		i=i1%i2;
		
		// bit operator for int: or |, and &, not ~, xor ^, priority: {~}>{&}>{|,^}
		i1=0B01001101;
		i2=0B10010110;
		i=i1|i2;
		System.out.println(Integer.toBinaryString(i));
		i=i1&i2;
		System.out.println(Integer.toBinaryString(i));
		i=~i1;
		System.out.println(Integer.toBinaryString(i));
		i=i1^i2;
		System.out.println(Integer.toBinaryString(i));
		
		//shift operation for int: <<, >>
		i1=1;
		i=i1<<1;
		System.out.println(Integer.toBinaryString(i));
		i=i1<<2;
		System.out.println(Integer.toBinaryString(i));
		i1=0B1010;
		i=i1>>1;
		System.out.println(Integer.toBinaryString(i));
		i=i1>>2;
		System.out.println(Integer.toBinaryString(i));
		
		System.out.println("=====");
		
		i1=0B100;
		i=i1>>1;
		System.out.println(Integer.toBinaryString(i));
		i1=-0B100;
		System.out.println(Integer.toBinaryString(i1));
		i=i1>>1;
		System.out.println(Integer.toBinaryString(i));
		
		// arithmetic operation for double: +,-,*,/
		
		// logic operation for boolean: &&,||,!, priority: {!}>{&&}>{||}
		System.out.println("Logic Operation====");
		b1=true;
		b2=false;
		boolean b=b1 && b2;
		System.out.println(b);
		b= b1 || b2;
		System.out.println(b);
		b=!b1;
		System.out.println(b);
		
		// comparison operation for numbers : operands are number, result is boolean: ==,>=,<=,>,<,!=
		System.out.println("Comparison Operations=====");
		i1=2;
		i2=3;
		b=(i1==i2);
		System.out.println(b);
		b=(i1>=i2);
		System.out.println(b);
		b=(i1<i2);
		System.out.println(b);
		
		// if (boolean_value) {statements;}
		if (i1==2 || i2==3) {
			
		}
		b1=i1==2;
		b2=i2==3;
		if (b1||b2) {
			
		}
		
		//ASCII code examples
		System.out.println("Ascii code example====");
		char c=0x30;
		System.out.println(c);
		
		c1='A';
		c=(char)(c1+1);
		System.out.println(c);
		
		c1='H';
		c=(char)(c1-'A'+'a');
		System.out.println(c);
		
		c1='p';
		c=(char)(c1-'a'+'A');
		System.out.println(c);
		
		int offset='a'-'A';
		for (i=0;i<26;i++) {
			System.out.print((char)('A'+offset+i));
		}
		System.out.println();
		
		//type cast
		i1=3;
		d1=i1;
		
		d1=2.3;
		i1=(int)d1;
		
		c1='A';
		i1=c1;
		
		c1=(char)i1;
		
		
		
	}

}
