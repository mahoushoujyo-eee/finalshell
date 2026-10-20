/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PcapHandle;

class KD
implements Runnable {
    final li_0 O;
    private final PcapHandle p;

    KD(li_0 li_02, PcapHandle pcapHandle) {
        this.O = li_02;
        this.p = pcapHandle;
    }

    @Override
    public void run() {
        this.p.close();
    }
}

