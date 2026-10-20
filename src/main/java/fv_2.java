/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fv
 */
class fv_2
implements ItemListener {
    final yu_1 q;

    fv_2(yu_1 yu_12) {
        this.q = yu_12;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        try {
            this.q.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

