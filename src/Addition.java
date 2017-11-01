
public class Addition implements Mathematics {
	
	@Override
	public double doMath(String a, String b) {
		double res = Integer.parseInt(a) + Integer.parseInt(b);
		return res;
	}
}
