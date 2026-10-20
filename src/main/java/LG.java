/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

class LG
implements KeyListener {
    final xl_0 s;
    private static final long a;

    LG(xl_0 xl_02) {
        this.s = xl_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == (int)a) {
            String string = ((JTextField)this.s.C).getText().trim();
            ((JTextField)this.s.C).setCaretPosition(((JTextField)this.s.C).getDocument().getLength());
            try {
                yt_1.F.J(new m1(this, string));
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
        long l2 = 8164457927423876175L;
        a = 0xC25E5BD253B8DC45L ^ l2;
    }
}

