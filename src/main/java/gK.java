/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

class gK
implements MouseMotionListener {
    final aM V;
    final bq_0 Q;
    private static final long a;

    gK(bq_0 bq_02, aM aM2) {
        this.Q = bq_02;
        this.V = aM2;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.Q.g = System.currentTimeMillis();
        try {
            this.Q.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.Q.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block61: {
            Point point;
            block65: {
                int n10;
                int n11;
                block66: {
                    int n12;
                    String[] stringArray;
                    block64: {
                        block62: {
                            block63: {
                                th_1 th_12;
                                int n13;
                                aM aM2;
                                jc_0 jc_02;
                                block56: {
                                    block57: {
                                        block59: {
                                            th_1 th_13;
                                            int n14;
                                            bq_0 bq_02;
                                            block60: {
                                                long l2;
                                                block58: {
                                                    int n15;
                                                    jc_0 jc_03;
                                                    bq_0 bq_03;
                                                    block54: {
                                                        block55: {
                                                            block53: {
                                                                boolean bl;
                                                                block52: {
                                                                    String[] stringArray2 = aM.s();
                                                                    try {
                                                                        this.Q.r();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    stringArray = stringArray2;
                                                                    try {
                                                                        bl = (Boolean)this.V.l();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    if (stringArray != null) break block52;
                                                                    if (!bl) break block53;
                                                                    bq_03 = (bq_0)this.Q;
                                                                    if (stringArray == null) {
                                                                        try {
                                                                            bl = (Boolean)bq_03.g();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                    }
                                                                    break block54;
                                                                }
                                                                if (bl) break block55;
                                                            }
                                                            return;
                                                        }
                                                        bq_03 = (bq_0)this.Q;
                                                    }
                                                    try {
                                                        bq_03.G();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        jc_03 = (jc_0)aM.a();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    jc_02 = jc_03;
                                                    try {
                                                        jc_02.c(true);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        n15 = (Integer)jc_02.V();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    int n16 = n12 = n15;
                                                    if (stringArray == null) {
                                                        if (n16 != jc_0.g) {
                                                            try {
                                                                n16 = ((Boolean)this.V.E()).booleanValue() ? 1 : 0;
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                        }
                                                    } else if (n16 == 0) {
                                                        return;
                                                    }
                                                    point = mouseEvent.getLocationOnScreen();
                                                    int n10 = n12;
                                                    n10 = jc_0.g;
                                                    if (stringArray != null) break block56;
                                                    if (n11 != n10) break block57;
                                                    long l3 = System.currentTimeMillis() - this.Q.M;
                                                    long l2 = l3 - a;
                                                    l2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                                    if (stringArray != null) break block58;
                                                    if (l2 <= 0) break block59;
                                                    bq_02 = (bq_0)this.Q;
                                                    if (stringArray != null) break block60;
                                                    l2 = bq_02.E;
                                                }
                                                if (l2 != true) break block59;
                                                this.Q.C = true;
                                                bq_02 = (bq_0)this.Q;
                                            }
                                            try {
                                                n14 = (Integer)aM.X(this.Q.J, (Object)point, this.V, false);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            bq_02.a = n14;
                                            try {
                                                th_13 = (th_1)this.V.L();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            th_13.setVisible(true);
                                        }
                                        if (stringArray == null) break block61;
                                    }
                                    int n10 = n12;
                                    n10 = jc_0.w;
                                }
                                if (stringArray != null) break block62;
                                if (n11 != n10) break block63;
                                try {
                                    aM2 = (aM)jc_02.c();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                aM aM3 = aM2;
                                try {
                                    n13 = ((Boolean)aM3.E()).booleanValue();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray == null) {
                                    if (n13 == 0) {
                                        return;
                                    }
                                    try {
                                        n13 = (Integer)aM.X(this.Q.J, (Object)point, (Object)aM3, false);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                int n17 = n13;
                                try {
                                    aM3.s(n17);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    th_12 = (th_1)this.V.L();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                th_12.setVisible(true);
                                if (stringArray == null) break block61;
                            }
                            int n10 = n12;
                            n10 = jc_0.S;
                        }
                        if (stringArray != null) break block64;
                        if (n11 == n10) break block65;
                        int n10 = n12;
                        n10 = jc_0.p;
                    }
                    if (stringArray != null) break block66;
                    if (n11 == n10) break block65;
                    int n10 = n12;
                    n10 = jc_0.e;
                }
                if (n11 != n10) break block61;
            }
            try {
                aM.P(this.Q.J, (Object)point, this.V);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8285475901048755521L;
        a = 0x72FBEC6F05121573L ^ l2;
    }
}

