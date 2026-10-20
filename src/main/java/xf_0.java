/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JScrollPane;

/*
 * Renamed from xf
 */
class xf_0
implements Runnable {
    final FC W;

    xf_0(FC fC2) {
        this.W = fC2;
    }

    @Override
    public void run() {
        ((JScrollPane)this.W.V.R).getVerticalScrollBar().setValue(0);
    }
}

