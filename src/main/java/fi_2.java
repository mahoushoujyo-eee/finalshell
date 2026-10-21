import java.util.List;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

public final class Fi_2 implements TcpPacket.TcpOption {
   private static final long serialVersionUID;
   private final TcpOptionKind z;
   private final byte r;
   private final List j;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public static Fi_2 Y(byte[] var0, int var1, int var2) throws IllegalRawDataException {
      ByteArrays.validateBounds(var0, var1, var2);
      return new Fi_2(var0, var1, var2);
   }

   private Fi_2(byte[] param1, int param2, int param3) throws IllegalRawDataException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: getstatic org/pcap4j/packet/namednumber/TcpOptionKind.SACK Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 008: putfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 00b: invokestatic Li_2.I ()[Ljava/lang/String;
      // 00e: aload 0
      // 00f: new java/util/ArrayList
      // 012: dup
      // 013: invokespecial java/util/ArrayList.<init> ()V
      // 016: putfield Fi_2.j Ljava/util/List;
      // 019: astore 4
      // 01b: iload 3
      // 01c: bipush 2
      // 01d: aload 4
      // 01f: ifnonnull 09f
      // 022: if_icmpge 083
      // 025: goto 02c
      // 028: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: new java/lang/StringBuilder
      // 02f: dup
      // 030: sipush 22231
      // 033: ldc2_w 4324881667024271662
      // 036: invokestatic Fi_2.a (IJ)I
      // 039: invokespecial java/lang/StringBuilder.<init> (I)V
      // 03c: astore 5
      // 03e: aload 5
      // 040: sipush 29594
      // 043: sipush 23843
      // 046: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04c: aload 1
      // 04d: ldc " "
      // 04f: invokestatic org/pcap4j/util/ByteArrays.toHexString ([BLjava/lang/String;)Ljava/lang/String;
      // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 055: sipush 29587
      // 058: sipush 13426
      // 05b: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: iload 2
      // 062: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 065: sipush 29584
      // 068: sipush -20720
      // 06b: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: iload 3
      // 072: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 075: pop
      // 076: new org/pcap4j/packet/IllegalRawDataException
      // 079: dup
      // 07a: aload 5
      // 07c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07f: invokespecial org/pcap4j/packet/IllegalRawDataException.<init> (Ljava/lang/String;)V
      // 082: athrow
      // 083: aload 1
      // 084: iload 2
      // 085: baload
      // 086: aload 4
      // 088: ifnonnull 11c
      // 08b: aload 0
      // 08c: getfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 08f: invokevirtual org/pcap4j/packet/namednumber/TcpOptionKind.value ()Ljava/lang/Number;
      // 092: checkcast java/lang/Byte
      // 095: invokevirtual java/lang/Byte.byteValue ()B
      // 098: goto 09f
      // 09b: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: if_icmpeq 10f
      // 0a2: new java/lang/StringBuilder
      // 0a5: dup
      // 0a6: sipush 13026
      // 0a9: ldc2_w 6583125517290954008
      // 0ac: invokestatic Fi_2.a (IJ)I
      // 0af: invokespecial java/lang/StringBuilder.<init> (I)V
      // 0b2: astore 5
      // 0b4: aload 5
      // 0b6: sipush 29597
      // 0b9: sipush 29543
      // 0bc: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 0
      // 0c3: getfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 0c6: invokevirtual org/pcap4j/packet/namednumber/TcpOptionKind.valueAsString ()Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: sipush 29596
      // 0cf: sipush 31618
      // 0d2: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: aload 1
      // 0d9: ldc " "
      // 0db: invokestatic org/pcap4j/util/ByteArrays.toHexString ([BLjava/lang/String;)Ljava/lang/String;
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: sipush 29595
      // 0e4: sipush 4218
      // 0e7: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: iload 2
      // 0ee: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0f1: sipush 29593
      // 0f4: sipush 12898
      // 0f7: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: iload 3
      // 0fe: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 101: pop
      // 102: new org/pcap4j/packet/IllegalRawDataException
      // 105: dup
      // 106: aload 5
      // 108: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10b: invokespecial org/pcap4j/packet/IllegalRawDataException.<init> (Ljava/lang/String;)V
      // 10e: athrow
      // 10f: aload 0
      // 110: aload 1
      // 111: bipush 1
      // 112: iload 2
      // 113: iadd
      // 114: baload
      // 115: putfield Fi_2.r B
      // 118: aload 0
      // 119: invokevirtual Fi_2.R ()I
      // 11c: istore 5
      // 11e: iload 5
      // 120: bipush 2
      // 121: aload 4
      // 123: ifnonnull 161
      // 126: if_icmpge 154
      // 129: goto 130
      // 12c: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: new org/pcap4j/packet/IllegalRawDataException
      // 133: dup
      // 134: new java/lang/StringBuilder
      // 137: dup
      // 138: sipush 29590
      // 13b: sipush -22305
      // 13e: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 141: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 144: iload 5
      // 146: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 149: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14c: invokespecial org/pcap4j/packet/IllegalRawDataException.<init> (Ljava/lang/String;)V
      // 14f: athrow
      // 150: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: iload 5
      // 156: bipush 2
      // 157: isub
      // 158: sipush 642
      // 15b: ldc2_w 3892549993512463742
      // 15e: invokestatic Fi_2.a (IJ)I
      // 161: irem
      // 162: aload 4
      // 164: ifnonnull 1a5
      // 167: ifeq 1a4
      // 16a: goto 171
      // 16d: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: new java/lang/StringBuilder
      // 174: dup
      // 175: sipush 21942
      // 178: ldc2_w 2704719501806549576
      // 17b: invokestatic Fi_2.a (IJ)I
      // 17e: invokespecial java/lang/StringBuilder.<init> (I)V
      // 181: astore 6
      // 183: aload 6
      // 185: sipush 29591
      // 188: sipush -681
      // 18b: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: iload 5
      // 193: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 196: pop
      // 197: new org/pcap4j/packet/IllegalRawDataException
      // 19a: dup
      // 19b: aload 6
      // 19d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a0: invokespecial org/pcap4j/packet/IllegalRawDataException.<init> (Ljava/lang/String;)V
      // 1a3: athrow
      // 1a4: iload 3
      // 1a5: aload 4
      // 1a7: ifnonnull 21f
      // 1aa: iload 5
      // 1ac: if_icmpge 21e
      // 1af: goto 1b6
      // 1b2: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: new java/lang/StringBuilder
      // 1b9: dup
      // 1ba: sipush 21942
      // 1bd: ldc2_w 2704719501806549576
      // 1c0: invokestatic Fi_2.a (IJ)I
      // 1c3: invokespecial java/lang/StringBuilder.<init> (I)V
      // 1c6: astore 6
      // 1c8: aload 6
      // 1ca: sipush 29598
      // 1cd: sipush 6140
      // 1d0: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: iload 5
      // 1d8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1db: sipush 29578
      // 1de: sipush 7964
      // 1e1: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: aload 1
      // 1e8: ldc " "
      // 1ea: invokestatic org/pcap4j/util/ByteArrays.toHexString ([BLjava/lang/String;)Ljava/lang/String;
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: sipush 29595
      // 1f3: sipush 4218
      // 1f6: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: iload 2
      // 1fd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 200: sipush 29593
      // 203: sipush 12898
      // 206: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 209: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20c: iload 3
      // 20d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 210: pop
      // 211: new org/pcap4j/packet/IllegalRawDataException
      // 214: dup
      // 215: aload 6
      // 217: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21a: invokespecial org/pcap4j/packet/IllegalRawDataException.<init> (Ljava/lang/String;)V
      // 21d: athrow
      // 21e: bipush 2
      // 21f: istore 6
      // 221: aload 4
      // 223: ifnull 253
      // 226: aload 0
      // 227: getfield Fi_2.j Ljava/util/List;
      // 22a: new Jf_2
      // 22d: dup
      // 22e: aload 1
      // 22f: iload 6
      // 231: iload 2
      // 232: iadd
      // 233: invokestatic org/pcap4j/util/ByteArrays.getInt ([BI)I
      // 236: aload 1
      // 237: iload 6
      // 239: bipush 4
      // 23a: iadd
      // 23b: iload 2
      // 23c: iadd
      // 23d: invokestatic org/pcap4j/util/ByteArrays.getInt ([BI)I
      // 240: invokespecial Jf_2.<init> (II)V
      // 243: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 248: pop
      // 249: goto 250
      // 24c: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24f: athrow
      // 250: iinc 6 8
      // 253: iload 6
      // 255: iload 5
      // 257: if_icmplt 226
      // 25a: aload 4
      // 25c: ifnonnull 250
      // 25f: return
   }

   private Fi_2(bB_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Li_2.I ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: aload 0
      // 08: getstatic org/pcap4j/packet/namednumber/TcpOptionKind.SACK Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 0b: putfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 0e: aload 0
      // 0f: new java/util/ArrayList
      // 12: dup
      // 13: invokespecial java/util/ArrayList.<init> ()V
      // 16: putfield Fi_2.j Ljava/util/List;
      // 19: astore 2
      // 1a: aload 1
      // 1b: aload 2
      // 1c: ifnonnull 2a
      // 1f: ifnull 3b
      // 22: goto 29
      // 25: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 1
      // 2a: invokestatic bB_3.B (LbB_3;)Ljava/util/List;
      // 2d: aload 2
      // 2e: ifnonnull 83
      // 31: ifnonnull 74
      // 34: goto 3b
      // 37: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: new java/lang/StringBuilder
      // 3e: dup
      // 3f: invokespecial java/lang/StringBuilder.<init> ()V
      // 42: astore 3
      // 43: aload 3
      // 44: sipush 29592
      // 47: sipush -8062
      // 4a: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 4d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50: aload 1
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: sipush 29599
      // 57: sipush 16939
      // 5a: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: aload 1
      // 61: invokestatic bB_3.B (LbB_3;)Ljava/util/List;
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 67: pop
      // 68: new java/lang/NullPointerException
      // 6b: dup
      // 6c: aload 3
      // 6d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 70: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 73: athrow
      // 74: aload 0
      // 75: aload 2
      // 76: ifnonnull b0
      // 79: getfield Fi_2.j Ljava/util/List;
      // 7c: goto 83
      // 7f: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: aload 1
      // 84: invokestatic bB_3.B (LbB_3;)Ljava/util/List;
      // 87: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 8c: pop
      // 8d: aload 1
      // 8e: invokestatic bB_3.t (LbB_3;)Z
      // 91: ifeq a8
      // 94: aload 0
      // 95: aload 0
      // 96: invokevirtual Fi_2.length ()I
      // 99: i2b
      // 9a: putfield Fi_2.r B
      // 9d: aload 2
      // 9e: ifnull b7
      // a1: goto a8
      // a4: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: aload 0
      // a9: goto b0
      // ac: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: aload 1
      // b1: invokestatic bB_3.A (LbB_3;)B
      // b4: putfield Fi_2.r B
      // b7: return
   }

   @Override
   public TcpOptionKind getKind() {
      return this.z;
   }

   public byte o() {
      return this.r;
   }

   public int R() {
      return a(20711, 2672142846314626844L) & this.r;
   }

   @Override
   public int length() {
      return this.j.size() * 4 * 2 + 2;
   }

   @Override
   public byte[] getRawData() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual Fi_2.length ()I
      // 04: newarray 8
      // 06: astore 2
      // 07: invokestatic Li_2.I ()[Ljava/lang/String;
      // 0a: aload 2
      // 0b: bipush 0
      // 0c: aload 0
      // 0d: getfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 10: invokevirtual org/pcap4j/packet/namednumber/TcpOptionKind.value ()Ljava/lang/Number;
      // 13: checkcast java/lang/Byte
      // 16: invokevirtual java/lang/Byte.byteValue ()B
      // 19: bastore
      // 1a: astore 1
      // 1b: aload 2
      // 1c: bipush 1
      // 1d: aload 0
      // 1e: getfield Fi_2.r B
      // 21: bastore
      // 22: bipush 2
      // 23: istore 3
      // 24: aload 0
      // 25: getfield Fi_2.j Ljava/util/List;
      // 28: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d: astore 5
      // 2f: aload 1
      // 30: ifnull 69
      // 33: aload 5
      // 35: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3a: goto 41
      // 3d: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: checkcast Jf_2
      // 44: astore 4
      // 46: aload 4
      // 48: invokestatic Jf_2.s (LJf_2;)I
      // 4b: invokestatic org/pcap4j/util/ByteArrays.toByteArray (I)[B
      // 4e: bipush 0
      // 4f: aload 2
      // 50: iload 3
      // 51: bipush 4
      // 52: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 55: aload 4
      // 57: invokestatic Jf_2.v (LJf_2;)I
      // 5a: invokestatic org/pcap4j/util/ByteArrays.toByteArray (I)[B
      // 5d: bipush 0
      // 5e: aload 2
      // 5f: iload 3
      // 60: bipush 4
      // 61: iadd
      // 62: bipush 4
      // 63: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 66: iinc 3 8
      // 69: aload 5
      // 6b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 70: ifne 33
      // 73: aload 2
      // 74: aload 1
      // 75: ifnonnull 41
      // 78: areturn
   }

   public bB_3 Z() {
      return new bB_3(this, null);
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Li_2.I ()[Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: astore 2
      // 0b: aload 2
      // 0c: sipush 29589
      // 0f: sipush 20154
      // 12: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 15: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18: aload 0
      // 19: getfield Fi_2.z Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 1c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f: pop
      // 20: astore 1
      // 21: aload 2
      // 22: sipush 29585
      // 25: sipush 28025
      // 28: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 2b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e: aload 0
      // 2f: invokevirtual Fi_2.R ()I
      // 32: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 35: sipush 29586
      // 38: sipush 18373
      // 3b: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: pop
      // 42: aload 0
      // 43: getfield Fi_2.j Ljava/util/List;
      // 46: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4b: astore 4
      // 4d: aload 1
      // 4e: ifnull 90
      // 51: aload 4
      // 53: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 58: goto 5f
      // 5b: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: checkcast Jf_2
      // 62: astore 3
      // 63: aload 2
      // 64: sipush 29579
      // 67: sipush -9420
      // 6a: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70: aload 3
      // 71: invokevirtual Jf_2.C ()J
      // 74: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 77: sipush 29588
      // 7a: sipush 27734
      // 7d: invokestatic Fi_2.a (II)Ljava/lang/String;
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: aload 3
      // 84: invokevirtual Jf_2.y ()J
      // 87: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 8a: ldc "]"
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: pop
      // 90: aload 4
      // 92: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 97: ifne 51
      // 9a: aload 2
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: aload 1
      // 9f: ifnonnull 5f
      // a2: areturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Li_2.I ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: if_acmpne 0f
      // 09: bipush 1
      // 0a: ireturn
      // 0b: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e: athrow
      // 0f: aload 0
      // 10: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 13: aload 2
      // 14: ifnonnull 2c
      // 17: aload 1
      // 18: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 1b: ifne 2b
      // 1e: goto 25
      // 21: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 1
      // 2c: checkcast Fi_2
      // 2f: astore 3
      // 30: aload 0
      // 31: getfield Fi_2.r B
      // 34: aload 2
      // 35: ifnonnull 6f
      // 38: aload 3
      // 39: getfield Fi_2.r B
      // 3c: if_icmpne 6e
      // 3f: goto 46
      // 42: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield Fi_2.j Ljava/util/List;
      // 4a: aload 3
      // 4b: getfield Fi_2.j Ljava/util/List;
      // 4e: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 53: aload 2
      // 54: ifnonnull 6f
      // 57: goto 5e
      // 5a: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: ifeq 6e
      // 61: goto 68
      // 64: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: bipush 1
      // 69: ireturn
      // 6a: invokestatic Fi_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
   }

   public List I() {
      return this.j;
   }

   @Override
   public int hashCode() {
      int var1 = a(21466, 7932917142897835047L);
      var1 = a(29172, 4223815167686483467L) * var1 + this.r;
      return a(30806, 2460151967734568878L) * var1 + this.j.hashCode();
   }

   static byte j(Fi_2 var0) {
      return var0.r;
   }

   Fi_2(bB_3 var1, Fi_2 var2) {
      this(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var17 = new String[18];
      int var15 = 0;
      String var14 = "\u008a\u0004}¼AzôÖ¼\brx<¹2g\u007fBY:´âúd\u001bA\u008a±\u0001¢\u0005ÊéLææ\b&ê\u009bÂ}é;£æ\u0099Xd\u0092\nÅ;é\\\u008cúÉÂ\u0015\u0015\tå\u001clMø\u0085\u0012·\u0081\n\b¸S/°ãVkÕ¿$\u007f]3ÛËkÂC£¨i)Î'\u008fÊ*R\u0007\u0014e¬ôCh\u0093r\u0006`\u001cÖ5§£¸H\u0010²×\u0090Äð\u0010\rl\u0099UÀ\u0081\u0096Û\u001a\u0099\nqdü¾Ã\u0087W(õÿ\u0012õ±\u0092\n¥¤K@5\u001a\u008e¥Ö\u001e¶]U;\u0007iåç\u009f\u009aÒP\n½?æÜmêõÀ\u0092U\nÀ?Jß\u0093ý2¨YÇ\u000bz_uú®\\ì¨¡B\b4¡\u008a\u0018mé@~Ä\u0094ôM\u0089£`Á\\\u0001%\u0096ÖFcØÓÏîÔ\u001bÝ\u0013\u0011\u00836Ö¸g\u0083ÉîpÈÕvn4&×\u0019<\u008d¹üL=ã\u008b@\u009bå0p]bt[\u0084:%\u0017\u009dL\u0005û4Æ\u0096g\u0006xíÉúIõÈª¿jIÿtÌë÷w¦Èª1Q\"\u00128\u0017¸\u0080\u0083\u001e¥\u0095ù!\u00166\u009c;é\u0002pH\u0010.p²8\u0090$¦ö\u0005\u0081\u0091Æi@\u0007{\u008b¡DA¹w";
      int var16 = "\u008a\u0004}¼AzôÖ¼\brx<¹2g\u007fBY:´âúd\u001bA\u008a±\u0001¢\u0005ÊéLææ\b&ê\u009bÂ}é;£æ\u0099Xd\u0092\nÅ;é\\\u008cúÉÂ\u0015\u0015\tå\u001clMø\u0085\u0012·\u0081\n\b¸S/°ãVkÕ¿$\u007f]3ÛËkÂC£¨i)Î'\u008fÊ*R\u0007\u0014e¬ôCh\u0093r\u0006`\u001cÖ5§£¸H\u0010²×\u0090Äð\u0010\rl\u0099UÀ\u0081\u0096Û\u001a\u0099\nqdü¾Ã\u0087W(õÿ\u0012õ±\u0092\n¥¤K@5\u001a\u008e¥Ö\u001e¶]U;\u0007iåç\u009f\u009aÒP\n½?æÜmêõÀ\u0092U\nÀ?Jß\u0093ý2¨YÇ\u000bz_uú®\\ì¨¡B\b4¡\u008a\u0018mé@~Ä\u0094ôM\u0089£`Á\\\u0001%\u0096ÖFcØÓÏîÔ\u001bÝ\u0013\u0011\u00836Ö¸g\u0083ÉîpÈÕvn4&×\u0019<\u008d¹üL=ã\u008b@\u009bå0p]bt[\u0084:%\u0017\u009dL\u0005û4Æ\u0096g\u0006xíÉúIõÈª¿jIÿtÌë÷w¦Èª1Q\"\u00128\u0017¸\u0080\u0083\u001e¥\u0095ù!\u00166\u009c;é\u0002pH\u0010.p²8\u0090$¦ö\u0005\u0081\u0091Æi@\u0007{\u008b¡DA¹w"
         .length();
      char var13 = '2';
      int var21 = -1;

      label70:
      while (true) {
         byte var10000 = 61;
         String var10001 = var14.substring(++var21, var21 + var13);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var18 = 0;
               byte var48 = var10000;
               var38 = var45;
               int var28 = var10004;
               byte var55;
               char[] var61;
               int var10006;
               if (var10004 <= 1) {
                  var61 = var45;
                  var55 = var10000;
                  var10006 = var18;
               } else {
                  var48 = var10000;
                  var28 = var10004;
                  if (var10004 <= var18) {
                     break label65;
                  }

                  var61 = var45;
                  var55 = var10000;
                  var10006 = var18;
               }

               while (true) {
                  char var70 = var61[var10006];
                  byte var71;
                  switch (var18 % 7) {
                     case 0:
                        var71 = 1;
                        break;
                     case 1:
                        var71 = 77;
                        break;
                     case 2:
                        var71 = 45;
                        break;
                     case 3:
                        var71 = 74;
                        break;
                     case 4:
                        var71 = 106;
                        break;
                     case 5:
                        var71 = 123;
                        break;
                     default:
                        var71 = 64;
                  }

                  var61[var10006] = (char)(var70 ^ var55 ^ var71);
                  var18++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var61 = var38;
                     var55 = var48;
                  } else {
                     if (var28 <= var18) {
                        break;
                     }

                     var61 = var38;
                     var55 = var48;
                     var10006 = var18;
                  }
               }
            }

            String var50 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var17[var15++] = var50;
                  if ((var21 += var13) >= var16) {
                     a = var17;
                     b = new String[18];
                     long var4 = 933744839589915477L;
                     long[] var10 = new long[8];
                     int var7 = 0;
                     String var8 = "âÄÿ\nss¶)Êt\u00ad\u000fÕ3T¶Á62¨ Ð|ä\u0001N¥\u0089@\bÒI²°À¢\u0080ÜQy^Äµ\u0096(@uA";
                     int var9 = "âÄÿ\nss¶)Êt\u00ad\u000fÕ3T¶Á62¨ Ð|ä\u0001N¥\u0089@\bÒI²°À¢\u0080ÜQy^Äµ\u0096(@uA".length();
                     byte var6 = 0;

                     label44:
                     while (true) {
                        byte var30 = var6;
                        var6 += 8;
                        byte[] var11 = var8.substring(var30, var6).getBytes("ISO-8859-1");
                        long[] var23 = var10;
                        int var31 = var7++;
                        long var42 = ((long)var11[0] & 255L) << 56
                           | ((long)var11[1] & 255L) << 48
                           | ((long)var11[2] & 255L) << 40
                           | ((long)var11[3] & 255L) << 32
                           | ((long)var11[4] & 255L) << 24
                           | ((long)var11[5] & 255L) << 16
                           | ((long)var11[6] & 255L) << 8
                           | (long)var11[7] & 255L;
                        byte var51 = -1;

                        while (true) {
                           long var60 = var42 ^ var4;
                           switch (var51) {
                              case 0:
                                 var23[var31] = var60;
                                 if (var6 >= var9) {
                                    c = var10;
                                    d = new Integer[8];
                                    long var2 = 5649775051527036211L;
                                    long var44 = -7170584330509061148L ^ var2;
                                    byte var33 = -1;
                                    long var0 = var44;
                                    serialVersionUID = var0;
                                    return;
                                 }
                                 break;
                              default:
                                 var23[var31] = var60;
                                 if (var6 < var9) {
                                    continue label44;
                                 }

                                 var8 = "üÆªÓs^\u0006#\nÒ^Üm\u0094Wc";
                                 var9 = "üÆªÓs^\u0006#\nÒ^Üm\u0094Wc".length();
                                 var6 = 0;
                           }

                           byte var32 = var6;
                           var6 += 8;
                           var11 = var8.substring(var32, var6).getBytes("ISO-8859-1");
                           var23 = var10;
                           var31 = var7++;
                           var42 = ((long)var11[0] & 255L) << 56
                              | ((long)var11[1] & 255L) << 48
                              | ((long)var11[2] & 255L) << 40
                              | ((long)var11[3] & 255L) << 32
                              | ((long)var11[4] & 255L) << 24
                              | ((long)var11[5] & 255L) << 16
                              | ((long)var11[6] & 255L) << 8
                              | (long)var11[7] & 255L;
                           var51 = 0;
                        }
                     }
                  }

                  var13 = var14.charAt(var21);
                  break;
               default:
                  var17[var15++] = var50;
                  if ((var21 += var13) < var16) {
                     var13 = var14.charAt(var21);
                     continue label70;
                  }

                  var14 = "í®ÐÈ%\u0099ê^\u008f½Ä\u0006\\ÂUu!ê";
                  var16 = "í®ÐÈ%\u0099ê^\u008f½Ä\u0006\\ÂUu!ê".length();
                  var13 = 11;
                  var21 = -1;
            }

            var10000 = 60;
            var10001 = var14.substring(++var21, var21 + var13);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29594) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 160;
               break;
            case 1:
               var10000 = 2;
               break;
            case 2:
               var10000 = 220;
               break;
            case 3:
               var10000 = 102;
               break;
            case 4:
               var10000 = 190;
               break;
            case 5:
               var10000 = 172;
               break;
            case 6:
               var10000 = 59;
               break;
            case 7:
               var10000 = 51;
               break;
            case 8:
               var10000 = 87;
               break;
            case 9:
               var10000 = 136;
               break;
            case 10:
               var10000 = 6;
               break;
            case 11:
               var10000 = 222;
               break;
            case 12:
               var10000 = 116;
               break;
            case 13:
               var10000 = 97;
               break;
            case 14:
               var10000 = 55;
               break;
            case 15:
               var10000 = 100;
               break;
            case 16:
               var10000 = 244;
               break;
            case 17:
               var10000 = 23;
               break;
            case 18:
               var10000 = 110;
               break;
            case 19:
               var10000 = 33;
               break;
            case 20:
               var10000 = 28;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 204;
               break;
            case 23:
               var10000 = 245;
               break;
            case 24:
               var10000 = 1;
               break;
            case 25:
               var10000 = 129;
               break;
            case 26:
               var10000 = 235;
               break;
            case 27:
               var10000 = 216;
               break;
            case 28:
               var10000 = 63;
               break;
            case 29:
               var10000 = 105;
               break;
            case 30:
               var10000 = 249;
               break;
            case 31:
               var10000 = 10;
               break;
            case 32:
               var10000 = 233;
               break;
            case 33:
               var10000 = 90;
               break;
            case 34:
               var10000 = 101;
               break;
            case 35:
               var10000 = 82;
               break;
            case 36:
               var10000 = 238;
               break;
            case 37:
               var10000 = 98;
               break;
            case 38:
               var10000 = 121;
               break;
            case 39:
               var10000 = 237;
               break;
            case 40:
               var10000 = 188;
               break;
            case 41:
               var10000 = 227;
               break;
            case 42:
               var10000 = 39;
               break;
            case 43:
               var10000 = 78;
               break;
            case 44:
               var10000 = 16;
               break;
            case 45:
               var10000 = 140;
               break;
            case 46:
               var10000 = 164;
               break;
            case 47:
               var10000 = 81;
               break;
            case 48:
               var10000 = 177;
               break;
            case 49:
               var10000 = 157;
               break;
            case 50:
               var10000 = 248;
               break;
            case 51:
               var10000 = 201;
               break;
            case 52:
               var10000 = 74;
               break;
            case 53:
               var10000 = 200;
               break;
            case 54:
               var10000 = 73;
               break;
            case 55:
               var10000 = 85;
               break;
            case 56:
               var10000 = 131;
               break;
            case 57:
               var10000 = 118;
               break;
            case 58:
               var10000 = 72;
               break;
            case 59:
               var10000 = 146;
               break;
            case 60:
               var10000 = 46;
               break;
            case 61:
               var10000 = 50;
               break;
            case 62:
               var10000 = 25;
               break;
            case 63:
               var10000 = 156;
               break;
            case 64:
               var10000 = 255;
               break;
            case 65:
               var10000 = 114;
               break;
            case 66:
               var10000 = 79;
               break;
            case 67:
               var10000 = 203;
               break;
            case 68:
               var10000 = 166;
               break;
            case 69:
               var10000 = 58;
               break;
            case 70:
               var10000 = 94;
               break;
            case 71:
               var10000 = 158;
               break;
            case 72:
               var10000 = 26;
               break;
            case 73:
               var10000 = 40;
               break;
            case 74:
               var10000 = 228;
               break;
            case 75:
               var10000 = 239;
               break;
            case 76:
               var10000 = 137;
               break;
            case 77:
               var10000 = 21;
               break;
            case 78:
               var10000 = 115;
               break;
            case 79:
               var10000 = 167;
               break;
            case 80:
               var10000 = 194;
               break;
            case 81:
               var10000 = 171;
               break;
            case 82:
               var10000 = 109;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 207;
               break;
            case 85:
               var10000 = 80;
               break;
            case 86:
               var10000 = 20;
               break;
            case 87:
               var10000 = 179;
               break;
            case 88:
               var10000 = 56;
               break;
            case 89:
               var10000 = 135;
               break;
            case 90:
               var10000 = 111;
               break;
            case 91:
               var10000 = 99;
               break;
            case 92:
               var10000 = 139;
               break;
            case 93:
               var10000 = 215;
               break;
            case 94:
               var10000 = 246;
               break;
            case 95:
               var10000 = 27;
               break;
            case 96:
               var10000 = 193;
               break;
            case 97:
               var10000 = 243;
               break;
            case 98:
               var10000 = 69;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 214;
               break;
            case 101:
               var10000 = 49;
               break;
            case 102:
               var10000 = 223;
               break;
            case 103:
               var10000 = 75;
               break;
            case 104:
               var10000 = 62;
               break;
            case 105:
               var10000 = 104;
               break;
            case 106:
               var10000 = 4;
               break;
            case 107:
               var10000 = 250;
               break;
            case 108:
               var10000 = 209;
               break;
            case 109:
               var10000 = 253;
               break;
            case 110:
               var10000 = 113;
               break;
            case 111:
               var10000 = 155;
               break;
            case 112:
               var10000 = 217;
               break;
            case 113:
               var10000 = 83;
               break;
            case 114:
               var10000 = 93;
               break;
            case 115:
               var10000 = 234;
               break;
            case 116:
               var10000 = 189;
               break;
            case 117:
               var10000 = 132;
               break;
            case 118:
               var10000 = 123;
               break;
            case 119:
               var10000 = 169;
               break;
            case 120:
               var10000 = 60;
               break;
            case 121:
               var10000 = 24;
               break;
            case 122:
               var10000 = 149;
               break;
            case 123:
               var10000 = 219;
               break;
            case 124:
               var10000 = 41;
               break;
            case 125:
               var10000 = 145;
               break;
            case 126:
               var10000 = 44;
               break;
            case 127:
               var10000 = 18;
               break;
            case 128:
               var10000 = 229;
               break;
            case 129:
               var10000 = 197;
               break;
            case 130:
               var10000 = 148;
               break;
            case 131:
               var10000 = 191;
               break;
            case 132:
               var10000 = 112;
               break;
            case 133:
               var10000 = 241;
               break;
            case 134:
               var10000 = 31;
               break;
            case 135:
               var10000 = 210;
               break;
            case 136:
               var10000 = 144;
               break;
            case 137:
               var10000 = 187;
               break;
            case 138:
               var10000 = 91;
               break;
            case 139:
               var10000 = 52;
               break;
            case 140:
               var10000 = 192;
               break;
            case 141:
               var10000 = 119;
               break;
            case 142:
               var10000 = 125;
               break;
            case 143:
               var10000 = 86;
               break;
            case 144:
               var10000 = 213;
               break;
            case 145:
               var10000 = 142;
               break;
            case 146:
               var10000 = 103;
               break;
            case 147:
               var10000 = 5;
               break;
            case 148:
               var10000 = 11;
               break;
            case 149:
               var10000 = 8;
               break;
            case 150:
               var10000 = 92;
               break;
            case 151:
               var10000 = 43;
               break;
            case 152:
               var10000 = 159;
               break;
            case 153:
               var10000 = 183;
               break;
            case 154:
               var10000 = 130;
               break;
            case 155:
               var10000 = 181;
               break;
            case 156:
               var10000 = 230;
               break;
            case 157:
               var10000 = 22;
               break;
            case 158:
               var10000 = 35;
               break;
            case 159:
               var10000 = 84;
               break;
            case 160:
               var10000 = 208;
               break;
            case 161:
               var10000 = 141;
               break;
            case 162:
               var10000 = 178;
               break;
            case 163:
               var10000 = 252;
               break;
            case 164:
               var10000 = 96;
               break;
            case 165:
               var10000 = 143;
               break;
            case 166:
               var10000 = 225;
               break;
            case 167:
               var10000 = 120;
               break;
            case 168:
               var10000 = 186;
               break;
            case 169:
               var10000 = 254;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 212;
               break;
            case 172:
               var10000 = 37;
               break;
            case 173:
               var10000 = 150;
               break;
            case 174:
               var10000 = 221;
               break;
            case 175:
               var10000 = 152;
               break;
            case 176:
               var10000 = 247;
               break;
            case 177:
               var10000 = 89;
               break;
            case 178:
               var10000 = 0;
               break;
            case 179:
               var10000 = 19;
               break;
            case 180:
               var10000 = 34;
               break;
            case 181:
               var10000 = 205;
               break;
            case 182:
               var10000 = 65;
               break;
            case 183:
               var10000 = 224;
               break;
            case 184:
               var10000 = 232;
               break;
            case 185:
               var10000 = 15;
               break;
            case 186:
               var10000 = 211;
               break;
            case 187:
               var10000 = 138;
               break;
            case 188:
               var10000 = 12;
               break;
            case 189:
               var10000 = 185;
               break;
            case 190:
               var10000 = 66;
               break;
            case 191:
               var10000 = 57;
               break;
            case 192:
               var10000 = 122;
               break;
            case 193:
               var10000 = 168;
               break;
            case 194:
               var10000 = 251;
               break;
            case 195:
               var10000 = 106;
               break;
            case 196:
               var10000 = 61;
               break;
            case 197:
               var10000 = 174;
               break;
            case 198:
               var10000 = 67;
               break;
            case 199:
               var10000 = 127;
               break;
            case 200:
               var10000 = 226;
               break;
            case 201:
               var10000 = 202;
               break;
            case 202:
               var10000 = 163;
               break;
            case 203:
               var10000 = 147;
               break;
            case 204:
               var10000 = 95;
               break;
            case 205:
               var10000 = 13;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 161;
               break;
            case 208:
               var10000 = 32;
               break;
            case 209:
               var10000 = 48;
               break;
            case 210:
               var10000 = 180;
               break;
            case 211:
               var10000 = 195;
               break;
            case 212:
               var10000 = 45;
               break;
            case 213:
               var10000 = 162;
               break;
            case 214:
               var10000 = 170;
               break;
            case 215:
               var10000 = 134;
               break;
            case 216:
               var10000 = 7;
               break;
            case 217:
               var10000 = 199;
               break;
            case 218:
               var10000 = 153;
               break;
            case 219:
               var10000 = 14;
               break;
            case 220:
               var10000 = 236;
               break;
            case 221:
               var10000 = 176;
               break;
            case 222:
               var10000 = 196;
               break;
            case 223:
               var10000 = 29;
               break;
            case 224:
               var10000 = 231;
               break;
            case 225:
               var10000 = 184;
               break;
            case 226:
               var10000 = 70;
               break;
            case 227:
               var10000 = 68;
               break;
            case 228:
               var10000 = 154;
               break;
            case 229:
               var10000 = 240;
               break;
            case 230:
               var10000 = 88;
               break;
            case 231:
               var10000 = 71;
               break;
            case 232:
               var10000 = 108;
               break;
            case 233:
               var10000 = 182;
               break;
            case 234:
               var10000 = 9;
               break;
            case 235:
               var10000 = 77;
               break;
            case 236:
               var10000 = 3;
               break;
            case 237:
               var10000 = 30;
               break;
            case 238:
               var10000 = 124;
               break;
            case 239:
               var10000 = 173;
               break;
            case 240:
               var10000 = 38;
               break;
            case 241:
               var10000 = 42;
               break;
            case 242:
               var10000 = 151;
               break;
            case 243:
               var10000 = 242;
               break;
            case 244:
               var10000 = 198;
               break;
            case 245:
               var10000 = 206;
               break;
            case 246:
               var10000 = 17;
               break;
            case 247:
               var10000 = 54;
               break;
            case 248:
               var10000 = 36;
               break;
            case 249:
               var10000 = 165;
               break;
            case 250:
               var10000 = 133;
               break;
            case 251:
               var10000 = 76;
               break;
            case 252:
               var10000 = 64;
               break;
            case 253:
               var10000 = 126;
               break;
            case 254:
               var10000 = 175;
               break;
            default:
               var10000 = 107;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28666;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





