/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;

/*
 * Renamed from y1
 */
public class y1_0 {
    long f;
    boolean b;

    public y1_0(JComponent jComponent, JPopupMenu jPopupMenu) {
        this.b = false;
        jPopupMenu.addPopupMenuListener(new DG(this));
        jComponent.addMouseListener(new lc_1(this));
    }

    public boolean i() {
        return this.b;
    }

    public void w(boolean bl) {
        this.b = bl;
    }
}

