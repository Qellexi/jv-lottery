package core.basesyntax;

import java.util.Random;

public class Lottery {
  public Ball getRandomBall() {
    Random random = new Random();
    ColorSupplier color = new ColorSupplier();
    Ball ball = new Ball(color.getRandomColor(), random.nextInt(100));   
    return ball;
  }
}
