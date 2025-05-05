package HW_6.Linked_Hash_Map.Task_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserHistory {
      private LinkedHashMap<String, String> historyMap;
      private static final int MAX_SIZE = 10;

      public BrowserHistory(){
          historyMap = new LinkedHashMap<>(MAX_SIZE, 0.75F, true);
      }
      public void addHistory(String id, String title){
          if(historyMap.size() >= MAX_SIZE){
              String oldKey = historyMap.entrySet().iterator().next().getKey();
              historyMap.remove(oldKey);
          }
          historyMap.put(id, title);
      }
      public void displayHistory(){
          for (Map.Entry<String, String> entry : historyMap.entrySet()){
              System.out.println("ID: " + entry.getKey() + " Заголовок: " + entry.getValue());
          }
      }
}
