/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from Ve
 */
class ve_0
implements TreeSelectionListener {
    final a3 S;

    ve_0(a3 a32) {
        this.S = a32;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        this.S.m = System.currentTimeMillis();
    }
}

