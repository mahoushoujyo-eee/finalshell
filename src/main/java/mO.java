/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;

class mO
implements Runnable {
    final yt_1 j;

    mO(yt_1 yt_12) {
        this.j = yt_12;
    }

    @Override
    public void run() {
        try {
            this.j.yN = new ca_2();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

