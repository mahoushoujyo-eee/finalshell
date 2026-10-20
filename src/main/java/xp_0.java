/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Renamed from xp
 */
class xp_0
implements KeyListener {
    final KC E;
    private static final long a;

    xp_0(KC kC) {
        this.E = kC;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int[] nArray = a3.I();
        int n10 = keyEvent.getKeyCode();
        if (nArray != null && n10 == (int)a) {
            n10 = ((KC)this.E).stopCellEditing() ? 1 : 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4943179860027291373L;
        a = 0xD993E46781CAB6E7L ^ l2;
    }
}

