package adhWAHrdiJWEQAEGIHQPOR;

public class Maximum {
public static double findMax(double n1, double n2, double n3) {
	double max;
	if (n1>n2 && n1>n3)
		max=n1;
	if (n2>n1 && n2>n3)
		max=n2;
	else
		max=n3;
	return max;
}
	public static void main(String[] args) {
System.out.println("Maximum od trite broja e:"+findMax(3.5,5.2,6.6));
	}
}