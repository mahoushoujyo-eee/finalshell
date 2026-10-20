/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GN;
import com.dm_2;
import com.xe_0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from com.Ha
 */
public class ha_0
implements GN {
    private static final Logger i = LoggerFactory.getLogger(xe_0.class);

    @Override
    public boolean K(int n10) {
        boolean bl = dm_2.J();
        boolean bl2 = n10;
        if (!bl) {
            switch (bl2) {
                case 0: {
                    return i.isDebugEnabled();
                }
                case 1: {
                    return i.isInfoEnabled();
                }
                case 2: {
                    return i.isWarnEnabled();
                }
                case 3: 
                case 4: {
                    return i.isErrorEnabled();
                }
            }
            bl2 = i.isTraceEnabled();
        }
        return bl2;
    }

    @Override
    public void t(int n10, String string) {
        this.c(n10, string, null);
    }

    @Override
    public void c(int n10, String string, Throwable throwable) {
        boolean bl = dm_2.J();
        int n11 = this.K(n10);
        if (!bl) {
            if (n11 == 0) {
                return;
            }
            n11 = n10;
        }
        switch (n11) {
            case 0: {
                i.debug(string, throwable);
                if (!bl) break;
            }
            case 1: {
                i.info(string, throwable);
                if (!bl) break;
            }
            case 2: {
                i.warn(string, throwable);
                if (!bl) break;
            }
            case 3: 
            case 4: {
                i.error(string, throwable);
                if (!bl) break;
            }
            default: {
                i.trace(string, throwable);
            }
        }
    }
}

