package com.iter;

/**
 * 五子棋的项目
 * @Author: mo pan
 * @Description: TODO
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.jar.JarEntry;

/**
 * 1.使用Jframe容器制作棋盘窗体；
 * 2.使用Jpanel和Graphics画出棋盘方格；
 * 3.使用鼠标监听事件实现落子功能；
 * 4.判断落子合法（不能超出棋盘）；
 *
 */
public class Ui {
    //窗体类
    private JFrame jFrame=new JFrame();
    //棋盘对象
    private Chessboard chessboard=new Chessboard();
    //棋盘长宽
    public int width=550;
    public int height=543;

    /**
     * 制作五子棋的窗体
     */
    public void init(){
        //窗体显示
        jFrame.setVisible(true);
    //给窗体设置标题
        jFrame.setTitle("五子棋对战（墨磐爨）");
        //设置窗体的大小
        jFrame.setSize(width,height);
        //窗体居中
        jFrame.setLocationRelativeTo(null);
        //默认关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //禁止窗体拖动大小
        jFrame.setResizable(false);
        //棋盘对象添加到棋盘窗体
        jFrame.add(chessboard);
        //鼠标点击后，落子功能实现
        chessboard.addMouseListener(new MouseAdapter() {
            /**
             * 给棋盘添加鼠标监听事件，==》鼠标点击事件
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //调用棋子方法
                play(e);
            }
        });


    }
    //处理鼠标点击事件的方法
    private void play(MouseEvent e) {
        //先把格子的大小求出来
        int cellSize = chessboard.getCellSize();
        //鼠标的位置转换棋盘的位置
        int x=(e.getX())/cellSize;
        int y=(e.getY())/cellSize;
        //添加棋子
        chessboard.addChess(new Location(x,y,1));
    }

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.init();
    }

}
