/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import com.ky_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kg
 */
class kg_2
implements ActionListener {
    final C5 e;
    final ka_0 C;

    kg_2(ka_0 ka_02, C5 c5) {
        this.C = ka_02;
        this.e = c5;
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
                ky_2[] ky_2Array;
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
                    ky_2Array = ka_0.N();
                    try {
                        _y_03 = (_y_0)u10.n();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    _y_0 _y_04 = _y_03;
                    if (u10 == null) break block18;
                    _y_02 = _y_04;
                    if (ky_2Array == null) break block19;
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
                if (ky_2Array == null) break block20;
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
            ((C5)this.e).setVisible(false);
        }
    }
}

