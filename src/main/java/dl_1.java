/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dL
 */
class dl_1
implements fw_1 {
    dl_1() {
    }

    /*
     * Loose catch block
     */
    @Override
    public void w(TX tX) {
        block21: {
            int n10 = bn_1.C();
            try {
                byte[] byArray;
                int n11;
                int n12;
                block20: {
                    block17: {
                        block19: {
                            block18: {
                                block23: {
                                    int n13;
                                    block22: {
                                        try {
                                            n12 = tX.C();
                                            n11 = 1;
                                            if (n10 != 0) break block17;
                                            if (n12 != n11) break block18;
                                        }
                                        catch (Exception exception) {
                                            throw dl_1.a(exception);
                                        }
                                        byArray = new byte[bn_1.J.available()];
                                        n13 = bn_1.J.read(byArray);
                                        n12 = bq_1.L() ? 1 : 0;
                                        if (n10 != 0) break block19;
                                        if (n12 != 0) break block18;
                                        break block22;
                                        catch (Exception exception) {
                                            throw dl_1.a(exception);
                                        }
                                    }
                                    bq_1.Z(n13);
                                    bq_1.S(byArray, n13);
                                    n12 = bq_1.u();
                                    n11 = bq_1.J();
                                    if (n10 != 0) break block17;
                                    break block23;
                                    catch (Exception exception) {
                                        throw dl_1.a(exception);
                                    }
                                }
                                try {
                                    block24: {
                                        if (n12 < n11) break block18;
                                        break block24;
                                        catch (Exception exception) {
                                            throw dl_1.a(exception);
                                        }
                                    }
                                    bq_1.y(true);
                                }
                                catch (Exception exception) {
                                    throw dl_1.a(exception);
                                }
                            }
                            n12 = tX.C();
                        }
                        n11 = 2;
                    }
                    if (n10 != 0) break block20;
                    try {
                        block25: {
                            if (n12 != n11) break block21;
                            break block25;
                            catch (Exception exception) {
                                throw dl_1.a(exception);
                            }
                        }
                        n12 = bq_1.L();
                        n11 = bq_1.J();
                    }
                    catch (Exception exception) {
                        throw dl_1.a(exception);
                    }
                }
                if (n12 < n11) {
                    byArray = bq_1.q();
                    bn_1.y.write(byArray, 0, byArray.length);
                    bq_1.V();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

