/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N3;
import com.ib_0;
import com.j_0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class uO
implements N3 {
    private static final ScheduledExecutorService i = Executors.newScheduledThreadPool(1);
    private final Object Z = new Object();
    private final Runnable f;
    private final long g;
    private ib_0 v = null;

    public uO(Runnable runnable, long l2) {
        this.f = runnable;
        this.g = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void q() {
        Object object = this.Z;
        synchronized (object) {
            boolean bl = j_0.P();
            Object object2 = this.v;
            if (!bl) {
                if (object2 != null) {
                    this.v.I();
                }
                this.v = new ib_0(this);
                i.schedule(this.v, this.g, TimeUnit.NANOSECONDS);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void y() {
        Object object = this.Z;
        synchronized (object) {
            boolean bl = j_0.P();
            Object object2 = this.v;
            if (!bl) {
                if (object2 != null) {
                    this.v.I();
                    this.v = null;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    static long G(uO uO2) {
        return uO2.g;
    }

    static ScheduledExecutorService J() {
        return i;
    }

    static Runnable u(uO uO2) {
        return uO2.f;
    }
}

