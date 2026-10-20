/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BL;
import com.EB;
import com.EY;
import com.ky_2;
import com.xg_0;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.wQ
 */
public class wq_1
extends TransferHandler {
    private static final DataFlavor[] M = new DataFlavor[]{DataFlavor.imageFlavor};
    private BufferedImage H;
    private boolean m = true;

    public wq_1(JComponent jComponent, ImageIcon imageIcon) {
        this(jComponent, xg_0.Z(imageIcon));
    }

    public wq_1(JComponent jComponent, Image image) {
        this(jComponent, xg_0.v(image));
    }

    public wq_1(JComponent jComponent, BufferedImage bufferedImage) {
        this.f(bufferedImage);
        int n10 = EY.P();
        jComponent.addMouseListener(new BL(this, jComponent));
        int n11 = n10;
        if (ky_2.F() != null) {
            EY.U(++n11);
        }
    }

    public BufferedImage l() {
        return this.H;
    }

    public void f(BufferedImage bufferedImage) {
        this.H = bufferedImage;
    }

    public boolean l() {
        return this.m;
    }

    public void k(boolean bl) {
        this.m = bl;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 1;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        return new EB(this);
    }

    static DataFlavor[] r() {
        return M;
    }

    static BufferedImage Y(wq_1 wq_12) {
        return wq_12.H;
    }
}

