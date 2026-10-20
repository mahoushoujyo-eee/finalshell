/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.c;
import com.dm_2;
import com.dx_1;
import com.dz_1;
import com.f_0;
import com.pc_0;
import com.wd_1;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

/*
 * Renamed from com.Qg
 */
class qg_0 {
    private static Vector H;
    private static InetAddress O;
    DI F;
    int r;
    int q;
    String E;
    InetAddress D;
    Runnable t;
    ServerSocket b;
    int m;
    private String n;
    boolean Q;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    qg_0(DI dI, String string, int n10, String string2, int n11, f_0 f_02, boolean bl) throws pc_0 {
        block18: {
            int n12;
            block17: {
                this.m = 0;
                this.Q = false;
                this.F = dI;
                boolean bl2 = dm_2.F();
                this.r = n10;
                this.E = string2;
                this.q = n11;
                this.Q = bl;
                try {
                    ServerSocket serverSocket;
                    block16: {
                        this.D = InetAddress.getByName(string);
                        f_0 f_03 = f_02;
                        if (bl2) {
                            block15: {
                                try {
                                    if (f_03 != null) break block15;
                                    serverSocket = new ServerSocket(n10, 0, this.D);
                                    break block16;
                                }
                                catch (Exception exception) {
                                    throw qg_0.a(exception);
                                }
                            }
                            f_03 = f_02;
                        }
                        serverSocket = f_03.d(n10, 0, this.D);
                    }
                    this.b = serverSocket;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    String string3 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50806 out of bounds for length 16" + string + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50797 out of bounds for length 16";
                    try {
                        if (exception instanceof Throwable) {
                            throw new pc_0(string3, exception);
                        }
                    }
                    catch (Exception exception2) {
                        throw qg_0.a(exception2);
                    }
                    throw new pc_0(string3);
                }
                try {
                    try {
                        n12 = n10;
                        if (!bl2) break block17;
                        if (n12 != 0) break block18;
                    }
                    catch (Exception exception) {
                        throw qg_0.a(exception);
                    }
                    n12 = this.b.getLocalPort();
                }
                catch (Exception exception) {
                    throw qg_0.a(exception);
                }
            }
            int n13 = n12;
            try {
                if (n13 != -1) {
                    this.r = n13;
                }
            }
            catch (Exception exception) {
                throw qg_0.a(exception);
            }
        }
    }

    static qg_0 W(DI dI, String string, int n10, String string2, int n11, f_0 f_02, boolean bl) throws pc_0 {
        qg_0 qg_02;
        block4: {
            block5: {
                string = qg_0.t(string);
                boolean bl2 = dm_2.F();
                try {
                    try {
                        qg_02 = qg_0.k(dI, string, n10);
                        if (!bl2) break block4;
                        if (qg_02 == null) break block5;
                    }
                    catch (pc_0 pc_02) {
                        throw qg_0.a(pc_02);
                    }
                    throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50806 out of bounds for length 16" + string + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50815 out of bounds for length 16");
                }
                catch (pc_0 pc_03) {
                    throw qg_0.a(pc_03);
                }
            }
            qg_02 = new qg_0(dI, string, n10, string2, n11, f_02, bl);
        }
        qg_0 qg_03 = qg_02;
        H.addElement(qg_03);
        return qg_03;
    }

    public static int X(byte[] byArray) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        int n10 = 0;
        try {
            n10 = dataInputStream.readUnsignedShort();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            dataInputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return n10;
    }

    public static String S(byte[] byArray, int n10) {
        StringBuffer stringBuffer = new StringBuffer();
        int n11 = 0;
        boolean bl = dm_2.F();
        while (n11 < n10) {
            int n12 = n11;
            if (bl) {
                if (n12 != 0) {
                    stringBuffer.append(" ");
                }
                n12 = byArray[n11];
            }
            int n13 = n12;
            String string = Long.toHexString(n13);
            if (bl) {
                if (string.length() == 1) {
                    string = "0" + string;
                }
                stringBuffer.append(string);
                ++n11;
            }
            if (bl) continue;
        }
        return stringBuffer.toString();
    }

    qg_0(DI dI, String string, int n10, String string2, f_0 f_02) throws pc_0 {
        this.m = 0;
        this.Q = false;
        this.F = dI;
        this.r = n10;
        this.n = string2;
        this.t(string, n10, f_02);
    }

    /*
     * Loose catch block
     */
    private void t(String string, int n10, f_0 f_02) throws pc_0 {
        block17: {
            int n11;
            block16: {
                boolean bl = dm_2.J();
                try {
                    ServerSocket serverSocket;
                    block15: {
                        f_0 f_03;
                        block13: {
                            block14: {
                                this.D = InetAddress.getByName(string);
                                qg_0 qg_02 = this;
                                f_03 = f_02;
                                if (bl) break block13;
                                try {
                                    block18: {
                                        if (f_03 != null) break block14;
                                        break block18;
                                        catch (Exception exception) {
                                            throw qg_0.a(exception);
                                        }
                                    }
                                    serverSocket = new ServerSocket(n10, 0, this.D);
                                    break block15;
                                }
                                catch (Exception exception) {
                                    throw qg_0.a(exception);
                                }
                            }
                            f_03 = f_02;
                        }
                        serverSocket = f_03.d(n10, 0, this.D);
                    }
                    qg_02.b = serverSocket;
                }
                catch (Exception exception) {
                    String string2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50813 out of bounds for length 16" + string + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50804 out of bounds for length 16";
                    throw new pc_0(string2, exception);
                }
                try {
                    try {
                        n11 = n10;
                        if (bl) break block16;
                        if (n11 != 0) break block17;
                    }
                    catch (Exception exception) {
                        throw qg_0.a(exception);
                    }
                    n11 = this.b.getLocalPort();
                }
                catch (Exception exception) {
                    throw qg_0.a(exception);
                }
            }
            int n12 = n11;
            try {
                if (n12 != -1) {
                    this.r = n12;
                }
            }
            catch (Exception exception) {
                throw qg_0.a(exception);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String[] a(DI dI) {
        Vector<String> vector = new Vector<String>();
        boolean bl = dm_2.F();
        String[] stringArray = H;
        synchronized (H) {
            String[] stringArray2;
            block10: {
                int n10 = 0;
                while (n10 < H.size()) {
                    qg_0 qg_02 = (qg_0)H.elementAt(n10);
                    if (bl) {
                        if (bl) {
                            if (qg_02.F == dI) {
                                vector.addElement(qg_02.r + ":" + qg_02.E + ":" + qg_02.q);
                            }
                            ++n10;
                        }
                        if (bl) continue;
                    }
                    break;
                }
                // ** MonitorExit[var3_3] (shouldn't be in output)
                stringArray = new String[vector.size()];
                for (n10 = 0; n10 < vector.size(); ++n10) {
                    stringArray2 = stringArray;
                    if (bl) {
                        stringArray2[n10] = (String)vector.elementAt(n10);
                        if (bl) continue;
                    }
                    break block10;
                }
                stringArray2 = stringArray;
            }
            return stringArray2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    static qg_0 k(DI var0, String var1_1, int var2_2) throws pc_0 {
        var3_3 = dm_2.F();
        try {
            var4_4 = InetAddress.getByName(var1_1);
        }
        catch (UnknownHostException var5_5) {
            throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50799 out of bounds for length 16" + var1_1 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50800 out of bounds for length 16", var5_5);
        }
        var5_6 = qg_0.H;
        synchronized (var5_6) {
            var6_7 = 0;
            while (var6_7 < qg_0.H.size()) {
                block24: {
                    block25: {
                        block27: {
                            block26: {
                                block33: {
                                    block32: {
                                        block31: {
                                            block30: {
                                                block29: {
                                                    block28: {
                                                        var7_8 = (qg_0)qg_0.H.elementAt(var6_7);
                                                        if (!var3_3) break block24;
                                                        if (var7_8.F != var0) break block25;
                                                        break block28;
                                                        catch (UnknownHostException v0) {
                                                            throw qg_0.a(v0);
                                                        }
                                                    }
                                                    if (var7_8.r != var2_2) break block25;
                                                    break block29;
                                                    catch (UnknownHostException v1) {
                                                        throw qg_0.a(v1);
                                                    }
                                                }
                                                v2 = qg_0.O;
                                                if (!var3_3) break block26;
                                                break block30;
                                                catch (UnknownHostException v3) {
                                                    throw qg_0.a(v3);
                                                }
                                            }
                                            if (v2 == null) ** GOTO lbl52
                                            break block31;
                                            catch (UnknownHostException v4) {
                                                throw qg_0.a(v4);
                                            }
                                        }
                                        v5 = var7_8;
                                        if (!var3_3) break block27;
                                        break block32;
                                        catch (UnknownHostException v6) {
                                            throw qg_0.a(v6);
                                        }
                                    }
                                    if (v5.D.equals(qg_0.O)) ** GOTO lbl67
                                    break block33;
                                    catch (UnknownHostException v7) {
                                        throw qg_0.a(v7);
                                    }
                                }
                                try {
                                    block34: {
                                        v5 = var7_8;
                                        if (!var3_3) break block27;
                                        break block34;
                                        catch (UnknownHostException v8) {
                                            throw qg_0.a(v8);
                                        }
                                    }
                                    v2 = v5.D;
                                }
                                catch (UnknownHostException v9) {
                                    throw qg_0.a(v9);
                                }
                            }
                            try {
                                if (!v2.equals(var4_4)) break block25;
lbl67:
                                // 2 sources

                                v5 = var7_8;
                            }
                            catch (UnknownHostException v10) {
                                throw qg_0.a(v10);
                            }
                        }
                        return v5;
                    }
                    ++var6_7;
                }
                if (var3_3) continue;
            }
            return null;
        }
    }

    private static String t(String string) {
        String string2;
        block4: {
            block5: {
                boolean bl;
                block8: {
                    boolean bl2;
                    block9: {
                        block6: {
                            String string3;
                            block7: {
                                bl2 = dm_2.F();
                                string2 = string;
                                if (!bl2) break block4;
                                if (string2 == null) break block5;
                                string3 = string;
                                if (!bl2) break block6;
                                if (string3.length() == 0) break block7;
                                bl = string.equals("*");
                                if (!bl2) break block8;
                                if (!bl) break block9;
                            }
                            string3 = string = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50810 out of bounds for length 16";
                        }
                        if (bl2) break block5;
                    }
                    string2 = string;
                    if (!bl2) break block4;
                    bl = string2.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50809 out of bounds for length 16");
                }
                if (bl) {
                    string = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50811 out of bounds for length 16";
                }
            }
            string2 = string;
        }
        return string2;
    }

    static qg_0 k(DI dI, String string, int n10, String string2, int n11, f_0 f_02) throws pc_0 {
        qg_0 qg_02;
        block4: {
            block5: {
                string = qg_0.t(string);
                boolean bl = dm_2.F();
                try {
                    try {
                        qg_02 = qg_0.k(dI, string, n10);
                        if (!bl) break block4;
                        if (qg_02 == null) break block5;
                    }
                    catch (pc_0 pc_02) {
                        throw qg_0.a(pc_02);
                    }
                    throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50806 out of bounds for length 16" + string + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50814 out of bounds for length 16");
                }
                catch (pc_0 pc_03) {
                    throw qg_0.a(pc_03);
                }
            }
            qg_02 = new qg_0(dI, string, n10, string2, n11, f_02);
        }
        qg_0 qg_03 = qg_02;
        H.addElement(qg_03);
        return qg_03;
    }

    static void t(DI dI, String string, int n10) throws pc_0 {
        qg_0 qg_02;
        qg_0 qg_03;
        block4: {
            block5: {
                string = qg_0.t(string);
                qg_03 = qg_0.k(dI, string, n10);
                boolean bl = dm_2.F();
                try {
                    try {
                        qg_02 = qg_03;
                        if (!bl) break block4;
                        if (qg_02 != null) break block5;
                    }
                    catch (pc_0 pc_02) {
                        throw qg_0.a(pc_02);
                    }
                    throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50806 out of bounds for length 16" + string + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50805 out of bounds for length 16");
                }
                catch (pc_0 pc_03) {
                    throw qg_0.a(pc_03);
                }
            }
            qg_02 = qg_03;
        }
        qg_02.S();
        H.removeElement(qg_03);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    static void G(DI var0) {
        var2_1 = qg_0.H;
        synchronized (var2_1) {
            var1_2 = dm_2.F();
            var3_3 = new qg_0[qg_0.H.size()];
            var4_4 = 0;
            var5_5 = 0;
            while (var5_5 < qg_0.H.size()) {
                block11: {
                    var6_6 = (qg_0)qg_0.H.elementAt(var5_5);
                    if (!var1_2) break block11;
                    v0 = var6_6;
                    if (!var1_2) ** GOTO lbl22
                    if (v0.F == var0) {
                        var6_6.S();
                        var3_3[var4_4++] = var6_6;
                    }
                    ++var5_5;
                }
                if (var1_2) continue;
            }
            for (var5_5 = 0; var5_5 < var4_4; ++var5_5) {
                v0 = var3_3[var5_5];
lbl22:
                // 2 sources

                var6_6 = v0;
                qg_0.H.removeElement(var6_6);
                if (var1_2) {
                    if (var1_2) continue;
                }
                break;
            }
            return;
        }
    }

    qg_0(DI dI, String string, int n10, String string2, int n11, f_0 f_02) throws pc_0 {
        this.m = 0;
        this.Q = false;
        this.F = dI;
        this.r = n10;
        this.E = string2;
        this.q = n11;
        this.t(string, n10, f_02);
    }

    public static qg_0 Y(DI dI, String string, int n10, String string2, f_0 f_02) throws pc_0 {
        qg_0 qg_02;
        block4: {
            String string3;
            block5: {
                string3 = qg_0.t(string);
                boolean bl = dm_2.J();
                try {
                    try {
                        qg_02 = qg_0.k(dI, string3, n10);
                        if (bl) break block4;
                        if (qg_02 == null) break block5;
                    }
                    catch (pc_0 pc_02) {
                        throw qg_0.a(pc_02);
                    }
                    throw new pc_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50806 out of bounds for length 16" + string3 + ":" + n10 + "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50815 out of bounds for length 16");
                }
                catch (pc_0 pc_03) {
                    throw qg_0.a(pc_03);
                }
            }
            qg_02 = new qg_0(dI, string3, n10, string2, f_02);
        }
        qg_0 qg_03 = qg_02;
        H.addElement(qg_03);
        return qg_03;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void E() {
        this.t = this::E;
        boolean bl = dm_2.F();
        try {
            while (this.t != null) {
                Socket socket = this.b.accept();
                try {
                    try {
                        yt_1.F.J(new wd_1(this, socket));
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl && bl) continue;
                    return;
                }
                catch (Exception exception) {
                    throw qg_0.a(exception);
                    return;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void I(Socket var1_1) throws Exception {
        block47: {
            block31: {
                block32: {
                    block46: {
                        block45: {
                            block44: {
                                block42: {
                                    block43: {
                                        block40: {
                                            block41: {
                                                block38: {
                                                    block39: {
                                                        block37: {
                                                            block36: {
                                                                block35: {
                                                                    block34: {
                                                                        block33: {
                                                                            block30: {
                                                                                block29: {
                                                                                    v0 = dm_2.J();
                                                                                    var1_1.setTcpNoDelay(true);
                                                                                    var2_2 = v0;
                                                                                    var3_3 = var1_1.getInputStream();
                                                                                    var4_4 = var1_1.getOutputStream();
                                                                                    try {
                                                                                        try {
                                                                                            v1 = this.n;
                                                                                            if (var2_2) break block29;
                                                                                            if (v1 == null) break block30;
                                                                                        }
                                                                                        catch (Exception v2) {
                                                                                            throw qg_0.a(v2);
                                                                                        }
                                                                                        v1 = this.n;
                                                                                    }
                                                                                    catch (Exception v3) {
                                                                                        throw qg_0.a(v3);
                                                                                    }
                                                                                }
                                                                                if (v1.length() <= 0) break block30;
                                                                                var5_5 = new dx_1();
                                                                                var5_5.D(this.F);
                                                                                var5_5.n();
                                                                                var5_5.X(var3_3);
                                                                                var5_5.D(var4_4);
                                                                                this.F.j(var5_5);
                                                                                var5_5.E(this.n);
                                                                                var5_5.s(var1_1.getInetAddress().getHostAddress());
                                                                                var5_5.a(var1_1.getPort());
                                                                                var5_5.I(this.m);
                                                                                if (!var2_2) break block47;
                                                                            }
                                                                            var5_5 = new dz_1();
                                                                            try {
                                                                                var5_5.D(this.F);
                                                                                var5_5.n();
                                                                                var5_5.X(var3_3);
                                                                                var5_5.D(var4_4);
                                                                                this.F.j(var5_5);
                                                                                v4 = this.Q;
                                                                                if (var2_2) break block31;
                                                                                if (v4 == 0) break block32;
                                                                            }
                                                                            catch (Exception v5) {
                                                                                throw qg_0.a(v5);
                                                                            }
                                                                            var6_6 = new DataInputStream(var1_1.getInputStream());
                                                                            var7_7 = new DataOutputStream(var1_1.getOutputStream());
                                                                            var8_8 = qg_0.a(10085, 109275185607992420L);
                                                                            var9_9 = new byte[3];
                                                                            var10_10 = 0;
                                                                            var11_11 = new byte[var8_8];
                                                                            var12_12 = 0;
                                                                            var13_13 = null;
                                                                            var14_14 = 0;
                                                                            var10_10 = var6_6.read(var9_9);
                                                                            var7_7.write(new byte[]{5, 0});
                                                                            var12_12 = var6_6.read(var11_11);
                                                                            var15_15 = false;
                                                                            try {
                                                                                try {
                                                                                    if (var2_2) break block33;
                                                                                    if (var12_12 >= 0) break block34;
                                                                                }
                                                                                catch (Exception v6) {
                                                                                    throw qg_0.a(v6);
                                                                                }
                                                                                var1_1.close();
                                                                            }
                                                                            catch (Exception v7) {
                                                                                throw qg_0.a(v7);
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    var16_16 = qg_0.S(var11_11, var12_12);
                                                                    try {
                                                                        v8 = var16_16.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50802 out of bounds for length 16");
                                                                        if (var2_2) break block35;
                                                                        if (v8 != 0) {
                                                                        }
                                                                        ** GOTO lbl85
                                                                    }
                                                                    catch (Exception v9) {
                                                                        throw qg_0.a(v9);
                                                                    }
                                                                    var12_12 = var6_6.read(var11_11);
                                                                    var16_16 = qg_0.S(var11_11, var12_12);
                                                                    try {
                                                                        if (!var2_2) break block36;
lbl85:
                                                                        // 2 sources

                                                                        v8 = var16_16.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50798 out of bounds for length 16");
                                                                    }
                                                                    catch (Exception v10) {
                                                                        throw qg_0.a(v10);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var2_2) break block37;
                                                                    if (v8 == 0) break block36;
                                                                }
                                                                catch (Exception v11) {
                                                                    throw qg_0.a(v11);
                                                                }
                                                                var12_12 = var6_6.read(var11_11);
                                                                var16_16 = qg_0.S(var11_11, var12_12);
                                                            }
                                                            v8 = var16_16.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50812 out of bounds for length 16");
                                                        }
                                                        try {
                                                            if (var2_2) break block38;
                                                            if (v8 == 0) break block39;
                                                        }
                                                        catch (Exception v12) {
                                                            throw qg_0.a(v12);
                                                        }
                                                        var17_17 = var11_11[4];
                                                        var13_13 = new String(var11_11, 5, (int)var17_17);
                                                        var18_22 = new byte[2];
                                                        System.arraycopy(var11_11, var12_12 - 2, var18_22, 0, 2);
                                                        var14_14 = qg_0.G(var18_22);
                                                        break block45;
                                                    }
                                                    v8 = var16_16.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50807 out of bounds for length 16");
                                                }
                                                try {
                                                    if (var2_2) break block40;
                                                    if (v8 == 0) break block41;
                                                }
                                                catch (Exception v13) {
                                                    throw qg_0.a(v13);
                                                }
                                                var17_18 = new byte[4];
                                                System.arraycopy(var11_11, 4, var17_18, 0, 4);
                                                var13_13 = InetAddress.getByAddress(var17_18).getHostAddress();
                                                var18_23 = new byte[2];
                                                System.arraycopy(var11_11, var12_12 - 2, var18_23, 0, 2);
                                                var14_14 = qg_0.G(var18_23);
                                                break block45;
                                            }
                                            v8 = var16_16.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50801 out of bounds for length 16");
                                        }
                                        try {
                                            if (var2_2) break block42;
                                            if (v8 == 0) break block43;
                                        }
                                        catch (Exception v14) {
                                            throw qg_0.a(v14);
                                        }
                                        var17_19 = new byte[qg_0.a(12512, 1318924485657162722L)];
                                        System.arraycopy(var11_11, 4, var17_19, 0, qg_0.a(3517, 2591766454367178429L));
                                        var13_13 = InetAddress.getByAddress(var17_19).getHostAddress();
                                        var18_24 = new byte[2];
                                        System.arraycopy(var11_11, var12_12 - 2, var18_24, 0, 2);
                                        var14_14 = qg_0.G(var18_24);
                                        break block45;
                                    }
                                    v8 = (int)var16_16.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50808 out of bounds for length 16");
                                }
                                try {
                                    if (var2_2) break block44;
                                    if (v8 == 0) break block45;
                                }
                                catch (Exception v15) {
                                    throw qg_0.a(v15);
                                }
                                v8 = 4;
                            }
                            var17_20 = new byte[v8];
                            System.arraycopy(var11_11, 4, var17_20, 0, 4);
                            var13_13 = InetAddress.getByAddress(var17_20).getHostAddress();
                            var18_25 = new byte[2];
                            System.arraycopy(var11_11, var12_12 - 2, var18_25, 0, 2);
                            var14_14 = qg_0.G(var18_25);
                            var15_15 = true;
                        }
                        if (var15_15) ** GOTO lbl169
                        var17_21 = new JX(0, var1_1.getLocalAddress(), var1_1.getLocalPort());
                        try {
                            var17_21.l(var7_7);
                            if (!var2_2) break block46;
lbl169:
                            // 2 sources

                            var1_1.close();
                            return;
                        }
                        catch (Exception v16) {
                            throw qg_0.a(v16);
                        }
                    }
                    this.E = var13_13;
                    this.q = var14_14;
                }
                var5_5.e(this.E);
                var5_5.t(this.q);
                var5_5.s(var1_1.getInetAddress().getHostAddress());
                var5_5.a(var1_1.getPort());
                var5_5.I(this.m);
                v4 = var5_5.d;
            }
            if (v4 != -1) {
                // empty if block
            }
        }
    }

    public static int G(byte[] byArray) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        int n10 = 0;
        try {
            n10 = dataInputStream.readUnsignedShort();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            dataInputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return n10;
    }

    /*
     * Loose catch block
     */
    void S() {
        this.t = null;
        boolean bl = dm_2.J();
        try {
            block8: {
                qg_0 qg_02;
                block6: {
                    qg_02 = this;
                    if (bl) break block8;
                    try {
                        block9: {
                            if (qg_02.b == null) break block6;
                            break block9;
                            catch (Exception exception) {
                                throw qg_0.a(exception);
                            }
                        }
                        this.b.close();
                    }
                    catch (Exception exception) {
                        throw qg_0.a(exception);
                    }
                }
                qg_02 = this;
            }
            qg_02.b = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    void V(int n10) {
        this.m = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        var13 = new String[19];
                        var11_1 = 0;
                        var10_2 = "\u009a\u00f6d{\u00d7\u00bdE\u00b2P\u009b\u00ff\u009cAR\u00f2O\u00c6\u0018\u0087\u0011\u00dc\u00fb\u00d9\u0017\u00a7e\u00c3\t#\u00f3\u00db{\u0083\u00a2\u0085\u00bb\u000e\u00b6\u001b\u00d3\u00fb\u008b c(\u00b5G\u001c\u0091kzZ\u0012D>\u00fc?\u0014\u000f\u00f0\u00fd\u00bd\u00d1\u00a3\u00bf\u00a4\u009b\u008c\u0010s\u00ca\u009f\u00d3\u00d8\u0016\u0087\u000bi\u00fa[=Y+\u008c\u00f0\"x\u0092\t\u00f3\u00b8>\u008c\u0001\u00ce\u00a6\u009dv\u0007R\u00a6,\u00d0\u00a4E\u0012\tE9J\u0005\r\u001f\u00aft\u00a6\u000b\u00c3\u00ab\u000e\u0017\u00f1n\u00dbX\u00c8m\u00cd\u000b\u00a3k\u0002\u000frm\u00e98\u008ea\u0005\u001cN\u009f\u0081\u00c4m\u0097\u00d1\u0086\u00c2[\u00b0\u0019\n\u0080/\u0004`P`\u0012o\u00a0%\u00e5.\u0097\u00a9n\u0013e:\u009b\u00e2'\u008d\u00b3\u0092[s\u00f1\u00e9\\\u008dr\u009c\u0082\n\u0090\u0011\u000f\u009e\u00c4s\u009c8\u00c4$\u00a5\u00a5{8\u00be\u00dc\u00ba\u0081\u00ba\u0007:\u00d3!~\u0005\u0090&\u0005\u00cc\u00d1\u00ef\u00dc\u00cc\u000bIT_\u00e8\u00d9\u0091\u009c\u00a7 \u0092\u00d5\u000b\u001d6\u0097\u007f\u00c8\u00d5\u00f0\u0016t\u0082\u00a8!\u0015\u00e4\u00ea\u00ab\u0000z|;w\u00ec\u0006\u00ef\u00dc^\u00f5\u00df;.\nm\u0003\u00f8\u00e1\u00fa\u0099\u00f1\u00e9\u0097&\u00da\u00eb g";
                        var12_3 = "\u009a\u00f6d{\u00d7\u00bdE\u00b2P\u009b\u00ff\u009cAR\u00f2O\u00c6\u0018\u0087\u0011\u00dc\u00fb\u00d9\u0017\u00a7e\u00c3\t#\u00f3\u00db{\u0083\u00a2\u0085\u00bb\u000e\u00b6\u001b\u00d3\u00fb\u008b c(\u00b5G\u001c\u0091kzZ\u0012D>\u00fc?\u0014\u000f\u00f0\u00fd\u00bd\u00d1\u00a3\u00bf\u00a4\u009b\u008c\u0010s\u00ca\u009f\u00d3\u00d8\u0016\u0087\u000bi\u00fa[=Y+\u008c\u00f0\"x\u0092\t\u00f3\u00b8>\u008c\u0001\u00ce\u00a6\u009dv\u0007R\u00a6,\u00d0\u00a4E\u0012\tE9J\u0005\r\u001f\u00aft\u00a6\u000b\u00c3\u00ab\u000e\u0017\u00f1n\u00dbX\u00c8m\u00cd\u000b\u00a3k\u0002\u000frm\u00e98\u008ea\u0005\u001cN\u009f\u0081\u00c4m\u0097\u00d1\u0086\u00c2[\u00b0\u0019\n\u0080/\u0004`P`\u0012o\u00a0%\u00e5.\u0097\u00a9n\u0013e:\u009b\u00e2'\u008d\u00b3\u0092[s\u00f1\u00e9\\\u008dr\u009c\u0082\n\u0090\u0011\u000f\u009e\u00c4s\u009c8\u00c4$\u00a5\u00a5{8\u00be\u00dc\u00ba\u0081\u00ba\u0007:\u00d3!~\u0005\u0090&\u0005\u00cc\u00d1\u00ef\u00dc\u00cc\u000bIT_\u00e8\u00d9\u0091\u009c\u00a7 \u0092\u00d5\u000b\u001d6\u0097\u007f\u00c8\u00d5\u00f0\u0016t\u0082\u00a8!\u0015\u00e4\u00ea\u00ab\u0000z|;w\u00ec\u0006\u00ef\u00dc^\u00f5\u00df;.\nm\u0003\u00f8\u00e1\u00fa\u0099\u00f1\u00e9\u0097&\u00da\u00eb g".length();
                        var9_4 = 23;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 65;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block23;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0090\u00e1\u0011\u00e9|cT\u0013\u00a7N\u00ac\u008f\u00cfE\u000e\u0002aVM\\";
                            var12_3 = "\u0090\u00e1\u0011\u00e9|cT\u0013\u00a7N\u00ac\u008f\u00cfE\u000e\u0002aVM\\".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 16;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block24;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 2;
                                    break;
                                }
                                case 1: {
                                    v15 = 108;
                                    break;
                                }
                                case 2: {
                                    v15 = 73;
                                    break;
                                }
                                case 3: {
                                    v15 = 37;
                                    break;
                                }
                                case 4: {
                                    v15 = 103;
                                    break;
                                }
                                case 5: {
                                    v15 = 87;
                                    break;
                                }
                                default: {
                                    v15 = 5;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                qg_0.a = var13;
                qg_0.c = new String[19];
                var0_7 = 1159073172608816424L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "D\u0086\u00bdq\u0017\\\u00db\u0085\u00f1\n\u00b8|\u001e\u00edqL\u0099;.\u001e? f\u00da";
                var5_11 = "D\u0086\u00bdq\u0017\\\u00db\u0085\u00f1\n\u00b8|\u001e\u00edqL\u0099;.\u001e? f\u00da".length();
                var2_12 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block26;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        qg_0.d = var6_8;
        qg_0.e = new Integer[3];
        qg_0.H = new Vector<E>();
        qg_0.O = null;
        try {
            qg_0.O = InetAddress.getByName("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50803 out of bounds for length 16");
        }
        catch (UnknownHostException var15_14) {
            // empty catch block
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x7D56) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 89;
                    break;
                }
                case 1: {
                    n14 = 118;
                    break;
                }
                case 2: {
                    n14 = 183;
                    break;
                }
                case 3: {
                    n14 = 8;
                    break;
                }
                case 4: {
                    n14 = 189;
                    break;
                }
                case 5: {
                    n14 = 251;
                    break;
                }
                case 6: {
                    n14 = 80;
                    break;
                }
                case 7: {
                    n14 = 115;
                    break;
                }
                case 8: {
                    n14 = 58;
                    break;
                }
                case 9: {
                    n14 = 230;
                    break;
                }
                case 10: {
                    n14 = 39;
                    break;
                }
                case 11: {
                    n14 = 214;
                    break;
                }
                case 12: {
                    n14 = 177;
                    break;
                }
                case 13: {
                    n14 = 45;
                    break;
                }
                case 14: {
                    n14 = 159;
                    break;
                }
                case 15: {
                    n14 = 78;
                    break;
                }
                case 16: {
                    n14 = 99;
                    break;
                }
                case 17: {
                    n14 = 236;
                    break;
                }
                case 18: {
                    n14 = 103;
                    break;
                }
                case 19: {
                    n14 = 154;
                    break;
                }
                case 20: {
                    n14 = 7;
                    break;
                }
                case 21: {
                    n14 = 67;
                    break;
                }
                case 22: {
                    n14 = 119;
                    break;
                }
                case 23: {
                    n14 = 213;
                    break;
                }
                case 24: {
                    n14 = 111;
                    break;
                }
                case 25: {
                    n14 = 59;
                    break;
                }
                case 26: {
                    n14 = 233;
                    break;
                }
                case 27: {
                    n14 = 240;
                    break;
                }
                case 28: {
                    n14 = 113;
                    break;
                }
                case 29: {
                    n14 = 64;
                    break;
                }
                case 30: {
                    n14 = 9;
                    break;
                }
                case 31: {
                    n14 = 87;
                    break;
                }
                case 32: {
                    n14 = 175;
                    break;
                }
                case 33: {
                    n14 = 35;
                    break;
                }
                case 34: {
                    n14 = 42;
                    break;
                }
                case 35: {
                    n14 = 149;
                    break;
                }
                case 36: {
                    n14 = 191;
                    break;
                }
                case 37: {
                    n14 = 226;
                    break;
                }
                case 38: {
                    n14 = 19;
                    break;
                }
                case 39: {
                    n14 = 193;
                    break;
                }
                case 40: {
                    n14 = 21;
                    break;
                }
                case 41: {
                    n14 = 61;
                    break;
                }
                case 42: {
                    n14 = 31;
                    break;
                }
                case 43: {
                    n14 = 186;
                    break;
                }
                case 44: {
                    n14 = 162;
                    break;
                }
                case 45: {
                    n14 = 84;
                    break;
                }
                case 46: {
                    n14 = 16;
                    break;
                }
                case 47: {
                    n14 = 37;
                    break;
                }
                case 48: {
                    n14 = 209;
                    break;
                }
                case 49: {
                    n14 = 203;
                    break;
                }
                case 50: {
                    n14 = 86;
                    break;
                }
                case 51: {
                    n14 = 63;
                    break;
                }
                case 52: {
                    n14 = 238;
                    break;
                }
                case 53: {
                    n14 = 126;
                    break;
                }
                case 54: {
                    n14 = 151;
                    break;
                }
                case 55: {
                    n14 = 41;
                    break;
                }
                case 56: {
                    n14 = 123;
                    break;
                }
                case 57: {
                    n14 = 130;
                    break;
                }
                case 58: {
                    n14 = 70;
                    break;
                }
                case 59: {
                    n14 = 11;
                    break;
                }
                case 60: {
                    n14 = 136;
                    break;
                }
                case 61: {
                    n14 = 143;
                    break;
                }
                case 62: {
                    n14 = 222;
                    break;
                }
                case 63: {
                    n14 = 66;
                    break;
                }
                case 64: {
                    n14 = 173;
                    break;
                }
                case 65: {
                    n14 = 28;
                    break;
                }
                case 66: {
                    n14 = 98;
                    break;
                }
                case 67: {
                    n14 = 192;
                    break;
                }
                case 68: {
                    n14 = 91;
                    break;
                }
                case 69: {
                    n14 = 50;
                    break;
                }
                case 70: {
                    n14 = 51;
                    break;
                }
                case 71: {
                    n14 = 43;
                    break;
                }
                case 72: {
                    n14 = 211;
                    break;
                }
                case 73: {
                    n14 = 132;
                    break;
                }
                case 74: {
                    n14 = 181;
                    break;
                }
                case 75: {
                    n14 = 69;
                    break;
                }
                case 76: {
                    n14 = 46;
                    break;
                }
                case 77: {
                    n14 = 140;
                    break;
                }
                case 78: {
                    n14 = 232;
                    break;
                }
                case 79: {
                    n14 = 96;
                    break;
                }
                case 80: {
                    n14 = 163;
                    break;
                }
                case 81: {
                    n14 = 25;
                    break;
                }
                case 82: {
                    n14 = 146;
                    break;
                }
                case 83: {
                    n14 = 250;
                    break;
                }
                case 84: {
                    n14 = 13;
                    break;
                }
                case 85: {
                    n14 = 174;
                    break;
                }
                case 86: {
                    n14 = 144;
                    break;
                }
                case 87: {
                    n14 = 33;
                    break;
                }
                case 88: {
                    n14 = 161;
                    break;
                }
                case 89: {
                    n14 = 22;
                    break;
                }
                case 90: {
                    n14 = 44;
                    break;
                }
                case 91: {
                    n14 = 5;
                    break;
                }
                case 92: {
                    n14 = 62;
                    break;
                }
                case 93: {
                    n14 = 228;
                    break;
                }
                case 94: {
                    n14 = 14;
                    break;
                }
                case 95: {
                    n14 = 225;
                    break;
                }
                case 96: {
                    n14 = 243;
                    break;
                }
                case 97: {
                    n14 = 30;
                    break;
                }
                case 98: {
                    n14 = 157;
                    break;
                }
                case 99: {
                    n14 = 47;
                    break;
                }
                case 100: {
                    n14 = 224;
                    break;
                }
                case 101: {
                    n14 = 95;
                    break;
                }
                case 102: {
                    n14 = 23;
                    break;
                }
                case 103: {
                    n14 = 73;
                    break;
                }
                case 104: {
                    n14 = 97;
                    break;
                }
                case 105: {
                    n14 = 112;
                    break;
                }
                case 106: {
                    n14 = 90;
                    break;
                }
                case 107: {
                    n14 = 198;
                    break;
                }
                case 108: {
                    n14 = 15;
                    break;
                }
                case 109: {
                    n14 = 241;
                    break;
                }
                case 110: {
                    n14 = 60;
                    break;
                }
                case 111: {
                    n14 = 124;
                    break;
                }
                case 112: {
                    n14 = 83;
                    break;
                }
                case 113: {
                    n14 = 142;
                    break;
                }
                case 114: {
                    n14 = 204;
                    break;
                }
                case 115: {
                    n14 = 253;
                    break;
                }
                case 116: {
                    n14 = 200;
                    break;
                }
                case 117: {
                    n14 = 190;
                    break;
                }
                case 118: {
                    n14 = 221;
                    break;
                }
                case 119: {
                    n14 = 93;
                    break;
                }
                case 120: {
                    n14 = 217;
                    break;
                }
                case 121: {
                    n14 = 125;
                    break;
                }
                case 122: {
                    n14 = 187;
                    break;
                }
                case 123: {
                    n14 = 194;
                    break;
                }
                case 124: {
                    n14 = 12;
                    break;
                }
                case 125: {
                    n14 = 77;
                    break;
                }
                case 126: {
                    n14 = 1;
                    break;
                }
                case 127: {
                    n14 = 74;
                    break;
                }
                case 128: {
                    n14 = 102;
                    break;
                }
                case 129: {
                    n14 = 52;
                    break;
                }
                case 130: {
                    n14 = 148;
                    break;
                }
                case 131: {
                    n14 = 227;
                    break;
                }
                case 132: {
                    n14 = 207;
                    break;
                }
                case 133: {
                    n14 = 27;
                    break;
                }
                case 134: {
                    n14 = 29;
                    break;
                }
                case 135: {
                    n14 = 182;
                    break;
                }
                case 136: {
                    n14 = 196;
                    break;
                }
                case 137: {
                    n14 = 6;
                    break;
                }
                case 138: {
                    n14 = 252;
                    break;
                }
                case 139: {
                    n14 = 72;
                    break;
                }
                case 140: {
                    n14 = 116;
                    break;
                }
                case 141: {
                    n14 = 100;
                    break;
                }
                case 142: {
                    n14 = 56;
                    break;
                }
                case 143: {
                    n14 = 129;
                    break;
                }
                case 144: {
                    n14 = 120;
                    break;
                }
                case 145: {
                    n14 = 131;
                    break;
                }
                case 146: {
                    n14 = 32;
                    break;
                }
                case 147: {
                    n14 = 82;
                    break;
                }
                case 148: {
                    n14 = 0;
                    break;
                }
                case 149: {
                    n14 = 201;
                    break;
                }
                case 150: {
                    n14 = 133;
                    break;
                }
                case 151: {
                    n14 = 141;
                    break;
                }
                case 152: {
                    n14 = 3;
                    break;
                }
                case 153: {
                    n14 = 199;
                    break;
                }
                case 154: {
                    n14 = 205;
                    break;
                }
                case 155: {
                    n14 = 234;
                    break;
                }
                case 156: {
                    n14 = 244;
                    break;
                }
                case 157: {
                    n14 = 128;
                    break;
                }
                case 158: {
                    n14 = 106;
                    break;
                }
                case 159: {
                    n14 = 24;
                    break;
                }
                case 160: {
                    n14 = 212;
                    break;
                }
                case 161: {
                    n14 = 176;
                    break;
                }
                case 162: {
                    n14 = 38;
                    break;
                }
                case 163: {
                    n14 = 219;
                    break;
                }
                case 164: {
                    n14 = 178;
                    break;
                }
                case 165: {
                    n14 = 18;
                    break;
                }
                case 166: {
                    n14 = 122;
                    break;
                }
                case 167: {
                    n14 = 197;
                    break;
                }
                case 168: {
                    n14 = 216;
                    break;
                }
                case 169: {
                    n14 = 168;
                    break;
                }
                case 170: {
                    n14 = 152;
                    break;
                }
                case 171: {
                    n14 = 36;
                    break;
                }
                case 172: {
                    n14 = 40;
                    break;
                }
                case 173: {
                    n14 = 220;
                    break;
                }
                case 174: {
                    n14 = 109;
                    break;
                }
                case 175: {
                    n14 = 92;
                    break;
                }
                case 176: {
                    n14 = 237;
                    break;
                }
                case 177: {
                    n14 = 223;
                    break;
                }
                case 178: {
                    n14 = 184;
                    break;
                }
                case 179: {
                    n14 = 231;
                    break;
                }
                case 180: {
                    n14 = 206;
                    break;
                }
                case 181: {
                    n14 = 121;
                    break;
                }
                case 182: {
                    n14 = 48;
                    break;
                }
                case 183: {
                    n14 = 169;
                    break;
                }
                case 184: {
                    n14 = 153;
                    break;
                }
                case 185: {
                    n14 = 160;
                    break;
                }
                case 186: {
                    n14 = 145;
                    break;
                }
                case 187: {
                    n14 = 137;
                    break;
                }
                case 188: {
                    n14 = 49;
                    break;
                }
                case 189: {
                    n14 = 179;
                    break;
                }
                case 190: {
                    n14 = 110;
                    break;
                }
                case 191: {
                    n14 = 138;
                    break;
                }
                case 192: {
                    n14 = 108;
                    break;
                }
                case 193: {
                    n14 = 20;
                    break;
                }
                case 194: {
                    n14 = 242;
                    break;
                }
                case 195: {
                    n14 = 65;
                    break;
                }
                case 196: {
                    n14 = 117;
                    break;
                }
                case 197: {
                    n14 = 26;
                    break;
                }
                case 198: {
                    n14 = 134;
                    break;
                }
                case 199: {
                    n14 = 85;
                    break;
                }
                case 200: {
                    n14 = 210;
                    break;
                }
                case 201: {
                    n14 = 139;
                    break;
                }
                case 202: {
                    n14 = 55;
                    break;
                }
                case 203: {
                    n14 = 195;
                    break;
                }
                case 204: {
                    n14 = 71;
                    break;
                }
                case 205: {
                    n14 = 215;
                    break;
                }
                case 206: {
                    n14 = 255;
                    break;
                }
                case 207: {
                    n14 = 10;
                    break;
                }
                case 208: {
                    n14 = 150;
                    break;
                }
                case 209: {
                    n14 = 94;
                    break;
                }
                case 210: {
                    n14 = 254;
                    break;
                }
                case 211: {
                    n14 = 76;
                    break;
                }
                case 212: {
                    n14 = 147;
                    break;
                }
                case 213: {
                    n14 = 88;
                    break;
                }
                case 214: {
                    n14 = 229;
                    break;
                }
                case 215: {
                    n14 = 170;
                    break;
                }
                case 216: {
                    n14 = 79;
                    break;
                }
                case 217: {
                    n14 = 171;
                    break;
                }
                case 218: {
                    n14 = 155;
                    break;
                }
                case 219: {
                    n14 = 104;
                    break;
                }
                case 220: {
                    n14 = 34;
                    break;
                }
                case 221: {
                    n14 = 185;
                    break;
                }
                case 222: {
                    n14 = 158;
                    break;
                }
                case 223: {
                    n14 = 167;
                    break;
                }
                case 224: {
                    n14 = 246;
                    break;
                }
                case 225: {
                    n14 = 247;
                    break;
                }
                case 226: {
                    n14 = 101;
                    break;
                }
                case 227: {
                    n14 = 114;
                    break;
                }
                case 228: {
                    n14 = 239;
                    break;
                }
                case 229: {
                    n14 = 235;
                    break;
                }
                case 230: {
                    n14 = 188;
                    break;
                }
                case 231: {
                    n14 = 81;
                    break;
                }
                case 232: {
                    n14 = 164;
                    break;
                }
                case 233: {
                    n14 = 107;
                    break;
                }
                case 234: {
                    n14 = 208;
                    break;
                }
                case 235: {
                    n14 = 218;
                    break;
                }
                case 236: {
                    n14 = 245;
                    break;
                }
                case 237: {
                    n14 = 165;
                    break;
                }
                case 238: {
                    n14 = 249;
                    break;
                }
                case 239: {
                    n14 = 105;
                    break;
                }
                case 240: {
                    n14 = 166;
                    break;
                }
                case 241: {
                    n14 = 202;
                    break;
                }
                case 242: {
                    n14 = 2;
                    break;
                }
                case 243: {
                    n14 = 248;
                    break;
                }
                case 244: {
                    n14 = 135;
                    break;
                }
                case 245: {
                    n14 = 172;
                    break;
                }
                case 246: {
                    n14 = 156;
                    break;
                }
                case 247: {
                    n14 = 57;
                    break;
                }
                case 248: {
                    n14 = 127;
                    break;
                }
                case 249: {
                    n14 = 75;
                    break;
                }
                case 250: {
                    n14 = 4;
                    break;
                }
                case 251: {
                    n14 = 54;
                    break;
                }
                case 252: {
                    n14 = 180;
                    break;
                }
                case 253: {
                    n14 = 68;
                    break;
                }
                case 254: {
                    n14 = 53;
                    break;
                }
                default: {
                    n14 = 17;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            qg_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4300;
        if (e[n11] == null) {
            qg_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

