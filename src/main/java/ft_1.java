/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fT
 */
class ft_1
implements WindowFocusListener {
    final ta_2 q;

    ft_1(ta_2 ta_22) {
        this.q = ta_22;
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        block5: {
            FF fF2;
            block4: {
                int[] nArray = ta_2.m();
                fF2 = (FF)this.q.K;
                if (nArray != null) break block4;
                if (fF2 == null) break block5;
                fF2 = (FF)this.q.K;
            }
            try {
                fF2.y();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

