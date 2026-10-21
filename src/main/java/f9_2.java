import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class f9_2 {
   int J;
   Object f = new Object();
   private HashMap C = new HashMap();
   HashMap X = new HashMap();
   long l = 0L;
   int r = a(16045, 7238709439410119833L);
   int h = this.r;
   int V = this.h;
   int d = -1;
   Object A = new Object();
   long m = 0L;
   long F = 0L;
   long i;
   long j = System.currentTimeMillis();
   Random R = new Random();
   HashMap x = new HashMap();
   public int s = a(5465, 6098055134163079018L);
   int v = -1;
   long w;
   long L;
   int c = 0;
   lA_3 S;
   InetAddress U;
   int p;
   public HashMap N = new HashMap();
   Object T = new Object();
   Object P = new Object();
   String D;
   public Tb_2 z;
   boolean u = false;
   private static final String[] a;
   private static final String[] b;
   private static final long[] e;
   private static final Integer[] g;
   private static final long[] k;
   private static final Long[] n;

   f9_2(lA_3 var1, int var2, InetAddress var3, int var4) {
      this.z = new Tb_2();
      this.J = var2;
      this.S = var1;
      this.U = var3;
      this.p = var4;
   }

   public void g(DatagramPacket var1) {
      com.ky_4[] var10000 = Qm_2.J();
      byte[] var3 = var1.getData();
      com.ky_4[] var2 = var10000;
      int var4 = 0;
      var4 = ym_4.y(var1);
      int var5 = cN_3.m(var3, a(25484, 6311079077445302713L));
      int var15 = var4;
      int var10001 = BN.y;
      if (var2 != null) {
         if (var4 == BN.y) {
            V_ var6 = new V_(var1);
            this.g(var6.m(), var1.getAddress(), var1.getPort());
            this.V = var6.K() * a(25882, 921940702012407597L);
            if (var2 != null) {
               return;
            }
         }

         var15 = var4;
         var10001 = BN.I;
      }

      if (var15 == var10001) {
         Vf_2 var14 = new Vf_2(var1);
         this.j = System.currentTimeMillis();
         Long var7 = (Long)this.x.get(var14.R());
         if (var2 != null) {
            if (var7 == null) {
               return;
            }

            this.s = (int)(System.currentTimeMillis() - var7);
         }

         String var8;
         label26: {
            label25: {
               var8 = "";
               if (var2 != null) {
                  if (!this.S.h()) {
                     break label25;
                  }

                  var8 = a(3490, 14104);
               }

               if (var2 != null) {
                  break label26;
               }
            }

            var8 = a(3489, 15871);
         }

         var10001 = this.s;
         String var10002 = var1.getAddress().getHostAddress();
         int var9 = var1.getPort();
         String var10 = var10002;
         int var11 = var10001;
         lx_4.u(a(3491, -407) + var8 + " " + var11 + a(3488, -26445) + var10 + ":" + var9);
      }
   }

   public void l(DatagramPacket var1) throws IOException {
      this.S.H(var1);
   }

   void b(Qm_2 var1) {
      synchronized (this.T) {
         this.N.put(var1.W, var1);
      }
   }

   void g(Qm_2 var1) {
      synchronized (this.T) {
         this.N.remove(var1.W);
      }
   }

   public void q() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Qm_2.J ()[Lcom/ky_4;
      // 03: aload 0
      // 04: bipush 1
      // 05: putfield f9_2.u Z
      // 08: aload 0
      // 09: getfield f9_2.S LlA_3;
      // 0c: getfield lA_3.e LDl_2;
      // 0f: aload 0
      // 10: getfield f9_2.J I
      // 13: invokevirtual Dl_2.J (I)V
      // 16: aload 0
      // 17: getfield f9_2.T Ljava/lang/Object;
      // 1a: dup
      // 1b: astore 2
      // 1c: monitorenter
      // 1d: astore 1
      // 1e: aload 0
      // 1f: invokevirtual f9_2.J ()Ljava/util/Iterator;
      // 22: astore 3
      // 23: aload 1
      // 24: ifnonnull 4e
      // 27: aload 0
      // 28: getfield f9_2.N Ljava/util/HashMap;
      // 2b: aload 3
      // 2c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 31: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 34: checkcast Qm_2
      // 37: astore 4
      // 39: aload 4
      // 3b: ifnull 4e
      // 3e: getstatic lA_3.b Ljava/util/concurrent/ThreadPoolExecutor;
      // 41: new DL
      // 44: dup
      // 45: aload 0
      // 46: aload 4
      // 48: invokespecial DL.<init> (Lf9_2;LQm_2;)V
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

   Iterator J() {
      Object var1 = null;
      synchronized (this.T) {
         return new TQ(this.N.keySet().iterator());
      }
   }

   public void Q(int var1) {
      this.v = var1;
      this.C.clear();
      this.X.clear();
   }

   public void W(Qm_2 var1) {
   }

   public void I() {
      int var1 = Math.abs(this.R.nextInt());
      long var2 = System.currentTimeMillis();
      this.x.put(var1, var2);
      this.i = System.currentTimeMillis();
      V_ var4 = new V_(0, this.S.K, var1, lA_3.R, lA_3.E);
      var4.D(this.U);
      var4.A(this.p);

      try {
         this.l(var4.S());
      } catch (IOException var6) {
      }
   }

   public void g(int var1, InetAddress var2, int var3) {
      Vf_2 var4 = new Vf_2(0, this.S.K, var1);
      var4.D(var2);
      var4.A(var3);

      try {
         this.l(var4.S());
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public void i(V_ var1) {
      com.ky_4[] var2 = Qm_2.J();
      f9_2 var10000 = this;
      if (var2 != null) {
         if (this.S.i != 2) {
            return;
         }

         var10000 = this;
      }

      var10000.V = var1.K() * a(25230, 2390998495623870648L);
   }

   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   Fr_2 A(int var1) {
      com.ky_4[] var10000 = Qm_2.J();
      Fr_2 var3 = null;
      Object var4 = this.A;
      synchronized (this.A){} // $VF: monitorenter 
      com.ky_4[] var2 = var10000;

      try {
         var3 = (Fr_2)this.C.get(var1);
         var10000 = var3;
         if (var2 != null) {
            if (var3 == null) {
               var3 = new Fr_2();
               var3.H(var1);
               this.C.put(var1, var3);
            }

            var10000 = (com.ky_4[])var4;
         }

         // $VF: monitorexit
         return var3;
      } catch (Throwable var6) {
         // $VF: monitorexit
         throw var6;
      }
   }

   public int M() {
      com.ky_4[] var10000 = Qm_2.J();
      long var2 = System.currentTimeMillis();
      com.ky_4[] var1 = var10000;
      long var6;
      int var5 = (var6 = this.l - 0L) == 0L ? 0 : (var6 < 0L ? -1 : 1);
      if (var1 != null) {
         if (var5 == 0) {
            this.l = var2;
         }

         var5 = (int)((var2 - this.l) / b(24656, 5434401913817642932L));
      }

      return var5;
   }

   public int B(long var1) {
      return (int)((var1 - this.l) / b(8574, 8834631273517315739L));
   }

   public synchronized void l(long param1, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic Qm_2.J ()[Lcom/ky_4;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield f9_2.S LlA_3;
      // 009: getfield lA_3.i I
      // 00c: aload 4
      // 00e: ifnull 030
      // 011: bipush 1
      // 012: if_icmpne 02a
      // 015: goto 01c
      // 018: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getstatic lA_3.E I
      // 020: putfield f9_2.V I
      // 023: goto 02a
      // 026: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield f9_2.m J
      // 02e: lconst_0
      // 02f: lcmp
      // 030: aload 4
      // 032: ifnull 070
      // 035: ifne 04b
      // 038: goto 03f
      // 03b: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03e: athrow
      // 03f: aload 0
      // 040: lload 1
      // 041: putfield f9_2.F J
      // 044: goto 04b
      // 047: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04a: athrow
      // 04b: aload 0
      // 04c: dup
      // 04d: getfield f9_2.m J
      // 050: iload 3
      // 051: i2l
      // 052: ladd
      // 053: putfield f9_2.m J
      // 056: aload 0
      // 057: getfield f9_2.m J
      // 05a: aload 4
      // 05c: ifnull 08a
      // 05f: sipush 14017
      // 062: ldc2_w 1618229522977153319
      // 065: invokestatic f9_2.b (IJ)J
      // 068: lcmp
      // 069: goto 070
      // 06c: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 06f: athrow
      // 070: ifle 164
      // 073: ldc_w 1.0E9
      // 076: aload 0
      // 077: getfield f9_2.m J
      // 07a: l2f
      // 07b: fmul
      // 07c: aload 0
      // 07d: getfield f9_2.V I
      // 080: i2f
      // 081: fdiv
      // 082: f2l
      // 083: goto 08a
      // 086: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 089: athrow
      // 08a: lstore 5
      // 08c: invokestatic java/lang/System.nanoTime ()J
      // 08f: aload 0
      // 090: getfield f9_2.F J
      // 093: lsub
      // 094: lstore 7
      // 096: lload 7
      // 098: lload 5
      // 09a: aload 4
      // 09c: ifnull 0b5
      // 09f: lcmp
      // 0a0: ifge 15f
      // 0a3: goto 0aa
      // 0a6: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a9: athrow
      // 0aa: lload 5
      // 0ac: lload 7
      // 0ae: goto 0b5
      // 0b1: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b4: athrow
      // 0b5: lsub
      // 0b6: lstore 9
      // 0b8: aload 0
      // 0b9: dup
      // 0ba: getfield f9_2.w J
      // 0bd: lload 9
      // 0bf: ladd
      // 0c0: putfield f9_2.w J
      // 0c3: aload 0
      // 0c4: getfield f9_2.L J
      // 0c7: aload 0
      // 0c8: getfield f9_2.w J
      // 0cb: lsub
      // 0cc: lstore 11
      // 0ce: lload 11
      // 0d0: lconst_0
      // 0d1: aload 4
      // 0d3: ifnull 115
      // 0d6: lcmp
      // 0d7: ifle 10a
      // 0da: goto 0e1
      // 0dd: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e0: athrow
      // 0e1: lload 9
      // 0e3: lload 11
      // 0e5: aload 4
      // 0e7: ifnull 115
      // 0ea: goto 0f1
      // 0ed: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f0: athrow
      // 0f1: lcmp
      // 0f2: ifgt 10a
      // 0f5: goto 0fc
      // 0f8: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0fb: athrow
      // 0fc: lconst_0
      // 0fd: lstore 9
      // 0ff: aload 0
      // 100: dup
      // 101: getfield f9_2.L J
      // 104: lload 9
      // 106: lsub
      // 107: putfield f9_2.L J
      // 10a: lload 5
      // 10c: sipush 8939
      // 10f: ldc2_w 4001901885511562505
      // 112: invokestatic f9_2.b (IJ)J
      // 115: ldiv
      // 116: lstore 13
      // 118: lload 5
      // 11a: sipush 21995
      // 11d: ldc2_w 3850596804484006412
      // 120: invokestatic f9_2.b (IJ)J
      // 123: lrem
      // 124: l2i
      // 125: istore 15
      // 127: invokestatic java/lang/System.nanoTime ()J
      // 12a: lstore 16
      // 12c: lload 9
      // 12e: aload 4
      // 130: ifnull 141
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 15f
      // 138: goto 13f
      // 13b: invokestatic f9_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
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
      // 152: getfield f9_2.L J
      // 155: invokestatic java/lang/System.nanoTime ()J
      // 158: lload 16
      // 15a: lsub
      // 15b: ladd
      // 15c: putfield f9_2.L J
      // 15f: aload 0
      // 160: lconst_0
      // 161: putfield f9_2.m J
      // 164: return
   }

   public Object V() {
      return this.f;
   }

   public void P(Object var1) {
      this.f = var1;
   }

   public void q(int var1) {
      this.J = var1;
   }

   public int L() {
      return this.v;
   }

   public void F(int var1) {
      this.v = var1;
      this.j = System.currentTimeMillis();
   }

   public long Y() {
      return this.i;
   }

   public void I(long var1) {
      this.i = var1;
   }

   public long A() {
      return this.j;
   }

   public void B$void(long var1) {
      this.j = var1;
   }

   public String P() {
      return this.D;
   }

   public void U(String var1) {
      this.D = var1;
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[4];
      int var19 = 0;
      String var18 = "Ïù\u000f\u0006\u0082\u001e¨3\u0081Ó";
      int var20 = "Ïù\u000f\u0006\u0082\u001e¨3\u0081Ó".length();
      char var17 = 3;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 83;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
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
                  var74[var10006] = (char)(var74[var10006] ^ var66 ^ switch (var22 % 7) {
                     case 0 -> 115;
                     case 1 -> 115;
                     case 2 -> 43;
                     case 3 -> 15;
                     case 4 -> 80;
                     case 5 -> 127;
                     default -> 11;
                  });
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
                     b = new String[4];
                     long var8 = 2888358686190476467L;
                     long[] var14 = new long[5];
                     int var11 = 0;
                     String var12 = "Ôwvã\r g\u009e^aÛ\u0084´k`\u000bu\u0084¶ØÂÊå\u0002";
                     int var13 = "Ôwvã\r g\u009e^aÛ\u0084´k`\u000bu\u0084¶ØÂÊå\u0002".length();
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
                                    e = var14;
                                    g = new Integer[5];
                                    long var0 = 5292859585783822295L;
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "_\u0001\u0018íJ°>ð|\u0004\u0012¤P#7\u009b\u0002\u001eÜ\u007fWgÃ\u008b";
                                    int var5 = "_\u0001\u0018íJ°>ð|\u0004\u0012¤P#7\u009b\u0002\u001eÜ\u007fWgÃ\u008b".length();
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
                                                   k = var6;
                                                   n = new Long[5];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "3îé\u0095û$\u0002¤~ý\u009fO÷DÀ\u009e";
                                                var5 = "3îé\u0095û$\u0002¤~ý\u009fO÷DÀ\u009e".length();
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

                                 var12 = "b\u0089õb\u0002\u0012¸*Kë\u0086kîÅ\u0093#";
                                 var13 = "b\u0089õb\u0002\u0012¸*Kë\u0086kîÅ\u0093#".length();
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

                  var18 = "Ý8_\u0003Ñ\u0082\u0095";
                  var20 = "Ý8_\u0003Ñ\u0082\u0095".length();
                  var17 = 3;
                  var26 = -1;
            }

            var10000 = 72;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3490) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 12;
            case 1 -> 67;
            case 2 -> 245;
            case 3 -> 63;
            case 4 -> 59;
            case 5 -> 73;
            case 6 -> 231;
            case 7 -> 249;
            case 8 -> 101;
            case 9 -> 102;
            case 10 -> 223;
            case 11 -> 156;
            case 12 -> 47;
            case 13 -> 36;
            case 14 -> 121;
            case 15 -> 139;
            case 16 -> 159;
            case 17 -> 197;
            case 18 -> 202;
            case 19 -> 193;
            case 20 -> 107;
            case 21 -> 175;
            case 22 -> 182;
            case 23 -> 184;
            case 24 -> 133;
            case 25 -> 13;
            case 26 -> 5;
            case 27 -> 225;
            case 28 -> 29;
            case 29 -> 118;
            case 30 -> 110;
            case 31 -> 78;
            case 32 -> 185;
            case 33 -> 6;
            case 34 -> 141;
            case 35 -> 212;
            case 36 -> 104;
            case 37 -> 207;
            case 38 -> 167;
            case 39 -> 177;
            case 40 -> 187;
            case 41 -> 0;
            case 42 -> 8;
            case 43 -> 222;
            case 44 -> 111;
            case 45 -> 10;
            case 46 -> 53;
            case 47 -> 43;
            case 48 -> 115;
            case 49 -> 148;
            case 50 -> 195;
            case 51 -> 124;
            case 52 -> 94;
            case 53 -> 2;
            case 54 -> 214;
            case 55 -> 130;
            case 56 -> 232;
            case 57 -> 198;
            case 58 -> 4;
            case 59 -> 235;
            case 60 -> 136;
            case 61 -> 81;
            case 62 -> 62;
            case 63 -> 157;
            case 64 -> 52;
            case 65 -> 49;
            case 66 -> 108;
            case 67 -> 24;
            case 68 -> 71;
            case 69 -> 31;
            case 70 -> 150;
            case 71 -> 88;
            case 72 -> 76;
            case 73 -> 219;
            case 74 -> 186;
            case 75 -> 145;
            case 76 -> 106;
            case 77 -> 32;
            case 78 -> 98;
            case 79 -> 137;
            case 80 -> 14;
            case 81 -> 153;
            case 82 -> 200;
            case 83 -> 253;
            case 84 -> 119;
            case 85 -> 41;
            case 86 -> 158;
            case 87 -> 196;
            case 88 -> 72;
            case 89 -> 248;
            case 90 -> 192;
            case 91 -> 171;
            case 92 -> 116;
            case 93 -> 79;
            case 94 -> 152;
            case 95 -> 154;
            case 96 -> 45;
            case 97 -> 227;
            case 98 -> 205;
            case 99 -> 209;
            case 100 -> 201;
            case 101 -> 44;
            case 102 -> 155;
            case 103 -> 189;
            case 104 -> 211;
            case 105 -> 22;
            case 106 -> 99;
            case 107 -> 151;
            case 108 -> 132;
            case 109 -> 138;
            case 110 -> 160;
            case 111 -> 199;
            case 112 -> 85;
            case 113 -> 75;
            case 114 -> 221;
            case 115 -> 233;
            case 116 -> 170;
            case 117 -> 234;
            case 118 -> 237;
            case 119 -> 38;
            case 120 -> 60;
            case 121 -> 70;
            case 122 -> 57;
            case 123 -> 77;
            case 124 -> 123;
            case 125 -> 228;
            case 126 -> 176;
            case 127 -> 183;
            case 128 -> 218;
            case 129 -> 15;
            case 130 -> 51;
            case 131 -> 178;
            case 132 -> 250;
            case 133 -> 20;
            case 134 -> 80;
            case 135 -> 90;
            case 136 -> 230;
            case 137 -> 58;
            case 138 -> 87;
            case 139 -> 39;
            case 140 -> 224;
            case 141 -> 83;
            case 142 -> 190;
            case 143 -> 18;
            case 144 -> 114;
            case 145 -> 144;
            case 146 -> 19;
            case 147 -> 238;
            case 148 -> 95;
            case 149 -> 35;
            case 150 -> 86;
            case 151 -> 48;
            case 152 -> 143;
            case 153 -> 112;
            case 154 -> 142;
            case 155 -> 117;
            case 156 -> 64;
            case 157 -> 229;
            case 158 -> 127;
            case 159 -> 30;
            case 160 -> 46;
            case 161 -> 251;
            case 162 -> 163;
            case 163 -> 56;
            case 164 -> 210;
            case 165 -> 61;
            case 166 -> 217;
            case 167 -> 173;
            case 168 -> 140;
            case 169 -> 134;
            case 170 -> 179;
            case 171 -> 68;
            case 172 -> 161;
            case 173 -> 188;
            case 174 -> 149;
            case 175 -> 246;
            case 176 -> 244;
            case 177 -> 168;
            case 178 -> 91;
            case 179 -> 191;
            case 180 -> 180;
            case 181 -> 122;
            case 182 -> 9;
            case 183 -> 206;
            case 184 -> 181;
            case 185 -> 135;
            case 186 -> 220;
            case 187 -> 37;
            case 188 -> 128;
            case 189 -> 23;
            case 190 -> 164;
            case 191 -> 93;
            case 192 -> 243;
            case 193 -> 42;
            case 194 -> 89;
            case 195 -> 103;
            case 196 -> 147;
            case 197 -> 162;
            case 198 -> 50;
            case 199 -> 165;
            case 200 -> 55;
            case 201 -> 255;
            case 202 -> 16;
            case 203 -> 11;
            case 204 -> 129;
            case 205 -> 33;
            case 206 -> 236;
            case 207 -> 28;
            case 208 -> 69;
            case 209 -> 169;
            case 210 -> 26;
            case 211 -> 194;
            case 212 -> 242;
            case 213 -> 25;
            case 214 -> 74;
            case 215 -> 226;
            case 216 -> 120;
            case 217 -> 92;
            case 218 -> 216;
            case 219 -> 54;
            case 220 -> 3;
            case 221 -> 166;
            case 222 -> 7;
            case 223 -> 208;
            case 224 -> 109;
            case 225 -> 203;
            case 226 -> 241;
            case 227 -> 100;
            case 228 -> 131;
            case 229 -> 204;
            case 230 -> 40;
            case 231 -> 105;
            case 232 -> 252;
            case 233 -> 215;
            case 234 -> 96;
            case 235 -> 113;
            case 236 -> 97;
            case 237 -> 240;
            case 238 -> 247;
            case 239 -> 125;
            case 240 -> 34;
            case 241 -> 239;
            case 242 -> 21;
            case 243 -> 254;
            case 244 -> 126;
            case 245 -> 174;
            case 246 -> 65;
            case 247 -> 172;
            case 248 -> 84;
            case 249 -> 213;
            case 250 -> 1;
            case 251 -> 82;
            case 252 -> 27;
            case 253 -> 146;
            case 254 -> 66;
            default -> 17;
         };
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6711;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 22502) & 32767;
      if (n[var3] == null) {
         n[var3] = k[var3] ^ var1;
      }

      return n[var3];
   }
}





