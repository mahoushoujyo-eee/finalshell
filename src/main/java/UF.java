/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.jdesktop.swingx.JXList;

class UF
extends ComponentAdapter {
    final FK l;
    private static final long a;

    UF(FK fK2) {
        this.l = fK2;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        int n10 = ((JXList)c.c((long)369475678680292668L).get((Object)c.c((long)513954246938583342L).get((Object)this))).getCellBounds((int)0, (int)0).height;
        int n11 = ((JXList)this.l.l1).getHeight() / n10;
        n11 = (int)a;
        ((JXList)this.l.l1).setVisibleRowCount(n11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4742410471088708704L;
        a = 0xDAB7C4087455DC74L ^ l2;
    }
}

