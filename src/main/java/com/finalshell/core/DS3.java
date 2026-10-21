package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import java.net.Socket;
import java.util.Vector;

public class DS3 extends Dm4 {
   public static Vector G;
   public Socket x = null;
   public IX W = null;
   public AQ a = null;
   public static String[] f;
   public static String[] g;
   public static long[] h;
   public static Integer[] i;

   public DS3() {
      this.M(b(20633, 2584653661390976490L));
      this.Q(b(940, 6660855936291333854L));
      this.f(b(26425, 6693608346007831118L));
      this.o = new Cs4();
      this.X = true;
   }

   @Override
   public void S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 008: iload 1
      // 009: ifeq 0a1
      // 00c: instanceof com/finalshell/core/Ag2
      // 00f: ifeq 096
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 01d: checkcast com/finalshell/core/Ag2
      // 020: astore 2
      // 021: aload 2
      // 022: getfield com/finalshell/core/Ag2.X Ljava/lang/String;
      // 025: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 028: ldc com/finalshell/core/IX
      // 02a: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 02d: astore 3
      // 02e: aload 0
      // 02f: aload 3
      // 030: bipush 0
      // 031: anewarray 77
      // 034: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 037: bipush 0
      // 038: anewarray 93
      // 03b: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 03e: checkcast com/finalshell/core/IX
      // 041: putfield com/finalshell/core/DS3.W Lcom/finalshell/core/IX;
      // 044: new java/io/PipedOutputStream
      // 047: dup
      // 048: invokespecial java/io/PipedOutputStream.<init> ()V
      // 04b: astore 4
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 051: new com/finalshell/io/GF
      // 054: dup
      // 055: aload 4
      // 057: sipush 688
      // 05a: ldc2_w 235697628525520836
      // 05d: invokestatic com/finalshell/core/DS3.b (IJ)I
      // 060: invokespecial com/finalshell/io/GF.<init> (Ljava/io/PipedOutputStream;I)V
      // 063: bipush 0
      // 064: invokevirtual com/finalshell/core/Cs4.r (Ljava/io/InputStream;Z)V
      // 067: aload 0
      // 068: getfield com/finalshell/core/DS3.W Lcom/finalshell/core/IX;
      // 06b: aload 0
      // 06c: aload 0
      // 06d: invokevirtual com/finalshell/core/DS3.s ()Ljava/io/InputStream;
      // 070: aload 4
      // 072: invokeinterface com/finalshell/core/IX.A (Lcom/finalshell/core/DS3;Ljava/io/InputStream;Ljava/io/OutputStream;)V 4
      // 077: aload 0
      // 078: getfield com/finalshell/core/DS3.W Lcom/finalshell/core/IX;
      // 07b: aload 2
      // 07c: getfield com/finalshell/core/Ag2.k [Ljava/lang/Object;
      // 07f: invokeinterface com/finalshell/core/IX.K ([Ljava/lang/Object;)V 2
      // 084: new java/lang/Thread
      // 087: dup
      // 088: aload 0
      // 089: getfield com/finalshell/core/DS3.W Lcom/finalshell/core/IX;
      // 08c: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 08f: invokevirtual java/lang/Thread.start ()V
      // 092: iload 1
      // 093: ifne 10b
      // 096: aload 0
      // 097: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: checkcast com/finalshell/core/Ae2
      // 0a4: astore 2
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: getfield com/finalshell/core/Ae2.O Lcom/finalshell/core/PJ3;
      // 0aa: iload 1
      // 0ab: ifeq 0d7
      // 0ae: ifnonnull 0d3
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: aload 2
      // 0b9: getfield com/finalshell/core/Ae2.X Ljava/lang/String;
      // 0bc: aload 2
      // 0bd: getfield com/finalshell/core/Ae2.H I
      // 0c0: sipush 31305
      // 0c3: ldc2_w 8106513100888153913
      // 0c6: invokestatic com/finalshell/core/DS3.b (IJ)I
      // 0c9: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 0cc: goto 0e4
      // 0cf: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 2
      // 0d4: getfield com/finalshell/core/Ae2.O Lcom/finalshell/core/PJ3;
      // 0d7: aload 2
      // 0d8: getfield com/finalshell/core/Ae2.X Ljava/lang/String;
      // 0db: aload 2
      // 0dc: getfield com/finalshell/core/Ae2.H I
      // 0df: invokeinterface com/finalshell/core/PJ3.y (Ljava/lang/String;I)Ljava/net/Socket; 3
      // 0e4: putfield com/finalshell/core/DS3.x Ljava/net/Socket;
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/core/DS3.x Ljava/net/Socket;
      // 0eb: bipush 1
      // 0ec: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/core/DS3.x Ljava/net/Socket;
      // 0f7: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 0fa: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/InputStream;)V
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 101: aload 0
      // 102: getfield com/finalshell/core/DS3.x Ljava/net/Socket;
      // 105: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 108: invokevirtual com/finalshell/core/Cs4.H (Ljava/io/OutputStream;)V
      // 10b: aload 0
      // 10c: invokevirtual com/finalshell/core/DS3.l ()V
      // 10f: goto 122
      // 112: astore 2
      // 113: aload 0
      // 114: bipush 1
      // 115: invokevirtual com/finalshell/core/DS3.d (I)V
      // 118: aload 0
      // 119: bipush 1
      // 11a: putfield com/finalshell/core/DS3.S Z
      // 11d: aload 0
      // 11e: invokevirtual com/finalshell/core/DS3.r ()V
      // 121: return
      // 122: aload 0
      // 123: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 126: putfield com/finalshell/core/DS3.Z Ljava/lang/Thread;
      // 129: new com/finalshell/core/UJ
      // 12c: dup
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/DS3.c I
      // 131: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 134: astore 2
      // 135: new com/finalshell/core/YU
      // 138: dup
      // 139: aload 2
      // 13a: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 13d: astore 3
      // 13e: bipush 0
      // 13f: istore 4
      // 141: aload 0
      // 142: invokevirtual com/finalshell/core/DS3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 145: astore 5
      // 147: aload 0
      // 148: getfield com/finalshell/core/DS3.Z Ljava/lang/Thread;
      // 14b: ifnull 239
      // 14e: aload 0
      // 14f: iload 1
      // 150: ifeq 23f
      // 153: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 156: iload 1
      // 157: ifeq 176
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: ifnull 239
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 179: iload 1
      // 17a: ifeq 195
      // 17d: ifnull 239
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 0
      // 188: getfield com/finalshell/core/DS3.o Lcom/finalshell/core/Cs4;
      // 18b: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 2
      // 196: getfield com/finalshell/core/UJ.g [B
      // 199: sipush 19154
      // 19c: ldc2_w 3925836305493405607
      // 19f: invokestatic com/finalshell/core/DS3.b (IJ)I
      // 1a2: aload 2
      // 1a3: getfield com/finalshell/core/UJ.g [B
      // 1a6: arraylength
      // 1a7: sipush 27754
      // 1aa: ldc2_w 3314357792604686619
      // 1ad: invokestatic com/finalshell/core/DS3.b (IJ)I
      // 1b0: isub
      // 1b1: aload 5
      // 1b3: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 1b6: isub
      // 1b7: invokevirtual java/io/InputStream.read ([BII)I
      // 1ba: istore 4
      // 1bc: iload 1
      // 1bd: ifeq 207
      // 1c0: iload 4
      // 1c2: ifgt 1db
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: invokevirtual com/finalshell/core/DS3.F ()V
      // 1d0: iload 1
      // 1d1: ifne 239
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: aload 3
      // 1dc: invokevirtual com/finalshell/core/YU.M ()V
      // 1df: aload 2
      // 1e0: sipush 593
      // 1e3: ldc2_w 2824629694282393383
      // 1e6: invokestatic com/finalshell/core/DS3.b (IJ)I
      // 1e9: invokevirtual com/finalshell/core/UJ.V (B)V
      // 1ec: aload 2
      // 1ed: aload 0
      // 1ee: getfield com/finalshell/core/DS3.V I
      // 1f1: invokevirtual com/finalshell/core/UJ.u (I)V
      // 1f4: aload 2
      // 1f5: iload 4
      // 1f7: invokevirtual com/finalshell/core/UJ.u (I)V
      // 1fa: aload 2
      // 1fb: iload 4
      // 1fd: invokevirtual com/finalshell/core/UJ.S (I)V
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 0
      // 208: dup
      // 209: astore 6
      // 20b: monitorenter
      // 20c: aload 0
      // 20d: iload 1
      // 20e: ifeq 229
      // 211: getfield com/finalshell/core/DS3.S Z
      // 214: ifeq 21e
      // 217: aload 6
      // 219: monitorexit
      // 21a: iload 1
      // 21b: ifne 239
      // 21e: aload 5
      // 220: aload 3
      // 221: aload 0
      // 222: iload 4
      // 224: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // 227: aload 6
      // 229: monitorexit
      // 22a: goto 235
      // 22d: astore 7
      // 22f: aload 6
      // 231: monitorexit
      // 232: aload 7
      // 234: athrow
      // 235: iload 1
      // 236: ifne 147
      // 239: goto 23e
      // 23c: astore 5
      // 23e: aload 0
      // 23f: invokevirtual com/finalshell/core/DS3.r ()V
      // 242: return
   }

   @Override
   public void D(UJ param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/finalshell/core/UJ.d ()I
      // 05: invokevirtual com/finalshell/core/DS3.N (I)V
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual com/finalshell/core/UJ.K ()J
      // 0d: invokevirtual com/finalshell/core/DS3.X (J)V
      // 10: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual com/finalshell/core/UJ.d ()I
      // 18: invokevirtual com/finalshell/core/DS3.A (I)V
      // 1b: istore 2
      // 1c: aload 1
      // 1d: invokevirtual com/finalshell/core/UJ.S ()[B
      // 20: astore 3
      // 21: aload 1
      // 22: invokevirtual com/finalshell/core/UJ.d ()I
      // 25: istore 4
      // 27: aload 1
      // 28: invokevirtual com/finalshell/core/UJ.S ()[B
      // 2b: astore 5
      // 2d: aload 1
      // 2e: invokevirtual com/finalshell/core/UJ.d ()I
      // 31: istore 6
      // 33: aconst_null
      // 34: astore 7
      // 36: aload 0
      // 37: invokevirtual com/finalshell/core/DS3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 3a: astore 7
      // 3c: goto 41
      // 3f: astore 8
      // 41: aload 0
      // 42: aload 7
      // 44: aload 3
      // 45: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 48: iload 4
      // 4a: invokestatic com/finalshell/core/DS3.y (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/AQ;
      // 4d: putfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 50: aload 0
      // 51: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 54: iload 2
      // 55: ifne 79
      // 58: ifnonnull 75
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 0
      // 63: aload 7
      // 65: aconst_null
      // 66: iload 4
      // 68: invokestatic com/finalshell/core/DS3.y (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/AQ;
      // 6b: putfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 0
      // 76: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 79: ifnonnull e2
      // 7c: aload 7
      // 7e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 81: bipush 3
      // 82: iload 2
      // 83: ifne a9
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 92: ifeq e2
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 7
      // 9e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // a1: bipush 3
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a8: athrow
      // a9: new java/lang/StringBuilder
      // ac: dup
      // ad: invokespecial java/lang/StringBuilder.<init> ()V
      // b0: sipush 27708
      // b3: sipush 31877
      // b6: invokestatic com/finalshell/core/DS3.b (II)Ljava/lang/String;
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bc: aload 3
      // bd: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c3: ldc_w ":"
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c9: iload 4
      // cb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // ce: sipush 27704
      // d1: sipush 2458
      // d4: invokestatic com/finalshell/core/DS3.b (II)Ljava/lang/String;
      // d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // dd: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // e2: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static AQ y(ConnectHost var0, String var1, int var2) {
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      Vector var4 = G;
      synchronized (G){} // $VF: monitorenter 
      boolean var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      try {
         int var5 = 0;

         while (var5 < G.size()) {
            AQ var6;
            label122: {
               label133: {
                  var6 = (AQ)G.elementAt(var5);
                  AQ var10 = var6;
                  if (!var3) {
                     if (var6.o != var0 && !var3) {
                        break label133;
                     }

                     var10 = var6;
                  }

                  label134: {
                     var10000 = var10.j;
                     if (!var3) {
                        if (var10.j == var2) {
                           break label134;
                        }

                        var10000 = var6.j;
                     }

                     if (!var3) {
                        if (var10000 != 0) {
                           break label133;
                        }

                        var10000 = var6.w;
                     }

                     if (var10000 != var2 && !var3) {
                        break label133;
                     }
                  }

                  String var12 = var1;
                  if (!var3) {
                     if (var1 == null) {
                        break label122;
                     }

                     if (var3) {
                        return var6;
                     }

                     var12 = var6.M;
                  }

                  if (var12.equals(var1) || var3) {
                     break label122;
                  }
               }

               var5++;
               if (!var3) {
                  continue;
               }
               break;
            }

            // $VF: monitorexit
            return var6;
         }

         // $VF: monitorexit
         return null;
      } finally {
         // $VF: monitorexit
      }
   }

   public static String[] R(ConnectHost var0) {
      boolean var10000 = Dm4.F$boolean();
      Vector var2 = new Vector();
      boolean var1 = var10000;
      synchronized (G) {
         int var4 = 0;

         while (var4 < G.size()) {
            AQ var5 = (AQ)G.elementAt(var4);
            if (var1) {
               if (var1) {
                  label45:
                  if (var5.o == var0) {
                     if (var5 instanceof Ag2) {
                        var2.addElement(var5.w + ":" + var5.X + ":");
                        if (var1) {
                           break label45;
                        }
                     }

                     var2.addElement(var5.w + ":" + var5.X + ":" + ((Ae2)var5).H);
                  }

                  var4++;
               }

               if (var1) {
                  continue;
               }
            }
            break;
         }
      }

      String[] var8 = new String[var2.size()];
      int var9 = 0;

      while (true) {
         if (var9 < var2.size()) {
      String[] var10;
            var10 = var8;
            if (!var1) {
               break;
            }

            var8[var9] = (String)var2.elementAt(var9);
            var9++;
            if (var1) {
      String[] var10;
               continue;
            }
         }

         var10 = var8;
         break;
      }

      return var10;
   }

   public static String J(String var0) {
      boolean var1 = Dm4.J$boolean();
      String var10000 = var0;
      if (!var1) {
         if (var0 == null) {
            return b(27705, -21911);
         }

         var10000 = var0;
      }

      if (!var1) {
         label28:
         if (var10000.length() != 0) {
            var10000 = var0;
            if (!var1) {
               if (var0.equals("*")) {
                  break label28;
               }

               var10000 = var0;
            }

            return var10000;
         }

         var10000 = "";
      }

      return var10000;
   }

   public static void f(ConnectHost var0, String var1, int var2, int var3, String var4, int var5, PJ3 var6) throws Pc2 {
      String var7 = J(var1);
      synchronized (G) {
         if (y(var0, var7, var2) != null) {
            throw new Pc2(b(27706, 26062) + var2 + b(27707, 14326));
         } else {
            Ae2 var9 = new Ae2();
            var9.o = var0;
            var9.j = var2;
            var9.w = var3;
            var9.X = var4;
            var9.H = var5;
            var9.M = var7;
            var9.O = var6;
            G.addElement(var9);
         }
      }
   }

   public static void f(ConnectHost var0, String var1, int var2, int var3, String var4, Object[] var5) throws Pc2 {
      String var6 = J(var1);
      synchronized (G) {
         if (y(var0, var6, var2) != null) {
            throw new Pc2(b(27711, -28077) + var2 + b(27710, -29124));
         } else {
            Ag2 var8 = new Ag2();
            var8.o = var0;
            var8.j = var2;
            var8.w = var2;
            var8.X = var4;
            var8.k = var5;
            var8.M = var6;
            G.addElement(var8);
         }
      }
   }

   public static void f(DS3 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 1
      // 02: aload 0
      // 03: invokevirtual com/finalshell/core/DS3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 06: astore 1
      // 07: goto 0b
      // 0a: astore 2
      // 0b: aload 1
      // 0c: ifnull 2f
      // 0f: aload 0
      // 10: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 13: ifnull 2f
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/DS3.a Lcom/finalshell/core/AQ;
      // 22: getfield com/finalshell/core/AQ.j I
      // 25: invokestatic com/finalshell/core/DS3.W (Lcom/finalshell/crypto/ConnectHost;I)V
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/DS3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: return
   }

   public static void W(ConnectHost var0, int var1) {
      c(var0, null, var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void c(ConnectHost var0, String var1, int var2) {
      boolean var10000 = Dm4.J$boolean();
      Vector var4 = G;
      synchronized (G){} // $VF: monitorenter 
      boolean var3 = var10000;
      boolean var12 = false /* VF: Semaphore variable */;

      try {
         var12 = true;
         AQ var5 = y(var0, J(var1), var2);

         label114: {
            label113: {
               try {
                  var22 = var5;
                  if (var3) {
                     break label114;
                  }

                  if (var5 != null) {
                     break label113;
                  }
               } catch (Exception var16) {
                  throw b(var16);
               }

               var5 = y(var0, null, var2);
            }

            var22 = var5;
         }

         if (var22 == null) {
            // $VF: monitorexit
            return;
         }

         label104: {
            label103: {
               try {
                  G.removeElement(var5);
                  var23 = var1;
                  if (var3) {
                     break label104;
                  }

                  if (var1 != null) {
                     break label103;
                  }
               } catch (Exception var15) {
                  throw b(var15);
               }

               var1 = var5.M;
            }

            var23 = var1;
         }

         label95: {
            label94: {
               try {
                  if (var3) {
                     break label94;
                  }

                  if (var23 != null) {
                     break label95;
                  }
               } catch (Exception var14) {
                  throw b(var14);
               }

               var23 = b(27709, -9776);
            }

            var1 = var23;
         }

         // $VF: monitorexit
         var12 = false;
      } finally {
         if (var12) {
            // $VF: monitorexit
         }
      }

      UJ var18 = new UJ(b(31008, 3971855211882060889L));
      YU var19 = new YU(var18);

      try {
         var19.M();
         var18.V((byte)b(10395, 2618938027814014435L));
         var18.q(E8.J(b(27700, -21697)));
         var18.V((byte)0);
         var18.q(E8.J(var1));
         var18.u(var2);
         var0.D(var19);
      } catch (Exception var13) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void M(ConnectHost var0) {
      Object var2 = null;
      boolean var10000 = Dm4.F$boolean();
      int var3 = 0;
      Vector var4 = G;
      synchronized (G){} // $VF: monitorenter 
      boolean var1 = var10000;
      boolean var9 = false /* VF: Semaphore variable */;

      try {
         var9 = true;
         var2 = new int[G.size()];
         int var5 = 0;

         while (true) {
            if (var5 < G.size()) {
               AQ var6 = (AQ)G.elementAt(var5);
               if (!var1) {
                  var9 = false;
                  break;
               }

               if (var1) {
                  if (var6.o == var0) {
                     ((Object[])var2)[var3++] = var6.j;
                  }

                  var5++;
               }

               if (var1) {
                  continue;
               }
            }

            // $VF: monitorexit
            var9 = false;
            break;
         }
      } finally {
         if (var9) {
            // $VF: monitorexit
         }
      }

      int var12 = 0;

      while (var12 < var3) {
         W(var0, (int)((Object[])var2)[var12]);
         var12++;
         if (!var1) {
            break;
         }
      }
   }

   public int M() {
      boolean var1 = Dm4.J$boolean();
      AQ var10000 = this.a;
      if (!var1) {
         if (this.a == null) {
            return 0;
         }

         var10000 = this.a;
      }

      return var10000.j;
   }

   public void c(PJ3 var1) {
      boolean var2 = Dm4.J$boolean();
      AQ var10000 = this.a;
      if (!var2) {
         if (this.a == null) {
            return;
         }

         var10000 = this.a;
      }

      if (!var2) {
         if (!(var10000 instanceof Ae2)) {
            return;
         }

         var10000 = this.a;
      }

      ((Ae2)var10000).O = var1;
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 27708) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 214;
               break;
            case 1:
               var10000 = 100;
               break;
            case 2:
               var10000 = 124;
               break;
            case 3:
               var10000 = 130;
               break;
            case 4:
               var10000 = 47;
               break;
            case 5:
               var10000 = 136;
               break;
            case 6:
               var10000 = 22;
               break;
            case 7:
               var10000 = 245;
               break;
            case 8:
               var10000 = 54;
               break;
            case 9:
               var10000 = 29;
               break;
            case 10:
               var10000 = 210;
               break;
            case 11:
               var10000 = 229;
               break;
            case 12:
               var10000 = 196;
               break;
            case 13:
               var10000 = 217;
               break;
            case 14:
               var10000 = 65;
               break;
            case 15:
               var10000 = 70;
               break;
            case 16:
               var10000 = 6;
               break;
            case 17:
               var10000 = 95;
               break;
            case 18:
               var10000 = 117;
               break;
            case 19:
               var10000 = 190;
               break;
            case 20:
               var10000 = 102;
               break;
            case 21:
               var10000 = 167;
               break;
            case 22:
               var10000 = 188;
               break;
            case 23:
               var10000 = 226;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 107;
               break;
            case 26:
               var10000 = 175;
               break;
            case 27:
               var10000 = 215;
               break;
            case 28:
               var10000 = 144;
               break;
            case 29:
               var10000 = 189;
               break;
            case 30:
               var10000 = 230;
               break;
            case 31:
               var10000 = 125;
               break;
            case 32:
               var10000 = 163;
               break;
            case 33:
               var10000 = 13;
               break;
            case 34:
               var10000 = 71;
               break;
            case 35:
               var10000 = 181;
               break;
            case 36:
               var10000 = 122;
               break;
            case 37:
               var10000 = 184;
               break;
            case 38:
               var10000 = 221;
               break;
            case 39:
               var10000 = 153;
               break;
            case 40:
               var10000 = 43;
               break;
            case 41:
               var10000 = 241;
               break;
            case 42:
               var10000 = 56;
               break;
            case 43:
               var10000 = 81;
               break;
            case 44:
               var10000 = 194;
               break;
            case 45:
               var10000 = 7;
               break;
            case 46:
               var10000 = 149;
               break;
            case 47:
               var10000 = 42;
               break;
            case 48:
               var10000 = 30;
               break;
            case 49:
               var10000 = 101;
               break;
            case 50:
               var10000 = 75;
               break;
            case 51:
               var10000 = 39;
               break;
            case 52:
               var10000 = 5;
               break;
            case 53:
               var10000 = 244;
               break;
            case 54:
               var10000 = 34;
               break;
            case 55:
               var10000 = 92;
               break;
            case 56:
               var10000 = 37;
               break;
            case 57:
               var10000 = 24;
               break;
            case 58:
               var10000 = 216;
               break;
            case 59:
               var10000 = 228;
               break;
            case 60:
               var10000 = 8;
               break;
            case 61:
               var10000 = 98;
               break;
            case 62:
               var10000 = 118;
               break;
            case 63:
               var10000 = 9;
               break;
            case 64:
               var10000 = 23;
               break;
            case 65:
               var10000 = 156;
               break;
            case 66:
               var10000 = 197;
               break;
            case 67:
               var10000 = 254;
               break;
            case 68:
               var10000 = 137;
               break;
            case 69:
               var10000 = 160;
               break;
            case 70:
               var10000 = 209;
               break;
            case 71:
               var10000 = 171;
               break;
            case 72:
               var10000 = 177;
               break;
            case 73:
               var10000 = 58;
               break;
            case 74:
               var10000 = 142;
               break;
            case 75:
               var10000 = 76;
               break;
            case 76:
               var10000 = 182;
               break;
            case 77:
               var10000 = 0;
               break;
            case 78:
               var10000 = 61;
               break;
            case 79:
               var10000 = 204;
               break;
            case 80:
               var10000 = 15;
               break;
            case 81:
               var10000 = 62;
               break;
            case 82:
               var10000 = 235;
               break;
            case 83:
               var10000 = 140;
               break;
            case 84:
               var10000 = 66;
               break;
            case 85:
               var10000 = 11;
               break;
            case 86:
               var10000 = 143;
               break;
            case 87:
               var10000 = 123;
               break;
            case 88:
               var10000 = 242;
               break;
            case 89:
               var10000 = 31;
               break;
            case 90:
               var10000 = 67;
               break;
            case 91:
               var10000 = 200;
               break;
            case 92:
               var10000 = 91;
               break;
            case 93:
               var10000 = 251;
               break;
            case 94:
               var10000 = 132;
               break;
            case 95:
               var10000 = 135;
               break;
            case 96:
               var10000 = 60;
               break;
            case 97:
               var10000 = 74;
               break;
            case 98:
               var10000 = 223;
               break;
            case 99:
               var10000 = 138;
               break;
            case 100:
               var10000 = 159;
               break;
            case 101:
               var10000 = 73;
               break;
            case 102:
               var10000 = 139;
               break;
            case 103:
               var10000 = 120;
               break;
            case 104:
               var10000 = 44;
               break;
            case 105:
               var10000 = 89;
               break;
            case 106:
               var10000 = 112;
               break;
            case 107:
               var10000 = 104;
               break;
            case 108:
               var10000 = 220;
               break;
            case 109:
               var10000 = 141;
               break;
            case 110:
               var10000 = 170;
               break;
            case 111:
               var10000 = 111;
               break;
            case 112:
               var10000 = 154;
               break;
            case 113:
               var10000 = 187;
               break;
            case 114:
               var10000 = 4;
               break;
            case 115:
               var10000 = 68;
               break;
            case 116:
               var10000 = 78;
               break;
            case 117:
               var10000 = 41;
               break;
            case 118:
               var10000 = 201;
               break;
            case 119:
               var10000 = 108;
               break;
            case 120:
               var10000 = 232;
               break;
            case 121:
               var10000 = 211;
               break;
            case 122:
               var10000 = 250;
               break;
            case 123:
               var10000 = 80;
               break;
            case 124:
               var10000 = 212;
               break;
            case 125:
               var10000 = 147;
               break;
            case 126:
               var10000 = 103;
               break;
            case 127:
               var10000 = 28;
               break;
            case 128:
               var10000 = 178;
               break;
            case 129:
               var10000 = 238;
               break;
            case 130:
               var10000 = 19;
               break;
            case 131:
               var10000 = 93;
               break;
            case 132:
               var10000 = 252;
               break;
            case 133:
               var10000 = 50;
               break;
            case 134:
               var10000 = 247;
               break;
            case 135:
               var10000 = 183;
               break;
            case 136:
               var10000 = 219;
               break;
            case 137:
               var10000 = 127;
               break;
            case 138:
               var10000 = 231;
               break;
            case 139:
               var10000 = 202;
               break;
            case 140:
               var10000 = 27;
               break;
            case 141:
               var10000 = 249;
               break;
            case 142:
               var10000 = 2;
               break;
            case 143:
               var10000 = 203;
               break;
            case 144:
               var10000 = 225;
               break;
            case 145:
               var10000 = 1;
               break;
            case 146:
               var10000 = 64;
               break;
            case 147:
               var10000 = 21;
               break;
            case 148:
               var10000 = 72;
               break;
            case 149:
               var10000 = 46;
               break;
            case 150:
               var10000 = 185;
               break;
            case 151:
               var10000 = 176;
               break;
            case 152:
               var10000 = 94;
               break;
            case 153:
               var10000 = 69;
               break;
            case 154:
               var10000 = 158;
               break;
            case 155:
               var10000 = 113;
               break;
            case 156:
               var10000 = 233;
               break;
            case 157:
               var10000 = 86;
               break;
            case 158:
               var10000 = 165;
               break;
            case 159:
               var10000 = 36;
               break;
            case 160:
               var10000 = 90;
               break;
            case 161:
               var10000 = 116;
               break;
            case 162:
               var10000 = 45;
               break;
            case 163:
               var10000 = 59;
               break;
            case 164:
               var10000 = 106;
               break;
            case 165:
               var10000 = 234;
               break;
            case 166:
               var10000 = 84;
               break;
            case 167:
               var10000 = 236;
               break;
            case 168:
               var10000 = 164;
               break;
            case 169:
               var10000 = 134;
               break;
            case 170:
               var10000 = 105;
               break;
            case 171:
               var10000 = 222;
               break;
            case 172:
               var10000 = 246;
               break;
            case 173:
               var10000 = 192;
               break;
            case 174:
               var10000 = 79;
               break;
            case 175:
               var10000 = 53;
               break;
            case 176:
               var10000 = 240;
               break;
            case 177:
               var10000 = 157;
               break;
            case 178:
               var10000 = 14;
               break;
            case 179:
               var10000 = 155;
               break;
            case 180:
               var10000 = 243;
               break;
            case 181:
               var10000 = 119;
               break;
            case 182:
               var10000 = 10;
               break;
            case 183:
               var10000 = 96;
               break;
            case 184:
               var10000 = 151;
               break;
            case 185:
               var10000 = 162;
               break;
            case 186:
               var10000 = 191;
               break;
            case 187:
               var10000 = 150;
               break;
            case 188:
               var10000 = 57;
               break;
            case 189:
               var10000 = 199;
               break;
            case 190:
               var10000 = 52;
               break;
            case 191:
               var10000 = 239;
               break;
            case 192:
               var10000 = 88;
               break;
            case 193:
               var10000 = 145;
               break;
            case 194:
               var10000 = 227;
               break;
            case 195:
               var10000 = 121;
               break;
            case 196:
               var10000 = 172;
               break;
            case 197:
               var10000 = 198;
               break;
            case 198:
               var10000 = 18;
               break;
            case 199:
               var10000 = 193;
               break;
            case 200:
               var10000 = 161;
               break;
            case 201:
               var10000 = 186;
               break;
            case 202:
               var10000 = 82;
               break;
            case 203:
               var10000 = 25;
               break;
            case 204:
               var10000 = 16;
               break;
            case 205:
               var10000 = 169;
               break;
            case 206:
               var10000 = 195;
               break;
            case 207:
               var10000 = 115;
               break;
            case 208:
               var10000 = 173;
               break;
            case 209:
               var10000 = 33;
               break;
            case 210:
               var10000 = 174;
               break;
            case 211:
               var10000 = 148;
               break;
            case 212:
               var10000 = 129;
               break;
            case 213:
               var10000 = 38;
               break;
            case 214:
               var10000 = 205;
               break;
            case 215:
               var10000 = 146;
               break;
            case 216:
               var10000 = 110;
               break;
            case 217:
               var10000 = 131;
               break;
            case 218:
               var10000 = 87;
               break;
            case 219:
               var10000 = 179;
               break;
            case 220:
               var10000 = 109;
               break;
            case 221:
               var10000 = 114;
               break;
            case 222:
               var10000 = 40;
               break;
            case 223:
               var10000 = 55;
               break;
            case 224:
               var10000 = 208;
               break;
            case 225:
               var10000 = 166;
               break;
            case 226:
               var10000 = 17;
               break;
            case 227:
               var10000 = 128;
               break;
            case 228:
               var10000 = 253;
               break;
            case 229:
               var10000 = 49;
               break;
            case 230:
               var10000 = 255;
               break;
            case 231:
               var10000 = 99;
               break;
            case 232:
               var10000 = 218;
               break;
            case 233:
               var10000 = 206;
               break;
            case 234:
               var10000 = 85;
               break;
            case 235:
               var10000 = 152;
               break;
            case 236:
               var10000 = 63;
               break;
            case 237:
               var10000 = 26;
               break;
            case 238:
               var10000 = 35;
               break;
            case 239:
               var10000 = 133;
               break;
            case 240:
               var10000 = 248;
               break;
            case 241:
               var10000 = 3;
               break;
            case 242:
               var10000 = 97;
               break;
            case 243:
               var10000 = 20;
               break;
            case 244:
               var10000 = 32;
               break;
            case 245:
               var10000 = 126;
               break;
            case 246:
               var10000 = 224;
               break;
            case 247:
               var10000 = 213;
               break;
            case 248:
               var10000 = 77;
               break;
            case 249:
               var10000 = 51;
               break;
            case 250:
               var10000 = 12;
               break;
            case 251:
               var10000 = 48;
               break;
            case 252:
               var10000 = 83;
               break;
            case 253:
               var10000 = 207;
               break;
            case 254:
               var10000 = 180;
               break;
            default:
               var10000 = 237;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25968;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "B\fà¤Âè\u008fnÓÓ¡Úej\tm^(¸Ý\u0005\u001dv\u0007.U!AßWå\u00170[³!÷ÖÙ¢Ê\u001bCVö\u0093y~5Ñ#\bÐ¥Q\u001dÿý5g!ÃÀqé':L{²bK\u0096Hnâs\u0014%º3áÐÒú\u0013\"\u0080ñZ°ºÙ\t\u001f\u0082\u0096\r\u0090\u0089\u0096\u0015\u009cÔ\u0089\tæØ¼Ö\tE·B¬\u001d4ÌLA\u000e\u0007%éU4\u00ad.\u0089þ<Â]y\u0017Ä\\ÐÀ\"\u008fòG°\b";
      int var12 = "B\fà¤Âè\u008fnÓÓ¡Úej\tm^(¸Ý\u0005\u001dv\u0007.U!AßWå\u00170[³!÷ÖÙ¢Ê\u001bCVö\u0093y~5Ñ#\bÐ¥Q\u001dÿý5g!ÃÀqé':L{²bK\u0096Hnâs\u0014%º3áÐÒú\u0013\"\u0080ñZ°ºÙ\t\u001f\u0082\u0096\r\u0090\u0089\u0096\u0015\u009cÔ\u0089\tæØ¼Ö\tE·B¬\u001d4ÌLA\u000e\u0007%éU4\u00ad.\u0089þ<Â]y\u0017Ä\\ÐÀ\"\u008fòG°\b"
         .length();
      char var9 = 23;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 32;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 22;
                        break;
                     case 1:
                        var65 = 106;
                        break;
                     case 2:
                        var65 = 4;
                        break;
                     case 3:
                        var65 = 71;
                        break;
                     case 4:
                        var65 = 89;
                        break;
                     case 5:
                        var65 = 118;
                        break;
                     default:
                        var65 = 23;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     f = var13;
                     g = new String[9];
                     long var0 = 6057640519669434736L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "«ñ}à&\u0095ñYíøG\u0003\u0011(Àe\u0090L3ôÙX¯®\u000f \u008a\u000b\u00aduü\u009a°ý\u0082Ê¹B.´\u008cü\u008d\u001fÔ¬æÙë\u0094UÉúP.\t\u001eL\u009a\u0085¦\u008b\u008b>";
                     int var5 = "«ñ}à&\u0095ñYíøG\u0003\u0011(Àe\u0090L3ôÙX¯®\u000f \u008a\u000b\u00aduü\u009a°ý\u0082Ê¹B.´\u008cü\u008d\u001fÔ¬æÙë\u0094UÉúP.\t\u001eL\u009a\u0085¦\u008b\u008b>"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    h = var6;
                                    i = new Integer[10];
                                    G = new Vector();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "«92C\u0083u\u0004Ã\u0084*àåLkUá";
                                 var5 = "«92C\u0083u\u0004Ã\u0084*àåLkUá".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "3Gv\u0007ê·ß+¯\u008fJarÐL³6Íæ.ÍÄW\u0014F¬î0Cz1\u0083Ä½uáØ\u0099¥â\u0006\u008asg";
                  var12 = "3Gv\u0007ê·ß+¯\u008fJarÐL³6Íæ.ÍÄW\u0014F¬î0Cz1\u0083Ä½uáØ\u0099¥â\u0006\u008asg".length();
                  var9 = 23;
                  var17 = -1;
            }

            var10000 = 37;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






