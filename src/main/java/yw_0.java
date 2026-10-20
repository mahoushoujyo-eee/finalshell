/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JPasswordField;

/*
 * Renamed from Yw
 */
class yw_0
implements Runnable {
    final tn_2 h;

    yw_0(tn_2 tn_22) {
        this.h = tn_22;
    }

    @Override
    public void run() {
        ((JPasswordField)this.h.b).requestFocus();
    }
}

