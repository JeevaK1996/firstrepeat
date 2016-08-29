# firstrepeat

public class FirstRepeat {
	public static void main(String[]args){
		int a[]=new int[]{2,3,4,5,3,6,6};
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count==2){
				System.out.println(a[i]);
				break;
			}
			count=0;
			
		}
	}
}
