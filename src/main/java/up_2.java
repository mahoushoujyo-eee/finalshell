/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

/*
 * Renamed from up
 */
class up_2
implements Runnable {
    final String t;
    final JA j;

    up_2(JA jA, String string) {
        this.j = jA;
        this.t = string;
    }

    @Override
    public void run() {
        ((JTextArea)this.j.Z).append((String)this.t + "\n");
        try {
            this.j.x(this.j.Z);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JTextArea)this.j.Z).setCaretPosition(((JTextArea)this.j.Z).getDocument().getLength());
    }
}

