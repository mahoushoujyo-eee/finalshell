/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JSplitPane;

/*
 * Renamed from On
 */
class on_0
implements Runnable {
    final JSplitPane N;
    final CV v;

    on_0(CV cV, JSplitPane jSplitPane) {
        this.v = cV;
        this.N = jSplitPane;
    }

    @Override
    public void run() {
        int n10 = (int)((float)((JSplitPane)this.N).getWidth() * 0.65f);
        ((JSplitPane)this.N).setDividerLocation(n10);
    }
}

