/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dF
 */
class df_1
implements Runnable {
    final F6 h;

    df_1(F6 f62) {
        this.h = f62;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block26: {
            boolean bl = F6.g();
            try {
                F6 f62;
                block25: {
                    String string;
                    String string2;
                    F6 f63;
                    block23: {
                        block24: {
                            try {
                                try {
                                    this.h.E.S();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                f63 = (F6)this.h;
                                if (bl) break block23;
                                if (f63.l) {
                                }
                                break block24;
                            }
                            catch (Exception exception) {
                                throw df_1.a(exception);
                            }
                            try {
                                this.h.q();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            return;
                        }
                        try {
                            this.h.S.k(this.h.E);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        f63 = (F6)this.h;
                    }
                    try {
                        string2 = (String)f63.E.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string3 = string = string2;
                    f62 = (F6)this.h;
                    if (bl) break block25;
                    try {
                        block27: {
                            boolean bl2;
                            try {
                                bl2 = (Boolean)f62.O();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (bl2) break block26;
                            break block27;
                            catch (Exception exception) {
                                throw df_1.a(exception);
                            }
                        }
                        try {
                            this.h.t((Object)string3, false, false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        f62 = (F6)this.h;
                    }
                    catch (Exception exception) {
                        throw df_1.a(exception);
                    }
                }
                try {
                    f62.e(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

