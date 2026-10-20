/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.aE;
import com.ky_2;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Renamed from com.g
 */
public class g_0
extends TransferHandler {
    private String e;
    private boolean Z = true;

    public g_0(JComponent jComponent) {
        this(jComponent, null);
    }

    public g_0(JComponent jComponent, String string) {
        this(jComponent, string, true);
    }

    public g_0(JComponent jComponent, String string, boolean bl) {
        int n10 = EY.G();
        this.V(string);
        int n11 = n10;
        this.b(bl);
        jComponent.addMouseMotionListener(new aE(this, jComponent));
        if (n11 == 0) {
            ky_2.K(new String[5]);
        }
    }

    public String K() {
        return this.e;
    }

    public void V(String string) {
        this.e = string;
    }

    public boolean I() {
        return this.Z;
    }

    public void b(boolean bl) {
        this.Z = bl;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 1;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        return new StringSelection(this.K());
    }
}

