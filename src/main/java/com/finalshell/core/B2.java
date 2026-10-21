package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import com.finalshell.task.Mo2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class B2 {
   int O;
   Object P = new Object();
   long t = 0L;
   int G = a(28572, 1782366320909803639L);
   int u = this.G;
   int T = this.u;
   int H = -1;
   Object Q = new Object();
   long v = 0L;
   long W = 0L;
   long A;
   long J = System.currentTimeMillis();
   Random n = new Random();
   HashMap F = new HashMap();
   public int E = a(18285, 6620142799166425219L);
   int D = -1;
   long d;
   long M;
   int X = 0;
   PingMessageR V;
   InetAddress U;
   int y;
   public HashMap k = new HashMap();
   public HashMap h = new HashMap();
   Object w = new Object();
   Object e = new Object();
   public Mo2 x;
   boolean m = false;
   int C;
   int Z = Yh2.D;
   Object l = new Object();
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] f;
   public static long[] g;
   public static Long[] i;

   B2(PingMessageR var1, int var2, InetAddress var3, int var4) {
      this.x = new Mo2();
      this.O = var2;
      this.V = var1;
      this.U = var3;
      this.y = var4;
   }

   public void f(DatagramPacket var1) {
      String[] var10000 = PingMessageR.N();
      byte[] var3 = var1.getData();
      String[] var2 = var10000;
      int var4 = 0;
      var4 = CA3.m(var1);
      int var5 = LH3_2.z(var3, a(20666, 8019518855206231891L));
      int var15 = var4;
      short var10001 = D6.G;
      if (var2 != null) {
         if (var4 == D6.G) {
            Wk2 var6 = new Wk2(var1);
            this.D(var6.V(), var1.getAddress(), var1.getPort());
            this.T = var6.t() * a(27765, 5246059281212171167L);
            if (var2 != null) {
               return;
            }
         }

         var15 = var4;
         var10001 = D6.nJ;
      }

      if (var15 == var10001) {
         Wo2 var14 = new Wo2(var1);
         long var7 = this.J;
         this.J = System.currentTimeMillis();
         Long var9 = (Long)this.F.get(var14.m());
         if (var2 != null) {
            if (var9 == null) {
               return;
            }

            this.E = (int)(System.currentTimeMillis() - var9);
         }

         String var10;
         label26: {
            label25: {
               var10 = "";
               if (var2 != null) {
                  if (!this.V.k()) {
                     break label25;
                  }

                  var10 = a(-7663, 31913);
               }

               if (var2 != null) {
                  break label26;
               }
            }

            var10 = a(-7662, 15195);
         }

         long var11 = (System.currentTimeMillis() - var7) / b(28362, 7458193808466825844L);
         Jy2.g(a(-7661, -23500) + var10 + " " + this.E + a(-7660, 23858) + var11 + " " + var1.getAddress().getHostAddress() + ":" + var1.getPort());
      }
   }

   boolean y() {
      this.K();
      String[] var10000 = PingMessageR.N();
      byte var2 = 0;
      String[] var1 = var10000;
      int var3 = this.C;
      if (var1 != null) {
         if (this.C < this.Z) {
            var2 = 1;
         }

         Jy2.g(a(-7664, -18697) + var2 + " " + this.C + " " + (this.Z - this.C) + " " + this.Z);
         var3 = var2;
      }

      return var3 != 0;
   }

   void J() {
      synchronized (this.l) {
         this.l.notifyAll();
      }
   }

   void K() {
   }

   public void P(DatagramPacket var1) throws IOException {
      this.V.e(var1);
   }

   void z(UR var1) {
      synchronized (this.w) {
         this.k.put(var1.v, var1);
      }
   }

   void e(Qu2 var1) {
      synchronized (this.e) {
         this.h.put(var1.a, var1);
      }
   }

   void O(UR var1) {
      synchronized (this.w) {
         this.k.remove(var1.v);
      }
   }

   public void w() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 1
      // 02: putfield com/finalshell/core/B2.m Z
      // 05: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 08: aload 0
      // 09: getfield com/finalshell/core/B2.V Lcom/finalshell/crypto/PingMessageR;
      // 0c: getfield com/finalshell/crypto/PingMessageR.S Lcom/finalshell/core/Timeout;
      // 0f: aload 0
      // 10: getfield com/finalshell/core/B2.O I
      // 13: invokevirtual com/finalshell/core/Timeout.e (I)V
      // 16: astore 1
      // 17: aload 0
      // 18: getfield com/finalshell/core/B2.w Ljava/lang/Object;
      // 1b: dup
      // 1c: astore 2
      // 1d: monitorenter
      // 1e: aload 0
      // 1f: invokevirtual com/finalshell/core/B2.h$Iterator ()Ljava/util/Iterator;
      // 22: astore 3
      // 23: aload 1
      // 24: ifnonnull 4e
      // 27: aload 0
      // 28: getfield com/finalshell/core/B2.k Ljava/util/HashMap;
      // 2b: aload 3
      // 2c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 31: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 34: checkcast com/finalshell/core/UR
      // 37: astore 4
      // 39: aload 4
      // 3b: ifnull 4e
      // 3e: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 41: new com/finalshell/task/VE
      // 44: dup
      // 45: aload 0
      // 46: aload 4
      // 48: invokespecial com/finalshell/task/VE.<init> (Lcom/finalshell/core/B2;Lcom/finalshell/core/UR;)V
      // 4b: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 4e: aload 3
      // 4f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54: ifne 27
      // 57: aload 2
      // 58: monitorexit
      // 59: aload 1
      // 5a: ifnull 4e
      // 5d: goto 63
      // 60: aload 2
      // 61: monitorexit
      // 62: athrow
      // 63: return
   }

   Iterator h$Iterator() {
      Object var1 = null;
      synchronized (this.w) {
         return new com.finalshell.ui.model.GN(this.k.keySet().iterator());
      }
   }

   public void F(int var1) {
      this.D = var1;
   }

   public void J(UR var1) {
   }

   public void h$void() {
      int var1 = Math.abs(this.n.nextInt());
      long var2 = System.currentTimeMillis();
      this.F.put(var1, var2);
      this.A = System.currentTimeMillis();
      Wk2 var4 = new Wk2(0, this.V.q, var1, PingMessageR.A, PingMessageR.l);
      var4.K(this.U);
      var4.S(this.y);

      try {
         this.P(var4.H());
      } catch (IOException var6) {
      }
   }

   public void D(int var1, InetAddress var2, int var3) {
      Wo2 var4 = new Wo2(0, this.V.q, var1);
      var4.K(var2);
      var4.S(var3);

      try {
         this.P(var4.H());
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public void b(Wk2 var1) {
      String[] var2 = PingMessageR.N();
      B2 var10000 = this;
      if (var2 != null) {
         if (this.V.g != 2) {
            return;
         }

         var10000 = this;
      }

      var10000.T = var1.t() * a(16474, 8803193479454707634L);
   }

   public int v() {
      String[] var10000 = PingMessageR.N();
      long var2 = System.currentTimeMillis();
      String[] var1 = var10000;
      long var6;
      int var5 = (var6 = this.t - 0L) == 0L ? 0 : (var6 < 0L ? -1 : 1);
      if (var1 != null) {
         if (var5 == 0) {
            this.t = var2;
         }

         var5 = (int)((var2 - this.t) / b(28362, 7458193808466825844L));
      }

      return var5;
   }

   public int l(long var1) {
      return (int)((var1 - this.t) / b(14283, 7235391077982440310L));
   }

   void U() {
   }

   void A() {
   }

   public synchronized void z(long param1, int param3) {
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
      // 006: getfield com/finalshell/core/B2.V Lcom/finalshell/crypto/PingMessageR;
      // 009: getfield com/finalshell/crypto/PingMessageR.g I
      // 00c: aload 4
      // 00e: ifnull 030
      // 011: bipush 1
      // 012: if_icmpne 02a
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getstatic com/finalshell/crypto/PingMessageR.l I
      // 020: putfield com/finalshell/core/B2.T I
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/B2.v J
      // 02e: lconst_0
      // 02f: lcmp
      // 030: aload 4
      // 032: ifnull 070
      // 035: ifne 04b
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03e: athrow
      // 03f: aload 0
      // 040: lload 1
      // 041: putfield com/finalshell/core/B2.W J
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04a: athrow
      // 04b: aload 0
      // 04c: dup
      // 04d: getfield com/finalshell/core/B2.v J
      // 050: iload 3
      // 051: i2l
      // 052: ladd
      // 053: putfield com/finalshell/core/B2.v J
      // 056: aload 0
      // 057: getfield com/finalshell/core/B2.v J
      // 05a: aload 4
      // 05c: ifnull 08a
      // 05f: sipush 26040
      // 062: ldc2_w 7010554670540675335
      // 065: invokestatic com/finalshell/core/B2.b (IJ)J
      // 068: lcmp
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 06f: athrow
      // 070: ifle 169
      // 073: ldc_w 1.0E9
      // 076: aload 0
      // 077: getfield com/finalshell/core/B2.v J
      // 07a: l2f
      // 07b: fmul
      // 07c: aload 0
      // 07d: getfield com/finalshell/core/B2.T I
      // 080: i2f
      // 081: fdiv
      // 082: f2l
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 089: athrow
      // 08a: lstore 5
      // 08c: invokestatic java/lang/System.nanoTime ()J
      // 08f: aload 0
      // 090: getfield com/finalshell/core/B2.W J
      // 093: lsub
      // 094: lstore 7
      // 096: lload 7
      // 098: lload 5
      // 09a: aload 4
      // 09c: ifnull 0b5
      // 09f: lcmp
      // 0a0: ifge 164
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a9: athrow
      // 0aa: lload 5
      // 0ac: lload 7
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b4: athrow
      // 0b5: lsub
      // 0b6: lstore 9
      // 0b8: aload 0
      // 0b9: dup
      // 0ba: getfield com/finalshell/core/B2.d J
      // 0bd: lload 9
      // 0bf: ladd
      // 0c0: putfield com/finalshell/core/B2.d J
      // 0c3: aload 0
      // 0c4: getfield com/finalshell/core/B2.M J
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/core/B2.d J
      // 0cb: lsub
      // 0cc: lstore 11
      // 0ce: lload 11
      // 0d0: lconst_0
      // 0d1: aload 4
      // 0d3: ifnull 115
      // 0d6: lcmp
      // 0d7: ifle 10a
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e0: athrow
      // 0e1: lload 9
      // 0e3: lload 11
      // 0e5: aload 4
      // 0e7: ifnull 115
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f0: athrow
      // 0f1: lcmp
      // 0f2: ifgt 10a
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0fb: athrow
      // 0fc: lconst_0
      // 0fd: lstore 9
      // 0ff: aload 0
      // 100: dup
      // 101: getfield com/finalshell/core/B2.M J
      // 104: lload 9
      // 106: lsub
      // 107: putfield com/finalshell/core/B2.M J
      // 10a: lload 5
      // 10c: sipush 4271
      // 10f: ldc2_w 7232786824873683989
      // 112: invokestatic com/finalshell/core/B2.b (IJ)J
      // 115: ldiv
      // 116: lstore 13
      // 118: lload 5
      // 11a: sipush 15957
      // 11d: ldc2_w 3881339011018719977
      // 120: invokestatic com/finalshell/core/B2.b (IJ)J
      // 123: lrem
      // 124: l2i
      // 125: istore 15
      // 127: invokestatic java/lang/System.nanoTime ()J
      // 12a: lstore 16
      // 12c: lload 9
      // 12e: aload 4
      // 130: ifnull 162
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 15f
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/B2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 13e: athrow
      // 13f: lload 13
      // 141: iload 15
      // 143: invokestatic java/lang/Thread.sleep (JI)V
      // 146: goto 150
      // 149: astore 18
      // 14b: aload 18
      // 14d: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 150: aload 0
      // 151: dup
      // 152: getfield com/finalshell/core/B2.M J
      // 155: invokestatic java/lang/System.nanoTime ()J
      // 158: lload 16
      // 15a: lsub
      // 15b: ladd
      // 15c: putfield com/finalshell/core/B2.M J
      // 15f: invokestatic java/lang/System.nanoTime ()J
      // 162: lstore 18
      // 164: aload 0
      // 165: lconst_0
      // 166: putfield com/finalshell/core/B2.v J
      // 169: return
   }

   public Object R() {
      return this.P;
   }

   public void F(Object var1) {
      this.P = var1;
   }

   public void X(int var1) {
      this.O = var1;
   }

   public int p() {
      return this.D;
   }

   public void S(int var1) {
      this.D = var1;
      this.J = System.currentTimeMillis();
   }

   public long e() {
      return this.A;
   }

   public void w(long var1) {
      this.A = var1;
   }

   public long m() {
      return this.J;
   }

   public void T(long var1) {
      this.J = var1;
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -7664) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 212;
               break;
            case 2:
               var10000 = 63;
               break;
            case 3:
               var10000 = 202;
               break;
            case 4:
               var10000 = 77;
               break;
            case 5:
               var10000 = 169;
               break;
            case 6:
               var10000 = 74;
               break;
            case 7:
               var10000 = 59;
               break;
            case 8:
               var10000 = 210;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 72;
               break;
            case 11:
               var10000 = 223;
               break;
            case 12:
               var10000 = 14;
               break;
            case 13:
               var10000 = 85;
               break;
            case 14:
               var10000 = 152;
               break;
            case 15:
               var10000 = 174;
               break;
            case 16:
               var10000 = 132;
               break;
            case 17:
               var10000 = 76;
               break;
            case 18:
               var10000 = 4;
               break;
            case 19:
               var10000 = 209;
               break;
            case 20:
               var10000 = 124;
               break;
            case 21:
               var10000 = 18;
               break;
            case 22:
               var10000 = 215;
               break;
            case 23:
               var10000 = 104;
               break;
            case 24:
               var10000 = 254;
               break;
            case 25:
               var10000 = 126;
               break;
            case 26:
               var10000 = 178;
               break;
            case 27:
               var10000 = 181;
               break;
            case 28:
               var10000 = 55;
               break;
            case 29:
               var10000 = 82;
               break;
            case 30:
               var10000 = 49;
               break;
            case 31:
               var10000 = 67;
               break;
            case 32:
               var10000 = 110;
               break;
            case 33:
               var10000 = 109;
               break;
            case 34:
               var10000 = 44;
               break;
            case 35:
               var10000 = 75;
               break;
            case 36:
               var10000 = 65;
               break;
            case 37:
               var10000 = 89;
               break;
            case 38:
               var10000 = 226;
               break;
            case 39:
               var10000 = 28;
               break;
            case 40:
               var10000 = 149;
               break;
            case 41:
               var10000 = 10;
               break;
            case 42:
               var10000 = 61;
               break;
            case 43:
               var10000 = 69;
               break;
            case 44:
               var10000 = 243;
               break;
            case 45:
               var10000 = 54;
               break;
            case 46:
               var10000 = 43;
               break;
            case 47:
               var10000 = 189;
               break;
            case 48:
               var10000 = 52;
               break;
            case 49:
               var10000 = 162;
               break;
            case 50:
               var10000 = 252;
               break;
            case 51:
               var10000 = 221;
               break;
            case 52:
               var10000 = 12;
               break;
            case 53:
               var10000 = 131;
               break;
            case 54:
               var10000 = 230;
               break;
            case 55:
               var10000 = 167;
               break;
            case 56:
               var10000 = 34;
               break;
            case 57:
               var10000 = 93;
               break;
            case 58:
               var10000 = 128;
               break;
            case 59:
               var10000 = 84;
               break;
            case 60:
               var10000 = 118;
               break;
            case 61:
               var10000 = 228;
               break;
            case 62:
               var10000 = 141;
               break;
            case 63:
               var10000 = 37;
               break;
            case 64:
               var10000 = 247;
               break;
            case 65:
               var10000 = 41;
               break;
            case 66:
               var10000 = 3;
               break;
            case 67:
               var10000 = 96;
               break;
            case 68:
               var10000 = 114;
               break;
            case 69:
               var10000 = 23;
               break;
            case 70:
               var10000 = 240;
               break;
            case 71:
               var10000 = 79;
               break;
            case 72:
               var10000 = 188;
               break;
            case 73:
               var10000 = 249;
               break;
            case 74:
               var10000 = 219;
               break;
            case 75:
               var10000 = 208;
               break;
            case 76:
               var10000 = 165;
               break;
            case 77:
               var10000 = 180;
               break;
            case 78:
               var10000 = 204;
               break;
            case 79:
               var10000 = 182;
               break;
            case 80:
               var10000 = 105;
               break;
            case 81:
               var10000 = 227;
               break;
            case 82:
               var10000 = 97;
               break;
            case 83:
               var10000 = 140;
               break;
            case 84:
               var10000 = 187;
               break;
            case 85:
               var10000 = 179;
               break;
            case 86:
               var10000 = 95;
               break;
            case 87:
               var10000 = 71;
               break;
            case 88:
               var10000 = 70;
               break;
            case 89:
               var10000 = 38;
               break;
            case 90:
               var10000 = 6;
               break;
            case 91:
               var10000 = 60;
               break;
            case 92:
               var10000 = 51;
               break;
            case 93:
               var10000 = 232;
               break;
            case 94:
               var10000 = 184;
               break;
            case 95:
               var10000 = 197;
               break;
            case 96:
               var10000 = 133;
               break;
            case 97:
               var10000 = 233;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 102;
               break;
            case 101:
               var10000 = 135;
               break;
            case 102:
               var10000 = 116;
               break;
            case 103:
               var10000 = 8;
               break;
            case 104:
               var10000 = 225;
               break;
            case 105:
               var10000 = 81;
               break;
            case 106:
               var10000 = 101;
               break;
            case 107:
               var10000 = 145;
               break;
            case 108:
               var10000 = 207;
               break;
            case 109:
               var10000 = 30;
               break;
            case 110:
               var10000 = 199;
               break;
            case 111:
               var10000 = 80;
               break;
            case 112:
               var10000 = 125;
               break;
            case 113:
               var10000 = 39;
               break;
            case 114:
               var10000 = 64;
               break;
            case 115:
               var10000 = 251;
               break;
            case 116:
               var10000 = 222;
               break;
            case 117:
               var10000 = 119;
               break;
            case 118:
               var10000 = 146;
               break;
            case 119:
               var10000 = 191;
               break;
            case 120:
               var10000 = 103;
               break;
            case 121:
               var10000 = 161;
               break;
            case 122:
               var10000 = 253;
               break;
            case 123:
               var10000 = 136;
               break;
            case 124:
               var10000 = 21;
               break;
            case 125:
               var10000 = 220;
               break;
            case 126:
               var10000 = 155;
               break;
            case 127:
               var10000 = 157;
               break;
            case 128:
               var10000 = 90;
               break;
            case 129:
               var10000 = 235;
               break;
            case 130:
               var10000 = 130;
               break;
            case 131:
               var10000 = 17;
               break;
            case 132:
               var10000 = 159;
               break;
            case 133:
               var10000 = 177;
               break;
            case 134:
               var10000 = 138;
               break;
            case 135:
               var10000 = 205;
               break;
            case 136:
               var10000 = 27;
               break;
            case 137:
               var10000 = 245;
               break;
            case 138:
               var10000 = 108;
               break;
            case 139:
               var10000 = 213;
               break;
            case 140:
               var10000 = 42;
               break;
            case 141:
               var10000 = 203;
               break;
            case 142:
               var10000 = 236;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 46;
               break;
            case 145:
               var10000 = 151;
               break;
            case 146:
               var10000 = 172;
               break;
            case 147:
               var10000 = 68;
               break;
            case 148:
               var10000 = 192;
               break;
            case 149:
               var10000 = 5;
               break;
            case 150:
               var10000 = 120;
               break;
            case 151:
               var10000 = 185;
               break;
            case 152:
               var10000 = 47;
               break;
            case 153:
               var10000 = 229;
               break;
            case 154:
               var10000 = 117;
               break;
            case 155:
               var10000 = 121;
               break;
            case 156:
               var10000 = 24;
               break;
            case 157:
               var10000 = 13;
               break;
            case 158:
               var10000 = 144;
               break;
            case 159:
               var10000 = 113;
               break;
            case 160:
               var10000 = 122;
               break;
            case 161:
               var10000 = 36;
               break;
            case 162:
               var10000 = 193;
               break;
            case 163:
               var10000 = 153;
               break;
            case 164:
               var10000 = 32;
               break;
            case 165:
               var10000 = 156;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 195;
               break;
            case 168:
               var10000 = 40;
               break;
            case 169:
               var10000 = 196;
               break;
            case 170:
               var10000 = 173;
               break;
            case 171:
               var10000 = 176;
               break;
            case 172:
               var10000 = 123;
               break;
            case 173:
               var10000 = 94;
               break;
            case 174:
               var10000 = 248;
               break;
            case 175:
               var10000 = 206;
               break;
            case 176:
               var10000 = 214;
               break;
            case 177:
               var10000 = 57;
               break;
            case 178:
               var10000 = 139;
               break;
            case 179:
               var10000 = 164;
               break;
            case 180:
               var10000 = 211;
               break;
            case 181:
               var10000 = 15;
               break;
            case 182:
               var10000 = 9;
               break;
            case 183:
               var10000 = 190;
               break;
            case 184:
               var10000 = 163;
               break;
            case 185:
               var10000 = 48;
               break;
            case 186:
               var10000 = 224;
               break;
            case 187:
               var10000 = 58;
               break;
            case 188:
               var10000 = 56;
               break;
            case 189:
               var10000 = 160;
               break;
            case 190:
               var10000 = 20;
               break;
            case 191:
               var10000 = 201;
               break;
            case 192:
               var10000 = 147;
               break;
            case 193:
               var10000 = 239;
               break;
            case 194:
               var10000 = 127;
               break;
            case 195:
               var10000 = 107;
               break;
            case 196:
               var10000 = 154;
               break;
            case 197:
               var10000 = 106;
               break;
            case 198:
               var10000 = 25;
               break;
            case 199:
               var10000 = 255;
               break;
            case 200:
               var10000 = 78;
               break;
            case 201:
               var10000 = 88;
               break;
            case 202:
               var10000 = 234;
               break;
            case 203:
               var10000 = 137;
               break;
            case 204:
               var10000 = 45;
               break;
            case 205:
               var10000 = 231;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 7;
               break;
            case 208:
               var10000 = 186;
               break;
            case 209:
               var10000 = 73;
               break;
            case 210:
               var10000 = 1;
               break;
            case 211:
               var10000 = 242;
               break;
            case 212:
               var10000 = 62;
               break;
            case 213:
               var10000 = 11;
               break;
            case 214:
               var10000 = 83;
               break;
            case 215:
               var10000 = 158;
               break;
            case 216:
               var10000 = 112;
               break;
            case 217:
               var10000 = 217;
               break;
            case 218:
               var10000 = 86;
               break;
            case 219:
               var10000 = 244;
               break;
            case 220:
               var10000 = 100;
               break;
            case 221:
               var10000 = 142;
               break;
            case 222:
               var10000 = 150;
               break;
            case 223:
               var10000 = 29;
               break;
            case 224:
               var10000 = 50;
               break;
            case 225:
               var10000 = 91;
               break;
            case 226:
               var10000 = 19;
               break;
            case 227:
               var10000 = 246;
               break;
            case 228:
               var10000 = 250;
               break;
            case 229:
               var10000 = 22;
               break;
            case 230:
               var10000 = 66;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 134;
               break;
            case 233:
               var10000 = 26;
               break;
            case 234:
               var10000 = 16;
               break;
            case 235:
               var10000 = 218;
               break;
            case 236:
               var10000 = 170;
               break;
            case 237:
               var10000 = 98;
               break;
            case 238:
               var10000 = 129;
               break;
            case 239:
               var10000 = 87;
               break;
            case 240:
               var10000 = 92;
               break;
            case 241:
               var10000 = 35;
               break;
            case 242:
               var10000 = 2;
               break;
            case 243:
               var10000 = 115;
               break;
            case 244:
               var10000 = 183;
               break;
            case 245:
               var10000 = 148;
               break;
            case 246:
               var10000 = 194;
               break;
            case 247:
               var10000 = 200;
               break;
            case 248:
               var10000 = 175;
               break;
            case 249:
               var10000 = 33;
               break;
            case 250:
               var10000 = 216;
               break;
            case 251:
               var10000 = 143;
               break;
            case 252:
               var10000 = 0;
               break;
            case 253:
               var10000 = 166;
               break;
            case 254:
               var10000 = 31;
               break;
            default:
               var10000 = 238;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4074;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 15550) & 32767;
      if (i[var3] == null) {
         i[var3] = g[var3] ^ var1;
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[5];
      int var19 = 0;
      String var18 = "sLK\u0005×\u0099ö\u008e!\u0003\u0081\u001cõ\u0003ü¸{";
      int var20 = "sLK\u0005×\u0099ö\u008e!\u0003\u0081\u001cõ\u0003ü¸{".length();
      char var17 = '\t';
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 30;
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
                        var84 = 125;
                        break;
                     case 1:
                        var84 = 8;
                        break;
                     case 2:
                        var84 = 61;
                        break;
                     case 3:
                        var84 = 86;
                        break;
                     case 4:
                        var84 = 102;
                        break;
                     case 5:
                        var84 = 118;
                        break;
                     default:
                        var84 = 114;
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
                     b = new String[5];
                     long var8 = 3627703123446481894L;
                     long[] var14 = new long[5];
                     int var11 = 0;
                     String var12 = "ü\u0018QÌ Ð¤yÅb%_\u008eø£\u0091ì\u0010p\u00800t\u0088T";
                     int var13 = "ü\u0018QÌ Ð¤yÅb%_\u008eø£\u0091ì\u0010p\u00800t\u0088T".length();
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
                                    f = new Integer[5];
                                    long var0 = 6876822664683787206L;
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "8ï²\u0007¤{ÂZ>%\u001f\u0093\u001fÝbÁj²(\u0083cySo";
                                    int var5 = "8ï²\u0007¤{ÂZ>%\u001f\u0093\u001fÝbÁj²(\u0083cySo".length();
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
                                                   g = var6;
                                                   i = new Long[5];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = ";\u0006$\u001e\u0089ù\u009bX;\u000fd\u008c\u0097bý\u0093";
                                                var5 = ";\u0006$\u001e\u0089ù\u009bX;\u000fd\u008c\u0097bý\u0093".length();
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

                                 var12 = "µ¤½^í\u0087\u001c½:³Ä´56\u008b\u009f";
                                 var13 = "µ¤½^í\u0087\u001c½:³Ä´56\u008b\u009f".length();
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

                  var18 = "L¨ð\u0085(q\u0003\u0015\u000b¿";
                  var20 = "L¨ð\u0085(q\u0003\u0015\u000b¿".length();
                  var17 = 6;
                  var26 = -1;
            }

            var10000 = 42;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





