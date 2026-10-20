/*
 * Decompiled with CFR 0.152.
 */
package org;

import com.ky_2;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.B;
import org.F.F;
import org.F.c;
import org.V.J;
import org.Z;
import org.d_0;

public abstract class W
extends ClassLoader {
    @c
    protected B X;
    private static final String[] a;
    private static final String[] b;

    public W() {
    }

    public W(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override
    @F(value=false)
    public InputStream getResourceAsStream(String string) {
        return super.getParent().getResourceAsStream(string);
    }

    public abstract void K(File[] var1);

    public abstract void f(J var1);

    /*
     * Unable to fully structure code
     */
    public void Q(@c String var1_1) {
        var2_2 = d_0.b();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl8
        if (v0 == null) {
            v1 = Charset.defaultCharset();
        } else {
            v0 = var1_1;
lbl8:
            // 2 sources

            v1 = Charset.forName(v0);
        }
        this.n(v1);
    }

    public abstract void n(Charset var1);

    public abstract void H(boolean var1, boolean var2, boolean var3);

    public final void q(@c B b2) {
        this.X = b2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void main(String[] var0) throws Exception {
        block80: {
            block79: {
                block65: {
                    var2_1 = null;
                    var1_2 = d_0.b();
                    var3_3 = null;
                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = 0;
                    var7_7 = false;
                    for (var8_8 = 0; var8_8 < var0.length; ++var8_8) {
                        block78: {
                            block87: {
                                block71: {
                                    block76: {
                                        block77: {
                                            block74: {
                                                block75: {
                                                    block72: {
                                                        block73: {
                                                            block83: {
                                                                block82: {
                                                                    block70: {
                                                                        block69: {
                                                                            block68: {
                                                                                block67: {
                                                                                    block66: {
                                                                                        var9_9 = var0[var8_8];
                                                                                        v0 = (int)var9_9.startsWith("-");
                                                                                        if (var1_2 == null) break block65;
                                                                                        try {
                                                                                            block81: {
                                                                                                if (var1_2 == null) break block66;
                                                                                                break block81;
                                                                                                catch (NoSuchMethodException v1) {
                                                                                                    throw W.a(v1);
                                                                                                }
                                                                                            }
                                                                                            if (v0 == 0) {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        catch (NoSuchMethodException v2) {
                                                                                            throw W.a(v2);
                                                                                        }
                                                                                        v3 = W.a(16059, 7365).equals(var9_9);
                                                                                    }
                                                                                    try {
                                                                                        if (var1_2 == null) break block67;
                                                                                        if (v3 != 0) {
                                                                                        }
                                                                                        ** GOTO lbl36
                                                                                    }
                                                                                    catch (NoSuchMethodException v4) {
                                                                                        throw W.a(v4);
                                                                                    }
                                                                                    var2_1 = W.F(var0[++var8_8]);
                                                                                    try {
                                                                                        if (var1_2 != null) continue;
lbl36:
                                                                                        // 2 sources

                                                                                        v3 = W.a(16035, 18263).equals(var9_9);
                                                                                    }
                                                                                    catch (NoSuchMethodException v5) {
                                                                                        throw W.a(v5);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var1_2 == null) break block68;
                                                                                    if (v3 != 0) {
                                                                                    }
                                                                                    ** GOTO lbl51
                                                                                }
                                                                                catch (NoSuchMethodException v6) {
                                                                                    throw W.a(v6);
                                                                                }
                                                                                var3_3 = var0[++var8_8];
                                                                                try {
                                                                                    if (var1_2 != null) continue;
lbl51:
                                                                                    // 2 sources

                                                                                    v3 = W.a(16052, -18516).equals(var9_9);
                                                                                }
                                                                                catch (NoSuchMethodException v7) {
                                                                                    throw W.a(v7);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var1_2 == null) break block69;
                                                                                if (v3 != 0) {
                                                                                }
                                                                                ** GOTO lbl69
                                                                            }
                                                                            catch (NoSuchMethodException v8) {
                                                                                throw W.a(v8);
                                                                            }
                                                                            var4_4 = 1;
                                                                            var5_5 = 1;
                                                                            var6_6 = 1;
                                                                            var7_7 = true;
                                                                            try {
                                                                                if (var1_2 != null) continue;
lbl69:
                                                                                // 2 sources

                                                                                v3 = W.a(16057, 392).equals(var9_9);
                                                                            }
                                                                            catch (NoSuchMethodException v9) {
                                                                                throw W.a(v9);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var1_2 == null) break block70;
                                                                            if (v3 != 0) {
                                                                            }
                                                                            ** GOTO lbl87
                                                                        }
                                                                        catch (NoSuchMethodException v10) {
                                                                            throw W.a(v10);
                                                                        }
                                                                        var4_4 = 0;
                                                                        var5_5 = 0;
                                                                        var6_6 = 0;
                                                                        var7_7 = true;
                                                                        try {
                                                                            if (var1_2 != null) continue;
lbl87:
                                                                            // 2 sources

                                                                            v3 = W.a(16042, 629).startsWith(var9_9);
                                                                        }
                                                                        catch (NoSuchMethodException v11) {
                                                                            throw W.a(v11);
                                                                        }
                                                                    }
                                                                    if (var1_2 == null) break block71;
                                                                    if (v3 == 0) ** GOTO lbl158
                                                                    break block82;
                                                                    catch (NoSuchMethodException v12) {
                                                                        throw W.a(v12);
                                                                    }
                                                                }
                                                                v13 = var9_9.indexOf(W.a(16054, -21082));
                                                                if (var1_2 == null) break block72;
                                                                break block83;
                                                                catch (NoSuchMethodException v14) {
                                                                    throw W.a(v14);
                                                                }
                                                            }
                                                            try {
                                                                block84: {
                                                                    if (v13 == -1) break block73;
                                                                    break block84;
                                                                    catch (NoSuchMethodException v15) {
                                                                        throw W.a(v15);
                                                                    }
                                                                }
                                                                v13 = 1;
                                                                break block72;
                                                            }
                                                            catch (NoSuchMethodException v16) {
                                                                throw W.a(v16);
                                                            }
                                                        }
                                                        v13 = 0;
                                                    }
                                                    var4_4 = v13;
                                                    v17 = var9_9.indexOf(W.a(16044, -24515));
                                                    if (var1_2 == null) break block74;
                                                    try {
                                                        block85: {
                                                            if (v17 == -1) break block75;
                                                            break block85;
                                                            catch (NoSuchMethodException v18) {
                                                                throw W.a(v18);
                                                            }
                                                        }
                                                        v17 = 1;
                                                        break block74;
                                                    }
                                                    catch (NoSuchMethodException v19) {
                                                        throw W.a(v19);
                                                    }
                                                }
                                                v17 = 0;
                                            }
                                            var5_5 = v17;
                                            v20 = var9_9.indexOf(W.a(16063, 4594));
                                            if (var1_2 == null) break block76;
                                            try {
                                                block86: {
                                                    if (v20 == -1) break block77;
                                                    break block86;
                                                    catch (NoSuchMethodException v21) {
                                                        throw W.a(v21);
                                                    }
                                                }
                                                v20 = 1;
                                                break block76;
                                            }
                                            catch (NoSuchMethodException v22) {
                                                throw W.a(v22);
                                            }
                                        }
                                        v20 = 0;
                                    }
                                    var6_6 = v20;
                                    var7_7 = true;
                                    try {
                                        if (var1_2 != null) continue;
lbl158:
                                        // 2 sources

                                        v3 = (int)W.a(16061, 9679).equals(var9_9);
                                    }
                                    catch (NoSuchMethodException v23) {
                                        throw W.a(v23);
                                    }
                                }
                                if (var1_2 == null) break block78;
                                if (v3 == 0) ** GOTO lbl187
                                break block87;
                                catch (NoSuchMethodException v24) {
                                    throw W.a(v24);
                                }
                            }
                            try {
                                block88: {
                                    System.out.println(W.a(16043, -5085));
                                    System.out.println(W.a(16045, 663) + W.class.getName() + W.a(16034, 5830));
                                    System.out.println(W.a(16048, -23800));
                                    System.out.println(W.a(16055, -25148));
                                    System.out.println(W.a(16062, -27499));
                                    System.out.println(W.a(16046, -30922) + File.pathSeparator + W.a(16049, 10242));
                                    System.out.println(W.a(16058, -9235));
                                    System.out.println(W.a(16050, -29879));
                                    System.out.println(W.a(16047, 3675));
                                    System.out.println(W.a(16053, -17193));
                                    System.exit(0);
                                    if (var1_2 != null) continue;
                                    break block88;
                                    catch (NoSuchMethodException v25) {
                                        throw W.a(v25);
                                    }
                                }
                                System.err.println(W.a(16040, 1899) + var9_9 + W.a(16056, -17898));
                                v3 = 1;
                            }
                            catch (NoSuchMethodException v26) {
                                throw W.a(v26);
                            }
                        }
                        System.exit(v3);
                        if (var1_2 != null) continue;
                    }
                    v0 = var8_8;
                }
                if (var1_2 == null) break block79;
                try {
                    block89: {
                        if (v0 != var0.length) break block80;
                        break block89;
                        catch (NoSuchMethodException v27) {
                            throw W.a(v27);
                        }
                    }
                    System.err.println(W.a(16041, -10293));
                    v0 = 1;
                }
                catch (NoSuchMethodException v28) {
                    throw W.a(v28);
                }
            }
            System.exit(v0);
        }
        var9_9 = var0[var8_8++];
        var10_10 = new String[var0.length - var8_8];
        System.arraycopy(var0, var8_8, var10_10, 0, var0.length - var8_8);
        var11_11 = Z.A(W.class.getClassLoader()).C();
        try {
            if (var7_7) {
                var11_11.H((boolean)var4_4, (boolean)var5_5, (boolean)var6_6);
            }
        }
        catch (NoSuchMethodException v29) {
            throw W.a(v29);
        }
        try {
            if (var3_3 != null) {
                var11_11.Q(var3_3);
            }
        }
        catch (NoSuchMethodException v30) {
            throw W.a(v30);
        }
        try {
            if (var2_1 != null) {
                var11_11.K(var2_1);
            }
        }
        catch (NoSuchMethodException v31) {
            throw W.a(v31);
        }
        var12_12 = var11_11.loadClass(var9_9);
        try {
            var13_13 = var12_12.getMethod(W.a(16051, -11891), new Class[]{String[].class});
        }
        catch (NoSuchMethodException var14_14) {
            System.err.println(W.a(16060, 974) + var9_9 + W.a(16032, -22388));
            System.exit(1);
            return;
        }
        var13_13.invoke(null, new Object[]{var10_10});
    }

    private static File[] F(String string) {
        ArrayList<File> arrayList;
        ArrayList<File> arrayList2;
        block2: {
            arrayList2 = new ArrayList<File>();
            StringTokenizer stringTokenizer = new StringTokenizer(string, File.pathSeparator);
            ky_2[] ky_2Array = d_0.b();
            while (stringTokenizer.hasMoreTokens()) {
                arrayList = arrayList2;
                if (ky_2Array != null) {
                    arrayList.add(new File(stringTokenizer.nextToken()));
                    if (ky_2Array != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList.toArray(new File[arrayList2.size()]);
    }

    private static NoSuchMethodException a(NoSuchMethodException noSuchMethodException) {
        return noSuchMethodException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[27];
                var3_1 = 0;
                var2_2 = "%S\u00e1\u008f\u00e9\u00b6\u00c5\u00a3\u0000^\n\u0091d\u00af\u00e4\u00c6\u000eW\n\u00c0\u0000\u00fe\u001e\u0016\u00c6G8\\\u0014\u0094(\u00f5\u00fa%\u000b\u00b4%0-*\u001b\u0002\u00c3\u009c3W\u000e\u00dd\u001c\u00bcJ\u001d\u00cc\u00a12I\t%\u00f4\u001bC\u0007\u0098\u00cf\u00e0\u00fd\u00d2t\u00a3\u000b\u0082\u00e7\tV6:\u00cf\r\u00a7\\\u008c\u0006\u00b3*_T\u008f\u00d5\u0007\u008a\u0014Z\u00f1\u00a9\u0005\u0014\u0005\u00ab4\u00d9n^6\u00124\u0007c5)\u0010Qro\u00ab5w\u00bc5\u00e7\u00e3\u0019\u00a4!\u008e\u00ff\u00a1\u00ba\u00d1\u008f8\u008c\u0099$\u00de\u00b4\u00af\u00d8\u00c3\u001e\u00a4\u00caTD\t\u00d7t2\u0086\u001b\u00ee\u0080\u00e0L\u008a\u0082\u0092@\u0004\u0090$\u00faFM\u009cFv\u00cf,7\u00f2u\u00b5\u00aa\u00f0\u00cc\u00d6\u00af\u00a1h\u00fe\u00a4m\u0000\u008d\u00e2\u00ba@\u00b8\u00ecTM}=F\f=\u00048\u0015A/\u001a\u00dece\u00e3\u00ef\u00e7#ie\u009aPK\u00bb\u00d1\u00e0\u00afP\t\u0086\u00b6(\u00de/\u00ce{\u0019\u008fW,BSN[\u0085\u00b4\u0018\u00e3>&\u0004d,\u0000\u00f1\n\f\u00d6\u00dd\u0005\u00be\u00f80\u0093\u00e96\u00e9\u00c9N\u00e60k\u0082\u0094\u00e8l\u00b6r\u0093\u001bl?1i\u00d3\u00ab9\u00c3\u0005\u00e8\u0080\u00d3\u00d0v\u0016(w\u00dbJ\t\u0002\u00c2\u00be\u00fa\u007f!v\u00eb\u00fa\u00eb\u00cd\u0082\u00f61E\u00b1\u00a0\u0002b\u00b7<w>\u00ab\"\u00a0\u0001\u00b8\u000fm\u00db$W:\u00ad\u00bbd\u00f6\u00e2#\u008a\u009f\u00e5O76{\u00fd\u00e4!)\u00c9\u0015M\u00ec\u009f\u0098!\u0018+\u0005\u00a2\u009b\u00c0w\u00be\u00ef\u00a6\u00ba@45{\u00a5V\u0091W\u000f\u00d4\u0082\u00b7\u0003Y\u00e4\u00d8\u0006\u0013\u001a\u00bd\u00d8C\u00ac\u001d\b7V\u00c5\u00c2\u009a\u00c3\u00e8\u0087\u0017s\u00d1\u00c9\u008a\u00cf\u00a6<x\u00d4(\u0007|\u00c08\u00eeN\u00f1u` \u008a;\u00b7gb\u0084\u00c0qQ\u001c\u008e\u0091\u00ff\u00cc\u008e\u00a0m\u00d4\u00a7yi-\u000fg\u001cD\u008c\u0098\u00a3n\u008c\u00ef\u0011\u00bd\u0088\u00f2\u00f4\u008b\u00cf\u0088N\u00950\n\u00a5\u00ef\u00a0\u0007\u00ba\u00f85\u00f7\u00e0\u00bb\u00f9\u00a2z\u00f8uy\")\u001b\u00cay\u0082_\u0015\u000ez\u00c3U\u00a3\u00da1\u00be\u00fe\u00d5\u00a2$\u00e1i\fY\u00cf\u001d\u00fcp\u0095l\u0088\u00ca\u0085:\u008d\u00ba\u00b2nsPS4\t\u00ab\u0004\u00b2l\u00ddR\u0007\u0001\n/\u00e5h\u0096\u008b)\u00b0\u00dfS2\u00fd\u008bW\u00b9\u000b\\<\u00d4\u0005\u0080\u0091#\u00a4\u00eb\u00daEu\u00043\u000f\u00af\u00c3\u001a\u00e4\u0098\u00c0\u00170\u0014IzH\u0095\u00f5\u00ce\u00b8[";
                var4_3 = "%S\u00e1\u008f\u00e9\u00b6\u00c5\u00a3\u0000^\n\u0091d\u00af\u00e4\u00c6\u000eW\n\u00c0\u0000\u00fe\u001e\u0016\u00c6G8\\\u0014\u0094(\u00f5\u00fa%\u000b\u00b4%0-*\u001b\u0002\u00c3\u009c3W\u000e\u00dd\u001c\u00bcJ\u001d\u00cc\u00a12I\t%\u00f4\u001bC\u0007\u0098\u00cf\u00e0\u00fd\u00d2t\u00a3\u000b\u0082\u00e7\tV6:\u00cf\r\u00a7\\\u008c\u0006\u00b3*_T\u008f\u00d5\u0007\u008a\u0014Z\u00f1\u00a9\u0005\u0014\u0005\u00ab4\u00d9n^6\u00124\u0007c5)\u0010Qro\u00ab5w\u00bc5\u00e7\u00e3\u0019\u00a4!\u008e\u00ff\u00a1\u00ba\u00d1\u008f8\u008c\u0099$\u00de\u00b4\u00af\u00d8\u00c3\u001e\u00a4\u00caTD\t\u00d7t2\u0086\u001b\u00ee\u0080\u00e0L\u008a\u0082\u0092@\u0004\u0090$\u00faFM\u009cFv\u00cf,7\u00f2u\u00b5\u00aa\u00f0\u00cc\u00d6\u00af\u00a1h\u00fe\u00a4m\u0000\u008d\u00e2\u00ba@\u00b8\u00ecTM}=F\f=\u00048\u0015A/\u001a\u00dece\u00e3\u00ef\u00e7#ie\u009aPK\u00bb\u00d1\u00e0\u00afP\t\u0086\u00b6(\u00de/\u00ce{\u0019\u008fW,BSN[\u0085\u00b4\u0018\u00e3>&\u0004d,\u0000\u00f1\n\f\u00d6\u00dd\u0005\u00be\u00f80\u0093\u00e96\u00e9\u00c9N\u00e60k\u0082\u0094\u00e8l\u00b6r\u0093\u001bl?1i\u00d3\u00ab9\u00c3\u0005\u00e8\u0080\u00d3\u00d0v\u0016(w\u00dbJ\t\u0002\u00c2\u00be\u00fa\u007f!v\u00eb\u00fa\u00eb\u00cd\u0082\u00f61E\u00b1\u00a0\u0002b\u00b7<w>\u00ab\"\u00a0\u0001\u00b8\u000fm\u00db$W:\u00ad\u00bbd\u00f6\u00e2#\u008a\u009f\u00e5O76{\u00fd\u00e4!)\u00c9\u0015M\u00ec\u009f\u0098!\u0018+\u0005\u00a2\u009b\u00c0w\u00be\u00ef\u00a6\u00ba@45{\u00a5V\u0091W\u000f\u00d4\u0082\u00b7\u0003Y\u00e4\u00d8\u0006\u0013\u001a\u00bd\u00d8C\u00ac\u001d\b7V\u00c5\u00c2\u009a\u00c3\u00e8\u0087\u0017s\u00d1\u00c9\u008a\u00cf\u00a6<x\u00d4(\u0007|\u00c08\u00eeN\u00f1u` \u008a;\u00b7gb\u0084\u00c0qQ\u001c\u008e\u0091\u00ff\u00cc\u008e\u00a0m\u00d4\u00a7yi-\u000fg\u001cD\u008c\u0098\u00a3n\u008c\u00ef\u0011\u00bd\u0088\u00f2\u00f4\u008b\u00cf\u0088N\u00950\n\u00a5\u00ef\u00a0\u0007\u00ba\u00f85\u00f7\u00e0\u00bb\u00f9\u00a2z\u00f8uy\")\u001b\u00cay\u0082_\u0015\u000ez\u00c3U\u00a3\u00da1\u00be\u00fe\u00d5\u00a2$\u00e1i\fY\u00cf\u001d\u00fcp\u0095l\u0088\u00ca\u0085:\u008d\u00ba\u00b2nsPS4\t\u00ab\u0004\u00b2l\u00ddR\u0007\u0001\n/\u00e5h\u0096\u008b)\u00b0\u00dfS2\u00fd\u008bW\u00b9\u000b\\<\u00d4\u0005\u0080\u0091#\u00a4\u00eb\u00daEu\u00043\u000f\u00af\u00c3\u001a\u00e4\u0098\u00c0\u00170\u0014IzH\u0095\u00f5\u00ce\u00b8[".length();
                var1_4 = 34;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 109;
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
                    var2_2 = "\u00d3\u00cf?P\u0015\u0085\u00b5\u000b\u0003)\u00a1\u00e3\u0099:\u001b\u00ce\u00ec\u00af\u00dc\u00f4\u0012\u00f1\u00bau-\u00bab63\u0096;z\u00f0N\u00d7\u00be\u0019\u0082=\u00aa\u00f4\u000f\u00eb\u0096\u00d3\u00cc\u0014\u00ec\u0098w\u00d5";
                    var4_3 = "\u00d3\u00cf?P\u0015\u0085\u00b5\u000b\u0003)\u00a1\u00e3\u0099:\u001b\u00ce\u00ec\u00af\u00dc\u00f4\u0012\u00f1\u00bau-\u00bab63\u0096;z\u00f0N\u00d7\u00be\u0019\u0082=\u00aa\u00f4\u000f\u00eb\u0096\u00d3\u00cc\u0014\u00ec\u0098w\u00d5".length();
                    var1_4 = 9;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 75;
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
                            v15 = 94;
                            break;
                        }
                        case 1: {
                            v15 = 58;
                            break;
                        }
                        case 2: {
                            v15 = 74;
                            break;
                        }
                        case 3: {
                            v15 = 102;
                            break;
                        }
                        case 4: {
                            v15 = 85;
                            break;
                        }
                        case 5: {
                            v15 = 10;
                            break;
                        }
                        default: {
                            v15 = 116;
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
        W.a = var5;
        W.b = new String[27];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3EBA) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 194;
                    break;
                }
                case 1: {
                    n14 = 91;
                    break;
                }
                case 2: {
                    n14 = 49;
                    break;
                }
                case 3: {
                    n14 = 127;
                    break;
                }
                case 4: {
                    n14 = 237;
                    break;
                }
                case 5: {
                    n14 = 202;
                    break;
                }
                case 6: {
                    n14 = 177;
                    break;
                }
                case 7: {
                    n14 = 83;
                    break;
                }
                case 8: {
                    n14 = 238;
                    break;
                }
                case 9: {
                    n14 = 214;
                    break;
                }
                case 10: {
                    n14 = 182;
                    break;
                }
                case 11: {
                    n14 = 114;
                    break;
                }
                case 12: {
                    n14 = 247;
                    break;
                }
                case 13: {
                    n14 = 130;
                    break;
                }
                case 14: {
                    n14 = 89;
                    break;
                }
                case 15: {
                    n14 = 61;
                    break;
                }
                case 16: {
                    n14 = 154;
                    break;
                }
                case 17: {
                    n14 = 25;
                    break;
                }
                case 18: {
                    n14 = 215;
                    break;
                }
                case 19: {
                    n14 = 225;
                    break;
                }
                case 20: {
                    n14 = 18;
                    break;
                }
                case 21: {
                    n14 = 220;
                    break;
                }
                case 22: {
                    n14 = 183;
                    break;
                }
                case 23: {
                    n14 = 51;
                    break;
                }
                case 24: {
                    n14 = 169;
                    break;
                }
                case 25: {
                    n14 = 243;
                    break;
                }
                case 26: {
                    n14 = 180;
                    break;
                }
                case 27: {
                    n14 = 85;
                    break;
                }
                case 28: {
                    n14 = 158;
                    break;
                }
                case 29: {
                    n14 = 57;
                    break;
                }
                case 30: {
                    n14 = 29;
                    break;
                }
                case 31: {
                    n14 = 110;
                    break;
                }
                case 32: {
                    n14 = 174;
                    break;
                }
                case 33: {
                    n14 = 72;
                    break;
                }
                case 34: {
                    n14 = 97;
                    break;
                }
                case 35: {
                    n14 = 69;
                    break;
                }
                case 36: {
                    n14 = 230;
                    break;
                }
                case 37: {
                    n14 = 24;
                    break;
                }
                case 38: {
                    n14 = 206;
                    break;
                }
                case 39: {
                    n14 = 252;
                    break;
                }
                case 40: {
                    n14 = 6;
                    break;
                }
                case 41: {
                    n14 = 168;
                    break;
                }
                case 42: {
                    n14 = 125;
                    break;
                }
                case 43: {
                    n14 = 81;
                    break;
                }
                case 44: {
                    n14 = 66;
                    break;
                }
                case 45: {
                    n14 = 208;
                    break;
                }
                case 46: {
                    n14 = 129;
                    break;
                }
                case 47: {
                    n14 = 219;
                    break;
                }
                case 48: {
                    n14 = 178;
                    break;
                }
                case 49: {
                    n14 = 113;
                    break;
                }
                case 50: {
                    n14 = 133;
                    break;
                }
                case 51: {
                    n14 = 111;
                    break;
                }
                case 52: {
                    n14 = 179;
                    break;
                }
                case 53: {
                    n14 = 87;
                    break;
                }
                case 54: {
                    n14 = 138;
                    break;
                }
                case 55: {
                    n14 = 232;
                    break;
                }
                case 56: {
                    n14 = 31;
                    break;
                }
                case 57: {
                    n14 = 175;
                    break;
                }
                case 58: {
                    n14 = 207;
                    break;
                }
                case 59: {
                    n14 = 249;
                    break;
                }
                case 60: {
                    n14 = 96;
                    break;
                }
                case 61: {
                    n14 = 250;
                    break;
                }
                case 62: {
                    n14 = 43;
                    break;
                }
                case 63: {
                    n14 = 187;
                    break;
                }
                case 64: {
                    n14 = 33;
                    break;
                }
                case 65: {
                    n14 = 142;
                    break;
                }
                case 66: {
                    n14 = 3;
                    break;
                }
                case 67: {
                    n14 = 152;
                    break;
                }
                case 68: {
                    n14 = 115;
                    break;
                }
                case 69: {
                    n14 = 228;
                    break;
                }
                case 70: {
                    n14 = 149;
                    break;
                }
                case 71: {
                    n14 = 137;
                    break;
                }
                case 72: {
                    n14 = 123;
                    break;
                }
                case 73: {
                    n14 = 44;
                    break;
                }
                case 74: {
                    n14 = 112;
                    break;
                }
                case 75: {
                    n14 = 93;
                    break;
                }
                case 76: {
                    n14 = 211;
                    break;
                }
                case 77: {
                    n14 = 244;
                    break;
                }
                case 78: {
                    n14 = 245;
                    break;
                }
                case 79: {
                    n14 = 14;
                    break;
                }
                case 80: {
                    n14 = 109;
                    break;
                }
                case 81: {
                    n14 = 48;
                    break;
                }
                case 82: {
                    n14 = 192;
                    break;
                }
                case 83: {
                    n14 = 121;
                    break;
                }
                case 84: {
                    n14 = 147;
                    break;
                }
                case 85: {
                    n14 = 42;
                    break;
                }
                case 86: {
                    n14 = 151;
                    break;
                }
                case 87: {
                    n14 = 7;
                    break;
                }
                case 88: {
                    n14 = 47;
                    break;
                }
                case 89: {
                    n14 = 145;
                    break;
                }
                case 90: {
                    n14 = 107;
                    break;
                }
                case 91: {
                    n14 = 117;
                    break;
                }
                case 92: {
                    n14 = 53;
                    break;
                }
                case 93: {
                    n14 = 23;
                    break;
                }
                case 94: {
                    n14 = 144;
                    break;
                }
                case 95: {
                    n14 = 176;
                    break;
                }
                case 96: {
                    n14 = 36;
                    break;
                }
                case 97: {
                    n14 = 62;
                    break;
                }
                case 98: {
                    n14 = 19;
                    break;
                }
                case 99: {
                    n14 = 229;
                    break;
                }
                case 100: {
                    n14 = 28;
                    break;
                }
                case 101: {
                    n14 = 132;
                    break;
                }
                case 102: {
                    n14 = 234;
                    break;
                }
                case 103: {
                    n14 = 173;
                    break;
                }
                case 104: {
                    n14 = 30;
                    break;
                }
                case 105: {
                    n14 = 11;
                    break;
                }
                case 106: {
                    n14 = 46;
                    break;
                }
                case 107: {
                    n14 = 9;
                    break;
                }
                case 108: {
                    n14 = 59;
                    break;
                }
                case 109: {
                    n14 = 128;
                    break;
                }
                case 110: {
                    n14 = 171;
                    break;
                }
                case 111: {
                    n14 = 102;
                    break;
                }
                case 112: {
                    n14 = 140;
                    break;
                }
                case 113: {
                    n14 = 172;
                    break;
                }
                case 114: {
                    n14 = 68;
                    break;
                }
                case 115: {
                    n14 = 120;
                    break;
                }
                case 116: {
                    n14 = 162;
                    break;
                }
                case 117: {
                    n14 = 204;
                    break;
                }
                case 118: {
                    n14 = 55;
                    break;
                }
                case 119: {
                    n14 = 248;
                    break;
                }
                case 120: {
                    n14 = 40;
                    break;
                }
                case 121: {
                    n14 = 197;
                    break;
                }
                case 122: {
                    n14 = 226;
                    break;
                }
                case 123: {
                    n14 = 5;
                    break;
                }
                case 124: {
                    n14 = 38;
                    break;
                }
                case 125: {
                    n14 = 148;
                    break;
                }
                case 126: {
                    n14 = 90;
                    break;
                }
                case 127: {
                    n14 = 77;
                    break;
                }
                case 128: {
                    n14 = 255;
                    break;
                }
                case 129: {
                    n14 = 70;
                    break;
                }
                case 130: {
                    n14 = 134;
                    break;
                }
                case 131: {
                    n14 = 35;
                    break;
                }
                case 132: {
                    n14 = 253;
                    break;
                }
                case 133: {
                    n14 = 163;
                    break;
                }
                case 134: {
                    n14 = 205;
                    break;
                }
                case 135: {
                    n14 = 27;
                    break;
                }
                case 136: {
                    n14 = 166;
                    break;
                }
                case 137: {
                    n14 = 105;
                    break;
                }
                case 138: {
                    n14 = 58;
                    break;
                }
                case 139: {
                    n14 = 78;
                    break;
                }
                case 140: {
                    n14 = 13;
                    break;
                }
                case 141: {
                    n14 = 251;
                    break;
                }
                case 142: {
                    n14 = 136;
                    break;
                }
                case 143: {
                    n14 = 198;
                    break;
                }
                case 144: {
                    n14 = 124;
                    break;
                }
                case 145: {
                    n14 = 222;
                    break;
                }
                case 146: {
                    n14 = 118;
                    break;
                }
                case 147: {
                    n14 = 170;
                    break;
                }
                case 148: {
                    n14 = 8;
                    break;
                }
                case 149: {
                    n14 = 88;
                    break;
                }
                case 150: {
                    n14 = 156;
                    break;
                }
                case 151: {
                    n14 = 235;
                    break;
                }
                case 152: {
                    n14 = 26;
                    break;
                }
                case 153: {
                    n14 = 159;
                    break;
                }
                case 154: {
                    n14 = 94;
                    break;
                }
                case 155: {
                    n14 = 160;
                    break;
                }
                case 156: {
                    n14 = 184;
                    break;
                }
                case 157: {
                    n14 = 86;
                    break;
                }
                case 158: {
                    n14 = 203;
                    break;
                }
                case 159: {
                    n14 = 32;
                    break;
                }
                case 160: {
                    n14 = 218;
                    break;
                }
                case 161: {
                    n14 = 181;
                    break;
                }
                case 162: {
                    n14 = 71;
                    break;
                }
                case 163: {
                    n14 = 191;
                    break;
                }
                case 164: {
                    n14 = 143;
                    break;
                }
                case 165: {
                    n14 = 135;
                    break;
                }
                case 166: {
                    n14 = 104;
                    break;
                }
                case 167: {
                    n14 = 139;
                    break;
                }
                case 168: {
                    n14 = 100;
                    break;
                }
                case 169: {
                    n14 = 190;
                    break;
                }
                case 170: {
                    n14 = 106;
                    break;
                }
                case 171: {
                    n14 = 2;
                    break;
                }
                case 172: {
                    n14 = 209;
                    break;
                }
                case 173: {
                    n14 = 1;
                    break;
                }
                case 174: {
                    n14 = 52;
                    break;
                }
                case 175: {
                    n14 = 37;
                    break;
                }
                case 176: {
                    n14 = 16;
                    break;
                }
                case 177: {
                    n14 = 4;
                    break;
                }
                case 178: {
                    n14 = 242;
                    break;
                }
                case 179: {
                    n14 = 161;
                    break;
                }
                case 180: {
                    n14 = 246;
                    break;
                }
                case 181: {
                    n14 = 131;
                    break;
                }
                case 182: {
                    n14 = 20;
                    break;
                }
                case 183: {
                    n14 = 39;
                    break;
                }
                case 184: {
                    n14 = 146;
                    break;
                }
                case 185: {
                    n14 = 212;
                    break;
                }
                case 186: {
                    n14 = 76;
                    break;
                }
                case 187: {
                    n14 = 196;
                    break;
                }
                case 188: {
                    n14 = 122;
                    break;
                }
                case 189: {
                    n14 = 201;
                    break;
                }
                case 190: {
                    n14 = 15;
                    break;
                }
                case 191: {
                    n14 = 34;
                    break;
                }
                case 192: {
                    n14 = 98;
                    break;
                }
                case 193: {
                    n14 = 224;
                    break;
                }
                case 194: {
                    n14 = 186;
                    break;
                }
                case 195: {
                    n14 = 75;
                    break;
                }
                case 196: {
                    n14 = 119;
                    break;
                }
                case 197: {
                    n14 = 21;
                    break;
                }
                case 198: {
                    n14 = 108;
                    break;
                }
                case 199: {
                    n14 = 213;
                    break;
                }
                case 200: {
                    n14 = 164;
                    break;
                }
                case 201: {
                    n14 = 200;
                    break;
                }
                case 202: {
                    n14 = 84;
                    break;
                }
                case 203: {
                    n14 = 92;
                    break;
                }
                case 204: {
                    n14 = 141;
                    break;
                }
                case 205: {
                    n14 = 82;
                    break;
                }
                case 206: {
                    n14 = 193;
                    break;
                }
                case 207: {
                    n14 = 45;
                    break;
                }
                case 208: {
                    n14 = 189;
                    break;
                }
                case 209: {
                    n14 = 210;
                    break;
                }
                case 210: {
                    n14 = 157;
                    break;
                }
                case 211: {
                    n14 = 231;
                    break;
                }
                case 212: {
                    n14 = 95;
                    break;
                }
                case 213: {
                    n14 = 233;
                    break;
                }
                case 214: {
                    n14 = 155;
                    break;
                }
                case 215: {
                    n14 = 67;
                    break;
                }
                case 216: {
                    n14 = 56;
                    break;
                }
                case 217: {
                    n14 = 12;
                    break;
                }
                case 218: {
                    n14 = 116;
                    break;
                }
                case 219: {
                    n14 = 239;
                    break;
                }
                case 220: {
                    n14 = 153;
                    break;
                }
                case 221: {
                    n14 = 216;
                    break;
                }
                case 222: {
                    n14 = 63;
                    break;
                }
                case 223: {
                    n14 = 60;
                    break;
                }
                case 224: {
                    n14 = 22;
                    break;
                }
                case 225: {
                    n14 = 240;
                    break;
                }
                case 226: {
                    n14 = 73;
                    break;
                }
                case 227: {
                    n14 = 227;
                    break;
                }
                case 228: {
                    n14 = 195;
                    break;
                }
                case 229: {
                    n14 = 126;
                    break;
                }
                case 230: {
                    n14 = 99;
                    break;
                }
                case 231: {
                    n14 = 150;
                    break;
                }
                case 232: {
                    n14 = 217;
                    break;
                }
                case 233: {
                    n14 = 65;
                    break;
                }
                case 234: {
                    n14 = 167;
                    break;
                }
                case 235: {
                    n14 = 64;
                    break;
                }
                case 236: {
                    n14 = 199;
                    break;
                }
                case 237: {
                    n14 = 188;
                    break;
                }
                case 238: {
                    n14 = 74;
                    break;
                }
                case 239: {
                    n14 = 241;
                    break;
                }
                case 240: {
                    n14 = 41;
                    break;
                }
                case 241: {
                    n14 = 50;
                    break;
                }
                case 242: {
                    n14 = 101;
                    break;
                }
                case 243: {
                    n14 = 80;
                    break;
                }
                case 244: {
                    n14 = 236;
                    break;
                }
                case 245: {
                    n14 = 223;
                    break;
                }
                case 246: {
                    n14 = 79;
                    break;
                }
                case 247: {
                    n14 = 17;
                    break;
                }
                case 248: {
                    n14 = 185;
                    break;
                }
                case 249: {
                    n14 = 254;
                    break;
                }
                case 250: {
                    n14 = 221;
                    break;
                }
                case 251: {
                    n14 = 10;
                    break;
                }
                case 252: {
                    n14 = 165;
                    break;
                }
                case 253: {
                    n14 = 103;
                    break;
                }
                case 254: {
                    n14 = 54;
                    break;
                }
                default: {
                    n14 = 0;
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
            W.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

