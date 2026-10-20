/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c__0;
import com.ww_1;
import java.net.InetAddress;
import org.icmp4j.j;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

/*
 * Renamed from com.ah
 */
class ah_0
implements Runnable {
    final InetAddress k;
    final int Y;
    final c__0 c;

    ah_0(c__0 c__02, InetAddress inetAddress, int n10) {
        this.c = c__02;
        this.k = inetAddress;
        this.Y = n10;
    }

    @Override
    public void run() {
        ++this.c.n;
        try {
            j j2 = xq_0.A().p(this.k, this.Y, new ww_1(this));
            j2.n(this.c.n);
        }
        catch (PcapNativeException pcapNativeException) {
            pcapNativeException.printStackTrace();
        }
        catch (NotOpenException notOpenException) {
            notOpenException.printStackTrace();
        }
    }
}

