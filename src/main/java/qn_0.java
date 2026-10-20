/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

/*
 * Renamed from Qn
 */
class qn_0
implements Runnable {
    final U Z;

    qn_0(U u10) {
        this.Z = u10;
    }

    @Override
    public void run() {
        SwingUtilities.invokeLater(new fs_1(this));
    }
}

