/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JPasswordField;

/*
 * Renamed from bb
 */
class bb_2
implements Runnable {
    final zl_0 F;

    bb_2(zl_0 zl_02) {
        this.F = zl_02;
    }

    @Override
    public void run() {
        ((JPasswordField)this.F.n).requestFocus();
    }
}

