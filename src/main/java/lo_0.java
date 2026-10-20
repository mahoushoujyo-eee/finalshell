/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import javax.swing.JScrollPane;

/*
 * Renamed from Lo
 */
class lo_0
implements Runnable {
    final dy_1 j;

    lo_0(dy_1 dy_12) {
        this.j = dy_12;
    }

    @Override
    public void run() {
        ((JScrollPane)this.j.G).getViewport().setViewPosition(new Point(0, 0));
    }
}

