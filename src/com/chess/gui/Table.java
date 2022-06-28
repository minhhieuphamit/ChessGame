package com.chess.gui;

import javax.swing.*;
import java.awt.*;

public class Table {
    private final JFrame gameFrame;
    private static Dimension OUTER_FRAME_DIMENSION = new Dimension(800, 800);

    public Table() {
        this.gameFrame = new JFrame("JChess");
        this.gameFrame.setSize(OUTER_FRAME_DIMENSION);
        this.gameFrame.setResizable(true);
    }
}
