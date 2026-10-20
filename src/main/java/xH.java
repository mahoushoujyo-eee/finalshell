/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class xH
implements DocumentListener {
    final nj_0 Q;

    xH(nj_0 nj_02) {
        this.Q = nj_02;
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        try {
            this.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        try {
            this.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        try {
            this.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void Y() {
        try {
            this.Q.c();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

