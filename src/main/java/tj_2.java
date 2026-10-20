/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from tj
 */
class tj_2
implements Runnable {
    final or_2 P;

    tj_2(or_2 or_22) {
        this.P = or_22;
    }

    @Override
    public void run() {
        try {
            this.P.e.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

