/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

class T9
implements Runnable {
    final yk_0 O;

    T9(yk_0 yk_02) {
        this.O = yk_02;
    }

    @Override
    public void run() {
        if (((DU)this.O.Z.d).isVisible()) {
            SwingUtilities.invokeLater(new aQ(this));
        }
    }
}

