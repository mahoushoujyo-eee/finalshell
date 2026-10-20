/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Renamed from Yp
 */
class yp_0
implements KeyListener {
    final TM a;
    private static final long b;

    yp_0(TM tM) {
        this.a = tM;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        String string = aA.z();
        int n10 = keyEvent.getKeyCode();
        if (string == null && n10 == (int)b) {
            n10 = ((TM)this.a).stopCellEditing() ? 1 : 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1995765593045538617L;
        b = 0x352BA2DD9C6D1733L ^ l2;
    }
}

