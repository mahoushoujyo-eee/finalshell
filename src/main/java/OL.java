/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JPasswordField;

class OL
implements Runnable {
    final qv_0 n;

    OL(qv_0 qv_02) {
        this.n = qv_02;
    }

    @Override
    public void run() {
        ((JPasswordField)this.n.J).requestFocus();
    }
}

