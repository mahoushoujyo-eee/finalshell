/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from uO
 */
class uo_1
implements Runnable {
    final byte[] u;

    uo_1(byte[] byArray) {
        this.u = byArray;
    }

    @Override
    public void run() {
        bz_2.o = true;
        try {
            bz_2.c = bn_1.J.read(this.u, 0, this.u.length);
            bz_2.a = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        bz_2.o = false;
    }
}

