package com.iter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 棋盘类
 *
 * @Author: mo pan
 * @Description: TODO
 */
public class Chessboard extends JPanel {
    //规定由15条横竖线组成
    private static final int CHESSBOARD_SIZE = 15;
    //外边距
    private int margin = 20;

    //创建一个容器来保存棋子
    private List<Location> locationList=new ArrayList<>();

    /**
     * 绘图工具
     *
     * @param g 画笔工具
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawChessBoard(g);
        drawChess(g);
    }

    /**
     * 画棋盘的方法
     *
     * @param g
     */
    private void drawChessBoard(Graphics g) {
        //每条线之间的距离==》小格子的边长
        /**
         * cellsize：小格子的边长
         * getWidth:获取JPanel的总边长
         * (getWidth()-2*margin):减去两边的边距
         * CHESSBOARD_SIZE-1:15条线能画14个格子
         *
         */
        int cellsize = (getWidth() - 2 * margin) / (CHESSBOARD_SIZE - 1);
        for (int i = 0; i < CHESSBOARD_SIZE; i++) {
            //画横线
            g.drawLine(margin,margin+cellsize*i,getWidth()-20,margin+cellsize*i);
            //画竖线
            g.drawLine(margin+cellsize*i,margin,margin+cellsize*i,getHeight()-margin);
        }
    }
    /**
     * 画棋子
     *
     */
    public void drawChess(Graphics g){
        int cellsize = (getWidth() - 2 * margin) / (CHESSBOARD_SIZE - 1);
        for (int i = 0; i < locationList.size(); i++) {
            //如何辨别棋子的颜色
            Location location = locationList.get(i);
            if(location.getOwner()==1){
                //人类的棋子
                    g.setColor(Color.BLACK);
            }else {
                //机器人的棋子
                g.setColor(Color.white);
            }
            g.fillOval(location.getX()*cellsize+margin-cellsize/2,location.getY()*cellsize+margin-cellsize/2,cellsize,cellsize  );
        }

    }
    /**
     * 落子的方法
     */
    public void addChess(Location location){
        locationList.add(location);
        repaint();
    }
    //获取格子的大小
    public int getCellSize(){
        return (getWidth() - 2 * margin) / (CHESSBOARD_SIZE - 1);
    }
}
