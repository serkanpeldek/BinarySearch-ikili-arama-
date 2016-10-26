import java.util.Random;
import java.util.Arrays;
public class BinarySearch {

	private int[] array;
	private int size;
	private int value;

	
	public BinarySearch(int size){
		this.size=size;
		array=new int[size];
		fillArray();
		sortArray();
		//printArray();
	}
	
	public void search(int value){
		this.value=value;
		binarySearchR(0,size-1);
		binarySearchI(0,size-1);
	}
	private void binarySearchI(int begin, int end){
		int middle;
		while(true){
			middle=(begin+end)/2;
			System.out.println(begin+" "+middle+" "+end);
			if(middle<=begin||middle>=end)
			{
				System.out.println("Aranan deðer bulunamadý");
				break;
			}
			if(array[middle]>value){
				end=middle-1;
				 
			}else if(array[middle]<value){
				begin=middle+1;
			 
			}else{
				System.out.println("Aradýðýnýz deðer bulundu");
				System.out.println("Ýndeks deðeri: "+middle);
				break;
				
			}
		}
	}
	private void binarySearchR(int begin, int end){
		int middle=(begin+end)/2;
		System.out.println(begin+" "+middle+" "+end);
		if(middle<=begin||middle>=end)
		{
			System.out.println("Aranan deðer bulunamadý");
			return;
		}
		if(array[middle]>value){
			end=middle-1;
			binarySearchR(begin,end);
		}else if(array[middle]<value){
			begin=middle+1;
			binarySearchR(begin,end);
		}else{
			System.out.println("Aradýðýnýz deðer bulundu");
			System.out.println("Ýndeks deðeri: "+middle);
			
		}
	}
	private void sortArray(){
		Arrays.sort(array);
	}
	private void fillArray(){
		Random random=new Random();
		for(int i=0;i<size;i++){
			array[i]=random.nextInt(size);
		}
	}
	private void printArray(){
		int count=0;
		for(int i:array){
			System.out.printf("%4d",i);
			count++;
			if(count%15==0)
				System.out.println();
		}
		System.out.println();
	}
}
