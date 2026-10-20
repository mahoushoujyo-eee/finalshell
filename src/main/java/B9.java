/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class B9
implements Runnable {
    final a0 l;

    B9(a0 a02) {
        this.l = a02;
    }

    @Override
    public void run() {
        try {
            this.l.x.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

