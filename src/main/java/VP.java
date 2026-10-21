import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.core.PcapHandle;

class VP implements Runnable {
   private final PcapHandle t;
   private final CountDownLatch s;
   private final AtomicReference B;

   VP(PcapHandle var1, CountDownLatch var2, AtomicReference var3) {
      this.t = var1;
      this.s = var2;
      this.B = var3;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic xQ.B ()[Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: bipush 0
      // 007: istore 3
      // 008: aload 0
      // 009: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 00c: getstatic DJ.p Ljava/lang/String;
      // 00f: invokevirtual org/pcap4j/core/PcapHandle.dumpOpen (Ljava/lang/String;)Lorg/pcap4j/core/PcapDumper;
      // 012: astore 2
      // 013: aload 0
      // 014: getfield VP.B Ljava/util/concurrent/atomic/AtomicReference;
      // 017: aload 2
      // 018: invokevirtual java/util/concurrent/atomic/AtomicReference.set (Ljava/lang/Object;)V
      // 01b: aload 1
      // 01c: ifnonnull 070
      // 01f: aload 0
      // 020: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 023: invokevirtual org/pcap4j/core/PcapHandle.getNextPacket ()Lorg/pcap4j/packet/Packet;
      // 026: astore 4
      // 028: aload 1
      // 029: ifnull 053
      // 02c: aload 4
      // 02e: ifnonnull 03c
      // 031: aload 1
      // 032: ifnonnull 070
      // 035: goto 03c
      // 038: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 2
      // 03d: aload 4
      // 03f: aload 0
      // 040: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 043: invokevirtual org/pcap4j/core/PcapHandle.getTimestamp ()Ljava/sql/Timestamp;
      // 046: invokevirtual org/pcap4j/core/PcapDumper.dump (Lorg/pcap4j/packet/Packet;Ljava/sql/Timestamp;)V
      // 049: iinc 3 1
      // 04c: goto 053
      // 04f: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: iload 3
      // 054: aload 1
      // 055: ifnull 073
      // 058: getstatic DJ.Y I
      // 05b: if_icmplt 070
      // 05e: goto 065
      // 061: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: aload 1
      // 066: ifnonnull 0db
      // 069: goto 070
      // 06c: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: invokestatic java/lang/Thread.interrupted ()Z
      // 073: ifeq 01f
      // 076: aload 1
      // 077: ifnull 070
      // 07a: goto 0db
      // 07d: astore 4
      // 07f: aload 4
      // 081: invokevirtual java/lang/Exception.printStackTrace ()V
      // 084: aload 1
      // 085: ifnull 09c
      // 088: aload 2
      // 089: ifnull 095
      // 08c: aload 2
      // 08d: invokevirtual org/pcap4j/core/PcapDumper.close ()V
      // 090: goto 095
      // 093: astore 6
      // 095: aload 0
      // 096: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 099: invokevirtual org/pcap4j/core/PcapHandle.close ()V
      // 09c: goto 0a1
      // 09f: astore 6
      // 0a1: aload 0
      // 0a2: getfield VP.s Ljava/util/concurrent/CountDownLatch;
      // 0a5: invokevirtual java/util/concurrent/CountDownLatch.countDown ()V
      // 0a8: goto 106
      // 0ab: astore 5
      // 0ad: aload 1
      // 0ae: ifnull 0cc
      // 0b1: aload 2
      // 0b2: ifnull 0c5
      // 0b5: goto 0bc
      // 0b8: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: aload 2
      // 0bd: invokevirtual org/pcap4j/core/PcapDumper.close ()V
      // 0c0: goto 0c5
      // 0c3: astore 6
      // 0c5: aload 0
      // 0c6: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 0c9: invokevirtual org/pcap4j/core/PcapHandle.close ()V
      // 0cc: goto 0d1
      // 0cf: astore 6
      // 0d1: aload 0
      // 0d2: getfield VP.s Ljava/util/concurrent/CountDownLatch;
      // 0d5: invokevirtual java/util/concurrent/CountDownLatch.countDown ()V
      // 0d8: aload 5
      // 0da: athrow
      // 0db: aload 2
      // 0dc: aload 1
      // 0dd: ifnull 0eb
      // 0e0: ifnull 0f3
      // 0e3: goto 0ea
      // 0e6: invokestatic VP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 2
      // 0eb: invokevirtual org/pcap4j/core/PcapDumper.close ()V
      // 0ee: goto 0f3
      // 0f1: astore 6
      // 0f3: aload 0
      // 0f4: getfield VP.t Lorg/pcap4j/core/PcapHandle;
      // 0f7: invokevirtual org/pcap4j/core/PcapHandle.close ()V
      // 0fa: goto 0ff
      // 0fd: astore 6
      // 0ff: aload 0
      // 100: getfield VP.s Ljava/util/concurrent/CountDownLatch;
      // 103: invokevirtual java/util/concurrent/CountDownLatch.countDown ()V
      // 106: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





