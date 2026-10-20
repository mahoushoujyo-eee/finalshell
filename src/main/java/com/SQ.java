/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;

class SQ
implements Runnable {
    final int m;
    final WC n;

    SQ(WC wC, int n10) {
        this.n = wC;
        this.m = n10;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block38: {
            block34: {
                v0 = WC.V();
                this.n.R(this.m, true);
                var1_1 = v0;
                try {
                    block35: {
                        block36: {
                            block40: {
                                block39: {
                                    block48: {
                                        block47: {
                                            block46: {
                                                block37: {
                                                    block33: {
                                                        block44: {
                                                            block31: {
                                                                block32: {
                                                                    block30: {
                                                                        block41: {
                                                                            block29: {
                                                                                v1 = this.n;
                                                                                if (var1_1 != null) break block41;
                                                                                try {
                                                                                    block42: {
                                                                                        if (v1.E() >= 0L) break block29;
                                                                                        break block42;
                                                                                        catch (InterruptedException v2) {
                                                                                            throw SQ.a(v2);
                                                                                        }
                                                                                    }
                                                                                    v3 = this.n.k();
                                                                                    break block30;
                                                                                }
                                                                                catch (InterruptedException v4) {
                                                                                    throw SQ.a(v4);
                                                                                }
                                                                            }
                                                                            v1 = this.n;
                                                                        }
                                                                        v3 = v1.E();
                                                                    }
                                                                    var2_2 = v3;
                                                                    cfr_temp_0 = var2_2 - 0L;
                                                                    v5 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                    if (var1_1 != null) break block31;
                                                                    try {
                                                                        block43: {
                                                                            if (v5 <= 0) break block32;
                                                                            break block43;
                                                                            catch (InterruptedException v6) {
                                                                                throw SQ.a(v6);
                                                                            }
                                                                        }
                                                                        this.n.E = System.currentTimeMillis();
                                                                        this.n.t = var2_2;
                                                                        Thread.sleep(var2_2);
                                                                    }
                                                                    catch (InterruptedException v7) {
                                                                        throw SQ.a(v7);
                                                                    }
                                                                }
                                                                v5 = (long)this.n.E(-1, this.m);
                                                            }
                                                            if (var1_1 != null) break block33;
                                                            if (v5 == false) break block34;
                                                            break block44;
                                                            catch (InterruptedException v8) {
                                                                throw SQ.a(v8);
                                                            }
                                                        }
                                                        try {
                                                            block45: {
                                                                this.n.N = 0;
                                                                v9 = this.n;
                                                                if (var1_1 != null) break block35;
                                                                break block45;
                                                                catch (InterruptedException v10) {
                                                                    throw SQ.a(v10);
                                                                }
                                                            }
                                                            v5 = (long)v9.p;
                                                        }
                                                        catch (InterruptedException v11) {
                                                            throw SQ.a(v11);
                                                        }
                                                    }
                                                    try {
                                                        if (v5 == false) break block36;
lbl66:
                                                        // 3 sources

                                                        while (this.n.E(this.n.N, this.m)) {
                                                            break block37;
                                                        }
                                                        break block34;
                                                    }
                                                    catch (InterruptedException v12) {
                                                        throw SQ.a(v12);
                                                    }
                                                }
                                                this.n.X(this.m);
                                                v13 = this.n;
                                                v14 = ++this.n.N;
                                                if (var1_1 != null) break block38;
                                                v15 = v13.E(v14, this.m);
                                                if (var1_1 != null) break block39;
                                                break block46;
                                                catch (InterruptedException v16) {
                                                    throw SQ.a(v16);
                                                }
                                            }
                                            if (v15 != 0) ** GOTO lbl95
                                            break block47;
                                            catch (InterruptedException v17) {
                                                throw SQ.a(v17);
                                            }
                                        }
                                        if (var1_1 == null) break block34;
                                        break block48;
                                        catch (InterruptedException v18) {
                                            throw SQ.a(v18);
                                        }
                                    }
                                    try {
                                        block49: {
                                            v19 = this.n.k();
                                            if (var1_1 != null) break block40;
                                            break block49;
                                            catch (InterruptedException v20) {
                                                throw SQ.a(v20);
                                            }
                                        }
                                        cfr_temp_1 = v19 - 0L;
                                        v15 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                    }
                                    catch (InterruptedException v21) {
                                        throw SQ.a(v21);
                                    }
                                }
                                if (v15 <= 0) ** GOTO lbl66
                                v19 = this.n.k();
                            }
                            var4_4 = v19;
                            this.n.E = System.currentTimeMillis();
                            this.n.t = var4_4;
                            Thread.sleep(var4_4);
                            if (var1_1 == null) ** GOTO lbl66
                        }
                        this.n.X(this.m);
                        v9 = this.n;
                    }
                    ++v9.N;
                }
                catch (InterruptedException var2_3) {
                    // empty catch block
                }
            }
            v13 = this.n;
            v14 = this.m;
        }
        v13.L(v14);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

