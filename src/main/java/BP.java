/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CyclicBarrier;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;

class BP
implements Runnable {
    private final PcapHandle I;
    private final PacketListener c;
    private final CyclicBarrier e;
    private String q;
    private String v;
    final u_0 f;

    public BP(u_0 u_02, PcapHandle pcapHandle, PacketListener packetListener, CyclicBarrier cyclicBarrier) {
        this.f = u_02;
        this.I = pcapHandle;
        this.c = packetListener;
        this.e = cyclicBarrier;
    }

    public void F(String string, String string2) {
        this.q = string;
        this.v = string2;
    }

    @Override
    public void run() {
        try {
            this.e.await();
            this.I.loop(this.f.J, this.c);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

