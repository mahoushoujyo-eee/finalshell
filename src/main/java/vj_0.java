/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vj
 */
class vj_0
implements ActionListener {
    final aj_0 E;
    private static final String a;

    vj_0(aj_0 aj_02) {
        this.E = aj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block58: {
            String string;
            t3_0 t3_02;
            CT cT;
            Object object;
            F8 f82;
            lv_2 lv_22;
            _y_0 _y_02;
            U u10;
            block62: {
                _y_0 _y_03;
                _y_0 _y_04;
                block66: {
                    boolean bl;
                    block64: {
                        String[] stringArray;
                        block65: {
                            _y_0 _y_05;
                            _y_0 _y_06;
                            block63: {
                                F8 f83;
                                block61: {
                                    aM aM2;
                                    block60: {
                                        block59: {
                                            t3_0 t3_03;
                                            aM aM3;
                                            lv_2 lv_23;
                                            Object object2;
                                            Object object3;
                                            String string2;
                                            _y_0 _y_07;
                                            U u11;
                                            Object object4;
                                            Object object5;
                                            Object object6;
                                            yt_1 yt_12;
                                            stringArray = KV.b();
                                            try {
                                                yt_12 = (yt_1)yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray == null) {
                                                boolean bl2;
                                                Object object7;
                                                try {
                                                    object7 = yt_12.P();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    bl2 = (Boolean)object7.v();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (!bl2) {
                                                    try {
                                                        yt_12 = (yt_1)yt_1.i();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                }
                                            } else {
                                                try {
                                                    yt_12.g();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                return;
                                            }
                                            if ((KV)this.E.k == null) break block58;
                                            try {
                                                object6 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object5 = object6.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object4 = object5.G();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                u11 = (U)object4.D();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            u10 = u11;
                                            try {
                                                _y_07 = (_y_0)u10.n();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            _y_02 = _y_07;
                                            if (u10 == null || (string2 = (String)this.E.l) == null) break block58;
                                            try {
                                                object3 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object2 = object3.g();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                lv_23 = (lv_2)object2.S(string2);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            lv_22 = lv_23;
                                            if (lv_22 == null) break block58;
                                            try {
                                                aM3 = (aM)u10.o();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            aM2 = aM3;
                                            try {
                                                t3_03 = (t3_0)aM2.w(string2);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            t3_0 t3_04 = t3_03;
                                            if (stringArray != null) break block59;
                                            if (t3_04 != null) {
                                                try {
                                                    aM2.X(t3_04);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            break block60;
                                        }
                                        if (stringArray == null) break block58;
                                    }
                                    f83 = _y_02;
                                    if (stringArray != null) break block61;
                                    if (f83 == null) {
                                        Object object8;
                                        try {
                                            object8 = aM2.Q();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            f83 = (F8)object8.P();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                    }
                                    break block62;
                                }
                                _y_06 = f82 = f83;
                                if (stringArray != null) break block63;
                                if (_y_06 == null) break block62;
                                _y_06 = f82;
                            }
                            bl = _y_06.getClass().equals(CT.class);
                            if (stringArray != null) break block64;
                            if (!bl) break block65;
                            object = (CT)f82;
                            try {
                                _y_05 = (_y_0)object.t();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            _y_02 = _y_05;
                            if (stringArray == null) break block62;
                        }
                        _y_04 = f82;
                        if (stringArray != null) break block66;
                        bl = _y_04.getClass().equals(CE.class);
                    }
                    if (!bl) break block62;
                    _y_04 = f82;
                }
                object = (CE)((Object)_y_04);
                try {
                    _y_03 = (_y_0)object.t();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                _y_02 = _y_03;
            }
            try {
                cT = (CT)u10.Y(_y_02);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            f82 = cT;
            try {
                t3_02 = (t3_0)f82.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            object = t3_02;
            try {
                string = (String)lv_22.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.I(a + string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.e();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u8f9c\u7a2f1".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 105;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 46;
                            break;
                        }
                        case 1: {
                            n17 = 77;
                            break;
                        }
                        case 2: {
                            n17 = 117;
                            break;
                        }
                        case 3: {
                            n17 = 85;
                            break;
                        }
                        case 4: {
                            n17 = 78;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 92;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

