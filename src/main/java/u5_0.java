/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.c;
import com.ky_2;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.socket.ConnectionSocketFactory;
import org.apache.hc.client5.http.socket.PlainConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.http.io.SocketConfig;
import org.apache.hc.core5.pool.PoolConcurrencyPolicy;
import org.apache.hc.core5.pool.PoolReusePolicy;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.TimeValue;

/*
 * Renamed from u5
 */
public class u5_0 {
    String D;
    HttpClient Z;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public u5_0() {
        Object object;
        try {
            object = lk_0.B("K0AkNTsLGUp6OA1YUVcqCghjJnRVGw7voOPbzxQLBQpYPueu");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.D = object;
    }

    public HttpClient J() {
        CloseableHttpClient closeableHttpClient;
        String[] stringArray = WT.y();
        HttpClientBuilder httpClientBuilder = HttpClients.custom();
        httpClientBuilder.disableAutomaticRetries();
        httpClientBuilder.disableRedirectHandling();
        httpClientBuilder.setKeepAliveStrategy(new WV());
        bp_1 bp_12 = new bp_1(this);
        SSLContext sSLContext = SSLContexts.createSystemDefault();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", (PlainConnectionSocketFactory)((Object)new SSLConnectionSocketFactory(sSLContext))).build();
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(registry, PoolConcurrencyPolicy.STRICT, PoolReusePolicy.LIFO, TimeValue.ofMinutes(u5_0.b(26610, 1190133171111478952L)), null, bp_12, null);
        poolingHttpClientConnectionManager.setMaxTotal(u5_0.a(11571, 4056391414749887600L));
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(u5_0.a(32269, 4922557632315961167L));
        SocketConfig socketConfig = SocketConfig.custom().setSoKeepAlive(true).setTcpNoDelay(true).setSoReuseAddress(true).build();
        String[] stringArray2 = stringArray;
        poolingHttpClientConnectionManager.setDefaultSocketConfig(socketConfig);
        httpClientBuilder.setConnectionManager(poolingHttpClientConnectionManager);
        httpClientBuilder.setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(u5_0.b(16562, 4143298789293875690L), TimeUnit.MILLISECONDS).setConnectionRequestTimeout(u5_0.b(5519, 7235146474424972502L), TimeUnit.MILLISECONDS).build());
        CloseableHttpClient closeableHttpClient2 = httpClientBuilder.build();
        try {
            closeableHttpClient = closeableHttpClient2;
            if (ky_2.F() != null) {
                WT.r(new String[5]);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw u5_0.a(arrayIndexOutOfBoundsException);
        }
        return closeableHttpClient;
    }

    public byte[] u(String string) throws Exception {
        byte[] byArray;
        try {
            byArray = (byte[])this.r(this.Z, (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return byArray;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] r(HttpClient var1_1, String var2_2) {
        var4_3 = null;
        var5_4 = new HttpGet(var2_2);
        var3_5 = WT.y();
        try {
            block11: {
                var6_6 = System.currentTimeMillis();
                var8_8 = (CloseableHttpResponse)var1_1.execute(var5_4);
                var9_9 = var8_8.getEntity();
                var10_10 = var9_9.getContent();
                var11_11 = var8_8.getCode();
                var12_12 = new DataInputStream(var10_10);
                var13_13 = new ByteArrayOutputStream();
                var14_14 = new byte[u5_0.a(19263, 5060697269300566655L)];
                var15_15 = 0;
                while ((var15_15 = var12_12.read(var14_14)) > 0) {
                    try {
                        v0 = var13_13;
                        if (var3_5 == null) {
                            v0.write(var14_14, 0, var15_15);
                            if (var3_5 == null) continue;
                            break;
                        }
                        break block11;
                    }
                    catch (Exception v1) {
                        throw u5_0.a(v1);
                    }
                }
                v0 = var13_13;
            }
            var4_3 = v0.toByteArray();
            var13_13.close();
            var10_10.close();
            return var4_3;
        }
        catch (Exception var6_7) {
            try {
                v2 = var6_7 instanceof IOException;
                if (var3_5 == null) {
                    if (!v2) return var4_3;
                }
                ** GOTO lbl41
            }
            catch (Exception v3) {
                throw u5_0.a(v3);
            }
            try {
                v2 = var5_4.getUri().getHost().equals((String)this.D);
lbl41:
                // 2 sources

                if (!v2) return var4_3;
            }
            catch (URISyntaxException var7_16) {
                // empty catch block
            }
        }
        return var4_3;
    }

    public O0 D(O0 o0, String string, HttpClient httpClient) throws IOException {
        byte[] byArray;
        byte[] byArray2 = o0.toString().getBytes("utf-8");
        try {
            byArray = (byte[])this.q((Object)byArray2, (Object)string, (Object)httpClient, 3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        byte[] byArray3 = byArray;
        String string2 = new String(byArray3, "utf-8");
        O0 o02 = O0.y(string2);
        return o02;
    }

    /*
     * Exception decompiling
     */
    public byte[] q(byte[] var1_1, String var2_2, HttpClient var3_3, int var4_4) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[CATCHBLOCK], 27[CATCHBLOCK]], but top level block is 8[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public HttpClient N() {
        return (HttpClient)this.Z;
    }

    public void U(HttpClient httpClient) {
        this.Z = httpClient;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[6];
                                var19_1 = 0;
                                var18_2 = "\u00a8\u009c=\u00d7\u0014\u000f\u009bO\u00ab\u00c6nsOr\u00c8\u009eI\u00d3\u000b\u00c0\u00a8\u0005\u00b90\u001fBP\u0005\u0001\u00a8\u00a4\f<";
                                var20_3 = "\u00a8\u009c=\u00d7\u0014\u000f\u009bO\u00ab\u00c6nsOr\u00c8\u009eI\u00d3\u000b\u00c0\u00a8\u0005\u00b90\u001fBP\u0005\u0001\u00a8\u00a4\f<".length();
                                var17_4 = 5;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 14;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
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
                                    var18_2 = "\u00a0\u009a\u00bd\u00c2\u00eeVI&\u0091\u009e!dI]\u00c0y\u0090\u00c7\u00f0I2o\u00e7\u00c6\u001f\u00ef\u00eeh\u00fc\u0004\u00cd\u00a3y\u00df\u009dAq\u00b4\u0086\u00d3\u00b5\u008e\u00b2\u0011\u00b2\u00e9\u0017\u00cf\u0004\u00b9\u00d5\u00ec\u00fc";
                                    var20_3 = "\u00a0\u009a\u00bd\u00c2\u00eeVI&\u0091\u009e!dI]\u00c0y\u0090\u00c7\u00f0I2o\u00e7\u00c6\u001f\u00ef\u00eeh\u00fc\u0004\u00cd\u00a3y\u00df\u009dAq\u00b4\u0086\u00d3\u00b5\u008e\u00b2\u0011\u00b2\u00e9\u0017\u00cf\u0004\u00b9\u00d5\u00ec\u00fc".length();
                                    var17_4 = 48;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 127;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
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
                                    break block34;
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
                                            v15 = 42;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 88;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 31;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 87;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 13;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 38;
                                            break;
                                        }
                                        default: {
                                            v15 = 81;
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
                        u5_0.a = var21;
                        u5_0.b = new String[6];
                        var8_7 = 6815834546332772054L;
                        var14_8 = new long[4];
                        var11_9 = 0;
                        var12_10 = "\u00a5\u009c\u0019X\u00fas8\u00a9\u008f\u0086\u00e7\u00b0\u00f4\u0086\u00c8Y";
                        var13_11 = "\u00a5\u009c\u0019X\u00fas8\u00a9\u008f\u0086\u00e7\u00b0\u00f4\u0086\u00c8Y".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u001e\u00c4\u000fM\u0082\u0094\u0089\u0093l\u00a3\u0004Ut\u001cZ\u00c2";
                            var13_11 = "\u001e\u00c4\u000fM\u0082\u0094\u0089\u0093l\u00a3\u0004Ut\u001cZ\u00c2".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
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
                u5_0.c = var14_8;
                u5_0.d = new Integer[4];
                var0_14 = 319225269953044596L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "`\u0006z\u00d3\u0080\u00e43\u00b2=\u0011\u00e9\u00fa\u00e4\u00cb\u00e6\u008e";
                var5_18 = "`\u0006z\u00d3\u0080\u00e43\u00b2=\u0011\u00e9\u00fa\u00e4\u00cb\u00e6\u008e".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "&\u0080\u00c0\u00c5\u00c6\u00ef\u00e8\u000b\u0014\u00ea.aQcf\u00d9";
                    var5_18 = "&\u0080\u00c0\u00c5\u00c6\u00ef\u00e8\u000b\u0014\u00ea.aQcf\u00d9".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        u5_0.e = var6_15;
        u5_0.f = new Long[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1649) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 139;
                    break;
                }
                case 1: {
                    n14 = 7;
                    break;
                }
                case 2: {
                    n14 = 10;
                    break;
                }
                case 3: {
                    n14 = 89;
                    break;
                }
                case 4: {
                    n14 = 77;
                    break;
                }
                case 5: {
                    n14 = 212;
                    break;
                }
                case 6: {
                    n14 = 243;
                    break;
                }
                case 7: {
                    n14 = 227;
                    break;
                }
                case 8: {
                    n14 = 128;
                    break;
                }
                case 9: {
                    n14 = 122;
                    break;
                }
                case 10: {
                    n14 = 54;
                    break;
                }
                case 11: {
                    n14 = 200;
                    break;
                }
                case 12: {
                    n14 = 189;
                    break;
                }
                case 13: {
                    n14 = 250;
                    break;
                }
                case 14: {
                    n14 = 119;
                    break;
                }
                case 15: {
                    n14 = 199;
                    break;
                }
                case 16: {
                    n14 = 210;
                    break;
                }
                case 17: {
                    n14 = 48;
                    break;
                }
                case 18: {
                    n14 = 165;
                    break;
                }
                case 19: {
                    n14 = 168;
                    break;
                }
                case 20: {
                    n14 = 94;
                    break;
                }
                case 21: {
                    n14 = 63;
                    break;
                }
                case 22: {
                    n14 = 113;
                    break;
                }
                case 23: {
                    n14 = 109;
                    break;
                }
                case 24: {
                    n14 = 173;
                    break;
                }
                case 25: {
                    n14 = 64;
                    break;
                }
                case 26: {
                    n14 = 83;
                    break;
                }
                case 27: {
                    n14 = 46;
                    break;
                }
                case 28: {
                    n14 = 79;
                    break;
                }
                case 29: {
                    n14 = 244;
                    break;
                }
                case 30: {
                    n14 = 242;
                    break;
                }
                case 31: {
                    n14 = 91;
                    break;
                }
                case 32: {
                    n14 = 217;
                    break;
                }
                case 33: {
                    n14 = 148;
                    break;
                }
                case 34: {
                    n14 = 160;
                    break;
                }
                case 35: {
                    n14 = 75;
                    break;
                }
                case 36: {
                    n14 = 252;
                    break;
                }
                case 37: {
                    n14 = 97;
                    break;
                }
                case 38: {
                    n14 = 226;
                    break;
                }
                case 39: {
                    n14 = 233;
                    break;
                }
                case 40: {
                    n14 = 187;
                    break;
                }
                case 41: {
                    n14 = 159;
                    break;
                }
                case 42: {
                    n14 = 234;
                    break;
                }
                case 43: {
                    n14 = 17;
                    break;
                }
                case 44: {
                    n14 = 225;
                    break;
                }
                case 45: {
                    n14 = 43;
                    break;
                }
                case 46: {
                    n14 = 230;
                    break;
                }
                case 47: {
                    n14 = 247;
                    break;
                }
                case 48: {
                    n14 = 166;
                    break;
                }
                case 49: {
                    n14 = 211;
                    break;
                }
                case 50: {
                    n14 = 65;
                    break;
                }
                case 51: {
                    n14 = 86;
                    break;
                }
                case 52: {
                    n14 = 80;
                    break;
                }
                case 53: {
                    n14 = 203;
                    break;
                }
                case 54: {
                    n14 = 178;
                    break;
                }
                case 55: {
                    n14 = 209;
                    break;
                }
                case 56: {
                    n14 = 175;
                    break;
                }
                case 57: {
                    n14 = 222;
                    break;
                }
                case 58: {
                    n14 = 59;
                    break;
                }
                case 59: {
                    n14 = 72;
                    break;
                }
                case 60: {
                    n14 = 61;
                    break;
                }
                case 61: {
                    n14 = 192;
                    break;
                }
                case 62: {
                    n14 = 18;
                    break;
                }
                case 63: {
                    n14 = 116;
                    break;
                }
                case 64: {
                    n14 = 249;
                    break;
                }
                case 65: {
                    n14 = 35;
                    break;
                }
                case 66: {
                    n14 = 236;
                    break;
                }
                case 67: {
                    n14 = 73;
                    break;
                }
                case 68: {
                    n14 = 99;
                    break;
                }
                case 69: {
                    n14 = 6;
                    break;
                }
                case 70: {
                    n14 = 92;
                    break;
                }
                case 71: {
                    n14 = 213;
                    break;
                }
                case 72: {
                    n14 = 66;
                    break;
                }
                case 73: {
                    n14 = 201;
                    break;
                }
                case 74: {
                    n14 = 70;
                    break;
                }
                case 75: {
                    n14 = 125;
                    break;
                }
                case 76: {
                    n14 = 185;
                    break;
                }
                case 77: {
                    n14 = 78;
                    break;
                }
                case 78: {
                    n14 = 95;
                    break;
                }
                case 79: {
                    n14 = 237;
                    break;
                }
                case 80: {
                    n14 = 26;
                    break;
                }
                case 81: {
                    n14 = 102;
                    break;
                }
                case 82: {
                    n14 = 11;
                    break;
                }
                case 83: {
                    n14 = 60;
                    break;
                }
                case 84: {
                    n14 = 181;
                    break;
                }
                case 85: {
                    n14 = 140;
                    break;
                }
                case 86: {
                    n14 = 100;
                    break;
                }
                case 87: {
                    n14 = 58;
                    break;
                }
                case 88: {
                    n14 = 108;
                    break;
                }
                case 89: {
                    n14 = 87;
                    break;
                }
                case 90: {
                    n14 = 15;
                    break;
                }
                case 91: {
                    n14 = 56;
                    break;
                }
                case 92: {
                    n14 = 62;
                    break;
                }
                case 93: {
                    n14 = 216;
                    break;
                }
                case 94: {
                    n14 = 142;
                    break;
                }
                case 95: {
                    n14 = 41;
                    break;
                }
                case 96: {
                    n14 = 90;
                    break;
                }
                case 97: {
                    n14 = 235;
                    break;
                }
                case 98: {
                    n14 = 246;
                    break;
                }
                case 99: {
                    n14 = 32;
                    break;
                }
                case 100: {
                    n14 = 133;
                    break;
                }
                case 101: {
                    n14 = 104;
                    break;
                }
                case 102: {
                    n14 = 224;
                    break;
                }
                case 103: {
                    n14 = 39;
                    break;
                }
                case 104: {
                    n14 = 180;
                    break;
                }
                case 105: {
                    n14 = 138;
                    break;
                }
                case 106: {
                    n14 = 228;
                    break;
                }
                case 107: {
                    n14 = 30;
                    break;
                }
                case 108: {
                    n14 = 241;
                    break;
                }
                case 109: {
                    n14 = 164;
                    break;
                }
                case 110: {
                    n14 = 126;
                    break;
                }
                case 111: {
                    n14 = 69;
                    break;
                }
                case 112: {
                    n14 = 223;
                    break;
                }
                case 113: {
                    n14 = 36;
                    break;
                }
                case 114: {
                    n14 = 57;
                    break;
                }
                case 115: {
                    n14 = 215;
                    break;
                }
                case 116: {
                    n14 = 183;
                    break;
                }
                case 117: {
                    n14 = 149;
                    break;
                }
                case 118: {
                    n14 = 167;
                    break;
                }
                case 119: {
                    n14 = 154;
                    break;
                }
                case 120: {
                    n14 = 103;
                    break;
                }
                case 121: {
                    n14 = 172;
                    break;
                }
                case 122: {
                    n14 = 182;
                    break;
                }
                case 123: {
                    n14 = 84;
                    break;
                }
                case 124: {
                    n14 = 190;
                    break;
                }
                case 125: {
                    n14 = 220;
                    break;
                }
                case 126: {
                    n14 = 195;
                    break;
                }
                case 127: {
                    n14 = 34;
                    break;
                }
                case 128: {
                    n14 = 33;
                    break;
                }
                case 129: {
                    n14 = 129;
                    break;
                }
                case 130: {
                    n14 = 19;
                    break;
                }
                case 131: {
                    n14 = 248;
                    break;
                }
                case 132: {
                    n14 = 156;
                    break;
                }
                case 133: {
                    n14 = 50;
                    break;
                }
                case 134: {
                    n14 = 145;
                    break;
                }
                case 135: {
                    n14 = 101;
                    break;
                }
                case 136: {
                    n14 = 1;
                    break;
                }
                case 137: {
                    n14 = 24;
                    break;
                }
                case 138: {
                    n14 = 155;
                    break;
                }
                case 139: {
                    n14 = 115;
                    break;
                }
                case 140: {
                    n14 = 3;
                    break;
                }
                case 141: {
                    n14 = 251;
                    break;
                }
                case 142: {
                    n14 = 124;
                    break;
                }
                case 143: {
                    n14 = 68;
                    break;
                }
                case 144: {
                    n14 = 206;
                    break;
                }
                case 145: {
                    n14 = 169;
                    break;
                }
                case 146: {
                    n14 = 162;
                    break;
                }
                case 147: {
                    n14 = 131;
                    break;
                }
                case 148: {
                    n14 = 174;
                    break;
                }
                case 149: {
                    n14 = 23;
                    break;
                }
                case 150: {
                    n14 = 47;
                    break;
                }
                case 151: {
                    n14 = 238;
                    break;
                }
                case 152: {
                    n14 = 146;
                    break;
                }
                case 153: {
                    n14 = 85;
                    break;
                }
                case 154: {
                    n14 = 245;
                    break;
                }
                case 155: {
                    n14 = 207;
                    break;
                }
                case 156: {
                    n14 = 205;
                    break;
                }
                case 157: {
                    n14 = 107;
                    break;
                }
                case 158: {
                    n14 = 106;
                    break;
                }
                case 159: {
                    n14 = 82;
                    break;
                }
                case 160: {
                    n14 = 112;
                    break;
                }
                case 161: {
                    n14 = 157;
                    break;
                }
                case 162: {
                    n14 = 14;
                    break;
                }
                case 163: {
                    n14 = 55;
                    break;
                }
                case 164: {
                    n14 = 123;
                    break;
                }
                case 165: {
                    n14 = 229;
                    break;
                }
                case 166: {
                    n14 = 53;
                    break;
                }
                case 167: {
                    n14 = 22;
                    break;
                }
                case 168: {
                    n14 = 134;
                    break;
                }
                case 169: {
                    n14 = 152;
                    break;
                }
                case 170: {
                    n14 = 188;
                    break;
                }
                case 171: {
                    n14 = 118;
                    break;
                }
                case 172: {
                    n14 = 42;
                    break;
                }
                case 173: {
                    n14 = 127;
                    break;
                }
                case 174: {
                    n14 = 81;
                    break;
                }
                case 175: {
                    n14 = 93;
                    break;
                }
                case 176: {
                    n14 = 40;
                    break;
                }
                case 177: {
                    n14 = 240;
                    break;
                }
                case 178: {
                    n14 = 202;
                    break;
                }
                case 179: {
                    n14 = 114;
                    break;
                }
                case 180: {
                    n14 = 147;
                    break;
                }
                case 181: {
                    n14 = 130;
                    break;
                }
                case 182: {
                    n14 = 21;
                    break;
                }
                case 183: {
                    n14 = 29;
                    break;
                }
                case 184: {
                    n14 = 2;
                    break;
                }
                case 185: {
                    n14 = 158;
                    break;
                }
                case 186: {
                    n14 = 179;
                    break;
                }
                case 187: {
                    n14 = 197;
                    break;
                }
                case 188: {
                    n14 = 170;
                    break;
                }
                case 189: {
                    n14 = 176;
                    break;
                }
                case 190: {
                    n14 = 186;
                    break;
                }
                case 191: {
                    n14 = 110;
                    break;
                }
                case 192: {
                    n14 = 20;
                    break;
                }
                case 193: {
                    n14 = 137;
                    break;
                }
                case 194: {
                    n14 = 12;
                    break;
                }
                case 195: {
                    n14 = 239;
                    break;
                }
                case 196: {
                    n14 = 49;
                    break;
                }
                case 197: {
                    n14 = 9;
                    break;
                }
                case 198: {
                    n14 = 38;
                    break;
                }
                case 199: {
                    n14 = 96;
                    break;
                }
                case 200: {
                    n14 = 255;
                    break;
                }
                case 201: {
                    n14 = 132;
                    break;
                }
                case 202: {
                    n14 = 153;
                    break;
                }
                case 203: {
                    n14 = 25;
                    break;
                }
                case 204: {
                    n14 = 67;
                    break;
                }
                case 205: {
                    n14 = 184;
                    break;
                }
                case 206: {
                    n14 = 144;
                    break;
                }
                case 207: {
                    n14 = 5;
                    break;
                }
                case 208: {
                    n14 = 44;
                    break;
                }
                case 209: {
                    n14 = 111;
                    break;
                }
                case 210: {
                    n14 = 221;
                    break;
                }
                case 211: {
                    n14 = 27;
                    break;
                }
                case 212: {
                    n14 = 198;
                    break;
                }
                case 213: {
                    n14 = 219;
                    break;
                }
                case 214: {
                    n14 = 76;
                    break;
                }
                case 215: {
                    n14 = 120;
                    break;
                }
                case 216: {
                    n14 = 31;
                    break;
                }
                case 217: {
                    n14 = 194;
                    break;
                }
                case 218: {
                    n14 = 193;
                    break;
                }
                case 219: {
                    n14 = 52;
                    break;
                }
                case 220: {
                    n14 = 74;
                    break;
                }
                case 221: {
                    n14 = 253;
                    break;
                }
                case 222: {
                    n14 = 161;
                    break;
                }
                case 223: {
                    n14 = 150;
                    break;
                }
                case 224: {
                    n14 = 45;
                    break;
                }
                case 225: {
                    n14 = 105;
                    break;
                }
                case 226: {
                    n14 = 204;
                    break;
                }
                case 227: {
                    n14 = 28;
                    break;
                }
                case 228: {
                    n14 = 88;
                    break;
                }
                case 229: {
                    n14 = 0;
                    break;
                }
                case 230: {
                    n14 = 98;
                    break;
                }
                case 231: {
                    n14 = 196;
                    break;
                }
                case 232: {
                    n14 = 37;
                    break;
                }
                case 233: {
                    n14 = 13;
                    break;
                }
                case 234: {
                    n14 = 141;
                    break;
                }
                case 235: {
                    n14 = 136;
                    break;
                }
                case 236: {
                    n14 = 218;
                    break;
                }
                case 237: {
                    n14 = 231;
                    break;
                }
                case 238: {
                    n14 = 232;
                    break;
                }
                case 239: {
                    n14 = 4;
                    break;
                }
                case 240: {
                    n14 = 214;
                    break;
                }
                case 241: {
                    n14 = 51;
                    break;
                }
                case 242: {
                    n14 = 117;
                    break;
                }
                case 243: {
                    n14 = 121;
                    break;
                }
                case 244: {
                    n14 = 135;
                    break;
                }
                case 245: {
                    n14 = 191;
                    break;
                }
                case 246: {
                    n14 = 8;
                    break;
                }
                case 247: {
                    n14 = 171;
                    break;
                }
                case 248: {
                    n14 = 16;
                    break;
                }
                case 249: {
                    n14 = 177;
                    break;
                }
                case 250: {
                    n14 = 208;
                    break;
                }
                case 251: {
                    n14 = 71;
                    break;
                }
                case 252: {
                    n14 = 143;
                    break;
                }
                case 253: {
                    n14 = 254;
                    break;
                }
                case 254: {
                    n14 = 151;
                    break;
                }
                default: {
                    n14 = 163;
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
            u5_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5140;
        if (d[n11] == null) {
            u5_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2159) & Short.MAX_VALUE;
        if (f[n11] == null) {
            u5_0.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

