package com.finalshell.core;

import com.finalshell.task.Uf2;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LA3 {
   public DatagramSocket X;
   public HashMap O;
   public Thread s;
   public Thread A;
   public static ThreadPoolExecutor b;
   public Uf2 x;
   public Object f;
   public Object B;
   public Random G;
   public int K;
   public LinkedBlockingQueue Q;
   public static int d;
   public static int w;
   public int i;
   public String V;
   public HashSet k;
   public HashSet W;
   public static int R;
   public static int E;
   public Dl2 e;
   public HashSet h;
   public F92 n;
   public boolean P;
   public HashMap T;
   public static List r;
   public static String a;
   public static long[] c;
   public static Integer[] g;

   static {
      __vfClinit__();
   }

   public static int x(short var0) {
      return var0 & a(25924, 4537513190672194924L);
   }

   public LA3(String param1, short param2, int param3, boolean param4, boolean param5) throws Exception {
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
      // 004: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 007: aload 0
      // 008: new java/lang/Object
      // 00b: dup
      // 00c: invokespecial java/lang/Object.<init> ()V
      // 00f: putfield com/finalshell/core/LA3.f Ljava/lang/Object;
      // 012: aload 0
      // 013: new java/lang/Object
      // 016: dup
      // 017: invokespecial java/lang/Object.<init> ()V
      // 01a: putfield com/finalshell/core/LA3.B Ljava/lang/Object;
      // 01d: aload 0
      // 01e: new java/util/Random
      // 021: dup
      // 022: invokespecial java/util/Random.<init> ()V
      // 025: putfield com/finalshell/core/LA3.G Ljava/util/Random;
      // 028: astore 6
      // 02a: aload 0
      // 02b: aload 0
      // 02c: getfield com/finalshell/core/LA3.G Ljava/util/Random;
      // 02f: invokevirtual java/util/Random.nextInt ()I
      // 032: invokestatic java/lang/Math.abs (I)I
      // 035: putfield com/finalshell/core/LA3.K I
      // 038: aload 0
      // 039: new java/util/concurrent/LinkedBlockingQueue
      // 03c: dup
      // 03d: invokespecial java/util/concurrent/LinkedBlockingQueue.<init> ()V
      // 040: putfield com/finalshell/core/LA3.Q Ljava/util/concurrent/LinkedBlockingQueue;
      // 043: aload 0
      // 044: getstatic com/finalshell/core/LA3.w I
      // 047: putfield com/finalshell/core/LA3.i I
      // 04a: aload 0
      // 04b: ldc ""
      // 04d: putfield com/finalshell/core/LA3.V Ljava/lang/String;
      // 050: aload 0
      // 051: new java/util/HashSet
      // 054: dup
      // 055: invokespecial java/util/HashSet.<init> ()V
      // 058: putfield com/finalshell/core/LA3.k Ljava/util/HashSet;
      // 05b: aload 0
      // 05c: new java/util/HashSet
      // 05f: dup
      // 060: invokespecial java/util/HashSet.<init> ()V
      // 063: putfield com/finalshell/core/LA3.W Ljava/util/HashSet;
      // 066: aload 0
      // 067: new java/util/HashSet
      // 06a: dup
      // 06b: invokespecial java/util/HashSet.<init> ()V
      // 06e: putfield com/finalshell/core/LA3.h Ljava/util/HashSet;
      // 071: aload 0
      // 072: bipush 1
      // 073: putfield com/finalshell/core/LA3.P Z
      // 076: aload 0
      // 077: new java/util/HashMap
      // 07a: dup
      // 07b: invokespecial java/util/HashMap.<init> ()V
      // 07e: putfield com/finalshell/core/LA3.T Ljava/util/HashMap;
      // 081: aload 0
      // 082: new com/finalshell/task/Uf2
      // 085: dup
      // 086: invokespecial com/finalshell/task/Uf2.<init> ()V
      // 089: putfield com/finalshell/core/LA3.x Lcom/finalshell/task/Uf2;
      // 08c: aload 0
      // 08d: iload 3
      // 08e: putfield com/finalshell/core/LA3.i I
      // 091: aload 0
      // 092: iload 4
      // 094: putfield com/finalshell/core/LA3.P Z
      // 097: aload 0
      // 098: aload 1
      // 099: putfield com/finalshell/core/LA3.V Ljava/lang/String;
      // 09c: aload 0
      // 09d: aload 6
      // 09f: ifnull 0e3
      // 0a2: getfield com/finalshell/core/LA3.i I
      // 0a5: bipush 2
      // 0a6: if_icmpne 0db
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/LA3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: iload 2
      // 0b1: invokestatic com/finalshell/core/LA3.x (S)I
      // 0b4: getstatic com/finalshell/core/LA3.a Ljava/lang/String;
      // 0b7: swap
      // 0b8: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0bd: invokestatic com/finalshell/core/Lx4_2.F (Ljava/lang/Object;)V
      // 0c0: aload 0
      // 0c1: new java/net/DatagramSocket
      // 0c4: dup
      // 0c5: iload 2
      // 0c6: invokestatic com/finalshell/core/LA3.x (S)I
      // 0c9: invokespecial java/net/DatagramSocket.<init> (I)V
      // 0cc: putfield com/finalshell/core/LA3.X Ljava/net/DatagramSocket;
      // 0cf: aload 6
      // 0d1: ifnonnull 0ed
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/LA3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/LA3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: new java/net/DatagramSocket
      // 0e6: dup
      // 0e7: invokespecial java/net/DatagramSocket.<init> ()V
      // 0ea: putfield com/finalshell/core/LA3.X Ljava/net/DatagramSocket;
      // 0ed: aload 0
      // 0ee: new java/util/HashMap
      // 0f1: dup
      // 0f2: invokespecial java/util/HashMap.<init> ()V
      // 0f5: putfield com/finalshell/core/LA3.O Ljava/util/HashMap;
      // 0f8: aload 0
      // 0f9: new com/finalshell/core/Dl2
      // 0fc: dup
      // 0fd: aload 0
      // 0fe: invokespecial com/finalshell/core/Dl2.<init> (Lcom/finalshell/core/LA3;)V
      // 101: putfield com/finalshell/core/LA3.e Lcom/finalshell/core/Dl2;
      // 104: aload 0
      // 105: new com/finalshell/task/JP
      // 108: dup
      // 109: aload 0
      // 10a: invokespecial com/finalshell/task/JP.<init> (Lcom/finalshell/core/LA3;)V
      // 10d: putfield com/finalshell/core/LA3.A Ljava/lang/Thread;
      // 110: aload 0
      // 111: getfield com/finalshell/core/LA3.A Ljava/lang/Thread;
      // 114: invokevirtual java/lang/Thread.start ()V
      // 117: aload 0
      // 118: new com/finalshell/task/Ko2
      // 11b: dup
      // 11c: aload 0
      // 11d: invokespecial com/finalshell/task/Ko2.<init> (Lcom/finalshell/core/LA3;)V
      // 120: putfield com/finalshell/core/LA3.s Ljava/lang/Thread;
      // 123: aload 0
      // 124: getfield com/finalshell/core/LA3.s Ljava/lang/Thread;
      // 127: invokevirtual java/lang/Thread.start ()V
      // 12a: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 12d: ifnull 13e
      // 130: bipush 4
      // 131: anewarray 187
      // 134: invokestatic com/finalshell/core/Qm2.F ([Lcom/finalshell/ui/panel/Ky4;)V
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/LA3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: return
   }

   public static void e(Ao2 var0) {
      r.add(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void F(Cr4 var0) {
      Ky4[] var1 = Qm2.J();
      Iterator var3 = r.iterator();
      int var10000;
      if (var1 == null) {
         Ao2 var2 = (Ao2)var3.next();
         int var4 = var0.R();
         if (var1 != null) {
            if (var4 == Cr4.Z) {
               var2.a(var0);
               if (var1 == null) {
                  var10000 = var4;
                  if (var1 != null) {
                     if (var4 == Cr4.i) {
                        var2.W(var0);
                     }

                     var10000 = (var3.hasNext()) ? 1 : 0;
                  }
               } else {
                  var10000 = (var3.hasNext()) ? 1 : 0;
               }
            } else {
               var10000 = var4;
               if (var1 != null) {
                  if (var4 == Cr4.i) {
                     var2.W(var0);
                  }

                  var10000 = (var3.hasNext()) ? 1 : 0;
               }
            }
         } else {
            if (var4 == Cr4.Z) {
               var2.W(var0);
            }

            var10000 = (var3.hasNext()) ? 1 : 0;
         }
      } else {
         var10000 = (var3.hasNext()) ? 1 : 0;
      }

      while (true) {
         while (var10000 != 0) {
            Ao2 var5 = (Ao2)var3.next();
            int var6 = var0.R();
            if (var1 != null) {
               if (var6 == Cr4.Z) {
                  var5.a(var0);
                  if (var1 == null) {
                     var10000 = var6;
                     if (var1 != null) {
                        if (var6 == Cr4.i) {
                           var5.W(var0);
                        }

                        var10000 = (var3.hasNext()) ? 1 : 0;
                     }
                  } else {
                     var10000 = (var3.hasNext()) ? 1 : 0;
                  }
               } else {
                  var10000 = var6;
                  if (var1 != null) {
                     if (var6 == Cr4.i) {
                        var5.W(var0);
                     }

                     var10000 = (var3.hasNext()) ? 1 : 0;
                  }
               }
            } else {
               if (var6 == Cr4.Z) {
                  var5.W(var0);
               }

               var10000 = (var3.hasNext()) ? 1 : 0;
            }
         }

         if (var1 != null) {
            return;
         }

         var10000 = (var3.hasNext()) ? 1 : 0;
      }
   }

   public void H(DatagramPacket var1) throws IOException {
      this.X.send(var1);
   }

   public O02_2 X() {
      O02_2 var1 = null;

      try {
         java.lang.Class var2 = java.lang.Class.forName(this.V);
         var1 = (O02_2)var2.newInstance();
      } catch (ClassNotFoundException var3) {
         var3.printStackTrace();
      } catch (InstantiationException var4) {
         var4.printStackTrace();
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
      }

      return var1;
   }

   public void g(Qm2 var1) {
      synchronized (this.f) {
         this.W.add(var1.W);
         this.O.remove(var1.W);
      }
   }

   public Qm2 A(InetAddress var1, int var2, int var3, int var4) throws Exception {
      Ky4[] var10000 = Qm2.J();
      Qm2 var6 = (Qm2)this.O.get(var3);
      Ky4[] var5 = var10000;

      try {
         if (var5 == null) {
            return var6;
         }

         if (var6 != null) {
            return var6;
         }
      } catch (Exception var10) {
         throw a(var10);
      }

      F92 var7 = this.e.d(var4, var1, var2);
      var6 = new Qm2(this, var1, var2, 2, var3, var7);
      synchronized (this.f) {
         this.O.put(var3, var6);
      }

      var7.b(var6);
      return var6;
   }

   public Qm2 h(String var1, int var2, String var3) throws Exception {
      InetAddress var4 = InetAddress.getByName(var1);
      int var5 = Math.abs(this.G.nextInt());
      String var6 = var4.getHostAddress() + ":" + var2;
      int var7 = Math.abs(var6.hashCode());
      F92 var8 = this.e.d(var7, var4, var2);
      var8.U(var3);
      Qm2 var9 = new Qm2(this, var4, var2, 1, var5, var8);
      synchronized (this.f) {
         this.O.put(var5, var9);
      }

      var8.b(var9);
      this.n = var8;
      return var9;
   }

   public boolean h() {
      return this.P;
   }

   public void k(boolean var1) {
      this.P = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14377;
      if (g[var3] == null) {
         g[var3] = (int)(c[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "@=?_w.\u000by0<\u000bb/Yxnl".toCharArray();
      int var10004 = var10003.length;
      int var12 = 0;
      byte var39 = 29;
      char[] var10002 = var10003;
      int var26 = var10004;
      char[] var45;
      byte var51;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var45 = var10003;
         var10005 = var12;
         char var10008 = var10003[var12];
         var10007 = 29;
         var10006 = var10008;
         switch (var12 % 7) {
            case 0:
               var51 = 17;
               break;
            case 1:
               var51 = 73;
               break;
            case 2:
               var51 = 81;
               break;
            case 3:
               var51 = 54;
               break;
            case 4:
               var51 = 15;
               break;
            case 5:
               var51 = 93;
               break;
            default:
               var51 = 54;
         }
      } else {
         var39 = 29;
         var26 = var10004;
         if (var10004 <= var12) {
            String var43 = new String(var10003).intern();
            int var32 = -1;
            a = var43;
            long var17 = 215896108088074117L;
            long[] var22 = new long[2];
            int var19 = 0;
            String var20 = "\u0094j\u009dÑßÀ¤r¯Ð \u009e\u000bP=\u0016";
            int var21 = "\u0094j\u009dÑßÀ¤r¯Ð \u009e\u000bP=\u0016".length();
            byte var18 = 0;

            do {
               var32 = var18;
               var18 += 8;
               byte[] var23 = var20.substring(var32, var18).getBytes("ISO-8859-1");
               var32 = var19++;
               long var49 = (
                     ((long)var23[0] & 255L) << 56
                        | ((long)var23[1] & 255L) << 48
                        | ((long)var23[2] & 255L) << 40
                        | ((long)var23[3] & 255L) << 32
                        | ((long)var23[4] & 255L) << 24
                        | ((long)var23[5] & 255L) << 16
                        | ((long)var23[6] & 255L) << 8
                        | (long)var23[7] & 255L
                  )
                  ^ var17;
               byte var44 = -1;
               var22[var32] = var49;
            } while (var18 < var21);

            c = var22;
            g = new Integer[2];
            long var16 = 4329141988402462966L;
            long var38 = 4329141988402472934L ^ var16;
            byte var35 = -1;
            long var15 = var38;
            d = a(988, 1694877988886821877L);
            w = 1;
            r = new Vector();
            SynchronousQueue var24 = new SynchronousQueue();
            ThreadPoolExecutor var25 = new ThreadPoolExecutor(5, 5, var15, TimeUnit.MILLISECONDS, var24);
            b = var25;
            return;
         }

         var45 = var10003;
         var10005 = var12;
         char var52 = var10003[var12];
         var10007 = 29;
         var10006 = var52;
         switch (var12 % 7) {
            case 0:
               var51 = 17;
               break;
            case 1:
               var51 = 73;
               break;
            case 2:
               var51 = 81;
               break;
            case 3:
               var51 = 54;
               break;
            case 4:
               var51 = 15;
               break;
            case 5:
               var51 = 93;
               break;
            default:
               var51 = 54;
         }
      }

      while (true) {
         var45[var10005] = (char)(var10006 ^ var10007 ^ var51);
         var12++;
         if (var39 == 0) {
            var45 = var10002;
            var10005 = var39;
            char var54 = var10002[var39];
            var10007 = var39;
            var10006 = var54;
            switch (var12 % 7) {
               case 0:
                  var51 = 17;
                  break;
               case 1:
                  var51 = 73;
                  break;
               case 2:
                  var51 = 81;
                  break;
               case 3:
                  var51 = 54;
                  break;
               case 4:
                  var51 = 15;
                  break;
               case 5:
                  var51 = 93;
                  break;
               default:
                  var51 = 54;
            }
         } else {
            if (var26 <= var12) {
               String var41 = new String(var10002).intern();
               int var28 = -1;
               a = var41;
               long var4 = 215896108088074117L;
               long[] var10 = new long[2];
               int var7 = 0;
               String var8 = "\u0094j\u009dÑßÀ¤r¯Ð \u009e\u000bP=\u0016";
               int var9 = "\u0094j\u009dÑßÀ¤r¯Ð \u009e\u000bP=\u0016".length();
               byte var6 = 0;

               do {
                  var28 = var6;
                  var6 += 8;
                  byte[] var11 = var8.substring(var28, var6).getBytes("ISO-8859-1");
                  var28 = var7++;
                  long var48 = (
                        ((long)var11[0] & 255L) << 56
                           | ((long)var11[1] & 255L) << 48
                           | ((long)var11[2] & 255L) << 40
                           | ((long)var11[3] & 255L) << 32
                           | ((long)var11[4] & 255L) << 24
                           | ((long)var11[5] & 255L) << 16
                           | ((long)var11[6] & 255L) << 8
                           | (long)var11[7] & 255L
                     )
                     ^ var4;
                  byte var42 = -1;
                  var10[var28] = var48;
               } while (var6 < var9);

               c = var10;
               g = new Integer[2];
               long var2 = 4329141988402462966L;
               long var37 = 4329141988402472934L ^ var2;
               byte var31 = -1;
               long var0 = var37;
               d = a(988, 1694877988886821877L);
               w = 1;
               r = new Vector();
               SynchronousQueue var13 = new SynchronousQueue();
               ThreadPoolExecutor var14 = new ThreadPoolExecutor(5, 5, var0, TimeUnit.MILLISECONDS, var13);
               b = var14;
               return;
            }

            var45 = var10002;
            var10005 = var12;
            char var53 = var10002[var12];
            var10007 = var39;
            var10006 = var53;
            switch (var12 % 7) {
               case 0:
                  var51 = 17;
                  break;
               case 1:
                  var51 = 73;
                  break;
               case 2:
                  var51 = 81;
                  break;
               case 3:
                  var51 = 54;
                  break;
               case 4:
                  var51 = 15;
                  break;
               case 5:
                  var51 = 93;
                  break;
               default:
                  var51 = 54;
            }
         }
      }
   }
}





