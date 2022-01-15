public class Queue
{   
     int SIZE = 5;
     int arr[] = new int[SIZE];
     int front, rear;
     
     Queue(){
         front = -1;
         rear = -1;
     }
     
     boolean isEmpty(){
         if(front == -1)return true;
         else
         return false;
     }
     
     boolean isFull(){
         if(front == 0 && rear == SIZE - 1){
             return true;
         }
         return false;
     }
     
     void enQueue(int ele){
         if(isFull()){
             System.out.println("Queue is full");
         }else{
             if(front == -1)front = 0;
             rear++;
             arr[rear] = ele;
            }
     }
     
     int deQueue(){
         int item;
         if(isEmpty()){
             return (-1);
         }else{
             item = arr[front];
             if(front >= rear){
                 front = -1;
                 rear = -1;
             }else{
                 front++;
             }
         }
         
         return item;
     }
     
     void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(arr[i] + "  ");

      System.out.println("\nRear index-> " + rear);
    }
  }
  
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        
        q.display();
	}
}
