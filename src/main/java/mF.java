/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;

class mF
implements Runnable {
    final x2 c;

    mF(x2 x22) {
        this.c = x22;
    }

    @Override
    public void run() {
        block3: {
            block2: {
                Point point = ((vn_0)this.c.e).getMousePosition();
                String string = vn_0.C();
                if (string != null) break block2;
                if (point != null) break block3;
                this.c.e.q = -1;
                this.c.e.K = -1;
            }
            ((vn_0)this.c.e).repaint();
        }
    }
}

