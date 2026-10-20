/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class g2
implements ActionListener {
    final aj_0 F;
    private static final String a;

    g2(aj_0 aj_02) {
        this.F = aj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block60: {
            Object object;
            F8 f82;
            _y_0 _y_02;
            lv_2 lv_22;
            String string;
            _y_0 _y_03;
            U u10;
            block63: {
                block64: {
                    _y_0 _y_04;
                    F8 f83;
                    block68: {
                        boolean bl;
                        block66: {
                            String[] stringArray;
                            block67: {
                                _y_0 _y_05;
                                F8 f84;
                                block65: {
                                    F8 f85;
                                    Object object2;
                                    aM aM2;
                                    block62: {
                                        block61: {
                                            t3_0 t3_02;
                                            aM aM3;
                                            lv_2 lv_23;
                                            Object object3;
                                            Object object4;
                                            _y_0 _y_06;
                                            U u11;
                                            Object object5;
                                            Object object6;
                                            Object object7;
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
                                                Object object8;
                                                try {
                                                    object8 = yt_12.P();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    bl2 = (Boolean)object8.v();
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
                                            if ((KV)this.F.k == null) break block60;
                                            try {
                                                object7 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object6 = object7.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object5 = object6.G();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                u11 = (U)object5.D();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            u10 = u11;
                                            try {
                                                _y_06 = (_y_0)u10.n();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            _y_03 = _y_06;
                                            if (u10 == null || (string = (String)this.F.l) == null) break block60;
                                            try {
                                                object4 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object3 = object4.g();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                lv_23 = (lv_2)object3.S(string);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            lv_22 = lv_23;
                                            if (lv_22 == null) break block60;
                                            try {
                                                aM3 = (aM)u10.o();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            aM2 = aM3;
                                            try {
                                                t3_02 = (t3_0)aM2.q(string);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            t3_0 t3_03 = t3_02;
                                            if (stringArray != null) break block61;
                                            if (t3_03 != null) {
                                                try {
                                                    aM2.X(t3_03);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            break block62;
                                        }
                                        if (stringArray == null) break block60;
                                    }
                                    _y_02 = _y_03;
                                    if (stringArray != null) break block63;
                                    if (_y_02 != null) break block64;
                                    try {
                                        object2 = aM2.Q();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        f85 = (F8)object2.P();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    f84 = f82 = f85;
                                    if (stringArray != null) break block65;
                                    if (f84 == null) break block64;
                                    f84 = f82;
                                }
                                bl = f84.getClass().equals(CT.class);
                                if (stringArray != null) break block66;
                                if (!bl) break block67;
                                object = (CT)f82;
                                try {
                                    _y_05 = (_y_0)object.t();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                _y_03 = _y_05;
                                if (stringArray == null) break block64;
                            }
                            f83 = f82;
                            if (stringArray != null) break block68;
                            bl = f83.getClass().equals(CE.class);
                        }
                        if (!bl) break block64;
                        f83 = f82;
                    }
                    object = (CE)f83;
                    try {
                        _y_04 = (_y_0)object.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    _y_03 = _y_04;
                }
                _y_02 = _y_03;
            }
            if (_y_02 != null) {
                String string2;
                t3_0 t3_04;
                CE cE;
                try {
                    cE = (CE)u10.q((Object)string, (Object)_y_03);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                f82 = cE;
                try {
                    t3_04 = (t3_0)f82.X();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                object = t3_04;
                try {
                    string2 = (String)lv_22.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.I(a + string2);
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
                try {
                    _y_03.M().d(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
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
                char[] cArray3 = "\u7f74\u7e8bP".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 42;
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
                            n17 = 15;
                            break;
                        }
                        case 1: {
                            n17 = 125;
                            break;
                        }
                        case 2: {
                            n17 = 87;
                            break;
                        }
                        case 3: {
                            n17 = 71;
                            break;
                        }
                        case 4: {
                            n17 = 55;
                            break;
                        }
                        case 5: {
                            n17 = 69;
                            break;
                        }
                        default: {
                            n17 = 89;
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

