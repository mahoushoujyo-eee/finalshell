/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.cw_0;
import com.m.U;
import com.sl_0;
import com.us_0;
import com.wq_2;
import com.zn_0;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;

/*
 * Renamed from com.Yz
 */
public abstract class yz_0
extends TransferHandler {
    protected boolean l = false;
    protected DataFlavor q;
    protected DataFlavor[] e = new DataFlavor[1];
    protected List c;
    protected Map k;
    private static final String a;

    public yz_0() {
        try {
            this.e[0] = this.q = new DataFlavor(a + List.class.getName() + "\"");
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    public boolean e() {
        return this.l;
    }

    public void P(boolean bl) {
        this.l = bl;
    }

    /*
     * Loose catch block
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        cb_1 cb_12;
        JTree.DropLocation dropLocation;
        String[] stringArray;
        block39: {
            boolean bl;
            block38: {
                block49: {
                    block50: {
                        Object object;
                        block36: {
                            TreePath treePath;
                            block37: {
                                TransferHandler.TransferSupport transferSupport2;
                                block35: {
                                    boolean bl2;
                                    block33: {
                                        block34: {
                                            stringArray = cb_1.C();
                                            bl2 = transferSupport.isDrop();
                                            if (stringArray == null) break block33;
                                            try {
                                                block47: {
                                                    if (bl2) break block34;
                                                    break block47;
                                                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                                                        throw yz_0.a(unsupportedFlavorException);
                                                    }
                                                }
                                                return false;
                                            }
                                            catch (UnsupportedFlavorException unsupportedFlavorException) {
                                                throw yz_0.a(unsupportedFlavorException);
                                            }
                                        }
                                        try {
                                            transferSupport2 = transferSupport;
                                            if (stringArray == null) break block35;
                                            bl2 = transferSupport2.isDataFlavorSupported(this.q);
                                        }
                                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                                            throw yz_0.a(unsupportedFlavorException);
                                        }
                                    }
                                    try {
                                        if (!bl2) {
                                            return false;
                                        }
                                    }
                                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                                        throw yz_0.a(unsupportedFlavorException);
                                    }
                                    transferSupport2 = transferSupport;
                                }
                                dropLocation = (JTree.DropLocation)transferSupport2.getDropLocation();
                                treePath = dropLocation.getPath();
                                object = treePath;
                                if (stringArray == null) break block36;
                                try {
                                    block48: {
                                        if (object != null) break block37;
                                        break block48;
                                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                                            throw yz_0.a(unsupportedFlavorException);
                                        }
                                    }
                                    return false;
                                }
                                catch (UnsupportedFlavorException unsupportedFlavorException) {
                                    throw yz_0.a(unsupportedFlavorException);
                                }
                            }
                            object = treePath.getLastPathComponent();
                        }
                        cb_12 = (cb_1)object;
                        bl = cb_12.d();
                        if (stringArray == null) break block38;
                        if (bl) break block49;
                        break block50;
                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                            throw yz_0.a(unsupportedFlavorException);
                        }
                    }
                    try {
                        block51: {
                            bl = cb_12.u();
                            if (stringArray == null) break block38;
                            break block51;
                            catch (UnsupportedFlavorException unsupportedFlavorException) {
                                throw yz_0.a(unsupportedFlavorException);
                            }
                        }
                        if (!bl) break block39;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw yz_0.a(unsupportedFlavorException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        try {
            List list;
            block40: {
                Object object;
                block42: {
                    block41: {
                        try {
                            list = this.c;
                            if (stringArray == null) break block40;
                            if (list == null) break block41;
                        }
                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                            throw yz_0.a(unsupportedFlavorException);
                        }
                        for (cb_1 cb_13 : this.c) {
                            block46: {
                                boolean bl;
                                block45: {
                                    block44: {
                                        cb_1 cb_14;
                                        cb_1 cb_15;
                                        block43: {
                                            block52: {
                                                object = cb_12;
                                                if (stringArray == null) break block42;
                                                cb_15 = cb_13;
                                                if (stringArray == null) break block43;
                                                break block52;
                                                catch (UnsupportedFlavorException unsupportedFlavorException) {
                                                    throw yz_0.a(unsupportedFlavorException);
                                                }
                                            }
                                            try {
                                                block53: {
                                                    if (object == cb_15) break block44;
                                                    break block53;
                                                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                                                        throw yz_0.a(unsupportedFlavorException);
                                                    }
                                                }
                                                cb_14 = cb_12;
                                                cb_15 = cb_13;
                                            }
                                            catch (UnsupportedFlavorException unsupportedFlavorException) {
                                                throw yz_0.a(unsupportedFlavorException);
                                            }
                                        }
                                        try {
                                            bl = cb_14.isNodeAncestor(cb_15);
                                            if (stringArray == null) break block45;
                                            if (!bl) break block46;
                                        }
                                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                                            throw yz_0.a(unsupportedFlavorException);
                                        }
                                    }
                                    bl = false;
                                }
                                return bl;
                            }
                            if (stringArray != null) continue;
                        }
                    }
                    object = transferSupport.getTransferable().getTransferData(this.q);
                }
                list = (List)object;
            }
            List list2 = list;
            boolean bl = this.y(list2, cb_12, dropLocation.getChildIndex());
            transferSupport.setShowDropLocation(bl);
            return bl;
        }
        catch (UnsupportedFlavorException unsupportedFlavorException) {
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        block11: {
            ArrayList<cb_1> arrayList;
            String[] stringArray;
            block9: {
                boolean bl;
                List list;
                block10: {
                    us_0 us_02 = (us_0)jComponent;
                    stringArray = cb_1.C();
                    list = us_02.V();
                    bl = list.isEmpty();
                    if (stringArray == null) break block10;
                    if (bl) break block11;
                    bl = list.contains(us_02.M());
                }
                if (stringArray != null) {
                    if (bl) {
                        return null;
                    }
                    U.z(list);
                    bl = this.i(list);
                }
                if (!bl) {
                    return null;
                }
                arrayList = new ArrayList<cb_1>();
                for (cb_1 cb_12 : list) {
                    arrayList.add(this.D(cb_12));
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block9;
                }
                this.c = list;
                this.k = new HashMap(1);
            }
            for (cb_1 cb_12 : this.c) {
                ArrayList<Integer> arrayList2;
                cb_1 cb_13 = cb_12.C();
                ArrayList<Integer> arrayList3 = arrayList2 = (ArrayList<Integer>)this.k.get(cb_13.H());
                if (stringArray != null) {
                    if (arrayList3 == null) {
                        arrayList2 = new ArrayList<Integer>(1);
                        this.k.put(cb_13.H(), arrayList2);
                    }
                    arrayList3 = arrayList2;
                }
                arrayList3.add(cb_13.getIndex(cb_12));
                if (stringArray != null) continue;
            }
            return new wq_2(this, arrayList);
        }
        return null;
    }

    @Override
    protected void exportDone(JComponent jComponent, Transferable transferable, int n10) {
        if ((n10 & 2) == 2) {
            us_0 us_02 = (us_0)jComponent;
            us_02.s(this.c);
            this.c = null;
        }
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport var1_1) {
        block32: {
            block33: {
                block30: {
                    block31: {
                        block26: {
                            block27: {
                                block28: {
                                    block25: {
                                        var2_2 = cb_1.C();
                                        v0 = this;
                                        if (var2_2 == null) ** GOTO lbl17
                                        try {
                                            block34: {
                                                if (v0.canImport(var1_1)) break block25;
                                                break block34;
                                                catch (UnsupportedFlavorException v1) {
                                                    throw yz_0.a(v1);
                                                }
                                            }
                                            return false;
                                        }
                                        catch (UnsupportedFlavorException v2) {
                                            throw yz_0.a(v2);
                                        }
                                    }
                                    try {
                                        v0 = var1_1.getTransferable().getTransferData(this.q);
lbl17:
                                        // 2 sources

                                        var3_3 = (List)v0;
                                    }
                                    catch (UnsupportedFlavorException var4_4) {
                                        return false;
                                    }
                                    catch (IOException var4_5) {
                                        return false;
                                    }
                                    var4_6 = (JTree.DropLocation)var1_1.getDropLocation();
                                    var5_7 = var4_6.getChildIndex();
                                    var6_8 = var4_6.getPath();
                                    var7_9 = (cb_1)var6_8.getLastPathComponent();
                                    var8_10 = (us_0)var1_1.getComponent();
                                    var9_11 = (zn_0)var8_10.getModel();
                                    try {
                                        block29: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v3 = this.l;
                                                            if (var2_2 == null) break block26;
                                                            if (!v3) break block27;
                                                        }
                                                        catch (UnsupportedFlavorException v4) {
                                                            throw yz_0.a(v4);
                                                        }
                                                        v5 = var7_9;
                                                        if (var2_2 == null) break block28;
                                                    }
                                                    catch (UnsupportedFlavorException v6) {
                                                        throw yz_0.a(v6);
                                                    }
                                                    if (!v5.g()) break block29;
                                                }
                                                catch (UnsupportedFlavorException v7) {
                                                    throw yz_0.a(v7);
                                                }
                                                this.b(var3_3, var7_9, var8_10, var9_11, this.x(var5_7, var7_9));
                                                if (var2_2 != null) break block28;
                                            }
                                            catch (UnsupportedFlavorException v8) {
                                                throw yz_0.a(v8);
                                            }
                                        }
                                        var8_10.d(new sl_0(this, var7_9, var3_3, var8_10, var9_11));
                                        v5 = var8_10.K(var7_9);
                                    }
                                    catch (UnsupportedFlavorException v9) {
                                        throw yz_0.a(v9);
                                    }
                                }
                                return true;
                            }
                            v3 = var7_9.g();
                        }
                        try {
                            try {
                                if (var2_2 == null) break block30;
                                if (v3) break block31;
                            }
                            catch (UnsupportedFlavorException v10) {
                                throw yz_0.a(v10);
                            }
                            var8_10.w(var7_9);
                        }
                        catch (UnsupportedFlavorException v11) {
                            throw yz_0.a(v11);
                        }
                    }
                    v3 = var7_9.g();
                }
                try {
                    try {
                        if (var2_2 == null) break block32;
                        if (!v3) break block33;
                    }
                    catch (UnsupportedFlavorException v12) {
                        throw yz_0.a(v12);
                    }
                    this.b(var3_3, var7_9, var8_10, var9_11, this.x(var5_7, var7_9));
                    return true;
                }
                catch (UnsupportedFlavorException v13) {
                    throw yz_0.a(v13);
                }
            }
            v3 = false;
        }
        return v3;
    }

    protected int x(int n10, cb_1 cb_12) {
        String[] stringArray = cb_1.C();
        int n11 = n10;
        if (stringArray != null) {
            n11 = n11 == -1 ? cb_12.getChildCount() : n10;
        }
        int n12 = n11;
        int n13 = this.k.containsKey(cb_12.H());
        if (stringArray != null) {
            if (n13 != 0) {
                for (Integer n14 : (List)this.k.get(cb_12.H())) {
                    n13 = n14;
                    if (stringArray != null) {
                        if (n13 < n12) {
                            --n12;
                        }
                        if (stringArray != null) continue;
                    }
                    break;
                }
            } else {
                n13 = n12;
            }
        }
        return n13;
    }

    protected void b(List list, cb_1 cb_12, us_0 us_02, zn_0 zn_02, int n10) {
        SwingUtilities.invokeLater(new cw_0(this, zn_02, list, cb_12, n10, us_02));
    }

    protected abstract boolean i(List var1);

    protected abstract boolean y(List var1, cb_1 var2, int var3);

    protected abstract cb_1 D(cb_1 var1);

    public abstract void p(List var1, cb_1 var2, us_0 var3, zn_0 var4, int var5);

    public String toString() {
        return this.getClass().getName();
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
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
                char[] cArray3 = "vYD0fi\u001ec@[2 rR}HB=\"`\tz\u0004X3lk\u0013:FV6ji\u000beLRglf\u001edZ\t~".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 75;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 98;
                            break;
                        }
                        case 2: {
                            n17 = 127;
                            break;
                        }
                        case 3: {
                            n17 = 23;
                            break;
                        }
                        case 4: {
                            n17 = 68;
                            break;
                        }
                        case 5: {
                            n17 = 65;
                            break;
                        }
                        default: {
                            n17 = 52;
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

