/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

class x2
implements Runnable {
    final vn_0 e;

    x2(vn_0 vn_02) {
        this.e = vn_02;
    }

    @Override
    public void run() {
        SwingUtilities.invokeLater(new mF(this));
    }
}

