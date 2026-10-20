/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nh_1;
import com.rt_2;
import java.awt.Component;
import java.lang.reflect.Constructor;
import javax.swing.JTable;

/*
 * Renamed from com.rq
 */
public class rq_2
extends rt_2 {
    private final Class[] Y = new Class[]{String.class};
    private Constructor k;
    private Object p;
    private static int[] D;
    private static final String b;

    public rq_2() {
        super(new nh_1());
        this.l().setName(b);
    }

    @Override
    public boolean stopCellEditing() {
        Component component = this.l();
        try {
            this.p = this.k.newInstance(super.getCellEditorValue());
            this.q(component, true);
            return super.stopCellEditing();
        }
        catch (Exception exception) {
            this.q(component, false);
            return false;
        }
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n10, int n11) {
        Object object2;
        block4: {
            this.p = null;
            int[] nArray = rq_2.G();
            try {
                block5: {
                    object2 = jTable.getColumnClass(n11);
                    try {
                        if (nArray == null) break block4;
                        if (object2 != Object.class) break block5;
                    }
                    catch (Exception exception) {
                        throw rq_2.a(exception);
                    }
                    object2 = String.class;
                }
                this.k = ((Class)object2).getConstructor(this.Y);
            }
            catch (Exception exception) {
                return null;
            }
        }
        object2 = super.getTableCellEditorComponent(jTable, object, bl, n10, n11);
        this.q((Component)object2, true);
        return object2;
    }

    private void q(Component component, boolean bl) {
        block5: {
            Component component2;
            int[] nArray;
            block4: {
                nArray = rq_2.G();
                component2 = component;
                if (nArray == null) break block4;
                if (!(component2 instanceof nh_1)) break block5;
                component2 = component;
            }
            nh_1 nh_12 = (nh_1)component2;
            boolean bl2 = bl;
            if (nArray != null) {
                bl2 = !bl2;
            }
            nh_12.s(bl2);
        }
    }

    @Override
    public Object getCellEditorValue() {
        return this.p;
    }

    public static void O(int[] nArray) {
        D = nArray;
    }

    public static int[] G() {
        return D;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (rq_2.G() == null) {
                    rq_2.O(new int[3]);
                }
                char[] cArray3 = "\u0002\u0016)A#(\u00052\u001e?B4".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 7;
                            break;
                        }
                        case 1: {
                            n17 = 38;
                            break;
                        }
                        case 2: {
                            n17 = 26;
                            break;
                        }
                        case 3: {
                            n17 = 124;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 87;
                            break;
                        }
                        default: {
                            n17 = 49;
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
        b = new String(cArray).intern();
    }
}

