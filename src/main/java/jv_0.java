/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Jv
 */
class jv_0
implements Runnable {
    final a0 I;

    jv_0(a0 a02) {
        this.I = a02;
    }

    @Override
    public void run() {
        try {
            this.I.L.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

