/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

class BV
implements KeyListener {
    final F6 n;
    private static final long a;

    BV(F6 f62) {
        this.n = f62;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        boolean bl = F6.i();
        if (keyEvent.getKeyCode() == (int)a) {
            String string;
            block6: {
                string = ((dv_0)this.n.J).getText().trim();
                boolean bl2 = false;
                while (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                    bl2 = true;
                    if (bl) {
                        if (bl) continue;
                    }
                    break block6;
                }
                if (bl2) {
                    ((dv_0)this.n.J).setText(string);
                }
            }
            String string2 = string;
            ((dv_0)this.n.J).setCaretPosition(((dv_0)this.n.J).getDocument().getLength());
            try {
                yt_1.F.J(new dr_0(this, string2));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8841734958257816143L;
        a = 0xCA946F2B591C4245L ^ l2;
    }
}

