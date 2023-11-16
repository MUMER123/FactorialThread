public class MyThread extends Thread{
    private int num;
    MyThread(String name,int num){
        super(name);
        this.num = num;
    }
    @Override
    public void run(){
        int fact = num;
        if(num==0){
            System.out.println(1);
        }else {
            for(int i=num-1;i>0;i--){
                fact = fact*i;
            }

            System.out.println(fact);
        }

    }

}
