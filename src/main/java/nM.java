/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;

class nM
implements Runnable {
    final TM K;

    nM(TM tM) {
        this.K = tM;
    }

    @Override
    public void run() {
        ((ne_2)this.K.v).requestFocus();
        ((ne_2)this.K.v).selectAll();
    }
}

