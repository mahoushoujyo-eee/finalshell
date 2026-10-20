/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JPasswordField;

/*
 * Renamed from b3
 */
class b3_0
implements Runnable {
    final fz_2 P;

    b3_0(fz_2 fz_22) {
        this.P = fz_22;
    }

    @Override
    public void run() {
        ((JPasswordField)this.P.i).requestFocus();
    }
}

