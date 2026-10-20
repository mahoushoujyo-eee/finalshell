/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class JS
implements Comparator {
    final Comparator p;
    final O8 S;
    final om_0 k;
    String q;
    final String J;
    final uo_0 H;

    JS(uo_0 uo_02, String string) {
        this.H = uo_02;
        this.J = string;
        this.p = Collator.getInstance(Locale.CHINA);
        this.S = new O8();
        this.k = new om_0();
        this.q = this.J;
    }

    public int d(li_1 li_12, li_1 li_13) {
        int n10;
        block62: {
            block63: {
                String string;
                String string2;
                block68: {
                    String string3;
                    u8_0 u8_02;
                    u8_0 u8_03;
                    boolean bl;
                    block67: {
                        u8_0 u8_04;
                        String string4;
                        block66: {
                            block65: {
                                u8_0 u8_05;
                                u8_0 u8_06;
                                block64: {
                                    u8_0 u8_07;
                                    block60: {
                                        block61: {
                                            int n11;
                                            block58: {
                                                String string5;
                                                String string6;
                                                block59: {
                                                    bl = uo_0.k();
                                                    n11 = ((String)this.q).equals((String)gk_0.j);
                                                    if (!bl) break block58;
                                                    if (n11 != 0) break block59;
                                                    n10 = ((String)this.q).equals((String)gk_0.a);
                                                    if (!bl) break block60;
                                                    if (n10 == 0) break block61;
                                                }
                                                try {
                                                    string6 = (String)li_12.B();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    string5 = (String)li_13.B();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                n11 = ((Comparator)this.p).compare(string6, string5);
                                            }
                                            return n11;
                                        }
                                        n10 = ((String)this.q).equals((String)gk_0.i) ? 1 : 0;
                                    }
                                    if (bl) {
                                        if (n10 != 0) {
                                            String string7;
                                            String string8;
                                            try {
                                                string8 = (String)li_12.y();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                string7 = (String)li_13.y();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            return ((Comparator)this.p).compare(string8, string7);
                                        }
                                        n10 = ((String)this.q).equals((String)gk_0.t) ? 1 : 0;
                                    }
                                    if (bl) {
                                        if (n10 != 0) {
                                            int n12;
                                            int n13;
                                            int n14;
                                            try {
                                                n14 = (Integer)li_12.m();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                n13 = (Integer)li_13.m();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                n12 = (Integer)this.k.x((Object)n14, (Object)n13);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            return n12;
                                        }
                                        n10 = ((String)this.q).equals((String)gk_0.s) ? 1 : 0;
                                    }
                                    if (bl) {
                                        if (n10 != 0) {
                                            int n15;
                                            long l2;
                                            long l3;
                                            try {
                                                l3 = (Long)li_12.c();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                l2 = (Long)li_13.c();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                n15 = (Integer)this.S.t((Object)l3, (Object)l2);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            return n15;
                                        }
                                        n10 = ((String)this.q).equals((String)gk_0.P) ? 1 : 0;
                                    }
                                    if (bl) {
                                        if (n10 != 0) {
                                            int n16;
                                            float f10;
                                            float f11;
                                            try {
                                                f11 = ((Float)li_12.r()).floatValue();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                f10 = ((Float)li_13.r()).floatValue();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                n16 = (Integer)this.k.V((Object)Float.valueOf(f11), (Object)Float.valueOf(f10));
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            return n16;
                                        }
                                        n10 = ((String)this.q).equals((String)gk_0.S) ? 1 : 0;
                                    }
                                    if (!bl) break block62;
                                    if (n10 == 0) break block63;
                                    string2 = "";
                                    try {
                                        u8_07 = (u8_0)li_12.P();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    u8_05 = u8_06 = u8_07;
                                    if (!bl) break block64;
                                    if (u8_05 == null) break block65;
                                    u8_05 = u8_06;
                                }
                                try {
                                    string4 = (String)u8_05.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (!bl) break block66;
                                if (string4 != null) {
                                    String string9;
                                    try {
                                        string9 = (String)u8_06.M();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    string2 = string9;
                                }
                            }
                            string4 = "";
                        }
                        string = string4;
                        try {
                            u8_04 = (u8_0)li_13.P();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        u8_02 = u8_03 = u8_04;
                        if (!bl) break block67;
                        if (u8_02 == null) break block68;
                        u8_02 = u8_03;
                    }
                    try {
                        string3 = (String)u8_02.M();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) {
                        if (string3 != null) {
                            try {
                                string3 = (String)u8_03.M();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                    } else {
                        string = string3;
                    }
                }
                return ((Comparator)this.p).compare(string2, string);
            }
            n10 = 1;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.d((Object)((li_1)object), (Object)((li_1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

