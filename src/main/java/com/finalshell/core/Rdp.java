package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Rdp {
   WI I = null;
   public int w = 0;
   int y;
   UR F;
   Connect2 Z;
   boolean u;
   Object e;
   boolean T;
   public HashMap J;
   boolean B;
   Object W;
   Object k;
   public InetAddress R;
   public int D;
   public int M;
   int K;
   boolean l;
   int Q;
   int q;
   int N;
   BR3 t;
   int V;
   static Random C;
   long i;
   boolean s;
   boolean G;
   static int m;
   Object z;
   public static String[] a;
   public static String[] b;
   public static long c;
   public static long d;

   static {
      __vfClinit__();
   }

   Rdp(UR var1) {
      this.y = (int)c;
      this.Z = null;
      this.u = false;
      this.e = new Object();
      this.T = false;
      this.J = new HashMap();
      this.B = false;
      this.W = new Object();
      this.k = new Object();
      this.M = 0;
      this.K = -1;
      this.l = false;
      this.Q = 0;
      this.q = -1;
      this.N = 0;
      this.V = 0;
      this.i = d;
      this.s = false;
      this.G = false;
      this.z = new Object();
      this.F = var1;
      this.t = new BR3(var1);
      this.Z = var1.e;
      this.R = var1.s;
      this.D = var1.f;
   }

   void i(byte[] param1, int param2, int param3) throws PV, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/finalshell/core/Yh2.e I
      // 03: istore 5
      // 05: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 08: iload 3
      // 09: iload 5
      // 0b: idiv
      // 0c: istore 6
      // 0e: astore 4
      // 10: iload 3
      // 11: iload 5
      // 13: irem
      // 14: aload 4
      // 16: ifnull 28
      // 19: ifeq 26
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: iinc 6 1
      // 26: iload 6
      // 28: aload 4
      // 2a: ifnull 3c
      // 2d: ifne 3a
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush 1
      // 38: istore 6
      // 3a: iload 5
      // 3c: istore 7
      // 3e: iload 3
      // 3f: aload 4
      // 41: ifnull 6b
      // 44: iload 7
      // 46: if_icmpgt 63
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 1
      // 52: bipush 0
      // 53: iload 3
      // 54: invokevirtual com/finalshell/core/Rdp.Y ([BII)V
      // 57: aload 4
      // 59: ifnonnull ba
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: bipush 0
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: istore 8
      // 6d: aload 4
      // 6f: ifnonnull b3
      // 72: iload 7
      // 74: newarray 8
      // 76: astore 9
      // 78: aload 1
      // 79: iload 2
      // 7a: aload 9
      // 7c: bipush 0
      // 7d: iload 7
      // 7f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 82: aload 0
      // 83: aload 9
      // 85: bipush 0
      // 86: aload 9
      // 88: arraylength
      // 89: invokevirtual com/finalshell/core/Rdp.Y ([BII)V
      // 8c: iload 2
      // 8d: iload 5
      // 8f: iadd
      // 90: istore 2
      // 91: iload 2
      // 92: iload 7
      // 94: iadd
      // 95: iload 3
      // 96: aload 4
      // 98: ifnull ad
      // 9b: if_icmple b0
      // 9e: iload 3
      // 9f: iload 6
      // a1: bipush 1
      // a2: isub
      // a3: iload 5
      // a5: imul
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: isub
      // ae: istore 7
      // b0: iinc 8 1
      // b3: iload 8
      // b5: iload 6
      // b7: if_icmplt 72
      // ba: return
   }

   void Y(byte[] param1, int param2, int param3) throws PV, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/core/Rdp.s Z
      // 009: aload 4
      // 00b: ifnull 023
      // 00e: ifne 15f
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: getfield com/finalshell/core/Rdp.G Z
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: ifne 14a
      // 026: new com/finalshell/core/WI
      // 029: dup
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/Rdp.M I
      // 02e: aload 1
      // 02f: bipush 0
      // 030: iload 3
      // 031: i2s
      // 032: aload 0
      // 033: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 036: getfield com/finalshell/core/UR.v I
      // 039: aload 0
      // 03a: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 03d: getfield com/finalshell/core/UR.Y Lcom/finalshell/crypto/PingMessageR;
      // 040: getfield com/finalshell/crypto/PingMessageR.q I
      // 043: invokespecial com/finalshell/core/WI.<init> (I[BISII)V
      // 046: astore 5
      // 048: aload 5
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Rdp.R Ljava/net/InetAddress;
      // 04e: invokevirtual com/finalshell/core/WI.K (Ljava/net/InetAddress;)V
      // 051: aload 5
      // 053: aload 0
      // 054: getfield com/finalshell/core/Rdp.D I
      // 057: invokevirtual com/finalshell/core/WI.S (I)V
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/Rdp.z Ljava/lang/Object;
      // 05e: dup
      // 05f: astore 6
      // 061: monitorenter
      // 062: aload 0
      // 063: getfield com/finalshell/core/Rdp.J Ljava/util/HashMap;
      // 066: aload 5
      // 068: invokevirtual com/finalshell/core/WI.D ()I
      // 06b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06e: aload 5
      // 070: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 073: pop
      // 074: aload 6
      // 076: monitorexit
      // 077: goto 07e
      // 07a: aload 6
      // 07c: monitorexit
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/Rdp.k Ljava/lang/Object;
      // 082: dup
      // 083: astore 6
      // 085: monitorenter
      // 086: aload 0
      // 087: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 08a: getfield com/finalshell/core/UR.e Lcom/finalshell/core/Connect2;
      // 08d: aload 4
      // 08f: ifnull 0ad
      // 092: invokevirtual com/finalshell/core/Connect2.E ()Z
      // 095: ifne 0ab
      // 098: aload 0
      // 099: getfield com/finalshell/core/Rdp.k Ljava/lang/Object;
      // 09c: invokevirtual java/lang/Object.wait ()V
      // 09f: goto 0ab
      // 0a2: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: astore 7
      // 0a8: aload 7
      // 0aa: athrow
      // 0ab: aload 6
      // 0ad: monitorexit
      // 0ae: goto 0b5
      // 0b1: aload 6
      // 0b3: monitorexit
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: istore 6
      // 0b8: getstatic com/finalshell/core/Yh2.R Z
      // 0bb: aload 4
      // 0bd: ifnull 0d0
      // 0c0: ifeq 0cd
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: bipush 1
      // 0cb: istore 6
      // 0cd: getstatic com/finalshell/core/Yh2.p Z
      // 0d0: aload 4
      // 0d2: ifnull 123
      // 0d5: ifeq 0fe
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 5
      // 0e1: invokevirtual com/finalshell/core/WI.D ()I
      // 0e4: bipush 5
      // 0e5: aload 4
      // 0e7: ifnull 122
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: if_icmpgt 0fe
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: bipush 1
      // 0fc: istore 6
      // 0fe: aload 0
      // 0ff: aload 5
      // 101: bipush 0
      // 102: iload 6
      // 104: bipush 1
      // 105: invokevirtual com/finalshell/core/Rdp.v (Lcom/finalshell/core/WI;ZZZ)V
      // 108: aload 0
      // 109: invokestatic java/lang/System.currentTimeMillis ()J
      // 10c: putfield com/finalshell/core/Rdp.i J
      // 10f: aload 0
      // 110: dup
      // 111: getfield com/finalshell/core/Rdp.K I
      // 114: bipush 1
      // 115: iadd
      // 116: putfield com/finalshell/core/Rdp.K I
      // 119: getstatic com/finalshell/core/Rdp.m I
      // 11c: aload 5
      // 11e: invokevirtual com/finalshell/core/WI.G ()[B
      // 121: arraylength
      // 122: iadd
      // 123: putstatic com/finalshell/core/Rdp.m I
      // 126: aload 0
      // 127: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 12a: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // 12d: getfield com/finalshell/core/B2.x Lcom/finalshell/task/Mo2;
      // 130: aload 0
      // 131: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 134: aload 0
      // 135: getfield com/finalshell/core/Rdp.M I
      // 138: invokevirtual com/finalshell/task/Mo2.T (Lcom/finalshell/core/UR;I)V
      // 13b: aload 0
      // 13c: dup
      // 13d: getfield com/finalshell/core/Rdp.M I
      // 140: bipush 1
      // 141: iadd
      // 142: putfield com/finalshell/core/Rdp.M I
      // 145: aload 4
      // 147: ifnonnull 170
      // 14a: new com/finalshell/core/PV
      // 14d: dup
      // 14e: sipush -24950
      // 151: sipush 32500
      // 154: invokestatic com/finalshell/core/Rdp.a (II)Ljava/lang/String;
      // 157: invokespecial com/finalshell/core/PV.<init> (Ljava/lang/String;)V
      // 15a: athrow
      // 15b: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: new com/finalshell/core/PV
      // 162: dup
      // 163: sipush -24949
      // 166: sipush -15697
      // 169: invokestatic com/finalshell/core/Rdp.a (II)Ljava/lang/String;
      // 16c: invokespecial com/finalshell/core/PV.<init> (Ljava/lang/String;)V
      // 16f: athrow
      // 170: return
   }

   public void z() {
      Rdp var2;
      label24: {
         String[] var1 = PingMessageR.N();
         boolean var10000 = this.G;
         if (var1 != null) {
            if (this.G) {
               return;
            }

            this.G = true;
            this.F.e.F();
            var2 = this;
            if (var1 == null) {
               break label24;
            }

            var10000 = this.F.H;
         }

         if (var10000) {
            return;
         }

         var2 = this;
      }

      var2.U();
   }

   public void d() {
      String[] var1 = PingMessageR.N();
      Rdp var10000 = this;
      if (var1 != null) {
         if (this.G) {
            return;
         }

         var10000 = this;
      }

      var10000.G = true;
   }

   void v(WI param1, boolean param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 07: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // 0a: invokevirtual com/finalshell/core/B2.R ()Ljava/lang/Object;
      // 0d: dup
      // 0e: astore 6
      // 10: monitorenter
      // 11: astore 5
      // 13: invokestatic java/lang/System.nanoTime ()J
      // 16: lstore 7
      // 18: aload 0
      // 19: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 1c: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 23: invokevirtual com/finalshell/core/B2.J (Lcom/finalshell/core/UR;)V
      // 26: aload 1
      // 27: bipush 0
      // 28: invokevirtual com/finalshell/core/WI.F (I)V
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokevirtual com/finalshell/core/WI.H ()Ljava/net/DatagramPacket;
      // 30: invokevirtual com/finalshell/core/Rdp.i (Ljava/net/DatagramPacket;)V
      // 33: iload 3
      // 34: aload 5
      // 36: ifnull 4d
      // 39: ifeq 4b
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual com/finalshell/core/WI.H ()Ljava/net/DatagramPacket;
      // 41: invokevirtual com/finalshell/core/Rdp.i (Ljava/net/DatagramPacket;)V
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: iload 4
      // 4d: aload 5
      // 4f: ifnull 8a
      // 52: ifeq 74
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 60: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // 63: lload 7
      // 65: aload 1
      // 66: invokevirtual com/finalshell/core/WI.G ()[B
      // 69: arraylength
      // 6a: invokevirtual com/finalshell/core/B2.z (JI)V
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 0
      // 75: getfield com/finalshell/core/Rdp.F Lcom/finalshell/core/UR;
      // 78: getfield com/finalshell/core/UR.Y Lcom/finalshell/crypto/PingMessageR;
      // 7b: aload 5
      // 7d: ifnull bb
      // 80: getfield com/finalshell/crypto/PingMessageR.g I
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/Rdp.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: getstatic com/finalshell/crypto/PingMessageR.w I
      // 8d: if_icmpne b9
      // 90: new com/finalshell/core/Uy2
      // 93: dup
      // 94: ldc_w ""
      // 97: getstatic com/finalshell/core/Rdp.C Ljava/util/Random;
      // 9a: invokevirtual java/util/Random.nextLong ()J
      // 9d: aload 1
      // 9e: invokevirtual com/finalshell/core/WI.G ()[B
      // a1: arraylength
      // a2: getstatic com/finalshell/core/Uy2.T I
      // a5: invokespecial com/finalshell/core/Uy2.<init> (Ljava/lang/String;JII)V
      // a8: astore 9
      // aa: aload 9
      // ac: invokestatic com/finalshell/crypto/PingMessageR.V (Lcom/finalshell/core/Uy2;)V
      // af: goto b9
      // b2: astore 9
      // b4: aload 9
      // b6: invokevirtual java/io/IOException.printStackTrace ()V
      // b9: aload 6
      // bb: monitorexit
      // bc: goto c3
      // bf: aload 6
      // c1: monitorexit
      // c2: athrow
      // c3: return
   }

   void e$void(int var1) {
      this.F.Y.Q.Q(this.F, var1);
   }

   void N() {
      this.F.Y.Q.u(this.F);
   }

   WI e$WI(int var1) {
      return (WI)this.J.get(var1);
   }

   public void u(int var1, int var2) {
      String[] var3 = PingMessageR.N();
      HashMap var10000 = this.J;
      Integer var10001 = var1;
      if (var3 != null) {
         if (!var10000.containsKey(var10001)) {
            return;
         }

         var10000 = this.J;
         var10001 = var1;
      }

      WI var4 = (WI)var10000.get(var10001);
      if (var3 != null) {
         if (var4 == null) {
            return;
         }

         this.v(var4, true, false, true);
      }

      int var5 = (Yh2.n) ? 1 : 0;
      if (var3 != null) {
         if (!Yh2.n) {
            return;
         }

         var5 = var2;
      }

      if (var5 <= 1) {
         this.v(var4, true, false, true);
      }
   }

   public void w() {
      synchronized (this.z) {
         this.J.clear();
      }
   }

   void b(int var1) {
      synchronized (this.z) {
         WI var3 = (WI)this.J.remove(var1);
      }
   }

   void h() {
      synchronized (this.k) {
         this.k.notifyAll();
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void V() {
      String[] var10000 = PingMessageR.N();
      Object var2 = this.k;
      synchronized (this.k){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         this.k.notifyAll();
         // $VF: monitorexit
      } catch (Throwable var4) {
         // $VF: monitorexit
         throw var4;
      }

      Rdp var5 = this;
      if (var1 != null) {
         if (this.s) {
            return;
         }

         var5 = this;
      }

      var5.s = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   void U() {
      String[] var10000 = PingMessageR.N();
      W3 var2 = new W3(this.F.v, this.F.Y.q, this.M);
      var2.K(this.R);
      var2.S(this.D);
      String[] var1 = var10000;
      int var3 = 0;
      if (var1 == null) {
         try {
            this.i(var2.H());
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         var3++;
      }

      while (true) {
         for (; var3 < 4; var3++) {
            try {
               this.i(var2.H());
            } catch (IOException var5) {
               var5.printStackTrace();
            }
         }

         if (var1 != null) {
            return;
         }

         var3++;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   void F() {
      String[] var10000 = PingMessageR.N();
      WJ var2 = new WJ(this.F.v, this.F.Y.q);
      String[] var1 = var10000;
      var2.K(this.R);
      var2.S(this.D);
      int var3 = 0;
      if (var1 == null) {
         try {
            this.i(var2.H());
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         var3++;
      }

      while (true) {
         for (; var3 < 4; var3++) {
            try {
               this.i(var2.H());
            } catch (IOException var5) {
               var5.printStackTrace();
            }
         }

         if (var1 != null) {
            return;
         }

         var3++;
      }
   }

   void s(ArrayList var1) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = this.F.e.R();
      W0 var5 = new W0(this.F.C, var1, this.F.e.k, var4, this.F.v, this.F.Y.q);
      var5.K(this.R);
      var5.S(this.D);

      try {
         this.i(var5.H());
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   void i(DatagramPacket var1) throws IOException {
      this.r(var1, this.F.v);
   }

   public void r(DatagramPacket var1, Integer var2) throws IOException {
      this.F.B.P(var1);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -24950) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 254;
               break;
            case 1:
               var10000 = 90;
               break;
            case 2:
               var10000 = 37;
               break;
            case 3:
               var10000 = 195;
               break;
            case 4:
               var10000 = 237;
               break;
            case 5:
               var10000 = 25;
               break;
            case 6:
               var10000 = 235;
               break;
            case 7:
               var10000 = 208;
               break;
            case 8:
               var10000 = 125;
               break;
            case 9:
               var10000 = 251;
               break;
            case 10:
               var10000 = 245;
               break;
            case 11:
               var10000 = 133;
               break;
            case 12:
               var10000 = 38;
               break;
            case 13:
               var10000 = 168;
               break;
            case 14:
               var10000 = 12;
               break;
            case 15:
               var10000 = 167;
               break;
            case 16:
               var10000 = 101;
               break;
            case 17:
               var10000 = 200;
               break;
            case 18:
               var10000 = 187;
               break;
            case 19:
               var10000 = 110;
               break;
            case 20:
               var10000 = 179;
               break;
            case 21:
               var10000 = 10;
               break;
            case 22:
               var10000 = 43;
               break;
            case 23:
               var10000 = 156;
               break;
            case 24:
               var10000 = 226;
               break;
            case 25:
               var10000 = 120;
               break;
            case 26:
               var10000 = 150;
               break;
            case 27:
               var10000 = 189;
               break;
            case 28:
               var10000 = 14;
               break;
            case 29:
               var10000 = 48;
               break;
            case 30:
               var10000 = 9;
               break;
            case 31:
               var10000 = 26;
               break;
            case 32:
               var10000 = 13;
               break;
            case 33:
               var10000 = 73;
               break;
            case 34:
               var10000 = 155;
               break;
            case 35:
               var10000 = 143;
               break;
            case 36:
               var10000 = 123;
               break;
            case 37:
               var10000 = 207;
               break;
            case 38:
               var10000 = 198;
               break;
            case 39:
               var10000 = 217;
               break;
            case 40:
               var10000 = 247;
               break;
            case 41:
               var10000 = 84;
               break;
            case 42:
               var10000 = 202;
               break;
            case 43:
               var10000 = 40;
               break;
            case 44:
               var10000 = 191;
               break;
            case 45:
               var10000 = 8;
               break;
            case 46:
               var10000 = 39;
               break;
            case 47:
               var10000 = 76;
               break;
            case 48:
               var10000 = 145;
               break;
            case 49:
               var10000 = 88;
               break;
            case 50:
               var10000 = 91;
               break;
            case 51:
               var10000 = 42;
               break;
            case 52:
               var10000 = 103;
               break;
            case 53:
               var10000 = 132;
               break;
            case 54:
               var10000 = 219;
               break;
            case 55:
               var10000 = 124;
               break;
            case 56:
               var10000 = 19;
               break;
            case 57:
               var10000 = 87;
               break;
            case 58:
               var10000 = 51;
               break;
            case 59:
               var10000 = 180;
               break;
            case 60:
               var10000 = 96;
               break;
            case 61:
               var10000 = 182;
               break;
            case 62:
               var10000 = 227;
               break;
            case 63:
               var10000 = 64;
               break;
            case 64:
               var10000 = 253;
               break;
            case 65:
               var10000 = 236;
               break;
            case 66:
               var10000 = 49;
               break;
            case 67:
               var10000 = 240;
               break;
            case 68:
               var10000 = 242;
               break;
            case 69:
               var10000 = 252;
               break;
            case 70:
               var10000 = 144;
               break;
            case 71:
               var10000 = 186;
               break;
            case 72:
               var10000 = 146;
               break;
            case 73:
               var10000 = 3;
               break;
            case 74:
               var10000 = 199;
               break;
            case 75:
               var10000 = 2;
               break;
            case 76:
               var10000 = 157;
               break;
            case 77:
               var10000 = 255;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 194;
               break;
            case 81:
               var10000 = 21;
               break;
            case 82:
               var10000 = 83;
               break;
            case 83:
               var10000 = 220;
               break;
            case 84:
               var10000 = 126;
               break;
            case 85:
               var10000 = 23;
               break;
            case 86:
               var10000 = 95;
               break;
            case 87:
               var10000 = 99;
               break;
            case 88:
               var10000 = 249;
               break;
            case 89:
               var10000 = 129;
               break;
            case 90:
               var10000 = 98;
               break;
            case 91:
               var10000 = 63;
               break;
            case 92:
               var10000 = 135;
               break;
            case 93:
               var10000 = 5;
               break;
            case 94:
               var10000 = 188;
               break;
            case 95:
               var10000 = 193;
               break;
            case 96:
               var10000 = 113;
               break;
            case 97:
               var10000 = 46;
               break;
            case 98:
               var10000 = 232;
               break;
            case 99:
               var10000 = 102;
               break;
            case 100:
               var10000 = 216;
               break;
            case 101:
               var10000 = 16;
               break;
            case 102:
               var10000 = 203;
               break;
            case 103:
               var10000 = 209;
               break;
            case 104:
               var10000 = 170;
               break;
            case 105:
               var10000 = 107;
               break;
            case 106:
               var10000 = 97;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 213;
               break;
            case 109:
               var10000 = 70;
               break;
            case 110:
               var10000 = 223;
               break;
            case 111:
               var10000 = 153;
               break;
            case 112:
               var10000 = 162;
               break;
            case 113:
               var10000 = 53;
               break;
            case 114:
               var10000 = 158;
               break;
            case 115:
               var10000 = 225;
               break;
            case 116:
               var10000 = 112;
               break;
            case 117:
               var10000 = 178;
               break;
            case 118:
               var10000 = 44;
               break;
            case 119:
               var10000 = 233;
               break;
            case 120:
               var10000 = 67;
               break;
            case 121:
               var10000 = 71;
               break;
            case 122:
               var10000 = 117;
               break;
            case 123:
               var10000 = 45;
               break;
            case 124:
               var10000 = 106;
               break;
            case 125:
               var10000 = 138;
               break;
            case 126:
               var10000 = 62;
               break;
            case 127:
               var10000 = 222;
               break;
            case 128:
               var10000 = 66;
               break;
            case 129:
               var10000 = 160;
               break;
            case 130:
               var10000 = 206;
               break;
            case 131:
               var10000 = 36;
               break;
            case 132:
               var10000 = 52;
               break;
            case 133:
               var10000 = 214;
               break;
            case 134:
               var10000 = 171;
               break;
            case 135:
               var10000 = 234;
               break;
            case 136:
               var10000 = 29;
               break;
            case 137:
               var10000 = 41;
               break;
            case 138:
               var10000 = 174;
               break;
            case 139:
               var10000 = 104;
               break;
            case 140:
               var10000 = 61;
               break;
            case 141:
               var10000 = 212;
               break;
            case 142:
               var10000 = 154;
               break;
            case 143:
               var10000 = 241;
               break;
            case 144:
               var10000 = 0;
               break;
            case 145:
               var10000 = 204;
               break;
            case 146:
               var10000 = 82;
               break;
            case 147:
               var10000 = 130;
               break;
            case 148:
               var10000 = 114;
               break;
            case 149:
               var10000 = 111;
               break;
            case 150:
               var10000 = 85;
               break;
            case 151:
               var10000 = 75;
               break;
            case 152:
               var10000 = 183;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 201;
               break;
            case 155:
               var10000 = 127;
               break;
            case 156:
               var10000 = 11;
               break;
            case 157:
               var10000 = 197;
               break;
            case 158:
               var10000 = 239;
               break;
            case 159:
               var10000 = 6;
               break;
            case 160:
               var10000 = 136;
               break;
            case 161:
               var10000 = 196;
               break;
            case 162:
               var10000 = 68;
               break;
            case 163:
               var10000 = 192;
               break;
            case 164:
               var10000 = 33;
               break;
            case 165:
               var10000 = 230;
               break;
            case 166:
               var10000 = 1;
               break;
            case 167:
               var10000 = 231;
               break;
            case 168:
               var10000 = 47;
               break;
            case 169:
               var10000 = 94;
               break;
            case 170:
               var10000 = 137;
               break;
            case 171:
               var10000 = 34;
               break;
            case 172:
               var10000 = 131;
               break;
            case 173:
               var10000 = 244;
               break;
            case 174:
               var10000 = 243;
               break;
            case 175:
               var10000 = 121;
               break;
            case 176:
               var10000 = 148;
               break;
            case 177:
               var10000 = 169;
               break;
            case 178:
               var10000 = 175;
               break;
            case 179:
               var10000 = 60;
               break;
            case 180:
               var10000 = 86;
               break;
            case 181:
               var10000 = 176;
               break;
            case 182:
               var10000 = 108;
               break;
            case 183:
               var10000 = 55;
               break;
            case 184:
               var10000 = 164;
               break;
            case 185:
               var10000 = 248;
               break;
            case 186:
               var10000 = 228;
               break;
            case 187:
               var10000 = 173;
               break;
            case 188:
               var10000 = 89;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 177;
               break;
            case 191:
               var10000 = 100;
               break;
            case 192:
               var10000 = 122;
               break;
            case 193:
               var10000 = 185;
               break;
            case 194:
               var10000 = 250;
               break;
            case 195:
               var10000 = 109;
               break;
            case 196:
               var10000 = 184;
               break;
            case 197:
               var10000 = 81;
               break;
            case 198:
               var10000 = 65;
               break;
            case 199:
               var10000 = 205;
               break;
            case 200:
               var10000 = 215;
               break;
            case 201:
               var10000 = 134;
               break;
            case 202:
               var10000 = 78;
               break;
            case 203:
               var10000 = 119;
               break;
            case 204:
               var10000 = 77;
               break;
            case 205:
               var10000 = 142;
               break;
            case 206:
               var10000 = 74;
               break;
            case 207:
               var10000 = 172;
               break;
            case 208:
               var10000 = 28;
               break;
            case 209:
               var10000 = 31;
               break;
            case 210:
               var10000 = 165;
               break;
            case 211:
               var10000 = 54;
               break;
            case 212:
               var10000 = 27;
               break;
            case 213:
               var10000 = 151;
               break;
            case 214:
               var10000 = 211;
               break;
            case 215:
               var10000 = 116;
               break;
            case 216:
               var10000 = 59;
               break;
            case 217:
               var10000 = 7;
               break;
            case 218:
               var10000 = 118;
               break;
            case 219:
               var10000 = 80;
               break;
            case 220:
               var10000 = 210;
               break;
            case 221:
               var10000 = 149;
               break;
            case 222:
               var10000 = 238;
               break;
            case 223:
               var10000 = 140;
               break;
            case 224:
               var10000 = 4;
               break;
            case 225:
               var10000 = 56;
               break;
            case 226:
               var10000 = 139;
               break;
            case 227:
               var10000 = 190;
               break;
            case 228:
               var10000 = 152;
               break;
            case 229:
               var10000 = 161;
               break;
            case 230:
               var10000 = 93;
               break;
            case 231:
               var10000 = 246;
               break;
            case 232:
               var10000 = 15;
               break;
            case 233:
               var10000 = 22;
               break;
            case 234:
               var10000 = 18;
               break;
            case 235:
               var10000 = 50;
               break;
            case 236:
               var10000 = 35;
               break;
            case 237:
               var10000 = 20;
               break;
            case 238:
               var10000 = 58;
               break;
            case 239:
               var10000 = 224;
               break;
            case 240:
               var10000 = 92;
               break;
            case 241:
               var10000 = 229;
               break;
            case 242:
               var10000 = 218;
               break;
            case 243:
               var10000 = 69;
               break;
            case 244:
               var10000 = 181;
               break;
            case 245:
               var10000 = 105;
               break;
            case 246:
               var10000 = 24;
               break;
            case 247:
               var10000 = 79;
               break;
            case 248:
               var10000 = 115;
               break;
            case 249:
               var10000 = 57;
               break;
            case 250:
               var10000 = 163;
               break;
            case 251:
               var10000 = 128;
               break;
            case 252:
               var10000 = 32;
               break;
            case 253:
               var10000 = 221;
               break;
            case 254:
               var10000 = 166;
               break;
            default:
               var10000 = 147;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u009d|\u009a輭捔崻斣必O¼*ÂËDÏô\ty\u0007\u0006轂揇巖纳儋闽";
      int var8 = "\u009d|\u009a輭捔崻斣必O¼*ÂËDÏô\ty\u0007\u0006轂揇巖纳儋闽".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var6.substring(++var4, var4 + var5).toCharArray();
            int var10004 = var10003.length;
            int var10 = 0;
            byte var21 = 54;
            var10002 = var10003;
            int var12 = var10004;
            byte var24;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var24 = 54;
               var10006 = var10;
            } else {
               var21 = 54;
               var12 = var10004;
               if (var10004 <= var10) {
                  break label38;
               }

               var10005 = var10003;
               var24 = 54;
               var10006 = var10;
            }

            while (true) {
               char var36 = var10005[var10006];
               byte var37;
               switch (var10 % 7) {
                  case 0:
                     var37 = 92;
                     break;
                  case 1:
                     var37 = 33;
                     break;
                  case 2:
                     var37 = 26;
                     break;
                  case 3:
                     var37 = 100;
                     break;
                  case 4:
                     var37 = 75;
                     break;
                  case 5:
                     var37 = 21;
                     break;
                  default:
                     var37 = 12;
               }

               var10005[var10006] = (char)(var36 ^ var24 ^ var37);
               var10++;
               if (var21 == 0) {
                  var10006 = var21;
                  var10005 = var10002;
                  var24 = var21;
               } else {
                  if (var12 <= var10) {
                     break;
                  }

                  var10005 = var10002;
                  var24 = var21;
                  var10006 = var10;
               }
            }
         }

         String var23 = new String(var10002).intern();
         byte var14 = -1;
         var9[var7++] = var23;
         if ((var4 += var5) >= var8) {
            a = var9;
            b = new String[2];
            long var2 = 3286998495121616705L;
            long var19 = 1025758631082569509L ^ var2;
            var14 = -1;
            c = var19;
            long var0 = 3006239151296201487L;
            long var20 = -3006239151296201488L ^ var0;
            var14 = -1;
            d = var20;
            C = new Random();
            m = 0;
            return;
         }

         var5 = var6.charAt(var4);
      }
   }
}





