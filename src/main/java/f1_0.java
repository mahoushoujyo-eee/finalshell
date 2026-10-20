/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Renamed from f1
 */
public class f1_0
extends DefaultTableCellRenderer {
    Border e;
    SimpleDateFormat r;
    cu_1 W;
    boolean M;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    f1_0(boolean bl) {
        this.e = BorderFactory.createEmptyBorder(0, f1_0.a(27908, 845788551031903414L), 2, 4);
        this.r = new SimpleDateFormat(a);
        this.W = new cu_1();
        this.M = bl;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean n10, boolean bl, int n11, int n12) {
        cu_1 cu_12;
        block150: {
            block151: {
                block152: {
                    int n13;
                    boolean bl2;
                    block148: {
                        block149: {
                            block147: {
                                cu_1 cu_13;
                                block145: {
                                    block146: {
                                        li_1 li_12;
                                        block106: {
                                            String string;
                                            block111: {
                                                String string2;
                                                block144: {
                                                    String string3;
                                                    boolean bl3;
                                                    block143: {
                                                        String string4;
                                                        block142: {
                                                            block140: {
                                                                block141: {
                                                                    String string5;
                                                                    String string6;
                                                                    String string7;
                                                                    int n14;
                                                                    String string8;
                                                                    String string9;
                                                                    int n15;
                                                                    u8_0 u8_02;
                                                                    block138: {
                                                                        int n16;
                                                                        block139: {
                                                                            String string10;
                                                                            float f10;
                                                                            block136: {
                                                                                block137: {
                                                                                    String string11;
                                                                                    block129: {
                                                                                        block130: {
                                                                                            block135: {
                                                                                                String string12;
                                                                                                boolean bl4;
                                                                                                String string13;
                                                                                                block134: {
                                                                                                    String string14;
                                                                                                    block133: {
                                                                                                        block131: {
                                                                                                            block132: {
                                                                                                                String string15;
                                                                                                                String string16;
                                                                                                                String string17;
                                                                                                                block127: {
                                                                                                                    block128: {
                                                                                                                        int n17;
                                                                                                                        block107: {
                                                                                                                            block108: {
                                                                                                                                String string18;
                                                                                                                                block126: {
                                                                                                                                    u8_0 u8_03;
                                                                                                                                    block125: {
                                                                                                                                        int n18;
                                                                                                                                        int n19;
                                                                                                                                        block118: {
                                                                                                                                            block119: {
                                                                                                                                                block124: {
                                                                                                                                                    String string19;
                                                                                                                                                    boolean bl5;
                                                                                                                                                    String string20;
                                                                                                                                                    block123: {
                                                                                                                                                        String string21;
                                                                                                                                                        block122: {
                                                                                                                                                            block120: {
                                                                                                                                                                block121: {
                                                                                                                                                                    String string22;
                                                                                                                                                                    String string23;
                                                                                                                                                                    String string24;
                                                                                                                                                                    block116: {
                                                                                                                                                                        block117: {
                                                                                                                                                                            String string25;
                                                                                                                                                                            float f11;
                                                                                                                                                                            block114: {
                                                                                                                                                                                block115: {
                                                                                                                                                                                    String string26;
                                                                                                                                                                                    long l2;
                                                                                                                                                                                    block112: {
                                                                                                                                                                                        block113: {
                                                                                                                                                                                            String string27;
                                                                                                                                                                                            block109: {
                                                                                                                                                                                                block110: {
                                                                                                                                                                                                    int n20;
                                                                                                                                                                                                    u8_0 u8_04;
                                                                                                                                                                                                    Object object2;
                                                                                                                                                                                                    block105: {
                                                                                                                                                                                                        block104: {
                                                                                                                                                                                                            block103: {
                                                                                                                                                                                                                bl2 = uo_0.k();
                                                                                                                                                                                                                if (!bl2) break block103;
                                                                                                                                                                                                                if (object != null) break block104;
                                                                                                                                                                                                                ((cu_1)this.W).setText("");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return (cu_1)this.W;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        cu_12 = (cu_1)this.W;
                                                                                                                                                                                                        Object var9_9 = null;
                                                                                                                                                                                                        Object var10_10 = null;
                                                                                                                                                                                                        int n21 = 2;
                                                                                                                                                                                                        boolean bl6 = false;
                                                                                                                                                                                                        uo_0 uo_02 = (uo_0)jTable;
                                                                                                                                                                                                        n16 = jTable.convertColumnIndexToModel(n12);
                                                                                                                                                                                                        cu_12.setAlignmentX(n21);
                                                                                                                                                                                                        cu_12.setHorizontalAlignment(2);
                                                                                                                                                                                                        li_12 = null;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            cu_12.w(false);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            cu_12.Z(false);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            cu_12.L(false);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            cu_12.i(li_12);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        object2 = object.getClass();
                                                                                                                                                                                                        if (!bl2) break block105;
                                                                                                                                                                                                        if (!object2.equals(li_1.class)) break block106;
                                                                                                                                                                                                        object2 = object;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    li_12 = (li_1)object2;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        u8_04 = (u8_0)li_12.P();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    u8_02 = u8_04;
                                                                                                                                                                                                    string = "";
                                                                                                                                                                                                    n15 = this.M;
                                                                                                                                                                                                    if (!bl2) break block107;
                                                                                                                                                                                                    if (n15 != 0) break block108;
                                                                                                                                                                                                    n19 = n16;
                                                                                                                                                                                                    if (!bl2) break block109;
                                                                                                                                                                                                    if (n19 != 0) break block110;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        n20 = (Integer)li_12.m();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    string = n20 + "";
                                                                                                                                                                                                    if (bl2) break block111;
                                                                                                                                                                                                }
                                                                                                                                                                                                n19 = n16;
                                                                                                                                                                                            }
                                                                                                                                                                                            n18 = 1;
                                                                                                                                                                                            if (!bl2) break block112;
                                                                                                                                                                                            if (n19 != n18) break block113;
                                                                                                                                                                                            try {
                                                                                                                                                                                                string27 = (String)li_12.y();
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                                throw invocationTargetException.getTargetException();
                                                                                                                                                                                            }
                                                                                                                                                                                            string = string27;
                                                                                                                                                                                            if (bl2) break block111;
                                                                                                                                                                                        }
                                                                                                                                                                                        n19 = n16;
                                                                                                                                                                                        n18 = 2;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!bl2) break block114;
                                                                                                                                                                                    if (n19 != n18) break block115;
                                                                                                                                                                                    try {
                                                                                                                                                                                        l2 = (Long)li_12.c();
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        string26 = (String)lk_0.h(l2);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                                    }
                                                                                                                                                                                    string = string26 + " ";
                                                                                                                                                                                    try {
                                                                                                                                                                                        cu_12.Z(true);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                                    }
                                                                                                                                                                                    cu_12.setHorizontalAlignment(4);
                                                                                                                                                                                    if (bl2) break block111;
                                                                                                                                                                                }
                                                                                                                                                                                n19 = n16;
                                                                                                                                                                                n18 = 3;
                                                                                                                                                                            }
                                                                                                                                                                            if (!bl2) break block116;
                                                                                                                                                                            if (n19 != n18) break block117;
                                                                                                                                                                            try {
                                                                                                                                                                                f11 = ((Float)li_12.r()).floatValue();
                                                                                                                                                                            }
                                                                                                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                throw invocationTargetException.getTargetException();
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                string25 = (String)lk_0.k(f11);
                                                                                                                                                                            }
                                                                                                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                throw invocationTargetException.getTargetException();
                                                                                                                                                                            }
                                                                                                                                                                            string = string25 + "";
                                                                                                                                                                            try {
                                                                                                                                                                                cu_12.w(true);
                                                                                                                                                                            }
                                                                                                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                                throw invocationTargetException.getTargetException();
                                                                                                                                                                            }
                                                                                                                                                                            cu_12.setHorizontalAlignment(4);
                                                                                                                                                                            if (bl2) break block111;
                                                                                                                                                                        }
                                                                                                                                                                        n19 = n16;
                                                                                                                                                                        n18 = 4;
                                                                                                                                                                    }
                                                                                                                                                                    if (!bl2) break block118;
                                                                                                                                                                    if (n19 != n18) break block119;
                                                                                                                                                                    try {
                                                                                                                                                                        string24 = (String)li_12.B();
                                                                                                                                                                    }
                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                    }
                                                                                                                                                                    string = string24;
                                                                                                                                                                    if (!bl2) break block120;
                                                                                                                                                                    if (u8_02 == null) break block121;
                                                                                                                                                                    try {
                                                                                                                                                                        string23 = (String)u8_02.q();
                                                                                                                                                                    }
                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                    }
                                                                                                                                                                    string20 = string9 = string23;
                                                                                                                                                                    if (!bl2) break block122;
                                                                                                                                                                    if (string20 == null) break block121;
                                                                                                                                                                    string = string9.trim();
                                                                                                                                                                    try {
                                                                                                                                                                        string22 = (String)u8_02.M();
                                                                                                                                                                    }
                                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                                    }
                                                                                                                                                                    string20 = string8 = string22;
                                                                                                                                                                    if (!bl2) break block122;
                                                                                                                                                                    if (string20 == null) break block121;
                                                                                                                                                                    bl5 = string8.equals("");
                                                                                                                                                                    if (!bl2) break block123;
                                                                                                                                                                    if (bl5) break block121;
                                                                                                                                                                    bl5 = string.startsWith(string8);
                                                                                                                                                                    if (!bl2) break block123;
                                                                                                                                                                    if (bl5) {
                                                                                                                                                                        String string28;
                                                                                                                                                                        try {
                                                                                                                                                                            string28 = (String)li_12.B();
                                                                                                                                                                        }
                                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                                        }
                                                                                                                                                                        string = string28 + " " + string.substring(string8.length());
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                string = string.trim();
                                                                                                                                                            }
                                                                                                                                                            string20 = string;
                                                                                                                                                        }
                                                                                                                                                        if (!bl2) break block124;
                                                                                                                                                        try {
                                                                                                                                                            string21 = (String)li_12.B();
                                                                                                                                                        }
                                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                                        }
                                                                                                                                                        bl5 = string20.equals(string21);
                                                                                                                                                    }
                                                                                                                                                    if (bl5) break block111;
                                                                                                                                                    try {
                                                                                                                                                        string19 = (String)li_12.B();
                                                                                                                                                    }
                                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                                    }
                                                                                                                                                    string20 = string = string19 + "\u250b" + string;
                                                                                                                                                }
                                                                                                                                                if (bl2) break block111;
                                                                                                                                            }
                                                                                                                                            n19 = n16;
                                                                                                                                            n18 = 5;
                                                                                                                                        }
                                                                                                                                        if (n19 != n18) break block111;
                                                                                                                                        u8_03 = u8_02;
                                                                                                                                        if (!bl2) break block125;
                                                                                                                                        if (u8_03 == null) break block111;
                                                                                                                                        u8_03 = u8_02;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        string18 = (String)u8_03.M();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    if (!bl2) break block126;
                                                                                                                                    if (string18 != null) {
                                                                                                                                        try {
                                                                                                                                            string18 = (String)u8_02.M();
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break block111;
                                                                                                                                }
                                                                                                                                string = string18;
                                                                                                                                if (bl2) break block111;
                                                                                                                            }
                                                                                                                            n15 = n16;
                                                                                                                        }
                                                                                                                        if (!bl2) break block127;
                                                                                                                        if (n15 != 0) break block128;
                                                                                                                        try {
                                                                                                                            n17 = (Integer)li_12.m();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                        }
                                                                                                                        string = n17 + "";
                                                                                                                        if (bl2) break block111;
                                                                                                                    }
                                                                                                                    n15 = n16;
                                                                                                                }
                                                                                                                n14 = 1;
                                                                                                                if (!bl2) break block129;
                                                                                                                if (n15 != n14) break block130;
                                                                                                                try {
                                                                                                                    string17 = (String)li_12.B();
                                                                                                                }
                                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                                }
                                                                                                                string = string17;
                                                                                                                if (!bl2) break block131;
                                                                                                                if (u8_02 == null) break block132;
                                                                                                                try {
                                                                                                                    string16 = (String)u8_02.q();
                                                                                                                }
                                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                                }
                                                                                                                string13 = string9 = string16;
                                                                                                                if (!bl2) break block133;
                                                                                                                if (string13 == null) break block132;
                                                                                                                string = string9.trim();
                                                                                                                try {
                                                                                                                    string15 = (String)u8_02.M();
                                                                                                                }
                                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                                }
                                                                                                                string13 = string8 = string15;
                                                                                                                if (!bl2) break block133;
                                                                                                                if (string13 == null) break block132;
                                                                                                                bl4 = string8.equals("");
                                                                                                                if (!bl2) break block134;
                                                                                                                if (bl4) break block132;
                                                                                                                bl4 = string.startsWith(string8);
                                                                                                                if (!bl2) break block134;
                                                                                                                if (bl4) {
                                                                                                                    String string29;
                                                                                                                    try {
                                                                                                                        string29 = (String)li_12.B();
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                    }
                                                                                                                    string = string29 + " " + string.substring(string8.length());
                                                                                                                }
                                                                                                            }
                                                                                                            string = string.trim();
                                                                                                        }
                                                                                                        string13 = string;
                                                                                                    }
                                                                                                    if (!bl2) break block135;
                                                                                                    try {
                                                                                                        string14 = (String)li_12.B();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    bl4 = string13.equals(string14);
                                                                                                }
                                                                                                if (bl4) break block111;
                                                                                                try {
                                                                                                    string12 = (String)li_12.B();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                string13 = string = string12 + "\u250b" + string;
                                                                                            }
                                                                                            if (bl2) break block111;
                                                                                        }
                                                                                        n15 = n16;
                                                                                        n14 = 2;
                                                                                    }
                                                                                    if (!bl2) break block136;
                                                                                    if (n15 != n14) break block137;
                                                                                    try {
                                                                                        string11 = (String)li_12.R();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    string = string11;
                                                                                    try {
                                                                                        cu_12.Z(true);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    cu_12.setHorizontalAlignment(4);
                                                                                    if (bl2) break block111;
                                                                                }
                                                                                n15 = n16;
                                                                                n14 = 3;
                                                                            }
                                                                            if (!bl2) break block138;
                                                                            if (n15 != n14) break block139;
                                                                            try {
                                                                                f10 = ((Float)li_12.r()).floatValue();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            try {
                                                                                string10 = (String)lk_0.k(f10);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            string = string10 + "";
                                                                            try {
                                                                                cu_12.w(true);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            cu_12.setHorizontalAlignment(4);
                                                                            if (bl2) break block111;
                                                                        }
                                                                        n15 = n16;
                                                                        n14 = 4;
                                                                    }
                                                                    if (n15 != n14) break block111;
                                                                    try {
                                                                        string7 = (String)li_12.B();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    string = string7;
                                                                    if (!bl2) break block140;
                                                                    if (u8_02 == null) break block141;
                                                                    try {
                                                                        string6 = (String)u8_02.q();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    string2 = string9 = string6;
                                                                    if (!bl2) break block142;
                                                                    if (string2 == null) break block141;
                                                                    string = string9.trim();
                                                                    try {
                                                                        string5 = (String)u8_02.M();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    string2 = string8 = string5;
                                                                    if (!bl2) break block142;
                                                                    if (string2 == null) break block141;
                                                                    bl3 = string8.equals("");
                                                                    if (!bl2) break block143;
                                                                    if (bl3) break block141;
                                                                    bl3 = string.startsWith(string8);
                                                                    if (!bl2) break block143;
                                                                    if (bl3) {
                                                                        String string30;
                                                                        try {
                                                                            string30 = (String)li_12.B();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        string = string30 + " " + string.substring(string8.length());
                                                                    }
                                                                }
                                                                string = string.trim();
                                                            }
                                                            string2 = string;
                                                        }
                                                        if (!bl2) break block144;
                                                        try {
                                                            string4 = (String)li_12.B();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        bl3 = string2.equals(string4);
                                                    }
                                                    if (bl3) break block111;
                                                    try {
                                                        string3 = (String)li_12.B();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    string2 = string3 + "\u250b" + string;
                                                }
                                                string = string2;
                                            }
                                            cu_12.setText(string);
                                        }
                                        cu_12.setBorder((Border)this.e);
                                        cu_13 = cu_12;
                                        if (!bl2) break block145;
                                        try {
                                            cu_13.n(li_12);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (n12 != 1) break block146;
                                        try {
                                            cu_12.x(true);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (bl2) break block147;
                                    }
                                    cu_13 = cu_12;
                                }
                                try {
                                    cu_13.x(false);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            n13 = n10;
                            if (!bl2) break block148;
                            if (n13 == 0) break block149;
                            cu_12.setBackground((Color)fx_2.E);
                            cu_12.setForeground((Color)fx_2.o);
                            cu_12.setOpaque(true);
                            if (bl2) break block150;
                        }
                        n13 = n11 % 2;
                    }
                    int n22 = n13;
                    cu_12.setForeground(new Color(f1_0.a(7118, 7348843612794724985L), f1_0.a(996, 8567518723189979728L), f1_0.a(996, 8567518723189979728L)));
                    if (!bl2) break block151;
                    if (n22 != 0) break block152;
                    cu_12.setOpaque(false);
                    if (bl2) break block150;
                }
                cu_12.setOpaque(true);
            }
            cu_12.setBackground(new Color(f1_0.a(4667, 8230845895931210632L), f1_0.a(7334, 5591307223923270928L), f1_0.a(7334, 5591307223923270928L), f1_0.a(3494, 2046706939004171283L)));
        }
        return cu_12;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "}@ W\ts\u0013+]=\u000envdiT".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 86;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 82;
                                break;
                            }
                            case 1: {
                                v9 = 111;
                                break;
                            }
                            case 2: {
                                v9 = 15;
                                break;
                            }
                            case 3: {
                                v9 = 120;
                                break;
                            }
                            case 4: {
                                v9 = 112;
                                break;
                            }
                            case 5: {
                                v9 = 104;
                                break;
                            }
                            default: {
                                v9 = 8;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                f1_0.a = new String(v10).intern();
                var0_1 = 150113868117163652L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u00cd\fu\u0097\u00f2|\u009c\u00cf\u0018\u00c4\u0014\u000bX\u00fe\u001b\u00f0\u00d4\"GarP\n\u009d#\u00bd\u0011h^\u00c4\u0084\u00e6";
                var5_5 = "\u00cd\fu\u0097\u00f2|\u009c\u00cf\u0018\u00c4\u0014\u000bX\u00fe\u001b\u00f0\u00d4\"GarP\n\u009d#\u00bd\u0011h^\u00c4\u0084\u00e6".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00e8DU\u0000K\r\u0095h\u00bf\u0012e\u008f3\u00a2\u00ea:";
                    var5_5 = "\u00e8DU\u0000K\r\u0095h\u00bf\u0012e\u008f3\u00a2\u00ea:".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        f1_0.b = var6_2;
        f1_0.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x39B7;
        if (c[n11] == null) {
            f1_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

