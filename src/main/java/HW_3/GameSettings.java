package HW_3;

public class GameSettings {
    static int maxPlayers = 50;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }
    public  static void setMaxPlayers(int max){
        maxPlayers = max;
    }
    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        }
    }
    public void printGameStatus(){
        System.out.println("Наименование игры: " + gameName + " Игроков сейчас: " +
                currentPlayers + " Максимальное количество игроков: " + maxPlayers);
    }
}
