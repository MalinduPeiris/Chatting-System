import java.util.ArrayList;

public class Controller implements Observer{
       
    ArrayList<Observer> observerList=new ArrayList<>();
    static Controller instance;
    
    @Override
    public void sendMessage(String message,String name){
        for(Observer ob:observerList){
            ob.sendMessage(message,name);
        }
    }
    
    public void update(String message,String name){
        sendMessage(message,name);   
    }
    
    public static Controller getInstance(){
        if(instance==null){
            instance=new Controller();
            return instance;
        }else{
            return instance;
        }
    }
    
    public void addSender(Sender sender){
        observerList.add(sender);
    }
    
    
}
