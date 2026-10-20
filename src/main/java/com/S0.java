/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N2;
import com.fv_0;
import com.ky_2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class S0 {
    private static final Logger L = LoggerFactory.getLogger(S0.class);
    private final Future j;
    private final BlockingQueue F;
    private static ky_2[] D;

    public void S() {
        this.j.cancel(true);
    }

    public S0(fv_0 fv_02, ExecutorService executorService) {
        ky_2[] ky_2Array = S0.p();
        ky_2[] ky_2Array2 = ky_2Array;
        this.F = new ArrayBlockingQueue(1);
        this.j = executorService.submit(new N2(this, fv_02));
        if (ky_2Array2 != null) {
            ky_2.K(new String[3]);
        }
    }

    public void J(Predicate predicate) {
        this.F.offer(predicate);
    }

    static Logger g() {
        return L;
    }

    static Future P(S0 s0) {
        return s0.j;
    }

    static BlockingQueue a(S0 s0) {
        return s0.F;
    }

    static {
        S0.q(null);
    }

    public static void q(ky_2[] ky_2Array) {
        D = ky_2Array;
    }

    public static ky_2[] p() {
        return D;
    }
}

