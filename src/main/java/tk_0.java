/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.text.JTextComponent;

/*
 * Renamed from Tk
 */
class tk_0
implements Runnable {
    final dr_1 p;

    tk_0(dr_1 dr_12) {
        this.p = dr_12;
    }

    @Override
    public void run() {
        ((JTextComponent)this.p.O).selectAll();
    }
}

