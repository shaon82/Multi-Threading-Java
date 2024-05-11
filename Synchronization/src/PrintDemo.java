public class PrintDemo {

    public void print(){
        try {
            for (int i =1; i<10; i++){
                System.out.println("Counter----------  "+i);
            }
        }catch (Exception e){
            System.out.println("Thread  interrupted.");
        }
    }
}
