/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class U8
implements Runnable {
    U8() {
    }

    @Override
    public void run() {
        bf_1.L = true;
        try {
            bf_1.W = System.currentTimeMillis();
            bf_1.w = bn_1.J.read(bf_1.O, 0, bf_1.O.length);
            bf_1.D = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        bf_1.L = false;
    }
}

