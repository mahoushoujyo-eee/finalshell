package com.finalshell.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.util.Hashtable;
import java.util.List;

public class Wi2 {
   public Hashtable u = new Hashtable();
   public RandomAccessFile H;
   public MappedByteBuffer t;
   public static Wi2 J;
   public long C;
   public long B;
   public KH3_2 F = new KH3_2(this);
   public byte[] U = new byte[a(5053, 987590011349778320L)];
   public byte[] p = new byte[4];
   public byte[] f = new byte[3];
   public static int y;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] g;

   static {
      __vfClinit__();
   }

   public Wi2() {
      try {
         this.H = new RandomAccessFile(a(24647, -555), "r");
      } catch (FileNotFoundException var2) {
         System.out.println(Wi2.class.getResource(a(24645, 12505)).toString());
         System.out.println(a(24655, 1589));
         System.out.println(a(24642, 3584));
         this.H = null;
      }

      if (this.H != null) {
         try {
            try {
               this.C = this.c(0L);
               this.B = this.c(b(16642, 953220012220609600L));
               if (this.C != b(14578, 2316857388119592373L) && this.B != b(14578, 2316857388119592373L)) {
                  return;
               }
            } catch (FileNotFoundException var3) {
               throw a(var3);
            }

            this.H.close();
            this.H = null;
         } catch (IOException var4) {
            System.out.println(a(24651, -860));
            this.H = null;
         }
      }
   }

   public static Wi2 x() {
      return J;
   }

   public List u(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 3
      // 08: invokestatic com/finalshell/core/Wi2.d ()I
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/Wi2.B J
      // 0f: sipush 16642
      // 12: ldc2_w 953220012220609600
      // 15: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 18: ladd
      // 19: lstore 4
      // 1b: istore 2
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/Wi2.C J
      // 20: sipush 16642
      // 23: ldc2_w 953220012220609600
      // 26: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 29: ladd
      // 2a: lstore 6
      // 2c: iload 2
      // 2d: ifeq e9
      // 30: aload 0
      // 31: lload 6
      // 33: invokespecial com/finalshell/core/Wi2.z (J)J
      // 36: lstore 8
      // 38: lload 8
      // 3a: sipush 14578
      // 3d: ldc2_w 2316857388119592373
      // 40: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 43: iload 2
      // 44: ifne e6
      // 47: lcmp
      // 48: ifeq db
      // 4b: aload 0
      // 4c: lload 8
      // 4e: invokespecial com/finalshell/core/Wi2.h (J)Lcom/finalshell/core/KH3_2;
      // 51: astore 10
      // 53: aload 10
      // 55: getfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 58: aload 1
      // 59: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 5c: bipush -1
      // 5d: iload 2
      // 5e: ifne 7c
      // 61: if_icmpne 7f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 10
      // 6d: getfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 70: aload 1
      // 71: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 74: bipush -1
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: if_icmpeq db
      // 7f: new com/finalshell/core/IpRange
      // 82: dup
      // 83: invokespecial com/finalshell/core/IpRange.<init> ()V
      // 86: astore 11
      // 88: aload 11
      // 8a: aload 10
      // 8c: getfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 8f: putfield com/finalshell/core/IpRange.e Ljava/lang/String;
      // 92: aload 11
      // 94: aload 10
      // 96: getfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 99: putfield com/finalshell/core/IpRange.a Ljava/lang/String;
      // 9c: aload 0
      // 9d: lload 6
      // 9f: sipush 16642
      // a2: ldc2_w 953220012220609600
      // a5: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // a8: lsub
      // a9: aload 0
      // aa: getfield com/finalshell/core/Wi2.p [B
      // ad: invokespecial com/finalshell/core/Wi2.p (J[B)V
      // b0: aload 11
      // b2: aload 0
      // b3: getfield com/finalshell/core/Wi2.p [B
      // b6: invokestatic com/finalshell/core/KJ3.U ([B)Ljava/lang/String;
      // b9: putfield com/finalshell/core/IpRange.N Ljava/lang/String;
      // bc: aload 0
      // bd: lload 8
      // bf: aload 0
      // c0: getfield com/finalshell/core/Wi2.p [B
      // c3: invokespecial com/finalshell/core/Wi2.p (J[B)V
      // c6: aload 11
      // c8: aload 0
      // c9: getfield com/finalshell/core/Wi2.p [B
      // cc: invokestatic com/finalshell/core/KJ3.U ([B)Ljava/lang/String;
      // cf: putfield com/finalshell/core/IpRange.r Ljava/lang/String;
      // d2: aload 3
      // d3: aload 11
      // d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // da: pop
      // db: lload 6
      // dd: sipush 24789
      // e0: ldc2_w 510720196835104145
      // e3: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // e6: ladd
      // e7: lstore 6
      // e9: lload 6
      // eb: lload 4
      // ed: lcmp
      // ee: ifle 30
      // f1: aload 3
      // f2: areturn
   }

   public List p(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wi2.p ()I
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 3
      // 00b: istore 2
      // 00c: aload 0
      // 00d: iload 2
      // 00e: ifeq 047
      // 011: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 014: ifnonnull 046
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 022: invokevirtual java/io/RandomAccessFile.getChannel ()Ljava/nio/channels/FileChannel;
      // 025: astore 4
      // 027: aload 0
      // 028: aload 4
      // 02a: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY Ljava/nio/channels/FileChannel$MapMode;
      // 02d: lconst_0
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 032: invokevirtual java/io/RandomAccessFile.length ()J
      // 035: invokevirtual java/nio/channels/FileChannel.map (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      // 038: putfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 03b: aload 0
      // 03c: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 03f: getstatic java/nio/ByteOrder.LITTLE_ENDIAN Ljava/nio/ByteOrder;
      // 042: invokevirtual java/nio/MappedByteBuffer.order (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
      // 045: pop
      // 046: aload 0
      // 047: getfield com/finalshell/core/Wi2.B J
      // 04a: l2i
      // 04b: istore 4
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Wi2.C J
      // 051: l2i
      // 052: bipush 4
      // 053: iadd
      // 054: istore 5
      // 056: iload 2
      // 057: ifne 0f3
      // 05a: aload 0
      // 05b: iload 5
      // 05d: invokespecial com/finalshell/core/Wi2.Y$int (I)I
      // 060: istore 6
      // 062: iload 6
      // 064: bipush -1
      // 065: if_icmpeq 0f0
      // 068: aload 0
      // 069: iload 6
      // 06b: invokespecial com/finalshell/core/Wi2.Y$kH_3 (I)Lcom/finalshell/core/KH3_2;
      // 06e: astore 7
      // 070: aload 7
      // 072: getfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 075: aload 1
      // 076: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 079: bipush -1
      // 07a: iload 2
      // 07b: ifeq 099
      // 07e: if_icmpne 09c
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 7
      // 08a: getfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 08d: aload 1
      // 08e: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 091: bipush -1
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: if_icmpeq 0f0
      // 09c: new com/finalshell/core/IpRange
      // 09f: dup
      // 0a0: invokespecial com/finalshell/core/IpRange.<init> ()V
      // 0a3: astore 8
      // 0a5: aload 8
      // 0a7: aload 7
      // 0a9: getfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 0ac: putfield com/finalshell/core/IpRange.e Ljava/lang/String;
      // 0af: aload 8
      // 0b1: aload 7
      // 0b3: getfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 0b6: putfield com/finalshell/core/IpRange.a Ljava/lang/String;
      // 0b9: aload 0
      // 0ba: iload 5
      // 0bc: bipush 4
      // 0bd: isub
      // 0be: aload 0
      // 0bf: getfield com/finalshell/core/Wi2.p [B
      // 0c2: invokespecial com/finalshell/core/Wi2.x (I[B)V
      // 0c5: aload 8
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/core/Wi2.p [B
      // 0cb: invokestatic com/finalshell/core/KJ3.U ([B)Ljava/lang/String;
      // 0ce: putfield com/finalshell/core/IpRange.N Ljava/lang/String;
      // 0d1: aload 0
      // 0d2: iload 6
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/Wi2.p [B
      // 0d8: invokespecial com/finalshell/core/Wi2.x (I[B)V
      // 0db: aload 8
      // 0dd: aload 0
      // 0de: getfield com/finalshell/core/Wi2.p [B
      // 0e1: invokestatic com/finalshell/core/KJ3.U ([B)Ljava/lang/String;
      // 0e4: putfield com/finalshell/core/IpRange.r Ljava/lang/String;
      // 0e7: aload 3
      // 0e8: aload 8
      // 0ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ef: pop
      // 0f0: iinc 5 7
      // 0f3: iload 5
      // 0f5: iload 4
      // 0f7: if_icmple 05a
      // 0fa: goto 10a
      // 0fd: astore 4
      // 0ff: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 102: aload 4
      // 104: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 107: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 10a: aload 3
      // 10b: areturn
   }

   public int Y$int(int var1) {
      this.t.position(var1);
      return this.t.getInt() & a(32670, 1032755141651616696L);
   }

   public int w() {
      return this.t.getInt() & a(4634, 6111818812132703805L);
   }

   public String z(byte[] var1) {
      int var2 = d();

      try {
         if (this.H == null) {
            return a(24654, 2112);
         }
      } catch (IllegalArgumentException var6) {
         throw a(var6);
      }

      String var3 = KJ3.U(var1);

      label27: {
         Wi2 var10000;
         label26: {
            try {
               var10000 = this;
               if (var2 != 0) {
                  break label26;
               }

               if (this.u.containsKey(var3)) {
                  break label27;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }

            var10000 = this;
         }

         KH3_2 var7 = var10000.O(var1);
         this.u.put(var3, var7.T());
         return var7.I;
      }

      KH3_2 var4 = (KH3_2)this.u.get(var3);
      return var4.I;
   }

   public String q(String var1) {
      return this.z(KJ3.S(var1));
   }

   public String e(byte[] var1) {
      int var2 = d();

      try {
         if (this.H == null) {
            return a(24640, -29915);
         }
      } catch (IllegalArgumentException var6) {
         throw a(var6);
      }

      String var3 = KJ3.U(var1);

      label27: {
         Wi2 var10000;
         label26: {
            try {
               var10000 = this;
               if (var2 != 0) {
                  break label26;
               }

               if (this.u.containsKey(var3)) {
                  break label27;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }

            var10000 = this;
         }

         KH3_2 var7 = var10000.O(var1);
         this.u.put(var3, var7.T());
         return var7.f;
      }

      KH3_2 var4 = (KH3_2)this.u.get(var3);
      return var4.f;
   }

   public String f(String var1) {
      return this.e(KJ3.S(var1));
   }

   public KH3_2 O(byte[] var1) {
      int var10000 = d();
      KH3_2 var3 = null;
      long var4 = this.M(var1);
      int var2 = var10000;
      if (var4 != b(14578, 2316857388119592373L)) {
         var3 = this.h(var4);
      }

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (IllegalArgumentException var6) {
         throw a(var6);
      }

      var3 = new KH3_2(this);
      var3.I = a(24646, 20976);
      var3.f = a(24649, 22437);
      return var3;
   }

   public long c(long var1) {
      long var3 = 0L;

      try {
         this.H.seek(var1);
         var3 |= (long)(this.H.readByte() & a(24351, 5617242215471346494L));
         var3 |= (long)(this.H.readByte() << a(17257, 4731128747596181322L) & a(17268, 7376524008412966747L));
         var3 |= (long)(this.H.readByte() << a(25899, 776355949353453829L) & a(30061, 2063336393913260359L));
         return var3 | (long)(this.H.readByte() << a(23515, 6655502624317143033L) & a(22361, 4864237945379388284L));
      } catch (IOException var6) {
         return b(14578, 2316857388119592373L);
      }
   }

   public long z(long var1) {
      long var3 = 0L;

      try {
         this.H.seek(var1);
         this.H.readFully(this.f);
         var3 |= (long)(this.f[0] & a(24351, 5617242215471346494L));
         var3 |= (long)(this.f[1] << a(17257, 4731128747596181322L) & a(17268, 7376524008412966747L));
         return var3 | (long)(this.f[2] << a(25899, 776355949353453829L) & a(30061, 2063336393913260359L));
      } catch (IOException var6) {
         return b(14578, 2316857388119592373L);
      }
   }

   public long y() {
      long var1 = 0L;

      try {
         this.H.readFully(this.f);
         var1 |= (long)(this.f[0] & a(4000, 1553644771816711052L));
         var1 |= (long)(this.f[1] << a(11622, 2909534357893611855L) & a(13245, 8156324745887588246L));
         return var1 | (long)(this.f[2] << a(20828, 2534770315061198196L) & a(10277, 5960516838072222721L));
      } catch (IOException var4) {
         return b(5420, 570951278575886445L);
      }
   }

   public void p(long var1, byte[] var3) {
      try {
         this.H.seek(var1);
         this.H.readFully(var3);
         byte var4 = var3[0];
         var3[0] = var3[3];
         var3[3] = var4;
         var4 = var3[1];
         var3[1] = var3[2];
         var3[2] = var4;
      } catch (IOException var5) {
         System.out.println(var5.getMessage());
      }
   }

   public void x(int var1, byte[] var2) {
      this.t.position(var1);
      this.t.get(var2);
      byte var3 = var2[0];
      var2[0] = var2[3];
      var2[3] = var3;
      var3 = var2[1];
      var2[1] = var2[2];
      var2[2] = var3;
   }

   public int W(byte[] param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.p ()I
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 3
      // 08: ifne 2f
      // 0b: aload 0
      // 0c: aload 1
      // 0d: iload 4
      // 0f: baload
      // 10: aload 2
      // 11: iload 4
      // 13: baload
      // 14: invokespecial com/finalshell/core/Wi2.I (BB)I
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: istore 5
      // 20: iload 5
      // 22: iload 3
      // 23: ifeq 2b
      // 26: ifeq 2c
      // 29: iload 5
      // 2b: ireturn
      // 2c: iinc 4 1
      // 2f: iload 4
      // 31: bipush 4
      // 32: if_icmplt 0b
      // 35: bipush 0
      // 36: iload 3
      // 37: ifeq 1e
      // 3a: ireturn
   }

   public int I(byte param1, byte param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.d ()I
      // 03: istore 3
      // 04: iload 1
      // 05: sipush 24351
      // 08: ldc2_w 5617242215471346494
      // 0b: invokestatic com/finalshell/core/Wi2.a (IJ)I
      // 0e: iand
      // 0f: iload 2
      // 10: sipush 24351
      // 13: ldc2_w 5617242215471346494
      // 16: invokestatic com/finalshell/core/Wi2.a (IJ)I
      // 19: iand
      // 1a: iload 3
      // 1b: ifne 30
      // 1e: if_icmple 2e
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: bipush 1
      // 29: ireturn
      // 2a: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: iload 1
      // 2f: iload 2
      // 30: ixor
      // 31: iload 3
      // 32: ifne 46
      // 35: ifne 45
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
      // 41: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: bipush -1
      // 46: ireturn
   }

   public long M(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wi2.d ()I
      // 003: lconst_0
      // 004: lstore 3
      // 005: istore 2
      // 006: aload 0
      // 007: aload 0
      // 008: getfield com/finalshell/core/Wi2.C J
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/Wi2.p [B
      // 00f: invokespecial com/finalshell/core/Wi2.p (J[B)V
      // 012: aload 0
      // 013: aload 1
      // 014: aload 0
      // 015: getfield com/finalshell/core/Wi2.p [B
      // 018: invokespecial com/finalshell/core/Wi2.W ([B[B)I
      // 01b: istore 5
      // 01d: iload 5
      // 01f: iload 2
      // 020: ifne 038
      // 023: ifne 036
      // 026: goto 02d
      // 029: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield com/finalshell/core/Wi2.C J
      // 031: lreturn
      // 032: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: iload 5
      // 038: ifge 049
      // 03b: sipush 14578
      // 03e: ldc2_w 2316857388119592373
      // 041: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 044: lreturn
      // 045: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/finalshell/core/Wi2.C J
      // 04d: lstore 6
      // 04f: aload 0
      // 050: getfield com/finalshell/core/Wi2.B J
      // 053: lstore 8
      // 055: iload 2
      // 056: ifeq 0ed
      // 059: aload 0
      // 05a: lload 6
      // 05c: lload 8
      // 05e: invokespecial com/finalshell/core/Wi2.P (JJ)J
      // 061: lstore 3
      // 062: aload 0
      // 063: lload 3
      // 064: aload 0
      // 065: getfield com/finalshell/core/Wi2.p [B
      // 068: invokespecial com/finalshell/core/Wi2.p (J[B)V
      // 06b: aload 0
      // 06c: aload 1
      // 06d: aload 0
      // 06e: getfield com/finalshell/core/Wi2.p [B
      // 071: invokespecial com/finalshell/core/Wi2.W ([B[B)I
      // 074: istore 5
      // 076: iload 5
      // 078: iload 2
      // 079: ifne 08f
      // 07c: ifle 086
      // 07f: lload 3
      // 080: lstore 6
      // 082: iload 2
      // 083: ifeq 0ed
      // 086: iload 5
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: iload 2
      // 090: ifne 0b3
      // 093: ifge 0d9
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: lload 3
      // 09e: iload 2
      // 09f: ifne 0d3
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: lload 8
      // 0ab: lcmp
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: ifne 0cb
      // 0b6: lload 8
      // 0b8: sipush 24476
      // 0bb: ldc2_w 8599704451923929820
      // 0be: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 0c1: lsub
      // 0c2: lstore 8
      // 0c4: lload 8
      // 0c6: lstore 3
      // 0c7: iload 2
      // 0c8: ifeq 0ed
      // 0cb: lload 3
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: lstore 8
      // 0d5: iload 2
      // 0d6: ifeq 0ed
      // 0d9: aload 0
      // 0da: lload 3
      // 0db: sipush 16642
      // 0de: ldc2_w 953220012220609600
      // 0e1: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 0e4: ladd
      // 0e5: invokespecial com/finalshell/core/Wi2.z (J)J
      // 0e8: lreturn
      // 0e9: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: lload 6
      // 0ef: lload 8
      // 0f1: lcmp
      // 0f2: iflt 059
      // 0f5: aload 0
      // 0f6: lload 3
      // 0f7: sipush 16642
      // 0fa: ldc2_w 953220012220609600
      // 0fd: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 100: ladd
      // 101: invokespecial com/finalshell/core/Wi2.z (J)J
      // 104: iload 2
      // 105: ifne 135
      // 108: lstore 3
      // 109: aload 0
      // 10a: lload 3
      // 10b: aload 0
      // 10c: getfield com/finalshell/core/Wi2.p [B
      // 10f: invokespecial com/finalshell/core/Wi2.p (J[B)V
      // 112: aload 0
      // 113: aload 1
      // 114: aload 0
      // 115: getfield com/finalshell/core/Wi2.p [B
      // 118: invokespecial com/finalshell/core/Wi2.W ([B[B)I
      // 11b: istore 5
      // 11d: iload 5
      // 11f: iload 2
      // 120: ifne 078
      // 123: ifgt 12c
      // 126: lload 3
      // 127: lreturn
      // 128: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: sipush 14578
      // 12f: ldc2_w 2316857388119592373
      // 132: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 135: lreturn
   }

   public long P(long var1, long var3) {
      long var6 = (var3 - var1) / b(24476, 8599704451923929820L);
      int var10000 = p();
      var6 >>= 1;
      int var5 = var10000;

      try {
         if (var5 == 0) {
            return var6 + 0L;
         }

         if (var6 != 0L) {
            return var1 + var6 * b(24476, 8599704451923929820L);
         }
      } catch (IllegalArgumentException var8) {
         throw a(var8);
      }

      var6 = 1L;
      return var1 + var6 * b(24476, 8599704451923929820L);
   }

   public KH3_2 h(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wi2.d ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 008: lload 1
      // 009: sipush 3724
      // 00c: ldc2_w 4066171338162453455
      // 00f: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 012: ladd
      // 013: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 016: aload 0
      // 017: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 01a: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 01d: istore 4
      // 01f: iload 4
      // 021: bipush 1
      // 022: iload 3
      // 023: ifne 0b3
      // 026: if_icmpne 0a9
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: invokespecial com/finalshell/core/Wi2.y ()J
      // 034: lstore 5
      // 036: aload 0
      // 037: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 03a: lload 5
      // 03c: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 03f: aload 0
      // 040: iload 3
      // 041: ifne 087
      // 044: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 047: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 04a: istore 4
      // 04c: iload 4
      // 04e: bipush 2
      // 04f: if_icmpne 07f
      // 052: aload 0
      // 053: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 056: aload 0
      // 057: aload 0
      // 058: invokespecial com/finalshell/core/Wi2.y ()J
      // 05b: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 05e: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 061: aload 0
      // 062: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 065: lload 5
      // 067: sipush 16642
      // 06a: ldc2_w 953220012220609600
      // 06d: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 070: ladd
      // 071: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 074: iload 3
      // 075: ifeq 093
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 08a: aload 0
      // 08b: lload 5
      // 08d: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 090: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 093: aload 0
      // 094: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 09c: invokevirtual java/io/RandomAccessFile.getFilePointer ()J
      // 09f: invokespecial com/finalshell/core/Wi2.Y (J)Ljava/lang/String;
      // 0a2: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 0a5: iload 3
      // 0a6: ifeq 113
      // 0a9: iload 4
      // 0ab: bipush 2
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: if_icmpne 0e6
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0ba: aload 0
      // 0bb: aload 0
      // 0bc: invokespecial com/finalshell/core/Wi2.y ()J
      // 0bf: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 0c2: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0c9: aload 0
      // 0ca: lload 1
      // 0cb: sipush 29505
      // 0ce: ldc2_w 905274133213103620
      // 0d1: invokestatic com/finalshell/core/Wi2.b (IJ)J
      // 0d4: ladd
      // 0d5: invokespecial com/finalshell/core/Wi2.Y (J)Ljava/lang/String;
      // 0d8: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 0db: iload 3
      // 0dc: ifeq 113
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0ea: aload 0
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 0ef: invokevirtual java/io/RandomAccessFile.getFilePointer ()J
      // 0f2: lconst_1
      // 0f3: lsub
      // 0f4: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 0f7: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0fe: aload 0
      // 0ff: aload 0
      // 100: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 103: invokevirtual java/io/RandomAccessFile.getFilePointer ()J
      // 106: invokespecial com/finalshell/core/Wi2.Y (J)Ljava/lang/String;
      // 109: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: aload 0
      // 114: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 117: areturn
      // 118: astore 4
      // 11a: aconst_null
      // 11b: areturn
   }

   public KH3_2 Y$kH_3(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wi2.p ()I
      // 003: aload 0
      // 004: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 007: iload 1
      // 008: bipush 4
      // 009: iadd
      // 00a: invokevirtual java/nio/MappedByteBuffer.position (I)Ljava/nio/MappedByteBuffer;
      // 00d: pop
      // 00e: aload 0
      // 00f: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 012: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 015: istore 3
      // 016: istore 2
      // 017: iload 3
      // 018: bipush 1
      // 019: iload 2
      // 01a: ifeq 0a1
      // 01d: if_icmpne 098
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: invokespecial com/finalshell/core/Wi2.w ()I
      // 02b: istore 4
      // 02d: aload 0
      // 02e: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 031: iload 4
      // 033: invokevirtual java/nio/MappedByteBuffer.position (I)Ljava/nio/MappedByteBuffer;
      // 036: pop
      // 037: aload 0
      // 038: iload 2
      // 039: ifeq 076
      // 03c: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 03f: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 042: istore 3
      // 043: iload 3
      // 044: bipush 2
      // 045: if_icmpne 06e
      // 048: aload 0
      // 049: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 04c: aload 0
      // 04d: aload 0
      // 04e: invokespecial com/finalshell/core/Wi2.w ()I
      // 051: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 054: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 057: aload 0
      // 058: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 05b: iload 4
      // 05d: bipush 4
      // 05e: iadd
      // 05f: invokevirtual java/nio/MappedByteBuffer.position (I)Ljava/nio/MappedByteBuffer;
      // 062: pop
      // 063: iload 2
      // 064: ifne 082
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 0
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 079: aload 0
      // 07a: iload 4
      // 07c: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 07f: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 082: aload 0
      // 083: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 086: aload 0
      // 087: aload 0
      // 088: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 08b: invokevirtual java/nio/MappedByteBuffer.position ()I
      // 08e: invokespecial com/finalshell/core/Wi2.X (I)Ljava/lang/String;
      // 091: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 094: iload 2
      // 095: ifne 101
      // 098: iload 3
      // 099: bipush 2
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: if_icmpne 0d4
      // 0a4: aload 0
      // 0a5: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0a8: aload 0
      // 0a9: aload 0
      // 0aa: invokespecial com/finalshell/core/Wi2.w ()I
      // 0ad: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 0b0: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0b7: aload 0
      // 0b8: iload 1
      // 0b9: sipush 17257
      // 0bc: ldc2_w 4731128747596181322
      // 0bf: invokestatic com/finalshell/core/Wi2.a (IJ)I
      // 0c2: iadd
      // 0c3: invokespecial com/finalshell/core/Wi2.X (I)Ljava/lang/String;
      // 0c6: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 0c9: iload 2
      // 0ca: ifne 101
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0d8: aload 0
      // 0d9: aload 0
      // 0da: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 0dd: invokevirtual java/nio/MappedByteBuffer.position ()I
      // 0e0: bipush 1
      // 0e1: isub
      // 0e2: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 0e5: putfield com/finalshell/core/KH3_2.I Ljava/lang/String;
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 0ec: aload 0
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 0f1: invokevirtual java/nio/MappedByteBuffer.position ()I
      // 0f4: invokespecial com/finalshell/core/Wi2.X (I)Ljava/lang/String;
      // 0f7: putfield com/finalshell/core/KH3_2.f Ljava/lang/String;
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 0
      // 102: getfield com/finalshell/core/Wi2.F Lcom/finalshell/core/KH3_2;
      // 105: areturn
   }

   public String Y(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.p ()I
      // 03: aload 0
      // 04: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 07: lload 1
      // 08: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 10: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 13: istore 4
      // 15: iload 4
      // 17: bipush 1
      // 18: iload 3
      // 19: ifeq 30
      // 1c: if_icmpeq 33
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: iload 4
      // 28: bipush 2
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: if_icmpne 58
      // 33: aload 0
      // 34: lload 1
      // 35: lconst_1
      // 36: ladd
      // 37: invokespecial com/finalshell/core/Wi2.z (J)J
      // 3a: lstore 5
      // 3c: lload 5
      // 3e: lconst_0
      // 3f: lcmp
      // 40: ifne 51
      // 43: sipush 24643
      // 46: sipush -24002
      // 49: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 4c: areturn
      // 4d: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: lload 5
      // 54: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 57: areturn
      // 58: aload 0
      // 59: lload 1
      // 5a: invokespecial com/finalshell/core/Wi2.K (J)Ljava/lang/String;
      // 5d: areturn
   }

   public String X(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 04: iload 1
      // 05: invokevirtual java/nio/MappedByteBuffer.position (I)Ljava/nio/MappedByteBuffer;
      // 08: pop
      // 09: invokestatic com/finalshell/core/Wi2.p ()I
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 10: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 13: istore 3
      // 14: istore 2
      // 15: iload 3
      // 16: iload 2
      // 17: ifeq 47
      // 1a: bipush 1
      // 1b: if_icmpeq 3c
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: iload 3
      // 26: iload 2
      // 27: ifeq 47
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: bipush 2
      // 32: if_icmpne 63
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 0
      // 3d: invokespecial com/finalshell/core/Wi2.w ()I
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: istore 4
      // 49: iload 4
      // 4b: ifne 5c
      // 4e: sipush 24643
      // 51: sipush -24002
      // 54: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 57: areturn
      // 58: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 0
      // 5d: iload 4
      // 5f: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 62: areturn
      // 63: aload 0
      // 64: iload 1
      // 65: invokespecial com/finalshell/core/Wi2.i (I)Ljava/lang/String;
      // 68: areturn
   }

   public String K(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.d ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 08: lload 1
      // 09: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Wi2.U [B
      // 13: iload 4
      // 15: aload 0
      // 16: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 19: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 1c: bastore
      // 1d: iload 3
      // 1e: ifeq 39
      // 21: aload 0
      // 22: getfield com/finalshell/core/Wi2.U [B
      // 25: iinc 4 1
      // 28: iload 4
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/Wi2.H Ljava/io/RandomAccessFile;
      // 2e: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 31: bastore
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield com/finalshell/core/Wi2.U [B
      // 3d: iload 4
      // 3f: baload
      // 40: ifne 21
      // 43: iload 4
      // 45: ifeq 69
      // 48: aload 0
      // 49: getfield com/finalshell/core/Wi2.U [B
      // 4c: bipush 0
      // 4d: iload 4
      // 4f: sipush 24650
      // 52: sipush 29356
      // 55: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 58: invokestatic com/finalshell/core/KJ3.Q ([BIILjava/lang/String;)Ljava/lang/String;
      // 5b: areturn
      // 5c: astore 4
      // 5e: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 61: aload 4
      // 63: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 66: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 69: ldc_w ""
      // 6c: areturn
   }

   public String i(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.p ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 08: iload 1
      // 09: invokevirtual java/nio/MappedByteBuffer.position (I)Ljava/nio/MappedByteBuffer;
      // 0c: pop
      // 0d: bipush 0
      // 0e: istore 3
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Wi2.U [B
      // 13: iload 3
      // 14: aload 0
      // 15: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 18: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 1b: bastore
      // 1c: iload 2
      // 1d: ifne 37
      // 20: aload 0
      // 21: getfield com/finalshell/core/Wi2.U [B
      // 24: iinc 3 1
      // 27: iload 3
      // 28: aload 0
      // 29: getfield com/finalshell/core/Wi2.t Ljava/nio/MappedByteBuffer;
      // 2c: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 2f: bastore
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/finalshell/core/Wi2.U [B
      // 3b: iload 3
      // 3c: baload
      // 3d: ifne 20
      // 40: iload 3
      // 41: ifeq 62
      // 44: aload 0
      // 45: getfield com/finalshell/core/Wi2.U [B
      // 48: bipush 0
      // 49: iload 3
      // 4a: sipush 24644
      // 4d: sipush -20238
      // 50: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 53: invokestatic com/finalshell/core/KJ3.Q ([BIILjava/lang/String;)Ljava/lang/String;
      // 56: areturn
      // 57: astore 3
      // 58: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 5b: aload 3
      // 5c: invokevirtual java/lang/IllegalArgumentException.getMessage ()Ljava/lang/String;
      // 5f: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 62: ldc_w ""
      // 65: areturn
   }

   public String N(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wi2.d ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: iload 2
      // 07: ifne 2f
      // 0a: invokevirtual com/finalshell/core/Wi2.q (Ljava/lang/String;)Ljava/lang/String;
      // 0d: sipush 24648
      // 10: sipush 5170
      // 13: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 16: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19: ifeq 2d
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: ldc_w ""
      // 26: goto 32
      // 29: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 1
      // 2f: invokevirtual com/finalshell/core/Wi2.q (Ljava/lang/String;)Ljava/lang/String;
      // 32: astore 3
      // 33: aload 0
      // 34: aload 1
      // 35: iload 2
      // 36: ifne 5e
      // 39: invokevirtual com/finalshell/core/Wi2.f (Ljava/lang/String;)Ljava/lang/String;
      // 3c: sipush 24641
      // 3f: sipush 23057
      // 42: invokestatic com/finalshell/core/Wi2.a (II)Ljava/lang/String;
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: ifeq 5c
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: ldc_w ""
      // 55: goto 61
      // 58: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokevirtual com/finalshell/core/Wi2.f (Ljava/lang/String;)Ljava/lang/String;
      // 61: astore 4
      // 63: new java/lang/StringBuilder
      // 66: dup
      // 67: aload 3
      // 68: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 6b: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 6e: ldc_w " "
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: aload 4
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7c: astore 5
      // 7e: aload 5
      // 80: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 83: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 86: ifnull 97
      // 89: iinc 2 1
      // 8c: iload 2
      // 8d: invokestatic com/finalshell/core/Wi2.F (I)V
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/Wi2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: areturn
   }

   public static void F(int var0) {
      y = var0;
   }

   public static int p() {
      return y;
   }

   public static int d() {
      int var0 = p();

      try {
         return var0 == 0 ? 118 : 0;
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 24642) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 201;
               break;
            case 1:
               var10000 = 58;
               break;
            case 2:
               var10000 = 127;
               break;
            case 3:
               var10000 = 136;
               break;
            case 4:
               var10000 = 152;
               break;
            case 5:
               var10000 = 233;
               break;
            case 6:
               var10000 = 206;
               break;
            case 7:
               var10000 = 31;
               break;
            case 8:
               var10000 = 44;
               break;
            case 9:
               var10000 = 177;
               break;
            case 10:
               var10000 = 30;
               break;
            case 11:
               var10000 = 216;
               break;
            case 12:
               var10000 = 163;
               break;
            case 13:
               var10000 = 183;
               break;
            case 14:
               var10000 = 60;
               break;
            case 15:
               var10000 = 87;
               break;
            case 16:
               var10000 = 47;
               break;
            case 17:
               var10000 = 135;
               break;
            case 18:
               var10000 = 0;
               break;
            case 19:
               var10000 = 113;
               break;
            case 20:
               var10000 = 112;
               break;
            case 21:
               var10000 = 236;
               break;
            case 22:
               var10000 = 105;
               break;
            case 23:
               var10000 = 4;
               break;
            case 24:
               var10000 = 61;
               break;
            case 25:
               var10000 = 52;
               break;
            case 26:
               var10000 = 195;
               break;
            case 27:
               var10000 = 25;
               break;
            case 28:
               var10000 = 193;
               break;
            case 29:
               var10000 = 254;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 36;
               break;
            case 32:
               var10000 = 156;
               break;
            case 33:
               var10000 = 161;
               break;
            case 34:
               var10000 = 138;
               break;
            case 35:
               var10000 = 181;
               break;
            case 36:
               var10000 = 196;
               break;
            case 37:
               var10000 = 48;
               break;
            case 38:
               var10000 = 198;
               break;
            case 39:
               var10000 = 231;
               break;
            case 40:
               var10000 = 164;
               break;
            case 41:
               var10000 = 91;
               break;
            case 42:
               var10000 = 120;
               break;
            case 43:
               var10000 = 228;
               break;
            case 44:
               var10000 = 63;
               break;
            case 45:
               var10000 = 11;
               break;
            case 46:
               var10000 = 222;
               break;
            case 47:
               var10000 = 168;
               break;
            case 48:
               var10000 = 62;
               break;
            case 49:
               var10000 = 232;
               break;
            case 50:
               var10000 = 16;
               break;
            case 51:
               var10000 = 54;
               break;
            case 52:
               var10000 = 238;
               break;
            case 53:
               var10000 = 215;
               break;
            case 54:
               var10000 = 176;
               break;
            case 55:
               var10000 = 79;
               break;
            case 56:
               var10000 = 194;
               break;
            case 57:
               var10000 = 197;
               break;
            case 58:
               var10000 = 33;
               break;
            case 59:
               var10000 = 139;
               break;
            case 60:
               var10000 = 240;
               break;
            case 61:
               var10000 = 234;
               break;
            case 62:
               var10000 = 205;
               break;
            case 63:
               var10000 = 106;
               break;
            case 64:
               var10000 = 244;
               break;
            case 65:
               var10000 = 13;
               break;
            case 66:
               var10000 = 235;
               break;
            case 67:
               var10000 = 133;
               break;
            case 68:
               var10000 = 115;
               break;
            case 69:
               var10000 = 64;
               break;
            case 70:
               var10000 = 187;
               break;
            case 71:
               var10000 = 100;
               break;
            case 72:
               var10000 = 46;
               break;
            case 73:
               var10000 = 95;
               break;
            case 74:
               var10000 = 28;
               break;
            case 75:
               var10000 = 73;
               break;
            case 76:
               var10000 = 65;
               break;
            case 77:
               var10000 = 42;
               break;
            case 78:
               var10000 = 53;
               break;
            case 79:
               var10000 = 214;
               break;
            case 80:
               var10000 = 229;
               break;
            case 81:
               var10000 = 81;
               break;
            case 82:
               var10000 = 154;
               break;
            case 83:
               var10000 = 251;
               break;
            case 84:
               var10000 = 149;
               break;
            case 85:
               var10000 = 159;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 248;
               break;
            case 88:
               var10000 = 223;
               break;
            case 89:
               var10000 = 142;
               break;
            case 90:
               var10000 = 200;
               break;
            case 91:
               var10000 = 151;
               break;
            case 92:
               var10000 = 128;
               break;
            case 93:
               var10000 = 217;
               break;
            case 94:
               var10000 = 9;
               break;
            case 95:
               var10000 = 75;
               break;
            case 96:
               var10000 = 82;
               break;
            case 97:
               var10000 = 204;
               break;
            case 98:
               var10000 = 50;
               break;
            case 99:
               var10000 = 255;
               break;
            case 100:
               var10000 = 146;
               break;
            case 101:
               var10000 = 78;
               break;
            case 102:
               var10000 = 126;
               break;
            case 103:
               var10000 = 39;
               break;
            case 104:
               var10000 = 141;
               break;
            case 105:
               var10000 = 157;
               break;
            case 106:
               var10000 = 55;
               break;
            case 107:
               var10000 = 245;
               break;
            case 108:
               var10000 = 51;
               break;
            case 109:
               var10000 = 96;
               break;
            case 110:
               var10000 = 69;
               break;
            case 111:
               var10000 = 150;
               break;
            case 112:
               var10000 = 130;
               break;
            case 113:
               var10000 = 143;
               break;
            case 114:
               var10000 = 17;
               break;
            case 115:
               var10000 = 140;
               break;
            case 116:
               var10000 = 210;
               break;
            case 117:
               var10000 = 70;
               break;
            case 118:
               var10000 = 160;
               break;
            case 119:
               var10000 = 225;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 41;
               break;
            case 122:
               var10000 = 103;
               break;
            case 123:
               var10000 = 182;
               break;
            case 124:
               var10000 = 68;
               break;
            case 125:
               var10000 = 209;
               break;
            case 126:
               var10000 = 67;
               break;
            case 127:
               var10000 = 148;
               break;
            case 128:
               var10000 = 186;
               break;
            case 129:
               var10000 = 213;
               break;
            case 130:
               var10000 = 102;
               break;
            case 131:
               var10000 = 83;
               break;
            case 132:
               var10000 = 179;
               break;
            case 133:
               var10000 = 92;
               break;
            case 134:
               var10000 = 19;
               break;
            case 135:
               var10000 = 167;
               break;
            case 136:
               var10000 = 212;
               break;
            case 137:
               var10000 = 239;
               break;
            case 138:
               var10000 = 137;
               break;
            case 139:
               var10000 = 116;
               break;
            case 140:
               var10000 = 93;
               break;
            case 141:
               var10000 = 10;
               break;
            case 142:
               var10000 = 169;
               break;
            case 143:
               var10000 = 119;
               break;
            case 144:
               var10000 = 191;
               break;
            case 145:
               var10000 = 172;
               break;
            case 146:
               var10000 = 14;
               break;
            case 147:
               var10000 = 188;
               break;
            case 148:
               var10000 = 109;
               break;
            case 149:
               var10000 = 132;
               break;
            case 150:
               var10000 = 8;
               break;
            case 151:
               var10000 = 24;
               break;
            case 152:
               var10000 = 32;
               break;
            case 153:
               var10000 = 153;
               break;
            case 154:
               var10000 = 71;
               break;
            case 155:
               var10000 = 221;
               break;
            case 156:
               var10000 = 226;
               break;
            case 157:
               var10000 = 34;
               break;
            case 158:
               var10000 = 207;
               break;
            case 159:
               var10000 = 242;
               break;
            case 160:
               var10000 = 21;
               break;
            case 161:
               var10000 = 66;
               break;
            case 162:
               var10000 = 104;
               break;
            case 163:
               var10000 = 107;
               break;
            case 164:
               var10000 = 90;
               break;
            case 165:
               var10000 = 89;
               break;
            case 166:
               var10000 = 99;
               break;
            case 167:
               var10000 = 117;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 180;
               break;
            case 170:
               var10000 = 18;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 208;
               break;
            case 173:
               var10000 = 12;
               break;
            case 174:
               var10000 = 124;
               break;
            case 175:
               var10000 = 7;
               break;
            case 176:
               var10000 = 43;
               break;
            case 177:
               var10000 = 15;
               break;
            case 178:
               var10000 = 72;
               break;
            case 179:
               var10000 = 6;
               break;
            case 180:
               var10000 = 123;
               break;
            case 181:
               var10000 = 237;
               break;
            case 182:
               var10000 = 166;
               break;
            case 183:
               var10000 = 230;
               break;
            case 184:
               var10000 = 98;
               break;
            case 185:
               var10000 = 199;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 220;
               break;
            case 188:
               var10000 = 125;
               break;
            case 189:
               var10000 = 224;
               break;
            case 190:
               var10000 = 122;
               break;
            case 191:
               var10000 = 178;
               break;
            case 192:
               var10000 = 35;
               break;
            case 193:
               var10000 = 134;
               break;
            case 194:
               var10000 = 121;
               break;
            case 195:
               var10000 = 249;
               break;
            case 196:
               var10000 = 2;
               break;
            case 197:
               var10000 = 202;
               break;
            case 198:
               var10000 = 155;
               break;
            case 199:
               var10000 = 94;
               break;
            case 200:
               var10000 = 203;
               break;
            case 201:
               var10000 = 101;
               break;
            case 202:
               var10000 = 84;
               break;
            case 203:
               var10000 = 22;
               break;
            case 204:
               var10000 = 86;
               break;
            case 205:
               var10000 = 23;
               break;
            case 206:
               var10000 = 37;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 165;
               break;
            case 209:
               var10000 = 85;
               break;
            case 210:
               var10000 = 118;
               break;
            case 211:
               var10000 = 190;
               break;
            case 212:
               var10000 = 114;
               break;
            case 213:
               var10000 = 26;
               break;
            case 214:
               var10000 = 40;
               break;
            case 215:
               var10000 = 144;
               break;
            case 216:
               var10000 = 59;
               break;
            case 217:
               var10000 = 1;
               break;
            case 218:
               var10000 = 49;
               break;
            case 219:
               var10000 = 131;
               break;
            case 220:
               var10000 = 77;
               break;
            case 221:
               var10000 = 108;
               break;
            case 222:
               var10000 = 111;
               break;
            case 223:
               var10000 = 246;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 29;
               break;
            case 226:
               var10000 = 20;
               break;
            case 227:
               var10000 = 110;
               break;
            case 228:
               var10000 = 147;
               break;
            case 229:
               var10000 = 129;
               break;
            case 230:
               var10000 = 247;
               break;
            case 231:
               var10000 = 184;
               break;
            case 232:
               var10000 = 219;
               break;
            case 233:
               var10000 = 27;
               break;
            case 234:
               var10000 = 80;
               break;
            case 235:
               var10000 = 3;
               break;
            case 236:
               var10000 = 97;
               break;
            case 237:
               var10000 = 189;
               break;
            case 238:
               var10000 = 241;
               break;
            case 239:
               var10000 = 211;
               break;
            case 240:
               var10000 = 88;
               break;
            case 241:
               var10000 = 170;
               break;
            case 242:
               var10000 = 74;
               break;
            case 243:
               var10000 = 174;
               break;
            case 244:
               var10000 = 38;
               break;
            case 245:
               var10000 = 185;
               break;
            case 246:
               var10000 = 76;
               break;
            case 247:
               var10000 = 162;
               break;
            case 248:
               var10000 = 175;
               break;
            case 249:
               var10000 = 173;
               break;
            case 250:
               var10000 = 171;
               break;
            case 251:
               var10000 = 253;
               break;
            case 252:
               var10000 = 56;
               break;
            case 253:
               var10000 = 57;
               break;
            case 254:
               var10000 = 243;
               break;
            default:
               var10000 = 145;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11311;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 13633) & 32767;
      if (g[var3] == null) {
         g[var3] = e[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[14];
      int var19 = 0;
      String var18 = "ÎD圎坅伀恲教亩泍枓抅剼\ufff0óP昐秭劳耫峡旄沼伫畗\u0004杷睽圶匛\n闞诓盢ö\u000e攳揶帘旊亓\t\u0006û9»\u0018\u009bqNÍ\u0004柟眐囮嬺\f_\u001f\u0007;M²\u0087%Ò\u0011\u0007¨\u0003\u0006¤£\nE\u0003\u0094\u009f©î$|>\u0094\u0003\u0083!\u0013\u0019Qñ埽埳佾悤斖乳梩忎材锸謰ＲÎ«昀秂剰耥屧斕泏侶畩\toK\u0014\u00ad½YÅ\u0016[\u0004月矨埙厩";
      int var20 = "ÎD圎坅伀恲教亩泍枓抅剼\ufff0óP昐秭劳耫峡旄沼伫畗\u0004杷睽圶匛\n闞诓盢ö\u000e攳揶帘旊亓\t\u0006û9»\u0018\u009bqNÍ\u0004柟眐囮嬺\f_\u001f\u0007;M²\u0087%Ò\u0011\u0007¨\u0003\u0006¤£\nE\u0003\u0094\u009f©î$|>\u0094\u0003\u0083!\u0013\u0019Qñ埽埳佾悤斖乳梩忎材锸謰ＲÎ«昀秂剰耥屧斕泏侶畩\toK\u0014\u00ad½YÅ\u0016[\u0004月矨埙厩"
         .length();
      char var17 = 24;
      int var26 = -1;
      F(30);

      label88:
      while (true) {
         byte var10000 = 56;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var46;
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 69;
                        break;
                     case 1:
                        var84 = 36;
                        break;
                     case 2:
                        var84 = 16;
                        break;
                     case 3:
                        var84 = 108;
                        break;
                     case 4:
                        var84 = 43;
                        break;
                     case 5:
                        var84 = 79;
                        break;
                     default:
                        var84 = 89;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     b = new String[14];
                     long var8 = 6315840134985664308L;
                     long[] var14 = new long[15];
                     int var11 = 0;
                     String var12 = "O}V\u0007\u0019aWoÇwwÎ³\u0080\u008e!Þ\n-\"ÕÃøÀ\u0003\u0096¢Äì¾äG\u008a\u007fè\u008f¸¢§¢\f\u008e<þ|S\u001esºø\u008a\u008e\u009fòÆs\u001có¤Ô/\u0094ºPâåy3;¾\u0006öôlO´\u0089\u001cksF0´ó\u009d©¼H´¾Ïz<\u0001C5&\u008d\u0096ÂTâ(v";
                     int var13 = "O}V\u0007\u0019aWoÇwwÎ³\u0080\u008e!Þ\n-\"ÕÃøÀ\u0003\u0096¢Äì¾äG\u008a\u007fè\u008f¸¢§¢\f\u008e<þ|S\u001esºø\u008a\u008e\u009fòÆs\u001có¤Ô/\u0094ºPâåy3;¾\u0006öôlO´\u0089\u001cksF0´ó\u009d©¼H´¾Ïz<\u0001C5&\u008d\u0096ÂTâ(v"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[15];
                                    long var0 = 7207021069962838389L;
                                    long[] var6 = new long[7];
                                    int var3 = 0;
                                    String var4 = "\u009c\u0017é¬Û\u0089Þç\u0013\\2ØM¡k®\\i\u008a3Tè:¾i>ÿöv×õ1h\u0094U}\u0095`Gy";
                                    int var5 = "\u009c\u0017é¬Û\u0089Þç\u0013\\2ØM¡k®\\i\u008a3Tè:¾i>ÿöv×õ1h\u0094U}\u0095`Gy".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   e = var6;
                                                   g = new Long[7];
                                                   J = new Wi2();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "c\u0012\n*¬\u001dTã»Ü¥\u0001\u009a\u0000s?";
                                                var5 = "c\u0012\n*¬\u001dTã»Ü¥\u0001\u009a\u0000s?".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "Êø]µ\u000bã°Õ¹\tµ¢A\u0086´õ";
                                 var13 = "Êø]µ\u000bã°Õ¹\tµ¢A\u0086´õ".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "閜诃瘨vÕ斡挏廈敷下\f5\u001cÈÙ6lj|í¸b\u001f";
                  var20 = "閜诃瘨vÕ斡挏廈敷下\f5\u001cÈÙ6lj|í¸b\u001f".length();
                  var17 = '\n';
                  var26 = -1;
            }

            var10000 = 87;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





