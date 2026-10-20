/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Cu
 */
class cu_0
implements Runnable {
    final aU Y;
    final DH q;

    cu_0(DH dH, aU aU2) {
        this.q = dH;
        this.Y = aU2;
    }

    @Override
    public void run() {
        try {
            this.q.H(this.Y);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

