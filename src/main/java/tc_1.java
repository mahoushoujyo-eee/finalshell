/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tC
 */
class tc_1
implements FocusListener {
    final TM O;

    tc_1(TM tM) {
        this.O = tM;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        Object object;
        try {
            object = this.O.J.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.r(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        ((aJ)this.O.T).stopEditing();
    }
}

