/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class KW
implements Runnable {
    final or_2 D;

    KW(or_2 or_22) {
        this.D = or_22;
    }

    @Override
    public void run() {
        try {
            this.D.H.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

