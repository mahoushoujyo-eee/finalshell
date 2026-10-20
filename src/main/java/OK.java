/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

class OK
implements KeyListener {
    final o2_0 R;

    OK(o2_0 o2_02) {
        this.R = o2_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        String string;
        this.R.a = KeyStroke.getKeyStrokeForEvent(keyEvent);
        try {
            string = (String)xK.P(this.R.a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JTextField)this.R.d).setText(string);
    }
}

