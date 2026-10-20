/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.io.OutputStream;

public class aU
extends a2 {
    private OutputStream W;

    public aU(OutputStream outputStream) {
        this.W = outputStream;
    }

    public void p(byte by) throws IOException {
        this.W.write(by);
    }

    public void I(byte[] byArray) throws IOException {
        this.W.write(byArray);
        this.W.flush();
    }

    public void C(ub_0 ub_02) throws IOException {
        block34: {
            ub_0 ub_03;
            block33: {
                boolean bl;
                block32: {
                    String[] stringArray;
                    block30: {
                        yu_2 yu_22;
                        block31: {
                            int n10;
                            yu_2 yu_23;
                            ky_0 ky_02;
                            block28: {
                                ub_0 ub_04;
                                block27: {
                                    ky_02 = ub_02.R();
                                    stringArray = mp_0.o();
                                    yu_23 = null;
                                    try {
                                        try {
                                            ub_04 = ub_02;
                                            if (stringArray == null) break block27;
                                            if (!(ub_04 instanceof uw_0)) break block28;
                                        }
                                        catch (IOException iOException) {
                                            throw aU.a(iOException);
                                        }
                                        ub_04 = ub_02;
                                    }
                                    catch (IOException iOException) {
                                        throw aU.a(iOException);
                                    }
                                }
                                yu_23 = ((uw_0)ub_04).f();
                            }
                            if (yu_23 != null) {
                                block29: {
                                    for (n10 = 0; n10 < yu_23.c(); ++n10) {
                                        try {
                                            this.p(x9.ZPAD.r());
                                            if (stringArray == null) break block29;
                                            if (stringArray != null) continue;
                                        }
                                        catch (IOException iOException) {
                                            throw aU.a(iOException);
                                        }
                                        ky_2.K(new String[5]);
                                        break;
                                    }
                                    this.p(x9.ZDLE.r());
                                }
                                this.p(yu_23.T());
                            }
                            n10 = 0;
                            while (ky_02.K()) {
                                try {
                                    ++n10;
                                    this.p(ky_02.c());
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                        break;
                                    }
                                    break block30;
                                }
                                catch (IOException iOException) {
                                    throw aU.a(iOException);
                                }
                            }
                            try {
                                yu_22 = yu_23;
                                if (stringArray == null) break block31;
                                if (yu_22 == null) break block30;
                            }
                            catch (IOException iOException) {
                                throw aU.a(iOException);
                            }
                            yu_22 = yu_23;
                        }
                        try {
                            try {
                                bl = yu_22.d();
                                if (stringArray == null) break block32;
                                if (!bl) break block30;
                            }
                            catch (IOException iOException) {
                                throw aU.a(iOException);
                            }
                            this.p(kd_1.CR.m());
                            this.p(kd_1.LF.m());
                            this.p(kd_1.XON.m());
                        }
                        catch (IOException iOException) {
                            throw aU.a(iOException);
                        }
                    }
                    try {
                        ub_03 = ub_02;
                        if (stringArray == null) break block33;
                        bl = ub_03 instanceof UK;
                    }
                    catch (IOException iOException) {
                        throw aU.a(iOException);
                    }
                }
                if (!bl) break block34;
                ub_03 = ub_02;
            }
            try {
                if (((UK)ub_03).e() == x9.ZCRCW) {
                    this.p(kd_1.XON.m());
                }
            }
            catch (IOException iOException) {
                throw aU.a(iOException);
            }
        }
        this.W.flush();
    }

    @Override
    public void H(Object object) throws IOException {
        this.C((ub_0)object);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

