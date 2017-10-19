package me.aoa4eva;

public class Main {
    public static void main(String[] args) {
    Head myHead = new Head();
    Mouth myMouth = myHead.getMouth();
    myMouth.setCry("WAAAAAAAAH!");
    System.out.println(myHead.getMouth().getCry());
    }
}
