public class Hanoi
{

	public void hanoi(int home, int aux, int dest, int n)\n
	{
		if(n == 0)
		{
			return;
		}
			hanoi(home, dest, aux, n-1);
			System.out.println("move disk size " + n + " to " + dest);
			hanoi(aux, dest, home, n-1);
	}
}
