package com.example.brickgame;

public interface CollisionDetect {
    enum CollisionFrom{VERTICAL,HORIZONTAL};

    public static final int verticalCollision =1;

    public CollisionFrom isCollision(Ball ball);
}
