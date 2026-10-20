/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.core.PcapHandle;

class VP
implements Runnable {
    private final PcapHandle t;
    private final CountDownLatch s;
    private final AtomicReference B;

    VP(PcapHandle pcapHandle, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.t = pcapHandle;
        this.s = countDownLatch;
        this.B = atomicReference;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block35: {
            block38: {
                block34: {
                    var2_1 = null;
                    var1_2 = xQ.B();
                    var3_3 = 0;
                    try {
                        try {
                            var2_1 = this.t.dumpOpen(DJ.p);
                            this.B.set(var2_1);
                            if (var1_2 != null) ** GOTO lbl39
                            block28: while (true) {
                                block33: {
                                    block39: {
                                        var4_4 = this.t.getNextPacket();
                                        if (var1_2 == null) break block39;
                                        if (var4_4 != null) ** GOTO lbl19
                                        try {
                                            block40: {
                                                if (var1_2 != null) break block33;
                                                break block40;
                                                catch (Exception v0) {
                                                    throw VP.a(v0);
                                                }
                                            }
                                            var2_1.dump(var4_4, this.t.getTimestamp());
                                            ++var3_3;
                                        }
                                        catch (Exception v1) {
                                            throw VP.a(v1);
                                        }
                                    }
                                    v2 = var3_3;
                                    if (var1_2 == null) ** GOTO lbl42
                                    try {
                                        block41: {
                                            if (v2 < DJ.Y) break block33;
                                            break block41;
                                            catch (Exception v3) {
                                                throw VP.a(v3);
                                            }
                                        }
                                        if (var1_2 != null) break block34;
                                    }
                                    catch (Exception v4) {
                                        throw VP.a(v4);
                                    }
                                }
                                do {
                                    v2 = Thread.interrupted();
lbl42:
                                    // 2 sources

                                    if (v2 == 0) continue block28;
                                } while (var1_2 == null);
                                break;
                            }
                        }
                        catch (Exception var4_5) {
                            var4_5.printStackTrace();
                            if (var1_2 != null) {
                                if (var2_1 != null) {
                                    try {
                                        var2_1.close();
                                    }
                                    catch (Exception var6_6) {
                                        // empty catch block
                                    }
                                }
                                try {
                                    this.t.close();
                                }
                                catch (Exception var6_7) {
                                    // empty catch block
                                }
                            }
                            this.s.countDown();
                            break block35;
                        }
                    }
                    catch (Throwable var5_12) {
                        block36: {
                            block37: {
                                try {
                                    if (var1_2 == null) break block36;
                                    if (var2_1 == null) break block37;
                                }
                                catch (Exception v5) {
                                    throw VP.a(v5);
                                }
                                try {
                                    var2_1.close();
                                }
                                catch (Exception var6_8) {
                                    // empty catch block
                                }
                            }
                            try {
                                this.t.close();
                            }
                            catch (Exception var6_9) {
                                // empty catch block
                            }
                        }
                        this.s.countDown();
                        throw var5_12;
                    }
                }
                try {
                    v6 = var2_1;
                    if (var1_2 != null) {
                        if (v6 == null) break block38;
                    }
                    ** GOTO lbl93
                }
                catch (Exception v7) {
                    throw VP.a(v7);
                }
                try {
                    v6 = var2_1;
lbl93:
                    // 2 sources

                    v6.close();
                }
                catch (Exception var6_10) {
                    // empty catch block
                }
            }
            try {
                this.t.close();
            }
            catch (Exception var6_11) {
                // empty catch block
            }
            this.s.countDown();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

