/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

class JC
implements Runnable {
    final String O;
    final String y;
    final boolean T;
    final String J;

    JC(String string, String string2, boolean bl, String string3) {
        this.O = string;
        this.y = string2;
        this.T = bl;
        this.J = string3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block18: {
            var1_1 = yt_1.c();
            try {
                block16: {
                    block17: {
                        block19: {
                            var2_2 = Advapi32Util.registryValueExists(WinReg.HKEY_CURRENT_USER, (String)this.O, (String)this.y);
                            v0 = this.T;
                            if (var1_1 == null) break block16;
                            if (!v0) ** GOTO lbl34
                            break block19;
                            catch (Exception v1) {
                                throw JC.a(v1);
                            }
                        }
                        try {
                            block20: {
                                if (var2_2) break block17;
                                break block20;
                                catch (Exception v2) {
                                    throw JC.a(v2);
                                }
                            }
                            Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, (String)this.O, (String)this.y, (String)this.J);
                            if (var1_1 != null) break block18;
                        }
                        catch (Exception v3) {
                            throw JC.a(v3);
                        }
                    }
                    var3_4 = Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, (String)this.O, (String)this.y);
                    try {
                        if (!var3_4.equals((String)this.J)) {
                            Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, (String)this.O, (String)this.y, (String)this.J);
                        }
                    }
                    catch (Exception v4) {
                        throw JC.a(v4);
                    }
                    try {
                        if (var1_1 != null) break block18;
lbl34:
                        // 2 sources

                        v0 = var2_2;
                    }
                    catch (Exception v5) {
                        throw JC.a(v5);
                    }
                }
                try {
                    if (v0) {
                        Advapi32Util.registryDeleteValue(WinReg.HKEY_CURRENT_USER, (String)this.O, (String)this.y);
                    }
                }
                catch (Exception v6) {
                    throw JC.a(v6);
                }
            }
            catch (Exception var2_3) {
                var2_3.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

