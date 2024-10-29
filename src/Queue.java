public class Queue {
    private int front = 0;
    private int rear = -1;
    private int arr[];
    private int capacity = 0;

    public Queue(int _capacity){
        this.capacity = _capacity;
        arr = new int[this.capacity];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isFull(){
        return(this.rear == (this.capacity - 1));
    }

    public boolean isEmpty(){
        return(this.rear < this.front);
    }

    public boolean enQueue(int val){
        if(!isFull())
        {
            arr[++rear] = val;
            return true;
        }
        else
        {
            System.out.println("Sorry! your Queue is full");
            return false;
        }
    }

    public boolean deQueue(){
        if(!isEmpty())
        {
            for(int i = 0; i < this.rear; i++)
            {
                this.arr[i] = this.arr[i + 1];
            }
            this.rear--;
            return true;
        }
        else
        {
            System.out.println("Sorry! your Queue is empty");
            return false;
        }
    }

    @Override
    public String toString(){
        String content = "";
        if(!isEmpty())
        {
            for(int i = 0; i <= this.rear; i++)
            {
                content = content + arr[i] + "\t";
            }
            content = "[ " + content + " ]";
        }
        else
        {
            content = "Sorry your Queue is empty";
        }
        return content;
    }
}
