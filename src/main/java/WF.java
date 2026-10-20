/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

class WF
implements ItemListener {
    final zd_0 W;

    WF(zd_0 zd_02) {
        this.W = zd_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getStateChange() == 1) {
            try {
                this.W.I();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

