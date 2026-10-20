/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PG;
import com._4;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EY
extends TransferHandler {
    protected boolean o;
    protected int R = 1;
    protected boolean O;
    private static int H;

    public EY() {
        this(false, true);
    }

    public EY(boolean bl, boolean bl2) {
        this.i(bl);
        this.e(bl2);
    }

    public boolean d() {
        return this.o;
    }

    public void i(boolean bl) {
        this.o = bl;
    }

    public int E() {
        return this.R;
    }

    public void T(int n10) {
        this.R = n10;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return this.E();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        List list;
        int n10 = EY.P();
        EY eY = this;
        if (n10 == 0) {
            if (!eY.d()) return null;
            eY = this;
        }
        List list2 = list = eY.S();
        if (n10 == 0) {
            if (list2 == null) return null;
            list2 = list;
        }
        if (list2.size() <= 0) return null;
        _4 _42 = new _4(list);
        return _42;
    }

    public List S() {
        File file = this.P();
        return file != null ? Arrays.asList(file) : null;
    }

    public File P() {
        return null;
    }

    public boolean A() {
        return this.O;
    }

    public void e(boolean bl) {
        this.O = bl;
    }

    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        return this.A();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        int n10 = EY.G();
        boolean bl = transferSupport.isDrop();
        if (n10 != 0) {
            if (!bl) return false;
            bl = this.Q(transferSupport.getTransferable());
        }
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Q(Transferable transferable) {
        int n10 = EY.G();
        boolean bl = this.A();
        if (n10 != 0) {
            if (!bl) return false;
            bl = this.d(PG.s(transferable));
        }
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    public boolean d(List list) {
        return true;
    }

    public static void U(int n10) {
        H = n10;
    }

    public static int G() {
        return H;
    }

    public static int P() {
        int n10 = EY.G();
        if (n10 == 0) {
            return 9;
        }
        return 0;
    }

    static {
        if (EY.P() != 0) {
            EY.U(40);
        }
    }
}

