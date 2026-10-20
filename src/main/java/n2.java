/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.lang.reflect.InvocationTargetException;

class n2
implements AdjustmentListener {
    final og_1 S;
    final FK G;

    n2(FK fK2, og_1 og_12) {
        this.G = fK2;
        this.S = og_12;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        try {
            this.S.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

