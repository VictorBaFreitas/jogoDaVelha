package Octothorpe;

public class OctothorpeDTO {
    private boolean Player1Active = true, Player2Active = false;
    private int numberWinner1, numberWinner2, numberTies;

    public boolean isPlayer1Active() {
        return Player1Active;
    }

    public void setPlayer1Active(boolean Player1Active) {
        this.Player1Active = Player1Active;
    }

    public boolean isPlayer2Active() {
        return Player2Active;
    }

    public void setPlayer2Active(boolean Player2Active) {
        this.Player2Active = Player2Active;
    }

    public int getNumberWinner1() {
        return numberWinner1;
    }

    public void setNumberWinner1(int numberWinner1) {
        this.numberWinner1 = numberWinner1;
    }

    public int getNumberWinner2() {
        return numberWinner2;
    }

    public void setNumberWinner2(int numberWinner2) {
        this.numberWinner2 = numberWinner2;
    }

    public int getNumberTies() {
        return numberTies;
    }

    public void setNumberTies(int numberTies) {
        this.numberTies = numberTies;
    }
}