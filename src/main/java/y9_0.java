/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/*
 * Renamed from y9
 */
class y9_0
implements Runnable {
    final ak_0 H;

    y9_0(ak_0 ak_02) {
        this.H = ak_02;
    }

    @Override
    public void run() {
        block3: {
            ak_0 ak_02;
            block2: {
                String string = ak_0.u();
                ak_02 = (ak_0)this.H;
                if (string == null) break block2;
                if (!ak_02.i) break block3;
                ak_02 = (ak_0)this.H;
            }
            JScrollBar jScrollBar = ((JScrollPane)ak_02.c).getVerticalScrollBar();
            jScrollBar.setValue(jScrollBar.getMaximum());
        }
    }
}

