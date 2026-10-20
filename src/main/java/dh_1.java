/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Renamed from dH
 */
class dh_1
implements DocumentListener {
    final FK X;

    dh_1(FK fK2) {
        this.X = fK2;
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        try {
            this.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        try {
            this.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        try {
            this.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void T() {
        try {
            this.X.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

