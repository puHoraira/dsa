package chapter18;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface herb {

}

interface carb {

}

class Abal implements herb, carb {

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.err.println("up, down, left, right,diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.err.println("up, down, left, right");
    }
}
