package HW_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int max){
        maxPlayers = max;
    }

    public void addPlayer(){
        if(currentPlayers < maxPlayers){
            currentPlayers++;
        }
    }
     public void printGameStatus(){
         System.out.println("Наименование игры: " + gameName + ", Текущее количество игроков: " + currentPlayers
                 + ", Максимальное количество игроков: " + maxPlayers);
     }
}
