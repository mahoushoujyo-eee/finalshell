/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.tree.TreePath;

/*
 * Renamed from nm
 */
class nm_0
implements Runnable {
    final kq_0 P;

    nm_0(kq_0 kq_02) {
        this.P = kq_02;
    }

    @Override
    public void run() {
        ((a3)this.P.r).expandPath((TreePath)this.P.v);
    }
}

