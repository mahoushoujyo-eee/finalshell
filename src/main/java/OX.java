/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class OX
implements Runnable {
    final byte[] S;

    OX(byte[] byArray) {
        this.S = byArray;
    }

    @Override
    public void run() {
        bj_2.t = true;
        bj_2.x = true;
        try {
            bj_2.F = bn_1.J.read(this.S, 0, this.S.length);
            bj_2.T = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        bj_2.t = false;
    }
}

