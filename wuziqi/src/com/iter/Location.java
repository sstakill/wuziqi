package com.iter;

/**
 * 棋子对象
 * @Author: mo pan
 * @Description: TODO
 */
public class Location {
    private int x;//棋盘上x坐标
    private int y;//棋盘上y坐标
    private int owner;//1:人类，-1：机器人，0：空

    public Location(int x, int y, int owner) {
        this.x = x;
        this.y = y;
        this.owner = owner;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }
}
