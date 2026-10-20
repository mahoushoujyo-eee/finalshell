/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Renamed from gv
 */
class gv_0
implements DocumentListener {
    final vc_0 d;

    gv_0(vc_0 vc_02) {
        this.d = vc_02;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        try {
            this.d.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        try {
            this.d.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        try {
            this.d.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

