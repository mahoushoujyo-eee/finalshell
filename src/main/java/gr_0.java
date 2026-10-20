/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from gr
 */
class gr_0
implements ActionListener {
    final aj_0 V;

    gr_0(aj_0 aj_02) {
        this.V = aj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block18: {
            String string;
            lv_2 lv_22;
            lv_2 lv_23;
            U u10;
            block20: {
                _y_0 _y_02;
                String[] stringArray;
                block19: {
                    _y_0 _y_03;
                    U u11;
                    Object object;
                    Object object2;
                    Object object3;
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.O();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.G();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        u11 = (U)object.D();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    u10 = u11;
                    try {
                        _y_03 = (_y_0)u10.n();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    _y_0 _y_04 = _y_03;
                    stringArray = KV.b();
                    if (u10 == null) break block18;
                    _y_02 = _y_04;
                    if (stringArray != null) break block19;
                    if (_y_02 != null) {
                        try {
                            _y_02 = (_y_0)u10.n();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block18;
                }
                lv_22 = lv_23 = _y_02.a();
                if (stringArray != null) break block20;
                if (lv_22 == null) break block18;
                lv_22 = lv_23;
            }
            try {
                string = (String)lv_22.v();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string2 = string;
            dl_2 dl_22 = new dl_2(lv_23, u10);
        }
    }
}

