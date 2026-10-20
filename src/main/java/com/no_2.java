/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/*
 * Renamed from com.no
 */
public final class no_2 {
    private static final long a;

    public static String O(URL uRL) {
        try {
            return uRL.toURI().toASCIIString();
        }
        catch (URISyntaxException uRISyntaxException) {
            return uRL.toExternalForm();
        }
    }

    public static URL h(String string) {
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static URI L(String string) {
        URL uRL = no_2.h(string);
        String string2 = FV.D();
        URL uRL2 = uRL;
        if (string2 == null) {
            if (uRL2 == null) return null;
            uRL2 = uRL;
        }
        URI uRI = no_2.A(uRL2);
        return uRI;
    }

    public static URI A(URL uRL) {
        String string = FV.D();
        try {
            URI uRI;
            block6: {
                block5: {
                    URL uRL2;
                    block4: {
                        try {
                            uRL2 = uRL;
                            if (string != null) break block4;
                            if (uRL2 == null) break block5;
                        }
                        catch (URISyntaxException uRISyntaxException) {
                            throw no_2.a(uRISyntaxException);
                        }
                        uRL2 = uRL;
                    }
                    uRI = uRL2.toURI();
                    break block6;
                }
                uRI = null;
            }
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String t(String string) {
        URL uRL = no_2.h(string);
        String string2 = FV.D();
        URL uRL2 = uRL;
        if (string2 == null) {
            if (uRL2 == null) return null;
            uRL2 = uRL;
        }
        String string3 = uRL2.getHost();
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int D(String string) {
        URL uRL = no_2.h(string);
        String string2 = FV.D();
        URL uRL2 = uRL;
        if (string2 == null) {
            if (uRL2 == null) return -1;
            uRL2 = uRL;
        }
        int n10 = uRL2.getPort();
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public static String O(String var0) {
        block4: {
            block2: {
                block3: {
                    var2_1 = no_2.h(var0);
                    var1_2 = FV.D();
                    if (var2_1 == null) break block2;
                    v0 = new StringBuilder().append(var2_1.getHost());
                    v1 = var2_1.getPort();
                    v2 = (int)no_2.a;
                    if (var1_2 != null) break block3;
                    if (v1 == v2) ** GOTO lbl-1000
                    v1 = var2_1.getPort();
                    v2 = -1;
                }
                if (v1 != v2) {
                    v3 = ":" + var2_1.getPort();
                } else lbl-1000:
                // 2 sources

                {
                    v3 = "";
                }
                v4 = v0.append(v3).toString();
                break block4;
            }
            v4 = null;
        }
        return v4;
    }

    /*
     * Unable to fully structure code
     */
    public static String H(String var0, String var1_1) {
        block11: {
            block10: {
                var3_2 = "/";
                var2_3 = FV.D();
                var4_4 = var0.endsWith("/");
                var5_5 = var1_1.startsWith("/");
                v0 = var4_4;
                if (var2_3 == null) {
                    if (v0) {
                        v0 = var5_5;
                        if (var2_3 == null) {
                            if (v0) {
                                return var0 + var1_1.substring(1);
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var4_4;
                    }
                }
                if (var2_3 != null) break block10;
                if (v0) break block11;
                v0 = var5_5;
            }
            if (!v0) {
                return var0 + "/" + var1_1;
            }
        }
        return var0 + var1_1;
    }

    private static URISyntaxException a(URISyntaxException uRISyntaxException) {
        return uRISyntaxException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4312746438832228035L;
        a = 0xEE2E688D44ED0693L ^ l2;
    }
}

