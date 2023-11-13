import java.util.List;
import java.util.ArrayList;

class Server {
     private String name;
     private boolean isOverloaded;
     private boolean isDown;
     private List<ServerListener> listeners;

     public Server(String name) {
         this.name = name;
         this.isOverloaded = false;
         this.isDown = false;
         this.listeners = new ArrayList<>();
     }

     public void addListener(ServerListener listener) {
         listeners.add(listener);
     }

     public void removeListener(ServerListener listener) {
         listeners.remove(listener);
     }

     public void setOverloaded(boolean overloaded) {
         if (overloaded != this.isOverloaded) {
             this.isOverloaded = overloaded;
             notifyListeners("сервер перегружен: " + overloaded);
         }
     }

     public void setDown(boolean down) {
         if (down != this.isDown) {
             this.isDown = down;
             notifyListeners("сервер упал: " + down);
         }
     }

     private void notifyListeners(String message) {
         for (ServerListener listener : listeners) {
             listener.notify(name + ": " + message);
         }
     }
}
