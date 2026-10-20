/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

class VA
implements KeyListener {
    final gS z;
    private static final long a;

    VA(gS gS2) {
        this.z = gS2;
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
                this.z.h();
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
        long l2 = 817576603889992812L;
        a = 0x518573BBEB888466L ^ l2;
    }
}

