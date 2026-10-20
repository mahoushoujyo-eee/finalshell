/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;

/*
 * Renamed from cj
 */
class cj_2
implements Runnable {
    final mT L;

    cj_2(mT mT2) {
        this.L = mT2;
    }

    @Override
    public void run() {
        ((ne_2)this.L.L).requestFocus();
        ((ne_2)this.L.L).selectAll();
    }
}

