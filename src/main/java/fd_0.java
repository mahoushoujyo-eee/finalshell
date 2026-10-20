/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Fd
 */
class fd_0
implements ItemListener {
    final zM L;

    fd_0(zM zM2) {
        this.L = zM2;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block30: {
            int n10;
            ky_2[] ky_2Array;
            block29: {
                ky_2Array = zM.I();
                int n11 = itemEvent.getStateChange();
                if (ky_2Array == null) break block29;
                if (n11 != 1) break block30;
                n11 = n10 = ((Integer)itemEvent.getItem()).intValue();
            }
            if (ky_2Array != null) {
                int n12;
                Object object;
                Object object2;
                try {
                    object2 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n12 = (Integer)object.U();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (n10 != n12) {
                    Object object3;
                    Object object4;
                    Object object5;
                    try {
                        object5 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = object5.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4.D(n10);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3.S();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                Object object;
                Object object6;
                Object object7;
                try {
                    object7 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object6 = object7.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object6.Y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.L.g(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

