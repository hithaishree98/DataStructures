import java.util.Scanner;

public class Sequence<E>{
    protected Object[] data;
    protected int size;

    public Sequence(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();}
        this.data=new Object[n];
        this.size=0;
    }

    public int size(){
        return this.size;
    }

    public void append(E element){            
        if(this.size<this.data.length){
            this.data[this.size]=element;
        }
        else{
            Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
            this.data[this.size]=element;
        }
        this.size++;    
    }

    public Object get(int k) throws IndexOutOfBoundsException{
            if(k<0 || k>=this.size){
                throw new IndexOutOfBoundsException();}
            return this.data[k];
    }

	public void print(){
		System.out.print("\nCurrent Sequence: ");
		for(int i=0;i<this.size();i++){
            System.out.print(this.get(i)+" ");
        }
		System.out.println();
	}
	
    public void insert(int index, E newElement){
        //IMPLEMENT ME
		if(index>this.size+1)
			System.out.print("Index out of the range");
		for(int j=this.size;j>index;j--){
			
			data[j]= data[j-1];	
			
		}
		this.size++;
		data[index]=newElement;
    }

	public void delete(int index){
		//IMPLEMENT ME
		if(index>=this.size)
			System.out.print("Index out of the range");
		else{
			this.size--;
			for(int j=index;j<this.size;j++){
				data[j]=data[j+1];
				//data[j-1]= data[j];	
			
			}
			//this.size--;
			//data[index]=newElement;
		}
	}
	
    public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		Sequence<Integer> s = new Sequence<Integer>(7);
		s.append(1);
		s.append(2);
		s.append(3);
		s.append(4);
		s.append(5);
		s.print();
		
		//System.out.println("Please enter 1 to insert, 2 to delete or 3 to quit.");
        int operation = 0;
		while(true){
			System.out.println("Please enter 1 to insert, 2 to delete or 3 to quit.");
			operation = in.nextInt();
			if( operation==1){
				System.out.println("Please enter the value to insert.");
				int value = in.nextInt();
				System.out.println("Please enter the index to insert.");
				int index = in.nextInt();
				s.insert(index,value);
				s.print();
			}
		
			else if(operation==2){
				System.out.println("Please enter the index to delete.");
				int index = in.nextInt();
				s.delete(index);
				s.print();
			}
			else{
				System.out.println("Goodbye.");
				break;
			}
		}
		
		//INSERT CONTROL LOOP HERE
		
    }   //End main
}   //End class