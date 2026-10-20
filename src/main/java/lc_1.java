/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from lC
 */
class lc_1
implements MouseListener {
    final y1_0 f;
    private static final long a;

    lc_1(y1_0 y1_02) {
        this.f = y1_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    long l2 = System.currentTimeMillis() - this.f.f;
                    stringArray = F8.y();
                    if (stringArray != null) break block2;
                    if (l2 <= a) break block3;
                    this.f.b = false;
                }
                if (stringArray == null) break block4;
            }
            this.f.b = true;
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7839792761209487226L;
        a = 0x6CCC89FAB491FF80L ^ l2;
    }
}

