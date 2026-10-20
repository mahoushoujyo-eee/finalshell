/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

class Y1
implements KeyListener {
    final p4 Q;
    private static final long a;

    Y1(p4 p42) {
        this.Q = p42;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n10 = keyEvent.getKeyCode();
        if (n10 == (int)a) {
            try {
                this.Q.V();
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
        long l2 = 4344079865247896734L;
        a = 0x44F8C5981C071494L ^ l2;
    }
}

