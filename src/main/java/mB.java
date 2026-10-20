/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

class mB
implements ItemListener {
    final zb_0 h;

    mB(zb_0 zb_02) {
        this.h = zb_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getStateChange() == 1) {
            try {
                this.h.w();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

