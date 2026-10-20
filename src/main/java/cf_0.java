/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.QT;
import com.c;
import com.ky_2;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Cf
 */
public class cf_0 {
    static long T;
    static int S;
    private static gs_0 U;
    static ArrayList t;
    static long Q;
    static Random R;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static xB C(String string, int n10, String string2, int n11, lv_2 lv_22, int n12) throws Exception {
        int n13;
        int n14;
        block17: {
            n14 = cf_0.S;
            ServerSocket serverSocket = null;
            int n15 = BS.s();
            int n16 = 0;
            int n17 = 0;
            do {
                try {
                    n13 = n17;
                    if (n15 == 0) break block17;
                    if (n13 >= cf_0.a(19308, 7161391060087373820L)) break;
                }
                catch (IOException iOException) {
                    throw cf_0.a(iOException);
                }
                serverSocket = new ServerSocket(n14);
                n13 = 1;
                if (n15 == 0) break block17;
                n16 = n13;
                try {
                    if (serverSocket == null) break;
                    serverSocket.close();
                    break;
                }
                catch (IOException iOException) {
                    throw cf_0.a(iOException);
                }
                catch (IOException iOException) {
                    try {
                        iOException.printStackTrace();
                        ++n14;
                        if (n15 == 0) continue;
                    }
                    catch (Throwable throwable) {
                        block19: {
                            ServerSocket serverSocket2;
                            block18: {
                                try {
                                    serverSocket2 = serverSocket;
                                    if (n15 == 0) break block18;
                                    if (serverSocket2 == null) break block19;
                                }
                                catch (IOException iOException2) {
                                    throw cf_0.a(iOException2);
                                }
                                serverSocket2 = serverSocket;
                            }
                            serverSocket2.close();
                        }
                        throw throwable;
                    }
                    try {
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                    }
                    catch (IOException iOException3) {
                        throw cf_0.a(iOException3);
                    }
                }
                ++n17;
            } while (n15 != 0);
            n13 = n16;
        }
        try {
            if (n13 == 0) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw cf_0.a(iOException);
        }
        xB xB2 = new xB(n14, string, n10, string2, n11, lv_22, n12);
        cf_0.S = cf_0.S + 1;
        return xB2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ow_2 Q(String var0, int var1_1, int var2_2, QT var3_3) throws Exception {
        var5_4 = new ow_2();
        var6_5 = null;
        var7_6 = null;
        var8_7 = null;
        var9_8 = 0;
        var4_9 = BS.t();
        var10_10 = 0;
        do {
            block143: {
                block140: {
                    block131: {
                        block132: {
                            block134: {
                                block133: {
                                    block155: {
                                        block129: {
                                            block150: {
                                                block130: {
                                                    block152: {
                                                        block153: {
                                                            block128: {
                                                                block123: {
                                                                    block144: {
                                                                        try {
                                                                            v0 = (gs_0)cf_0.K();
                                                                        }
                                                                        catch (InvocationTargetException v1) {
                                                                            throw v1.getTargetException();
                                                                        }
                                                                        var11_11 = v0;
                                                                        if (var11_11 != null) break block144;
                                                                        try {
                                                                            if (var4_9 == 0) {
                                                                                throw new Exception("获取加速节点失败!");
                                                                            }
                                                                            ** GOTO lbl41
                                                                        }
                                                                        catch (IOException v2) {
                                                                            throw cf_0.a(v2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v3 = (String)var11_11.V();
                                                                    }
                                                                    catch (InvocationTargetException v4) {
                                                                        throw v4.getTargetException();
                                                                    }
                                                                    try {
                                                                        v5 = (Integer)var11_11.l();
                                                                    }
                                                                    catch (InvocationTargetException v6) {
                                                                        throw v6.getTargetException();
                                                                    }
                                                                    var6_5 = new Socket(v3, v5);
                                                                    var6_5.setSoTimeout(dd_1.O);
                                                                    var6_5.setTcpNoDelay(true);
                                                                    var7_6 = new DataInputStream(var6_5.getInputStream());
                                                                    var8_7 = new DataOutputStream(var6_5.getOutputStream());
lbl41:
                                                                    // 2 sources

                                                                    try {
                                                                        v7 = (Integer)var11_11.l();
                                                                    }
                                                                    catch (InvocationTargetException v8) {
                                                                        throw v8.getTargetException();
                                                                    }
                                                                    try {
                                                                        v9 = (byte[])cf_0.v(v7);
                                                                    }
                                                                    catch (InvocationTargetException v10) {
                                                                        throw v10.getTargetException();
                                                                    }
                                                                    var12_12 = v9;
                                                                    var8_7.write(var12_12);
                                                                    var8_7.write((int)(cf_0.T + 1L));
                                                                    var13_20 = false;
                                                                    var14_21 = new ByteArrayOutputStream();
                                                                    var15_22 = 0;
                                                                    for (var16_24 = 0; var16_24 < cf_0.a(17883, 3106107496560128322L); ++var16_24) {
                                                                        block127: {
                                                                            block148: {
                                                                                block126: {
                                                                                    block125: {
                                                                                        block124: {
                                                                                            var17_26 = var7_6.read();
                                                                                            var14_21.write(var17_26);
                                                                                            var18_28 = var14_21.toByteArray();
                                                                                            var19_29 = new String(var18_28, "utf-8");
                                                                                            v11 = var19_29.endsWith("");
                                                                                            if (var4_9 != 0) break block123;
                                                                                            try {
                                                                                                block145: {
                                                                                                    if (var4_9 != 0) break block124;
                                                                                                    break block145;
                                                                                                    catch (IOException v12) {
                                                                                                        throw cf_0.a(v12);
                                                                                                    }
                                                                                                }
                                                                                                if (v11) {
                                                                                                }
                                                                                                ** GOTO lbl88
                                                                                            }
                                                                                            catch (IOException v13) {
                                                                                                throw cf_0.a(v13);
                                                                                            }
                                                                                            var17_26 = var7_6.read();
                                                                                            try {
                                                                                                cfr_temp_0 = (long)var17_26 - cf_0.T;
                                                                                                v11 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                if (var4_9 != 0) break block123;
                                                                                                if (v11) break;
                                                                                            }
                                                                                            catch (IOException v14) {
                                                                                                throw cf_0.a(v14);
                                                                                            }
                                                                                            var13_20 = true;
                                                                                            try {
                                                                                                if (var4_9 == 0) break;
lbl88:
                                                                                                // 2 sources

                                                                                                v15 = var16_24;
                                                                                            }
                                                                                            catch (IOException v16) {
                                                                                                throw cf_0.a(v16);
                                                                                            }
                                                                                        }
                                                                                        if (var4_9 != 0) break block125;
                                                                                        try {
                                                                                            block146: {
                                                                                                if (v15 <= cf_0.a(10381, 6659382902339738646L)) continue;
                                                                                                break block146;
                                                                                                catch (IOException v17) {
                                                                                                    throw cf_0.a(v17);
                                                                                                }
                                                                                            }
                                                                                            v15 = var15_22;
                                                                                        }
                                                                                        catch (IOException v18) {
                                                                                            throw cf_0.a(v18);
                                                                                        }
                                                                                    }
                                                                                    if (var4_9 != 0) break block126;
                                                                                    try {
                                                                                        block147: {
                                                                                            if (v15 != 0) continue;
                                                                                            break block147;
                                                                                            catch (IOException v19) {
                                                                                                throw cf_0.a(v19);
                                                                                            }
                                                                                        }
                                                                                        v15 = (int)var19_29.startsWith("HTTP/");
                                                                                    }
                                                                                    catch (IOException v20) {
                                                                                        throw cf_0.a(v20);
                                                                                    }
                                                                                }
                                                                                if (var4_9 != 0) break block127;
                                                                                if (v15 != 0) ** GOTO lbl132
                                                                                break block148;
                                                                                catch (IOException v21) {
                                                                                    throw cf_0.a(v21);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block149: {
                                                                                    if (var4_9 == 0) break;
                                                                                    break block149;
                                                                                    catch (IOException v22) {
                                                                                        throw cf_0.a(v22);
                                                                                    }
                                                                                }
                                                                                v15 = 1;
                                                                            }
                                                                            catch (IOException v23) {
                                                                                throw cf_0.a(v23);
                                                                            }
                                                                        }
                                                                        var15_22 = v15;
                                                                        if (var4_9 == 0) continue;
                                                                    }
                                                                    v11 = var13_20;
                                                                }
                                                                if (!v11) break block150;
                                                                var16_23 = new O0();
                                                                var16_23.C("dst_address", var0);
                                                                var16_23.C("dst_port", var1_1);
                                                                var17_25 = var16_23.toString().getBytes("utf-8");
                                                                var8_7.writeInt(var17_25.length);
                                                                var8_7.write(var17_25);
                                                                var18_27 = var7_6.readInt();
                                                                var19_29 = new byte[var18_27];
                                                                var7_6.readFully((byte[])var19_29);
                                                                var20_30 = O0.y(new String((byte[])var19_29, "utf-8"));
                                                                var21_31 = var20_30.b("code");
                                                                var22_32 = var20_30.C("message");
                                                                if (var4_9 != 0) break block128;
                                                                try {
                                                                    block151: {
                                                                        if (var21_31 != 1) ** GOTO lbl197
                                                                        break block151;
                                                                        catch (IOException v24) {
                                                                            throw cf_0.a(v24);
                                                                        }
                                                                    }
                                                                    try {
                                                                        var5_4.S(var6_5);
                                                                    }
                                                                    catch (InvocationTargetException v25) {
                                                                        throw v25.getTargetException();
                                                                    }
                                                                }
                                                                catch (IOException v26) {
                                                                    throw cf_0.a(v26);
                                                                }
                                                            }
                                                            try {
                                                                v27 = (PipedInputStream)cf_0.g((Object)var7_6, var2_2);
                                                            }
                                                            catch (InvocationTargetException v28) {
                                                                throw v28.getTargetException();
                                                            }
                                                            var23_33 = v27;
                                                            try {
                                                                var5_4.R(var23_33);
                                                            }
                                                            catch (InvocationTargetException v29) {
                                                                throw v29.getTargetException();
                                                            }
                                                            try {
                                                                var5_4.G(var8_7);
                                                            }
                                                            catch (InvocationTargetException v30) {
                                                                throw v30.getTargetException();
                                                            }
                                                            var9_8 = 1;
                                                            if (var4_9 == 0) break block129;
lbl197:
                                                            // 3 sources

                                                            v31 = var3_3;
                                                            if (var4_9 != 0) break block152;
                                                            break block153;
                                                            catch (IOException v32) {
                                                                throw cf_0.a(v32);
                                                            }
                                                        }
                                                        try {
                                                            block154: {
                                                                if (v31 == null) break block130;
                                                                break block154;
                                                                catch (IOException v33) {
                                                                    throw cf_0.a(v33);
                                                                }
                                                            }
                                                            var3_3.a("连接加速服务器失败");
                                                            v31 = var3_3;
                                                        }
                                                        catch (IOException v34) {
                                                            throw cf_0.a(v34);
                                                        }
                                                    }
                                                    v31.K();
                                                }
                                                throw new Exception("加速失败1 " + var21_31 + " " + var22_32);
                                            }
                                            throw new Exception("协议错误!");
                                        }
                                        v35 = var9_8;
                                        if (var4_9 != 0) break block131;
                                        if (v35 != 0) break block132;
                                        break block155;
                                        catch (IOException v36) {
                                            throw cf_0.a(v36);
                                        }
                                    }
                                    try {
                                        block156: {
                                            v37 = var6_5;
                                            if (var4_9 != 0) ** GOTO lbl243
                                            break block156;
                                            catch (IOException v38) {
                                                throw cf_0.a(v38);
                                            }
                                        }
                                        if (v37 == null) break block133;
                                    }
                                    catch (IOException v39) {
                                        throw cf_0.a(v39);
                                    }
                                    try {
                                        v37 = var6_5;
lbl243:
                                        // 2 sources

                                        v37.close();
                                    }
                                    catch (IOException var12_13) {
                                        var12_13.printStackTrace();
                                    }
                                }
                                try {
                                    v40 = var7_6;
                                    if (var4_9 == 0) {
                                        if (v40 == null) break block134;
                                    }
                                    ** GOTO lbl258
                                }
                                catch (IOException v41) {
                                    throw cf_0.a(v41);
                                }
                                try {
                                    v40 = var7_6;
lbl258:
                                    // 2 sources

                                    v40.close();
                                }
                                catch (IOException var12_14) {
                                    var12_14.printStackTrace();
                                }
                            }
                            try {
                                v42 = var8_7;
                                if (var4_9 == 0) {
                                    if (v42 == null) break block132;
                                }
                                ** GOTO lbl273
                            }
                            catch (IOException v43) {
                                throw cf_0.a(v43);
                            }
                            try {
                                v42 = var8_7;
lbl273:
                                // 2 sources

                                v42.close();
                            }
                            catch (IOException var12_15) {
                                var12_15.printStackTrace();
                            }
                            break block132;
                            catch (Exception var12_16) {
                                block136: {
                                    block135: {
                                        try {
                                            var12_16.printStackTrace();
                                            v35 = var9_8;
                                            if (var4_9 != 0) break block131;
                                        }
                                        catch (Throwable var24_34) {
                                            block137: {
                                                block139: {
                                                    block138: {
                                                        try {
                                                            try {
                                                                if (var9_8 != 0) break block137;
                                                                v44 = var6_5;
                                                                if (var4_9 == 0) {
                                                                }
                                                                ** GOTO lbl299
                                                            }
                                                            catch (IOException v45) {
                                                                throw cf_0.a(v45);
                                                            }
                                                            if (v44 == null) break block138;
                                                        }
                                                        catch (IOException v46) {
                                                            throw cf_0.a(v46);
                                                        }
                                                        try {
                                                            v44 = var6_5;
lbl299:
                                                            // 2 sources

                                                            v44.close();
                                                        }
                                                        catch (IOException var25_35) {
                                                            var25_35.printStackTrace();
                                                        }
                                                    }
                                                    try {
                                                        v47 = var7_6;
                                                        if (var4_9 == 0) {
                                                            if (v47 == null) break block139;
                                                        }
                                                        ** GOTO lbl314
                                                    }
                                                    catch (IOException v48) {
                                                        throw cf_0.a(v48);
                                                    }
                                                    try {
                                                        v47 = var7_6;
lbl314:
                                                        // 2 sources

                                                        v47.close();
                                                    }
                                                    catch (IOException var25_36) {
                                                        var25_36.printStackTrace();
                                                    }
                                                }
                                                try {
                                                    v49 = var8_7;
                                                    if (var4_9 == 0) {
                                                        if (v49 == null) break block137;
                                                    }
                                                    ** GOTO lbl329
                                                }
                                                catch (IOException v50) {
                                                    throw cf_0.a(v50);
                                                }
                                                try {
                                                    v49 = var8_7;
lbl329:
                                                    // 2 sources

                                                    v49.close();
                                                }
                                                catch (IOException var25_38) {
                                                    var25_38.printStackTrace();
                                                }
                                            }
                                            throw var24_34;
                                        }
                                        if (v35 != 0) break block132;
                                        try {
                                            block157: {
                                                v51 = var6_5;
                                                if (var4_9 != 0) ** GOTO lbl350
                                                break block157;
                                                catch (IOException v52) {
                                                    throw cf_0.a(v52);
                                                }
                                            }
                                            if (v51 == null) break block135;
                                        }
                                        catch (IOException v53) {
                                            throw cf_0.a(v53);
                                        }
                                        try {
                                            v51 = var6_5;
lbl350:
                                            // 2 sources

                                            v51.close();
                                        }
                                        catch (IOException var12_17) {
                                            var12_17.printStackTrace();
                                        }
                                    }
                                    try {
                                        v54 = var7_6;
                                        if (var4_9 == 0) {
                                            if (v54 == null) break block136;
                                        }
                                        ** GOTO lbl365
                                    }
                                    catch (IOException v55) {
                                        throw cf_0.a(v55);
                                    }
                                    try {
                                        v54 = var7_6;
lbl365:
                                        // 2 sources

                                        v54.close();
                                    }
                                    catch (IOException var12_18) {
                                        var12_18.printStackTrace();
                                    }
                                }
                                try {
                                    v56 = var8_7;
                                    if (var4_9 == 0) {
                                        if (v56 == null) break block132;
                                    }
                                    ** GOTO lbl380
                                }
                                catch (IOException v57) {
                                    throw cf_0.a(v57);
                                }
                                try {
                                    v56 = var8_7;
lbl380:
                                    // 2 sources

                                    v56.close();
                                }
                                catch (IOException var12_19) {
                                    var12_19.printStackTrace();
                                }
                            }
                        }
                        v35 = var9_8;
                    }
                    try {
                        block141: {
                            try {
                                try {
                                    if (var4_9 != 0) break block140;
                                    if (v35 == 0) break block141;
                                }
                                catch (IOException v58) {
                                    throw cf_0.a(v58);
                                }
                                if (var4_9 == 0) break;
                            }
                            catch (IOException v59) {
                                throw cf_0.a(v59);
                            }
                        }
                        v35 = var10_10;
                    }
                    catch (IOException v60) {
                        throw cf_0.a(v60);
                    }
                }
                try {
                    block142: {
                        try {
                            if (v35 >= true) break block142;
                            try {
                                cf_0.S();
                            }
                            catch (InvocationTargetException v61) {
                                throw v61.getTargetException();
                            }
                            if (var4_9 == 0) break block143;
                        }
                        catch (IOException v62) {
                            throw cf_0.a(v62);
                        }
                    }
                    throw new Exception("加速失败2 ");
                }
                catch (IOException v63) {
                    throw cf_0.a(v63);
                }
            }
            ++var10_10;
        } while (var4_9 == 0);
        return var5_4;
    }

    public static synchronized gs_0 K() {
        if ((gs_0)cf_0.U == null || System.currentTimeMillis() - cf_0.Q > cf_0.b(4801, 6804444288997570672L)) {
            try {
                cf_0.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return (gs_0)cf_0.U;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void S() {
        block80: {
            block81: {
                block75: {
                    block74: {
                        var1 = (String)dd_1.U;
                        var0_1 = BS.t();
                        try {
                            block72: {
                                block71: {
                                    try {
                                        v0 = (byte[])bh_2.Y(var1);
                                    }
                                    catch (InvocationTargetException v1) {
                                        throw v1.getTargetException();
                                    }
                                    var2_2 = v0;
                                    var3_3 = new String(var2_2, "utf-8");
                                    var4_6 = O0.y(var3_3);
                                    var5_9 = var4_6.J("acce_node");
                                    var6_10 = new ArrayList<gs_0>();
                                    for (var7_11 = 0; var7_11 < var5_9.size(); ++var7_11) {
                                        var8_13 = var5_9.V(var7_11);
                                        var9_15 = new gs_0(var8_13.C("host"), var8_13.b("port"), var8_13.C("name"));
                                        try {
                                            var6_10.add(var9_15);
                                            if (var0_1 == 0) {
                                                if (var0_1 == 0) continue;
                                                break;
                                            }
                                            break block71;
                                        }
                                        catch (Exception v2) {
                                            throw cf_0.a(v2);
                                        }
                                    }
                                    cf_0.t = var6_10;
                                    cf_0.Q = System.currentTimeMillis();
                                }
                                var7_12 = Executors.newCachedThreadPool();
                                for (var8_14 = 0; var8_14 < ((ArrayList)cf_0.t).size(); ++var8_14) {
                                    var9_15 = (gs_0)((ArrayList)cf_0.t).get(var8_14);
                                    var10_16 = new ls_1(var9_15);
                                    try {
                                        var7_12.submit(var10_16);
                                        if (var0_1 == 0) {
                                            if (var0_1 == 0) continue;
                                            break;
                                        }
                                        break block72;
                                    }
                                    catch (Exception v3) {
                                        throw cf_0.a(v3);
                                    }
                                }
                                var7_12.awaitTermination(cf_0.b(12131, 3772689252854105552L), TimeUnit.SECONDS);
                                var7_12.shutdown();
                            }
                            for (var8_14 = 0; var8_14 < ((ArrayList)cf_0.t).size(); ++var8_14) {
                                var9_15 = (gs_0)((ArrayList)cf_0.t).get(var8_14);
                                try {
                                    if (var0_1 == 0 && var0_1 == 0) continue;
                                    break;
                                }
                                catch (Exception v4) {
                                    throw cf_0.a(v4);
                                }
                            }
                        }
                        catch (Exception var3_4) {
                            // empty catch block
                        }
                        try {
                            v5 = ((ArrayList)cf_0.t).size();
                            if (var0_1 != 0) break block74;
                            if (v5 <= 0) return;
                        }
                        catch (Exception v6) {
                            throw cf_0.a(v6);
                        }
                        v5 = var3_5 = 0;
                    }
                    while (var3_5 < cf_0.a(23735, 7972887903114848303L)) {
                        block79: {
                            block78: {
                                block76: {
                                    var4_7 = new Random().nextInt(((ArrayList)cf_0.t).size());
                                    var5_9 = (gs_0)((ArrayList)cf_0.t).get(var4_7);
                                    try {
                                        block77: {
                                            try {
                                                try {
                                                    try {
                                                        v7 = (gs_0)cf_0.U;
                                                        if (var0_1 != 0) break block75;
                                                        if (var0_1 != 0) break block76;
                                                    }
                                                    catch (Exception v8) {
                                                        throw cf_0.a(v8);
                                                    }
                                                    if (v7 != null) break block77;
                                                }
                                                catch (Exception v9) {
                                                    throw cf_0.a(v9);
                                                }
                                                cf_0.U = var5_9;
                                                if (var0_1 == 0) break;
                                            }
                                            catch (Exception v10) {
                                                throw cf_0.a(v10);
                                            }
                                        }
                                        v11 = var5_9;
                                    }
                                    catch (Exception v12) {
                                        throw cf_0.a(v12);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                v13 = (Integer)v11.H();
                                            }
                                            catch (InvocationTargetException v14) {
                                                throw v14.getTargetException();
                                            }
                                            if (var0_1 != 0) break block78;
                                            try {
                                                v15 = (Integer)cf_0.U.H();
                                            }
                                            catch (InvocationTargetException v16) {
                                                throw v16.getTargetException();
                                            }
                                            if (v13 != v15) {
                                            }
                                            ** GOTO lbl147
                                        }
                                        catch (Exception v17) {
                                            throw cf_0.a(v17);
                                        }
                                        v18 = var5_9;
                                        if (var0_1 != 0) break block79;
                                    }
                                    catch (Exception v19) {
                                        throw cf_0.a(v19);
                                    }
                                    try {
                                        v13 = (int)((Boolean)v18.x()).booleanValue();
                                    }
                                    catch (InvocationTargetException v20) {
                                        throw v20.getTargetException();
                                    }
                                }
                                catch (Exception v21) {
                                    throw cf_0.a(v21);
                                }
                            }
                            try {
                                try {
                                    if (v13 != 0 || var0_1 != 0) {
                                    }
                                    ** GOTO lbl147
                                }
                                catch (Exception v22) {
                                    throw cf_0.a(v22);
                                }
                                v18 = var5_9;
                            }
                            catch (Exception v23) {
                                throw cf_0.a(v23);
                            }
                        }
                        try {
                            cf_0.U = v18;
                            if (var0_1 == 0) break;
lbl147:
                            // 3 sources

                            ++var3_5;
                            if (var0_1 == 0) continue;
                            break;
                        }
                        catch (Exception v24) {
                            throw cf_0.a(v24);
                        }
                    }
                    v7 = (gs_0)cf_0.U;
                }
                try {
                    if (var0_1 != 0) break block80;
                    if (v7 != null) break block81;
                }
                catch (Exception v25) {
                    throw cf_0.a(v25);
                }
                for (var3_5 = 0; var3_5 < cf_0.a(20822, 1959913612749596108L); ++var3_5) {
                    block84: {
                        block82: {
                            var4_8 = new Random().nextInt(((ArrayList)cf_0.t).size());
                            var5_9 = (gs_0)((ArrayList)cf_0.t).get(var4_8);
                            try {
                                block83: {
                                    try {
                                        try {
                                            try {
                                                v7 = (gs_0)cf_0.U;
                                                if (var0_1 != 0) break block80;
                                                if (var0_1 != 0) break block82;
                                            }
                                            catch (Exception v26) {
                                                throw cf_0.a(v26);
                                            }
                                            if (v7 != null) break block83;
                                        }
                                        catch (Exception v27) {
                                            throw cf_0.a(v27);
                                        }
                                        cf_0.U = var5_9;
                                        if (var0_1 == 0) break;
                                    }
                                    catch (Exception v28) {
                                        throw cf_0.a(v28);
                                    }
                                }
                                v29 = var5_9;
                            }
                            catch (Exception v30) {
                                throw cf_0.a(v30);
                            }
                        }
                        try {
                            block85: {
                                try {
                                    try {
                                        if (var0_1 != 0) break block84;
                                        try {
                                            v31 = (Integer)v29.H();
                                        }
                                        catch (InvocationTargetException v32) {
                                            throw v32.getTargetException();
                                        }
                                        try {
                                            v33 = (Integer)cf_0.U.H();
                                        }
                                        catch (InvocationTargetException v34) {
                                            throw v34.getTargetException();
                                        }
                                        if (v31 != v33) break block85;
                                    }
                                    catch (Exception v35) {
                                        throw cf_0.a(v35);
                                    }
                                    if (var0_1 == 0) continue;
                                }
                                catch (Exception v36) {
                                    throw cf_0.a(v36);
                                }
                            }
                            v29 = var5_9;
                        }
                        catch (Exception v37) {
                            throw cf_0.a(v37);
                        }
                    }
                    try {
                        cf_0.U = v29;
                        if (var0_1 == 0) break;
                        if (var0_1 == 0) continue;
                        break;
                    }
                    catch (Exception v38) {
                        throw cf_0.a(v38);
                    }
                }
            }
            v7 = (gs_0)cf_0.U;
        }
        try {
            if (v7 == null) return;
            cf_0.Q = System.currentTimeMillis();
            return;
        }
        catch (Exception v39) {
            throw cf_0.a(v39);
        }
    }

    static PipedInputStream g(InputStream inputStream, int n10) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = null;
        try {
            pipedInputStream = new PipedInputStream(pipedOutputStream);
            try {
                yt_1.F.J(new yc_2(inputStream, n10, pipedOutputStream));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return pipedInputStream;
    }

    public static byte[] m() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP/1.1 200 OK");
        stringBuffer.append("Server: Apache/2.2.15 (CentOS)");
        stringBuffer.append("Accept-Ranges: bytes");
        stringBuffer.append("Content-Length: " + Math.abs(((Random)cf_0.R).nextInt()) + "");
        int n10 = BS.s();
        stringBuffer.append("Connection: Keep-Alive");
        stringBuffer.append("Content-Type: application/octet-stream");
        stringBuffer.append("");
        String string = stringBuffer.toString();
        int n11 = n10;
        byte[] byArray = string.getBytes();
        int n12 = byArray.length;
        if (ky_2.F() != null) {
            BS.q(++n11);
        }
        return byArray;
    }

    public static byte[] v(int n10) {
        String string;
        String string2;
        String string3;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            string3 = (String)cf_0.A(5 + ((Random)cf_0.R).nextInt(cf_0.a(1612, 3269765134917874385L)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string4 = string3 + ".com";
        try {
            string2 = (String)cf_0.A(cf_0.a(31289, 2273142890505424550L) + ((Random)cf_0.R).nextInt(cf_0.a(21049, 3191785575528982181L)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)cf_0.A(2 + ((Random)cf_0.R).nextInt(5));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        stringBuffer.append("GET /" + string2 + "." + string + " HTTP/1.1");
        stringBuffer.append("Accept: application/x-ms-application, image/jpeg, application/xaml+xml, image/gif, image/pjpeg, application/x-ms-xbap, */*");
        int n11 = BS.t();
        stringBuffer.append("Accept-Language: zh-CN");
        stringBuffer.append("Accept-Encoding: gzip, deflate");
        stringBuffer.append("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0");
        stringBuffer.append("Host: " + string4 + "");
        int n12 = n11;
        stringBuffer.append("Connection: Keep-Alive");
        stringBuffer.append("");
        String string5 = stringBuffer.toString();
        byte[] byArray = string5.getBytes();
        if (n12 != 0) {
            ky_2.K(new String[1]);
        }
        return byArray;
    }

    public static String A(int n10) {
        StringBuffer stringBuffer;
        block2: {
            String string = "abcdefghkmnopqrstuvwxyz";
            Random random = new Random();
            int n11 = BS.s();
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i2 = 0; i2 < n10; ++i2) {
                int n12 = random.nextInt(string.length());
                stringBuffer = stringBuffer2.append(string.charAt(n12));
                if (n11 != 0) {
                    if (n11 != 0) continue;
                }
                break block2;
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[35];
                                var19_1 = 0;
                                var18_2 = "\u0006v\u0005\u5357\u8ba9\u9518\u8bee\u0090\u0004n\u00c6\u008ca\u0004\u00bcg^\u00c1\u0002\u00ea\u0096\u0016J\u00e9\u000e\u00186\u0017>=\u00b2\u009c3\u00dd7\u00e3\u00ac\u00ff\u0085\u00ea\u000b}\u000e\u00cf\u0018E\u00ff\u00a0\\Z\u00e2]M\u00a2\u00ce\u00a3\u00d2\u00eb\u00b0M3\u0000\u0016lk\u00b1;\u001f\u00e9\u0004\u000bwGF\u0005\u00f8g\u00eft\u00e7 \u0018TD\u00af\u007f\u00e1\u0017\u00f4\u0098]\u0090HP$^\u0081-es\u00e7\u0080\u00e3\u00d2\u00fcT\u0099\u0086S2\u00de\u00fcW\t\u8328\u534e\u52a9\u9095\u828b\u705e\u5939\u8d17\u008d\t\u8f9d\u6371\u525b\u906f\u675a\u5219\u5624\u59f0\u8d58\u000bG}\u00d5\u00f5\u00bc\u00e6WOPBX\u0018\u008d\u008e\u00b9ry'9\u00f5.\u00d920\u00d9\u00ec\u000b\u00b8\u00c8guE\u0092\u00fe{Q\u0005Fq~\u00ac\u00b6\u000bL$X\u0089\u0018H\u0081\u00e4!\u009e\u00d1\u0010;\u00b0o\u00af\u00a3\u00c8b\u00e0f\u00bc(\u00b1{~\u00d8\u0016\u0018\u0001\u00e3gY\u001b?\u009b&\u0006\"\u00a5\u001a\u00f7T\u00a1\u00a7\u0090\u00bc\u00d6&WuPn\u0005C&\u0098\\\t\u0006\u00cfV\u0086s\u007f\u001d\t\u00f4\u00a3\u00fdQg$\u009c4\u00e8V\u0018\u0090\u00d42\u00f6\u0092\u009a)*\u00d5\u0093\u00e8\u00eb\u00fd\u0094\u00c8\u0086~\u00d8\u00a8\u00c8\u0086&V\u00951_^\u00bc\u009bE\u00cd\u0099C\u00e8\u00b8iP\u00a3R\u00ea\u00eaA+\u00f5\u00a3\u00fdO:\u00cc\u00dd_\u00bf\u0018\u009ej\u00b2\u009aZ\u00d0a\u00d3\u00ae\u00bd\u00b3\u00bf?XI\u00a6x^\u0013\u00c9\u0016\u00b13\u00e7(\u001c\u000e\u00f7\u0013\u0095\u00f3\u0012\u0007\u00a7\u0014\nw\u00b5=5\u0004\u0096j\u0089\u00f4\u0017\u0097?\u0091\u00e2\u00d0{\u001f\u00da\u009f\u001e\u00d4\u00e4\u00e0\u00c4g(\u00e9\"9AL\u00bf\u0018\u0004\u00ea`\u00dek\b;#\u00b6i\u00d4_=j(\u00cb\u00fcq&`\u00f9\u001a\u00c6qd\u00cf7\u0014\u00a4\u00e9\\M\u00d66\u00f1H2\u00b1\u009eS\u00f6\u000f\u00dc`m\u00cf\u0006\u00f8\u0095\u00dbZ\u00ba\u00a2X\u0016\u0011jg\u0015-\u00dbg4\u00bd\u00d1\u00dfa7\u00934j\u00b1( ^\u00ad\u00cdEh\u00cbU\u0012\n[\u0006\u00feL\u001e\u00b4\u00a4?\u009d\u00aa_ \u00ab#_c&x\u0083\u00d1cC%|\u00a7\u00ad\u00b3\u0090\u0081\u0006\u00dfm{\u00b4\u001d\f\u001d\u00a8\u00f1\u00f2W\u0084H\u0094y\u0002\u00a9\u00f6\u0097*\u00a3\u00d3\u0011\u00f1\u00edTN\u0007\u00f7\u00bd\u00ccy\u0016\u00eeN\u00d1\u0096\u0002<\u00b5M\u0006\u00e7\u001c\u00a8\u009ag\u00c9R\u0010\u0018\u00e5jf\u00ef\u00c8\u008d\u00c57\u00d4B\u008b\u00c2\u00c1\u00c3e\u00f5\u00aa\u0013[\u00e1\u00b8\u000e\u00f9c\u00dfO\u0090\u00d7\u00ab\u0010\u0012.R\u00ce3\u00072Je(SO\u00e4\u00b3Q\u00db\u00f8\u00f4\u00fd(_\u0091\u0084\u0081\u00c0\u00aa\u00e1\u00f2e\u0088d\u00e4x\u000b\u0007\u00e9\r\u0006\u528f\u9048\u5939\u8d9f\u008a\u00fb\u0006\u5285\u901c\u5978\u8d15\u00a1\u00aa";
                                var20_3 = "\u0006v\u0005\u5357\u8ba9\u9518\u8bee\u0090\u0004n\u00c6\u008ca\u0004\u00bcg^\u00c1\u0002\u00ea\u0096\u0016J\u00e9\u000e\u00186\u0017>=\u00b2\u009c3\u00dd7\u00e3\u00ac\u00ff\u0085\u00ea\u000b}\u000e\u00cf\u0018E\u00ff\u00a0\\Z\u00e2]M\u00a2\u00ce\u00a3\u00d2\u00eb\u00b0M3\u0000\u0016lk\u00b1;\u001f\u00e9\u0004\u000bwGF\u0005\u00f8g\u00eft\u00e7 \u0018TD\u00af\u007f\u00e1\u0017\u00f4\u0098]\u0090HP$^\u0081-es\u00e7\u0080\u00e3\u00d2\u00fcT\u0099\u0086S2\u00de\u00fcW\t\u8328\u534e\u52a9\u9095\u828b\u705e\u5939\u8d17\u008d\t\u8f9d\u6371\u525b\u906f\u675a\u5219\u5624\u59f0\u8d58\u000bG}\u00d5\u00f5\u00bc\u00e6WOPBX\u0018\u008d\u008e\u00b9ry'9\u00f5.\u00d920\u00d9\u00ec\u000b\u00b8\u00c8guE\u0092\u00fe{Q\u0005Fq~\u00ac\u00b6\u000bL$X\u0089\u0018H\u0081\u00e4!\u009e\u00d1\u0010;\u00b0o\u00af\u00a3\u00c8b\u00e0f\u00bc(\u00b1{~\u00d8\u0016\u0018\u0001\u00e3gY\u001b?\u009b&\u0006\"\u00a5\u001a\u00f7T\u00a1\u00a7\u0090\u00bc\u00d6&WuPn\u0005C&\u0098\\\t\u0006\u00cfV\u0086s\u007f\u001d\t\u00f4\u00a3\u00fdQg$\u009c4\u00e8V\u0018\u0090\u00d42\u00f6\u0092\u009a)*\u00d5\u0093\u00e8\u00eb\u00fd\u0094\u00c8\u0086~\u00d8\u00a8\u00c8\u0086&V\u00951_^\u00bc\u009bE\u00cd\u0099C\u00e8\u00b8iP\u00a3R\u00ea\u00eaA+\u00f5\u00a3\u00fdO:\u00cc\u00dd_\u00bf\u0018\u009ej\u00b2\u009aZ\u00d0a\u00d3\u00ae\u00bd\u00b3\u00bf?XI\u00a6x^\u0013\u00c9\u0016\u00b13\u00e7(\u001c\u000e\u00f7\u0013\u0095\u00f3\u0012\u0007\u00a7\u0014\nw\u00b5=5\u0004\u0096j\u0089\u00f4\u0017\u0097?\u0091\u00e2\u00d0{\u001f\u00da\u009f\u001e\u00d4\u00e4\u00e0\u00c4g(\u00e9\"9AL\u00bf\u0018\u0004\u00ea`\u00dek\b;#\u00b6i\u00d4_=j(\u00cb\u00fcq&`\u00f9\u001a\u00c6qd\u00cf7\u0014\u00a4\u00e9\\M\u00d66\u00f1H2\u00b1\u009eS\u00f6\u000f\u00dc`m\u00cf\u0006\u00f8\u0095\u00dbZ\u00ba\u00a2X\u0016\u0011jg\u0015-\u00dbg4\u00bd\u00d1\u00dfa7\u00934j\u00b1( ^\u00ad\u00cdEh\u00cbU\u0012\n[\u0006\u00feL\u001e\u00b4\u00a4?\u009d\u00aa_ \u00ab#_c&x\u0083\u00d1cC%|\u00a7\u00ad\u00b3\u0090\u0081\u0006\u00dfm{\u00b4\u001d\f\u001d\u00a8\u00f1\u00f2W\u0084H\u0094y\u0002\u00a9\u00f6\u0097*\u00a3\u00d3\u0011\u00f1\u00edTN\u0007\u00f7\u00bd\u00ccy\u0016\u00eeN\u00d1\u0096\u0002<\u00b5M\u0006\u00e7\u001c\u00a8\u009ag\u00c9R\u0010\u0018\u00e5jf\u00ef\u00c8\u008d\u00c57\u00d4B\u008b\u00c2\u00c1\u00c3e\u00f5\u00aa\u0013[\u00e1\u00b8\u000e\u00f9c\u00dfO\u0090\u00d7\u00ab\u0010\u0012.R\u00ce3\u00072Je(SO\u00e4\u00b3Q\u00db\u00f8\u00f4\u00fd(_\u0091\u0084\u0081\u00c0\u00aa\u00e1\u00f2e\u0088d\u00e4x\u000b\u0007\u00e9\r\u0006\u528f\u9048\u5939\u8d9f\u008a\u00fb\u0006\u5285\u901c\u5978\u8d15\u00a1\u00aa".length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 73;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "'\u00d8\u00a4\u00b9\u0005w\"\u001a)\u0096";
                                    var20_3 = "'\u00d8\u00a4\u00b9\u0005w\"\u001a)\u0096".length();
                                    var17_4 = 4;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 68;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 26;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 17;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 110;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 13;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 37;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 104;
                                            break;
                                        }
                                        default: {
                                            v15 = 111;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        cf_0.a = var21;
                        cf_0.b = new String[35];
                        var8_7 = 2903250936718110196L;
                        var14_8 = new long[9];
                        var11_9 = 0;
                        var12_10 = "\u0014<\u00e2\u0090\u000b\u00ccE\u00c5h3\u009b\u001b\u00e6C\u00d8\u00b6KA\u00f4?\u00be\u0083H&\\+\u00d5\\5\u00a21\u00e4)o3\f\u00bcy\u00cb[\u00fd\u00bbif\u00bd[\u009f/\u000b\u00f0\u00df\u0092)\u00ba? ";
                        var13_11 = "\u0014<\u00e2\u0090\u000b\u00ccE\u00c5h3\u009b\u001b\u00e6C\u00d8\u00b6KA\u00f4?\u00be\u0083H&\\+\u00d5\\5\u00a21\u00e4)o3\f\u00bcy\u00cb[\u00fd\u00bbif\u00bd[\u009f/\u000b\u00f0\u00df\u0092)\u00ba? ".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "@m\u0002Z\u0018\u00a0\u00e3Z\u0007\u00f1;\u00e4\u00b2\u00cdR\u001c";
                            var13_11 = "@m\u0002Z\u0018\u00a0\u00e3Z\u0007\u00f1;\u00e4\u00b2\u00cdR\u001c".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                cf_0.c = var14_8;
                cf_0.d = new Integer[9];
                var0_14 = 6049596472976560850L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "g\u00af3\u0013\u00aat\u00d7\u0001;\u00dc\u00eb\u0000\u00f0\u0017\u0091\u008b\r\u009aE\u00f7%?!\"";
                var5_18 = "g\u00af3\u0013\u00aat\u00d7\u0001;\u00dc\u00eb\u0000\u00f0\u0017\u0091\u008b\r\u009aE\u00f7%?!\"".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        cf_0.e = var6_15;
        cf_0.f = new Long[3];
        cf_0.T = cf_0.b(27015, 7505408140925387573L);
        cf_0.S = cf_0.a(6346, 953542548765092948L);
        cf_0.t = new ArrayList<E>();
        cf_0.Q = 0L;
        cf_0.R = new Random();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2E48) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 220;
                    break;
                }
                case 1: {
                    n14 = 253;
                    break;
                }
                case 2: {
                    n14 = 247;
                    break;
                }
                case 3: {
                    n14 = 179;
                    break;
                }
                case 4: {
                    n14 = 174;
                    break;
                }
                case 5: {
                    n14 = 64;
                    break;
                }
                case 6: {
                    n14 = 110;
                    break;
                }
                case 7: {
                    n14 = 159;
                    break;
                }
                case 8: {
                    n14 = 36;
                    break;
                }
                case 9: {
                    n14 = 252;
                    break;
                }
                case 10: {
                    n14 = 152;
                    break;
                }
                case 11: {
                    n14 = 91;
                    break;
                }
                case 12: {
                    n14 = 81;
                    break;
                }
                case 13: {
                    n14 = 67;
                    break;
                }
                case 14: {
                    n14 = 162;
                    break;
                }
                case 15: {
                    n14 = 160;
                    break;
                }
                case 16: {
                    n14 = 96;
                    break;
                }
                case 17: {
                    n14 = 49;
                    break;
                }
                case 18: {
                    n14 = 50;
                    break;
                }
                case 19: {
                    n14 = 32;
                    break;
                }
                case 20: {
                    n14 = 201;
                    break;
                }
                case 21: {
                    n14 = 132;
                    break;
                }
                case 22: {
                    n14 = 35;
                    break;
                }
                case 23: {
                    n14 = 150;
                    break;
                }
                case 24: {
                    n14 = 127;
                    break;
                }
                case 25: {
                    n14 = 85;
                    break;
                }
                case 26: {
                    n14 = 0;
                    break;
                }
                case 27: {
                    n14 = 62;
                    break;
                }
                case 28: {
                    n14 = 144;
                    break;
                }
                case 29: {
                    n14 = 195;
                    break;
                }
                case 30: {
                    n14 = 207;
                    break;
                }
                case 31: {
                    n14 = 4;
                    break;
                }
                case 32: {
                    n14 = 153;
                    break;
                }
                case 33: {
                    n14 = 241;
                    break;
                }
                case 34: {
                    n14 = 58;
                    break;
                }
                case 35: {
                    n14 = 54;
                    break;
                }
                case 36: {
                    n14 = 88;
                    break;
                }
                case 37: {
                    n14 = 108;
                    break;
                }
                case 38: {
                    n14 = 208;
                    break;
                }
                case 39: {
                    n14 = 52;
                    break;
                }
                case 40: {
                    n14 = 13;
                    break;
                }
                case 41: {
                    n14 = 66;
                    break;
                }
                case 42: {
                    n14 = 176;
                    break;
                }
                case 43: {
                    n14 = 237;
                    break;
                }
                case 44: {
                    n14 = 180;
                    break;
                }
                case 45: {
                    n14 = 56;
                    break;
                }
                case 46: {
                    n14 = 175;
                    break;
                }
                case 47: {
                    n14 = 173;
                    break;
                }
                case 48: {
                    n14 = 184;
                    break;
                }
                case 49: {
                    n14 = 189;
                    break;
                }
                case 50: {
                    n14 = 255;
                    break;
                }
                case 51: {
                    n14 = 171;
                    break;
                }
                case 52: {
                    n14 = 248;
                    break;
                }
                case 53: {
                    n14 = 37;
                    break;
                }
                case 54: {
                    n14 = 242;
                    break;
                }
                case 55: {
                    n14 = 77;
                    break;
                }
                case 56: {
                    n14 = 240;
                    break;
                }
                case 57: {
                    n14 = 183;
                    break;
                }
                case 58: {
                    n14 = 68;
                    break;
                }
                case 59: {
                    n14 = 39;
                    break;
                }
                case 60: {
                    n14 = 121;
                    break;
                }
                case 61: {
                    n14 = 217;
                    break;
                }
                case 62: {
                    n14 = 46;
                    break;
                }
                case 63: {
                    n14 = 163;
                    break;
                }
                case 64: {
                    n14 = 118;
                    break;
                }
                case 65: {
                    n14 = 202;
                    break;
                }
                case 66: {
                    n14 = 143;
                    break;
                }
                case 67: {
                    n14 = 29;
                    break;
                }
                case 68: {
                    n14 = 210;
                    break;
                }
                case 69: {
                    n14 = 111;
                    break;
                }
                case 70: {
                    n14 = 224;
                    break;
                }
                case 71: {
                    n14 = 223;
                    break;
                }
                case 72: {
                    n14 = 19;
                    break;
                }
                case 73: {
                    n14 = 71;
                    break;
                }
                case 74: {
                    n14 = 164;
                    break;
                }
                case 75: {
                    n14 = 86;
                    break;
                }
                case 76: {
                    n14 = 231;
                    break;
                }
                case 77: {
                    n14 = 72;
                    break;
                }
                case 78: {
                    n14 = 42;
                    break;
                }
                case 79: {
                    n14 = 63;
                    break;
                }
                case 80: {
                    n14 = 161;
                    break;
                }
                case 81: {
                    n14 = 65;
                    break;
                }
                case 82: {
                    n14 = 41;
                    break;
                }
                case 83: {
                    n14 = 181;
                    break;
                }
                case 84: {
                    n14 = 2;
                    break;
                }
                case 85: {
                    n14 = 97;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 244;
                    break;
                }
                case 88: {
                    n14 = 232;
                    break;
                }
                case 89: {
                    n14 = 89;
                    break;
                }
                case 90: {
                    n14 = 14;
                    break;
                }
                case 91: {
                    n14 = 105;
                    break;
                }
                case 92: {
                    n14 = 84;
                    break;
                }
                case 93: {
                    n14 = 165;
                    break;
                }
                case 94: {
                    n14 = 6;
                    break;
                }
                case 95: {
                    n14 = 23;
                    break;
                }
                case 96: {
                    n14 = 128;
                    break;
                }
                case 97: {
                    n14 = 182;
                    break;
                }
                case 98: {
                    n14 = 55;
                    break;
                }
                case 99: {
                    n14 = 155;
                    break;
                }
                case 100: {
                    n14 = 126;
                    break;
                }
                case 101: {
                    n14 = 239;
                    break;
                }
                case 102: {
                    n14 = 47;
                    break;
                }
                case 103: {
                    n14 = 92;
                    break;
                }
                case 104: {
                    n14 = 69;
                    break;
                }
                case 105: {
                    n14 = 27;
                    break;
                }
                case 106: {
                    n14 = 234;
                    break;
                }
                case 107: {
                    n14 = 137;
                    break;
                }
                case 108: {
                    n14 = 16;
                    break;
                }
                case 109: {
                    n14 = 78;
                    break;
                }
                case 110: {
                    n14 = 133;
                    break;
                }
                case 111: {
                    n14 = 70;
                    break;
                }
                case 112: {
                    n14 = 73;
                    break;
                }
                case 113: {
                    n14 = 212;
                    break;
                }
                case 114: {
                    n14 = 199;
                    break;
                }
                case 115: {
                    n14 = 113;
                    break;
                }
                case 116: {
                    n14 = 192;
                    break;
                }
                case 117: {
                    n14 = 134;
                    break;
                }
                case 118: {
                    n14 = 130;
                    break;
                }
                case 119: {
                    n14 = 197;
                    break;
                }
                case 120: {
                    n14 = 219;
                    break;
                }
                case 121: {
                    n14 = 3;
                    break;
                }
                case 122: {
                    n14 = 193;
                    break;
                }
                case 123: {
                    n14 = 229;
                    break;
                }
                case 124: {
                    n14 = 20;
                    break;
                }
                case 125: {
                    n14 = 102;
                    break;
                }
                case 126: {
                    n14 = 214;
                    break;
                }
                case 127: {
                    n14 = 198;
                    break;
                }
                case 128: {
                    n14 = 222;
                    break;
                }
                case 129: {
                    n14 = 120;
                    break;
                }
                case 130: {
                    n14 = 95;
                    break;
                }
                case 131: {
                    n14 = 18;
                    break;
                }
                case 132: {
                    n14 = 124;
                    break;
                }
                case 133: {
                    n14 = 38;
                    break;
                }
                case 134: {
                    n14 = 235;
                    break;
                }
                case 135: {
                    n14 = 53;
                    break;
                }
                case 136: {
                    n14 = 221;
                    break;
                }
                case 137: {
                    n14 = 246;
                    break;
                }
                case 138: {
                    n14 = 12;
                    break;
                }
                case 139: {
                    n14 = 21;
                    break;
                }
                case 140: {
                    n14 = 216;
                    break;
                }
                case 141: {
                    n14 = 139;
                    break;
                }
                case 142: {
                    n14 = 129;
                    break;
                }
                case 143: {
                    n14 = 147;
                    break;
                }
                case 144: {
                    n14 = 48;
                    break;
                }
                case 145: {
                    n14 = 249;
                    break;
                }
                case 146: {
                    n14 = 103;
                    break;
                }
                case 147: {
                    n14 = 9;
                    break;
                }
                case 148: {
                    n14 = 8;
                    break;
                }
                case 149: {
                    n14 = 131;
                    break;
                }
                case 150: {
                    n14 = 169;
                    break;
                }
                case 151: {
                    n14 = 125;
                    break;
                }
                case 152: {
                    n14 = 177;
                    break;
                }
                case 153: {
                    n14 = 228;
                    break;
                }
                case 154: {
                    n14 = 254;
                    break;
                }
                case 155: {
                    n14 = 140;
                    break;
                }
                case 156: {
                    n14 = 10;
                    break;
                }
                case 157: {
                    n14 = 138;
                    break;
                }
                case 158: {
                    n14 = 100;
                    break;
                }
                case 159: {
                    n14 = 34;
                    break;
                }
                case 160: {
                    n14 = 188;
                    break;
                }
                case 161: {
                    n14 = 44;
                    break;
                }
                case 162: {
                    n14 = 114;
                    break;
                }
                case 163: {
                    n14 = 40;
                    break;
                }
                case 164: {
                    n14 = 123;
                    break;
                }
                case 165: {
                    n14 = 43;
                    break;
                }
                case 166: {
                    n14 = 30;
                    break;
                }
                case 167: {
                    n14 = 211;
                    break;
                }
                case 168: {
                    n14 = 31;
                    break;
                }
                case 169: {
                    n14 = 196;
                    break;
                }
                case 170: {
                    n14 = 83;
                    break;
                }
                case 171: {
                    n14 = 33;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 251;
                    break;
                }
                case 174: {
                    n14 = 205;
                    break;
                }
                case 175: {
                    n14 = 112;
                    break;
                }
                case 176: {
                    n14 = 218;
                    break;
                }
                case 177: {
                    n14 = 51;
                    break;
                }
                case 178: {
                    n14 = 119;
                    break;
                }
                case 179: {
                    n14 = 106;
                    break;
                }
                case 180: {
                    n14 = 178;
                    break;
                }
                case 181: {
                    n14 = 225;
                    break;
                }
                case 182: {
                    n14 = 17;
                    break;
                }
                case 183: {
                    n14 = 28;
                    break;
                }
                case 184: {
                    n14 = 203;
                    break;
                }
                case 185: {
                    n14 = 250;
                    break;
                }
                case 186: {
                    n14 = 227;
                    break;
                }
                case 187: {
                    n14 = 76;
                    break;
                }
                case 188: {
                    n14 = 60;
                    break;
                }
                case 189: {
                    n14 = 213;
                    break;
                }
                case 190: {
                    n14 = 25;
                    break;
                }
                case 191: {
                    n14 = 142;
                    break;
                }
                case 192: {
                    n14 = 135;
                    break;
                }
                case 193: {
                    n14 = 148;
                    break;
                }
                case 194: {
                    n14 = 166;
                    break;
                }
                case 195: {
                    n14 = 24;
                    break;
                }
                case 196: {
                    n14 = 94;
                    break;
                }
                case 197: {
                    n14 = 116;
                    break;
                }
                case 198: {
                    n14 = 80;
                    break;
                }
                case 199: {
                    n14 = 99;
                    break;
                }
                case 200: {
                    n14 = 209;
                    break;
                }
                case 201: {
                    n14 = 59;
                    break;
                }
                case 202: {
                    n14 = 141;
                    break;
                }
                case 203: {
                    n14 = 194;
                    break;
                }
                case 204: {
                    n14 = 109;
                    break;
                }
                case 205: {
                    n14 = 122;
                    break;
                }
                case 206: {
                    n14 = 98;
                    break;
                }
                case 207: {
                    n14 = 170;
                    break;
                }
                case 208: {
                    n14 = 190;
                    break;
                }
                case 209: {
                    n14 = 233;
                    break;
                }
                case 210: {
                    n14 = 1;
                    break;
                }
                case 211: {
                    n14 = 75;
                    break;
                }
                case 212: {
                    n14 = 236;
                    break;
                }
                case 213: {
                    n14 = 154;
                    break;
                }
                case 214: {
                    n14 = 115;
                    break;
                }
                case 215: {
                    n14 = 158;
                    break;
                }
                case 216: {
                    n14 = 167;
                    break;
                }
                case 217: {
                    n14 = 226;
                    break;
                }
                case 218: {
                    n14 = 172;
                    break;
                }
                case 219: {
                    n14 = 104;
                    break;
                }
                case 220: {
                    n14 = 145;
                    break;
                }
                case 221: {
                    n14 = 11;
                    break;
                }
                case 222: {
                    n14 = 79;
                    break;
                }
                case 223: {
                    n14 = 151;
                    break;
                }
                case 224: {
                    n14 = 168;
                    break;
                }
                case 225: {
                    n14 = 191;
                    break;
                }
                case 226: {
                    n14 = 7;
                    break;
                }
                case 227: {
                    n14 = 243;
                    break;
                }
                case 228: {
                    n14 = 74;
                    break;
                }
                case 229: {
                    n14 = 146;
                    break;
                }
                case 230: {
                    n14 = 136;
                    break;
                }
                case 231: {
                    n14 = 107;
                    break;
                }
                case 232: {
                    n14 = 45;
                    break;
                }
                case 233: {
                    n14 = 186;
                    break;
                }
                case 234: {
                    n14 = 204;
                    break;
                }
                case 235: {
                    n14 = 57;
                    break;
                }
                case 236: {
                    n14 = 22;
                    break;
                }
                case 237: {
                    n14 = 93;
                    break;
                }
                case 238: {
                    n14 = 26;
                    break;
                }
                case 239: {
                    n14 = 61;
                    break;
                }
                case 240: {
                    n14 = 206;
                    break;
                }
                case 241: {
                    n14 = 187;
                    break;
                }
                case 242: {
                    n14 = 90;
                    break;
                }
                case 243: {
                    n14 = 215;
                    break;
                }
                case 244: {
                    n14 = 87;
                    break;
                }
                case 245: {
                    n14 = 157;
                    break;
                }
                case 246: {
                    n14 = 156;
                    break;
                }
                case 247: {
                    n14 = 149;
                    break;
                }
                case 248: {
                    n14 = 185;
                    break;
                }
                case 249: {
                    n14 = 200;
                    break;
                }
                case 250: {
                    n14 = 117;
                    break;
                }
                case 251: {
                    n14 = 101;
                    break;
                }
                case 252: {
                    n14 = 245;
                    break;
                }
                case 253: {
                    n14 = 15;
                    break;
                }
                case 254: {
                    n14 = 230;
                    break;
                }
                default: {
                    n14 = 238;
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
            cf_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3498;
        if (d[n11] == null) {
            cf_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2AB3) & Short.MAX_VALUE;
        if (f[n11] == null) {
            cf_0.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

