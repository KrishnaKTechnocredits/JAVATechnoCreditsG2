package array_1;

public class VisibleTree {

	public static void main(String[] args) {
		UserInputArray UserIP= new UserInputArray();
		VisibleTree visibleT= new VisibleTree();
		System.out.println("Number of trees visible are :"+visibleT.countofTree(UserIP.takeUserInputArrayInt()));	

	}
	int countofTree(int[] nT){
		int max=nT[0],count=1;
		for (int index=0;index<nT.length;index++)
		{
			if(max<nT[index])
			{
				max=nT[index];
				count++;
			}
		}
		return count;
	}

}
