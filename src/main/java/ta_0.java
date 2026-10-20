/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.c;
import com.oc_0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from Ta
 */
public class ta_0 {
    ArrayList G;
    HashMap n;
    String v;
    private static final String[] a;
    private static final String[] b;

    public ta_0() {
        this.G = new ArrayList();
        this.n = new HashMap();
        this.v = "acce.json";
        try {
            this.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void S(BS bS) throws Exception {
        try {
            BS bS2;
            try {
                bS2 = (BS)this.U(bS.C);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bS2 != null) {
                throw new Exception("映射 " + (String)bS.C + " 已存在,请修改名称!");
            }
        }
        catch (IOException iOException) {
            throw ta_0.a(iOException);
        }
        ServerSocket serverSocket = null;
        try {
            int n10;
            try {
                n10 = (Integer)bS.n();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            serverSocket = new ServerSocket(n10);
            try {
                this.s(serverSocket);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((ArrayList)this.G).add(bS);
            ((HashMap)this.n).put(bS.F, bS);
            try {
                this.B();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (IOException iOException) {
            int n11;
            try {
                n11 = (Integer)bS.n();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            throw new Exception("端口 " + n11 + " 已经被占用!");
        }
    }

    /*
     * Loose catch block
     */
    public void Y(String string) {
        block16: {
            BS bS;
            BS bS2;
            block15: {
                int n10;
                block17: {
                    BS bS3;
                    try {
                        bS3 = (BS)this.U(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bS2 = bS3;
                    n10 = BS.t();
                    bS = bS2;
                    if (n10 != 0) break block15;
                    if (bS == null) break block16;
                    break block17;
                    catch (IOException iOException) {
                        throw ta_0.a(iOException);
                    }
                }
                try {
                    block18: {
                        ((ArrayList)this.G).remove(bS2);
                        ((HashMap)this.n).remove(bS2.F);
                        if (n10 != 0) break block16;
                        break block18;
                        catch (IOException iOException) {
                            throw ta_0.a(iOException);
                        }
                    }
                    bS = bS2;
                }
                catch (IOException iOException) {
                    throw ta_0.a(iOException);
                }
            }
            if ((ServerSocket)bS.u != null) {
                try {
                    ((ServerSocket)bS2.u).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            try {
                try {
                    this.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Loose catch block
     */
    public void b(BS bS, BS bS2) throws Exception {
        block25: {
            int n10;
            block24: {
                BS bS3;
                block23: {
                    n10 = BS.t();
                    try {
                        try {
                            bS3 = (BS)this.U(bS2.C);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n10 != 0) break block23;
                        if (bS3 == null) break block24;
                    }
                    catch (IOException iOException) {
                        throw ta_0.a(iOException);
                    }
                    bS3 = bS;
                }
                try {
                    if (!((String)bS3.C).equals((String)bS2.C)) {
                        throw new Exception("映射 " + (String)bS2.C + " 已存在,请修改名称!");
                    }
                }
                catch (IOException iOException) {
                    throw ta_0.a(iOException);
                }
            }
            ServerSocket serverSocket = null;
            if (bS.F == bS2.F) break block25;
            try {
                Object object;
                block26: {
                    int n11;
                    try {
                        n11 = (Integer)bS2.n();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    serverSocket = new ServerSocket(n11);
                    try {
                        this.s(serverSocket);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bS.Y = false;
                    object = (ServerSocket)bS.u;
                    if (n10 != 0) break block25;
                    try {
                        block27: {
                            if (object == null) break block26;
                            break block27;
                            catch (IOException iOException) {
                                throw ta_0.a(iOException);
                            }
                        }
                        ((ServerSocket)bS.u).close();
                    }
                    catch (IOException iOException) {
                        throw ta_0.a(iOException);
                    }
                }
                bS.u = serverSocket;
                ((HashMap)this.n).remove(bS.F);
                object = ((HashMap)this.n).put(bS2.F, bS2);
            }
            catch (IOException iOException) {
                int n12;
                try {
                    n12 = (Integer)bS2.n();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                throw new Exception("端口 " + n12 + " 已经被占用!");
            }
        }
        bS.C = bS2.C;
        bS.F = bS2.F;
        bS.P = bS2.P;
        bS.J = bS2.J;
        try {
            this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void B() throws Exception {
        block10: {
            O0 o0 = new O0();
            oc_0 oc_02 = new oc_0();
            int n10 = BS.t();
            o0.C("map_list", oc_02);
            if (((ArrayList)this.G).size() == 0) {
                // empty if block
            }
            for (BS bS : (ArrayList)this.G) {
                O0 o02 = new O0();
                try {
                    o02.C("name", (String)bS.C);
                    o02.C("listen_port", bS.F);
                    o02.C("dst_address", (String)bS.P);
                    o02.C("dst_port", bS.J);
                    oc_02.add(o02);
                    if (n10 == 0) {
                        if (n10 == 0) continue;
                        break;
                    }
                    break block10;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw ta_0.a(unsupportedEncodingException);
                }
            }
            try {
                try {
                    this.q((Object)o0.V().getBytes("utf-8"), this.v);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                throw new Exception("保存失败!");
            }
        }
    }

    /*
     * Loose catch block
     */
    void y() {
        block18: {
            String string;
            O0 o0;
            int n10;
            block19: {
                O0 o02;
                block17: {
                    o02 = null;
                    n10 = BS.s();
                    try {
                        String string2;
                        try {
                            string2 = (String)ta_0.G(this.v);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string3 = string2;
                        o02 = O0.y(string3);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        o0 = o02;
                        if (n10 == 0) break block17;
                        if (o0 == null) break block18;
                    }
                    catch (Exception exception) {
                        throw ta_0.a(exception);
                    }
                    o0 = o02;
                }
                string = "map_list";
                if (n10 == 0) break block19;
                try {
                    block20: {
                        if (!o0.containsKey(string)) break block18;
                        break block20;
                        catch (Exception exception) {
                            throw ta_0.a(exception);
                        }
                    }
                    o0 = o02;
                    string = "map_list";
                }
                catch (Exception exception) {
                    throw ta_0.a(exception);
                }
            }
            oc_0 oc_02 = o0.J(string);
            for (int i2 = 0; i2 < oc_02.size(); ++i2) {
                O0 o03 = (O0)oc_02.get(i2);
                BS bS = new BS();
                bS.C = o03.C("name");
                bS.F = o03.b("listen_port");
                bS.P = o03.C("dst_address");
                bS.J = o03.b("dst_port");
                ((ArrayList)this.G).add(bS);
                try {
                    int n11;
                    try {
                        n11 = (Integer)bS.n();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ServerSocket serverSocket = new ServerSocket(n11);
                    try {
                        this.s(serverSocket);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bS.u = serverSocket;
                }
                catch (IOException iOException) {
                    bS.Y = true;
                    iOException.printStackTrace();
                }
                ((HashMap)this.n).put(bS.F, bS);
                if (n10 != 0) continue;
            }
        }
    }

    BS U(String string) {
        BS bS = null;
        Iterator iterator = ((ArrayList)this.G).iterator();
        int n10 = BS.s();
        while (iterator.hasNext()) {
            BS bS2;
            BS bS3 = bS2 = (BS)iterator.next();
            if (n10 != 0) {
                String string2;
                try {
                    string2 = (String)bS3.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!string2.equals(string)) continue;
                bS3 = bS2;
            }
            bS = bS3;
            break;
        }
        return bS;
    }

    public ArrayList Y() {
        return (ArrayList)this.G;
    }

    public void F(ArrayList arrayList) {
        this.G = arrayList;
    }

    void s(ServerSocket serverSocket) {
        try {
            yt_1.F.J(new wh_0(this, serverSocket));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void q(byte[] byArray, String string) throws Exception {
        block11: {
            FileOutputStream fileOutputStream;
            block8: {
                FileOutputStream fileOutputStream2 = null;
                int n10 = BS.t();
                try {
                    fileOutputStream2 = new FileOutputStream(string);
                    fileOutputStream2.write(byArray);
                    fileOutputStream = fileOutputStream2;
                    if (n10 != 0) break block8;
                }
                catch (Exception exception) {
                    try {
                        throw exception;
                    }
                    catch (Throwable throwable) {
                        block10: {
                            FileOutputStream fileOutputStream3;
                            block9: {
                                try {
                                    fileOutputStream3 = fileOutputStream2;
                                    if (n10 != 0) break block9;
                                    if (fileOutputStream3 == null) break block10;
                                }
                                catch (Exception exception2) {
                                    throw ta_0.a(exception2);
                                }
                                fileOutputStream3 = fileOutputStream2;
                            }
                            fileOutputStream3.close();
                        }
                        throw throwable;
                    }
                }
                if (fileOutputStream == null) break block11;
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.close();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static String G(String var0) throws Exception {
        block25: {
            block24: {
                var2_1 = null;
                var3_2 = null;
                var1_3 = BS.t();
                var4_4 = null;
                var5_5 = new File(var0);
                var6_9 = (int)var5_5.length();
                var7_10 = new byte[var6_9];
                var3_2 = new FileInputStream(var5_5);
                var4_4 = new DataInputStream(var3_2);
                var4_4.readFully(var7_10);
                var2_1 = new String(var7_10, "utf-8");
                try {
                    v0 = var3_2;
                    if (var1_3 == 0) {
                        if (v0 == null) break block24;
                    }
                    ** GOTO lbl23
                }
                catch (IOException v1) {
                    throw ta_0.a(v1);
                }
                try {
                    v0 = var3_2;
lbl23:
                    // 2 sources

                    v0.close();
                }
                catch (IOException var5_6) {
                    var5_6.printStackTrace();
                }
            }
            try {
                v2 = var4_4;
                if (var1_3 == 0) {
                    if (v2 == null) break block25;
                }
                ** GOTO lbl38
            }
            catch (IOException v3) {
                throw ta_0.a(v3);
            }
            try {
                v2 = var4_4;
lbl38:
                // 2 sources

                v2.close();
            }
            catch (IOException var5_7) {
                var5_7.printStackTrace();
            }
            break block25;
            catch (Exception var5_8) {
                try {
                    throw var5_8;
                }
                catch (Throwable var8_11) {
                    block27: {
                        block26: {
                            try {
                                v4 = var3_2;
                                if (var1_3 == 0) {
                                    if (v4 == null) break block26;
                                }
                                ** GOTO lbl57
                            }
                            catch (IOException v5) {
                                throw ta_0.a(v5);
                            }
                            try {
                                v4 = var3_2;
lbl57:
                                // 2 sources

                                v4.close();
                            }
                            catch (IOException var9_12) {
                                var9_12.printStackTrace();
                            }
                        }
                        try {
                            v6 = var4_4;
                            if (var1_3 == 0) {
                                if (v6 == null) break block27;
                            }
                            ** GOTO lbl72
                        }
                        catch (IOException v7) {
                            throw ta_0.a(v7);
                        }
                        try {
                            v6 = var4_4;
lbl72:
                            // 2 sources

                            v6.close();
                        }
                        catch (IOException var9_13) {
                            var9_13.printStackTrace();
                        }
                    }
                    throw var8_11;
                }
            }
        }
        return var2_1;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[22];
                var3_1 = 0;
                var2_2 = "*\u00e7\u0086\u0005\b_<VDZ\u00a6\u00c3\u00c2\u0003\u7a28\u53bf:\u000b'\u5d89\u5b95\u5764O\u8ba5\u4fb4\u65a2\u54c9\u79b7e\u000b\u00b4\u00d7\t\u001b\u00db\u0004\u00f7uD\u00af\u00af\u00076\u5d76\u7e20\u8818\u53d0\u7506M\u0005\u0085h\u0000\u000b\u0010\u0005\u00da7\u00eb\u00e0m\u000b['\u00fawF\u00cd\u00fb\u0005\u0093\u00e2\u0019\b\u00a4\u00a3\u0005\u00e7\u00a8\u00d4\u0003J\u000b\u00e2\u00fc\u00cd\f\u00a0\u00a2'\u00e8\b_j\u0005\u4f81\u5bcd\u596a\u8d1e\u00f9\u0003\u660d\u5c71\u00a8\t\u00f5\u00a7\u009dO\u0010\u00b9\u0080Y\u0002\u000b-\u5d24\u5bd4\u57d1g\u8b13\u4fb1\u6574\u5469\u796dq\u0004q\u00a4\u00edm\u0007\u0011\u5dcd\u7ec4\u886f\u534c\u75e8\u00de\u0003\u666a\u5c96D\u000b:S\u00d8\u008b\u00e1\u0016\u00b07\u00ac\u00e7\u00b2\b1\u009a\u00b7\u00c0\u00fe0\u00c9\u00d6";
                var4_3 = "*\u00e7\u0086\u0005\b_<VDZ\u00a6\u00c3\u00c2\u0003\u7a28\u53bf:\u000b'\u5d89\u5b95\u5764O\u8ba5\u4fb4\u65a2\u54c9\u79b7e\u000b\u00b4\u00d7\t\u001b\u00db\u0004\u00f7uD\u00af\u00af\u00076\u5d76\u7e20\u8818\u53d0\u7506M\u0005\u0085h\u0000\u000b\u0010\u0005\u00da7\u00eb\u00e0m\u000b['\u00fawF\u00cd\u00fb\u0005\u0093\u00e2\u0019\b\u00a4\u00a3\u0005\u00e7\u00a8\u00d4\u0003J\u000b\u00e2\u00fc\u00cd\f\u00a0\u00a2'\u00e8\b_j\u0005\u4f81\u5bcd\u596a\u8d1e\u00f9\u0003\u660d\u5c71\u00a8\t\u00f5\u00a7\u009dO\u0010\u00b9\u0080Y\u0002\u000b-\u5d24\u5bd4\u57d1g\u8b13\u4fb1\u6574\u5469\u796dq\u0004q\u00a4\u00edm\u0007\u0011\u5dcd\u7ec4\u886f\u534c\u75e8\u00de\u0003\u666a\u5c96D\u000b:S\u00d8\u008b\u00e1\u0016\u00b07\u00ac\u00e7\u00b2\b1\u009a\u00b7\u00c0\u00fe0\u00c9\u00d6".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 36;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u7aae\u537d;\b\u00a7\u0096\u0098\u00c0R\u00e7\u0013;";
                    var4_3 = "\u7aae\u537d;\b\u00a7\u0096\u0098\u00c0R\u00e7\u0013;".length();
                    var1_4 = 3;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 19;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 44;
                            break;
                        }
                        case 1: {
                            v15 = 10;
                            break;
                        }
                        case 2: {
                            v15 = 40;
                            break;
                        }
                        case 3: {
                            v15 = 48;
                            break;
                        }
                        case 4: {
                            v15 = 39;
                            break;
                        }
                        case 5: {
                            v15 = 85;
                            break;
                        }
                        default: {
                            v15 = 94;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        ta_0.a = var5;
        ta_0.b = new String[22];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAFA0) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 165;
                    break;
                }
                case 1: {
                    n14 = 159;
                    break;
                }
                case 2: {
                    n14 = 228;
                    break;
                }
                case 3: {
                    n14 = 79;
                    break;
                }
                case 4: {
                    n14 = 173;
                    break;
                }
                case 5: {
                    n14 = 192;
                    break;
                }
                case 6: {
                    n14 = 130;
                    break;
                }
                case 7: {
                    n14 = 169;
                    break;
                }
                case 8: {
                    n14 = 212;
                    break;
                }
                case 9: {
                    n14 = 42;
                    break;
                }
                case 10: {
                    n14 = 244;
                    break;
                }
                case 11: {
                    n14 = 148;
                    break;
                }
                case 12: {
                    n14 = 121;
                    break;
                }
                case 13: {
                    n14 = 30;
                    break;
                }
                case 14: {
                    n14 = 28;
                    break;
                }
                case 15: {
                    n14 = 203;
                    break;
                }
                case 16: {
                    n14 = 193;
                    break;
                }
                case 17: {
                    n14 = 181;
                    break;
                }
                case 18: {
                    n14 = 53;
                    break;
                }
                case 19: {
                    n14 = 218;
                    break;
                }
                case 20: {
                    n14 = 151;
                    break;
                }
                case 21: {
                    n14 = 190;
                    break;
                }
                case 22: {
                    n14 = 247;
                    break;
                }
                case 23: {
                    n14 = 227;
                    break;
                }
                case 24: {
                    n14 = 185;
                    break;
                }
                case 25: {
                    n14 = 160;
                    break;
                }
                case 26: {
                    n14 = 103;
                    break;
                }
                case 27: {
                    n14 = 124;
                    break;
                }
                case 28: {
                    n14 = 105;
                    break;
                }
                case 29: {
                    n14 = 242;
                    break;
                }
                case 30: {
                    n14 = 146;
                    break;
                }
                case 31: {
                    n14 = 49;
                    break;
                }
                case 32: {
                    n14 = 0;
                    break;
                }
                case 33: {
                    n14 = 150;
                    break;
                }
                case 34: {
                    n14 = 111;
                    break;
                }
                case 35: {
                    n14 = 15;
                    break;
                }
                case 36: {
                    n14 = 198;
                    break;
                }
                case 37: {
                    n14 = 249;
                    break;
                }
                case 38: {
                    n14 = 63;
                    break;
                }
                case 39: {
                    n14 = 75;
                    break;
                }
                case 40: {
                    n14 = 250;
                    break;
                }
                case 41: {
                    n14 = 210;
                    break;
                }
                case 42: {
                    n14 = 236;
                    break;
                }
                case 43: {
                    n14 = 99;
                    break;
                }
                case 44: {
                    n14 = 104;
                    break;
                }
                case 45: {
                    n14 = 147;
                    break;
                }
                case 46: {
                    n14 = 57;
                    break;
                }
                case 47: {
                    n14 = 65;
                    break;
                }
                case 48: {
                    n14 = 69;
                    break;
                }
                case 49: {
                    n14 = 215;
                    break;
                }
                case 50: {
                    n14 = 80;
                    break;
                }
                case 51: {
                    n14 = 243;
                    break;
                }
                case 52: {
                    n14 = 122;
                    break;
                }
                case 53: {
                    n14 = 48;
                    break;
                }
                case 54: {
                    n14 = 219;
                    break;
                }
                case 55: {
                    n14 = 252;
                    break;
                }
                case 56: {
                    n14 = 129;
                    break;
                }
                case 57: {
                    n14 = 97;
                    break;
                }
                case 58: {
                    n14 = 222;
                    break;
                }
                case 59: {
                    n14 = 120;
                    break;
                }
                case 60: {
                    n14 = 174;
                    break;
                }
                case 61: {
                    n14 = 50;
                    break;
                }
                case 62: {
                    n14 = 123;
                    break;
                }
                case 63: {
                    n14 = 78;
                    break;
                }
                case 64: {
                    n14 = 157;
                    break;
                }
                case 65: {
                    n14 = 47;
                    break;
                }
                case 66: {
                    n14 = 70;
                    break;
                }
                case 67: {
                    n14 = 230;
                    break;
                }
                case 68: {
                    n14 = 37;
                    break;
                }
                case 69: {
                    n14 = 35;
                    break;
                }
                case 70: {
                    n14 = 68;
                    break;
                }
                case 71: {
                    n14 = 170;
                    break;
                }
                case 72: {
                    n14 = 144;
                    break;
                }
                case 73: {
                    n14 = 14;
                    break;
                }
                case 74: {
                    n14 = 216;
                    break;
                }
                case 75: {
                    n14 = 154;
                    break;
                }
                case 76: {
                    n14 = 149;
                    break;
                }
                case 77: {
                    n14 = 98;
                    break;
                }
                case 78: {
                    n14 = 217;
                    break;
                }
                case 79: {
                    n14 = 86;
                    break;
                }
                case 80: {
                    n14 = 12;
                    break;
                }
                case 81: {
                    n14 = 29;
                    break;
                }
                case 82: {
                    n14 = 153;
                    break;
                }
                case 83: {
                    n14 = 191;
                    break;
                }
                case 84: {
                    n14 = 128;
                    break;
                }
                case 85: {
                    n14 = 84;
                    break;
                }
                case 86: {
                    n14 = 164;
                    break;
                }
                case 87: {
                    n14 = 117;
                    break;
                }
                case 88: {
                    n14 = 234;
                    break;
                }
                case 89: {
                    n14 = 133;
                    break;
                }
                case 90: {
                    n14 = 233;
                    break;
                }
                case 91: {
                    n14 = 59;
                    break;
                }
                case 92: {
                    n14 = 188;
                    break;
                }
                case 93: {
                    n14 = 9;
                    break;
                }
                case 94: {
                    n14 = 83;
                    break;
                }
                case 95: {
                    n14 = 24;
                    break;
                }
                case 96: {
                    n14 = 16;
                    break;
                }
                case 97: {
                    n14 = 187;
                    break;
                }
                case 98: {
                    n14 = 26;
                    break;
                }
                case 99: {
                    n14 = 183;
                    break;
                }
                case 100: {
                    n14 = 19;
                    break;
                }
                case 101: {
                    n14 = 3;
                    break;
                }
                case 102: {
                    n14 = 62;
                    break;
                }
                case 103: {
                    n14 = 223;
                    break;
                }
                case 104: {
                    n14 = 90;
                    break;
                }
                case 105: {
                    n14 = 46;
                    break;
                }
                case 106: {
                    n14 = 94;
                    break;
                }
                case 107: {
                    n14 = 205;
                    break;
                }
                case 108: {
                    n14 = 163;
                    break;
                }
                case 109: {
                    n14 = 20;
                    break;
                }
                case 110: {
                    n14 = 166;
                    break;
                }
                case 111: {
                    n14 = 197;
                    break;
                }
                case 112: {
                    n14 = 238;
                    break;
                }
                case 113: {
                    n14 = 51;
                    break;
                }
                case 114: {
                    n14 = 162;
                    break;
                }
                case 115: {
                    n14 = 118;
                    break;
                }
                case 116: {
                    n14 = 10;
                    break;
                }
                case 117: {
                    n14 = 45;
                    break;
                }
                case 118: {
                    n14 = 232;
                    break;
                }
                case 119: {
                    n14 = 17;
                    break;
                }
                case 120: {
                    n14 = 125;
                    break;
                }
                case 121: {
                    n14 = 207;
                    break;
                }
                case 122: {
                    n14 = 72;
                    break;
                }
                case 123: {
                    n14 = 41;
                    break;
                }
                case 124: {
                    n14 = 22;
                    break;
                }
                case 125: {
                    n14 = 175;
                    break;
                }
                case 126: {
                    n14 = 172;
                    break;
                }
                case 127: {
                    n14 = 2;
                    break;
                }
                case 128: {
                    n14 = 38;
                    break;
                }
                case 129: {
                    n14 = 44;
                    break;
                }
                case 130: {
                    n14 = 237;
                    break;
                }
                case 131: {
                    n14 = 156;
                    break;
                }
                case 132: {
                    n14 = 61;
                    break;
                }
                case 133: {
                    n14 = 21;
                    break;
                }
                case 134: {
                    n14 = 246;
                    break;
                }
                case 135: {
                    n14 = 6;
                    break;
                }
                case 136: {
                    n14 = 67;
                    break;
                }
                case 137: {
                    n14 = 71;
                    break;
                }
                case 138: {
                    n14 = 64;
                    break;
                }
                case 139: {
                    n14 = 11;
                    break;
                }
                case 140: {
                    n14 = 143;
                    break;
                }
                case 141: {
                    n14 = 231;
                    break;
                }
                case 142: {
                    n14 = 178;
                    break;
                }
                case 143: {
                    n14 = 138;
                    break;
                }
                case 144: {
                    n14 = 171;
                    break;
                }
                case 145: {
                    n14 = 7;
                    break;
                }
                case 146: {
                    n14 = 4;
                    break;
                }
                case 147: {
                    n14 = 255;
                    break;
                }
                case 148: {
                    n14 = 141;
                    break;
                }
                case 149: {
                    n14 = 137;
                    break;
                }
                case 150: {
                    n14 = 88;
                    break;
                }
                case 151: {
                    n14 = 226;
                    break;
                }
                case 152: {
                    n14 = 81;
                    break;
                }
                case 153: {
                    n14 = 167;
                    break;
                }
                case 154: {
                    n14 = 221;
                    break;
                }
                case 155: {
                    n14 = 158;
                    break;
                }
                case 156: {
                    n14 = 161;
                    break;
                }
                case 157: {
                    n14 = 135;
                    break;
                }
                case 158: {
                    n14 = 93;
                    break;
                }
                case 159: {
                    n14 = 180;
                    break;
                }
                case 160: {
                    n14 = 109;
                    break;
                }
                case 161: {
                    n14 = 132;
                    break;
                }
                case 162: {
                    n14 = 107;
                    break;
                }
                case 163: {
                    n14 = 56;
                    break;
                }
                case 164: {
                    n14 = 74;
                    break;
                }
                case 165: {
                    n14 = 202;
                    break;
                }
                case 166: {
                    n14 = 177;
                    break;
                }
                case 167: {
                    n14 = 142;
                    break;
                }
                case 168: {
                    n14 = 211;
                    break;
                }
                case 169: {
                    n14 = 134;
                    break;
                }
                case 170: {
                    n14 = 240;
                    break;
                }
                case 171: {
                    n14 = 136;
                    break;
                }
                case 172: {
                    n14 = 206;
                    break;
                }
                case 173: {
                    n14 = 189;
                    break;
                }
                case 174: {
                    n14 = 43;
                    break;
                }
                case 175: {
                    n14 = 196;
                    break;
                }
                case 176: {
                    n14 = 208;
                    break;
                }
                case 177: {
                    n14 = 85;
                    break;
                }
                case 178: {
                    n14 = 8;
                    break;
                }
                case 179: {
                    n14 = 54;
                    break;
                }
                case 180: {
                    n14 = 201;
                    break;
                }
                case 181: {
                    n14 = 182;
                    break;
                }
                case 182: {
                    n14 = 112;
                    break;
                }
                case 183: {
                    n14 = 36;
                    break;
                }
                case 184: {
                    n14 = 184;
                    break;
                }
                case 185: {
                    n14 = 87;
                    break;
                }
                case 186: {
                    n14 = 253;
                    break;
                }
                case 187: {
                    n14 = 209;
                    break;
                }
                case 188: {
                    n14 = 23;
                    break;
                }
                case 189: {
                    n14 = 194;
                    break;
                }
                case 190: {
                    n14 = 76;
                    break;
                }
                case 191: {
                    n14 = 152;
                    break;
                }
                case 192: {
                    n14 = 195;
                    break;
                }
                case 193: {
                    n14 = 66;
                    break;
                }
                case 194: {
                    n14 = 213;
                    break;
                }
                case 195: {
                    n14 = 92;
                    break;
                }
                case 196: {
                    n14 = 155;
                    break;
                }
                case 197: {
                    n14 = 200;
                    break;
                }
                case 198: {
                    n14 = 186;
                    break;
                }
                case 199: {
                    n14 = 245;
                    break;
                }
                case 200: {
                    n14 = 239;
                    break;
                }
                case 201: {
                    n14 = 95;
                    break;
                }
                case 202: {
                    n14 = 89;
                    break;
                }
                case 203: {
                    n14 = 77;
                    break;
                }
                case 204: {
                    n14 = 145;
                    break;
                }
                case 205: {
                    n14 = 225;
                    break;
                }
                case 206: {
                    n14 = 126;
                    break;
                }
                case 207: {
                    n14 = 58;
                    break;
                }
                case 208: {
                    n14 = 34;
                    break;
                }
                case 209: {
                    n14 = 91;
                    break;
                }
                case 210: {
                    n14 = 96;
                    break;
                }
                case 211: {
                    n14 = 229;
                    break;
                }
                case 212: {
                    n14 = 33;
                    break;
                }
                case 213: {
                    n14 = 251;
                    break;
                }
                case 214: {
                    n14 = 27;
                    break;
                }
                case 215: {
                    n14 = 119;
                    break;
                }
                case 216: {
                    n14 = 1;
                    break;
                }
                case 217: {
                    n14 = 52;
                    break;
                }
                case 218: {
                    n14 = 108;
                    break;
                }
                case 219: {
                    n14 = 18;
                    break;
                }
                case 220: {
                    n14 = 139;
                    break;
                }
                case 221: {
                    n14 = 254;
                    break;
                }
                case 222: {
                    n14 = 5;
                    break;
                }
                case 223: {
                    n14 = 114;
                    break;
                }
                case 224: {
                    n14 = 224;
                    break;
                }
                case 225: {
                    n14 = 204;
                    break;
                }
                case 226: {
                    n14 = 101;
                    break;
                }
                case 227: {
                    n14 = 40;
                    break;
                }
                case 228: {
                    n14 = 127;
                    break;
                }
                case 229: {
                    n14 = 113;
                    break;
                }
                case 230: {
                    n14 = 13;
                    break;
                }
                case 231: {
                    n14 = 55;
                    break;
                }
                case 232: {
                    n14 = 82;
                    break;
                }
                case 233: {
                    n14 = 73;
                    break;
                }
                case 234: {
                    n14 = 168;
                    break;
                }
                case 235: {
                    n14 = 116;
                    break;
                }
                case 236: {
                    n14 = 115;
                    break;
                }
                case 237: {
                    n14 = 248;
                    break;
                }
                case 238: {
                    n14 = 131;
                    break;
                }
                case 239: {
                    n14 = 100;
                    break;
                }
                case 240: {
                    n14 = 25;
                    break;
                }
                case 241: {
                    n14 = 60;
                    break;
                }
                case 242: {
                    n14 = 39;
                    break;
                }
                case 243: {
                    n14 = 102;
                    break;
                }
                case 244: {
                    n14 = 140;
                    break;
                }
                case 245: {
                    n14 = 235;
                    break;
                }
                case 246: {
                    n14 = 241;
                    break;
                }
                case 247: {
                    n14 = 199;
                    break;
                }
                case 248: {
                    n14 = 176;
                    break;
                }
                case 249: {
                    n14 = 179;
                    break;
                }
                case 250: {
                    n14 = 214;
                    break;
                }
                case 251: {
                    n14 = 220;
                    break;
                }
                case 252: {
                    n14 = 31;
                    break;
                }
                case 253: {
                    n14 = 110;
                    break;
                }
                case 254: {
                    n14 = 106;
                    break;
                }
                default: {
                    n14 = 32;
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
            ta_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

