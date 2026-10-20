/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.dy_1;

class xV
implements Runnable {
    final dy_1 j;
    final zD C;

    xV(zD zD2, dy_1 dy_12) {
        this.C = zD2;
        this.j = dy_12;
    }

    @Override
    public void run() {
        ((dy_1)this.j).r();
    }
}

