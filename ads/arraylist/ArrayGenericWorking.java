package ads.arraylist;
class Pair<X,Y>
{
	X x;
	Y y;
	Pair(X x,Y y)
	{
		this.x=x;
		this.y=y;
	}
	public void getValue()
	{
		System.out.println(x+ " "+y);
	}
}
public class ArrayGenericWorking {

	public static void main(String[] args) {
		Pair<Integer ,Float> p1=new Pair<>(111,11.3f);
		Pair<String ,Integer> p2=new Pair<>("Aman",113);
		Pair<Integer ,Boolean> p3=new Pair<>(111,true);
		p1.getValue();
		p2.getValue();
		p3.getValue();
		
	}

}
