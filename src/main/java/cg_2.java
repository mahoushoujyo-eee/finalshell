/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/*
 * Renamed from cg
 */
class cg_2
implements Runnable {
    final VN b;

    cg_2(VN vN) {
        this.b = vN;
    }

    @Override
    public void run() {
        block3: {
            VN vN;
            block2: {
                int n10 = z2.w();
                vN = (VN)this.b;
                if (n10 == 0) break block2;
                if (!vN.E) break block3;
                vN = (VN)this.b;
            }
            JScrollBar jScrollBar = ((JScrollPane)vN.W).getVerticalScrollBar();
            jScrollBar.setValue(jScrollBar.getMaximum());
        }
    }
}

