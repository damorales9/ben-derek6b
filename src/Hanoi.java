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














public void solveIterative(int from, int to, int other, int n)
{
	Stack<Integer> from, to, other;
	from = new Stack<Integer>();
	to = new Stack<Integer>();
	other = new Stack<Integer>();

	for(int i = n; i > 0; i--)
	{
		from.push(i);
	}

	while(!from.isEmpty)
	{
		move(from, to, other, from.pop);
	

	from.push 
