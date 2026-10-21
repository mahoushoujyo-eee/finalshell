package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

public class Or4 {
   public List q;
   public boolean V = false;
   public int A = a(10004, 242278767978422633L);
   public int m = a(2570, 8430846948041362548L);
   public int Z = 0;
   public int U;
   public String z = "";
   public byte[] t;
   public Socket H;
   public Socket e;
   public boolean l = false;
   public int c;
   public ArrayList W = new ArrayList();
   public Semaphore T = new Semaphore(0);
   public int r = 0;
   public int p = -1;
   public static int k;
   public static int R;
   public int v = 0;
   public YM o;
   public static String a;
   public static long[] b;
   public static Integer[] d;
   public static long f;

   static {
      __vfClinit__();
   }

   public Or4(YM var1, DataInputStream var2, DataOutputStream var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, null, 0);
   }

   public Or4(YM var1, DataInputStream var2, DataOutputStream var3, int var4, int var5, byte[] var6, int var7) {
      this.o = var1;
      this.q = new Vector();
      this.m = var5;
      this.t = var6;
      this.c = var4;
      com.finalshell.task.F22 var8 = new com.finalshell.task.F22(this, var6, var3, var7, var2);
      LA3.b.execute(var8);
   }

   public void G() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 1e
      // 09: getfield com/finalshell/core/Or4.V Z
      // 0c: ifne 7e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: putfield com/finalshell/core/Or4.V Z
      // 22: getstatic com/finalshell/core/Or4.f J
      // 25: invokestatic java/lang/Thread.sleep (J)V
      // 28: goto 2c
      // 2b: astore 2
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Or4.H Ljava/net/Socket;
      // 30: aload 1
      // 31: ifnull 62
      // 34: ifnull 53
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3d: athrow
      // 3e: getstatic com/finalshell/core/LA3.b Ljava/util/concurrent/ThreadPoolExecutor;
      // 41: new com/finalshell/task/KW
      // 44: dup
      // 45: aload 0
      // 46: invokespecial com/finalshell/task/KW.<init> (Lcom/finalshell/core/Or4;)V
      // 49: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 52: athrow
      // 53: aload 0
      // 54: aload 1
      // 55: ifnull 7b
      // 58: getfield com/finalshell/core/Or4.e Ljava/net/Socket;
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 61: athrow
      // 62: ifnull 7a
      // 65: getstatic com/finalshell/core/LA3.b Ljava/util/concurrent/ThreadPoolExecutor;
      // 68: new com/finalshell/task/Tj4
      // 6b: dup
      // 6c: aload 0
      // 6d: invokespecial com/finalshell/task/Tj4.<init> (Lcom/finalshell/core/Or4;)V
      // 70: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Or4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 79: athrow
      // 7a: aload 0
      // 7b: invokevirtual com/finalshell/core/Or4.g ()V
      // 7e: return
   }

   public GI_2 H(String var1) {
      GI_2 var3 = new GI_2(this);
      String var4 = null;
      Ky4[] var10000 = Qm2.J();
      var1 = var1.replaceAll("\r", "");
      var1 = var1.replaceAll(" ", "");
      String[] var5 = var1.split("\n");
      String[] var9 = var5;
      int var8 = var5.length;
      int var7 = 0;

      for (Ky4[] var2 = var10000; var7 < var8; var7++) {
         String var6 = var9[var7];
         String var15 = var6;
         if (var2 != null) {
            if (!var6.startsWith(a)) {
               continue;
            }

            var15 = var6.substring(5);
         }

         String var10 = var15;
         int var11 = var10.indexOf(":");
         if (var2 != null) {
            if (var11 > -1) {
               int var12 = Integer.parseInt(var10.substring(var11 + 1));
               var3.Z(var12);
               var10 = var10.substring(0, var11);
            }

            var4 = var10;
         }

         var3.C(var4);
      }

      return var3;
   }

   public void D(Fs2 var1) {
      this.q.add(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void g() {
      Ky4[] var1 = Qm2.J();
      Iterator var3 = this.q.iterator();
      if (var1 == null || var3.hasNext()) {
         do {
            Fs2 var2 = (Fs2)var3.next();
            var2.x();
         } while (var3.hasNext());
      }
   }

   public int O() {
      return this.Z;
   }

   public void b(int var1) {
      this.Z = var1;
   }

   public int y() {
      return this.U;
   }

   public void M(int var1) {
      this.U = var1;
   }

   public String s() {
      return this.z;
   }

   public void O(String var1) {
      this.z = var1;
   }

   public Socket V() {
      return this.H;
   }

   public void B(Socket var1) {
      this.H = var1;
   }

   public Socket X$Socket() {
      return this.e;
   }

   public void i(Socket var1) {
      this.e = var1;
   }

   public int Y() {
      return this.p;
   }

   public void J(int var1) {
      this.p = var1;
   }

   public int Z() {
      return this.v;
   }

   public void x(int var1) {
      this.v = var1;
   }

   public YM X$YM() {
      return this.o;
   }

   public void q(YM var1) {
      this.o = var1;
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1663;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "?eo\u0002\u001e".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var32 = 112;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var38;
      byte var44;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var38 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 112;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var44 = 7;
               break;
            case 1:
               var44 = 122;
               break;
            case 2:
               var44 = 108;
               break;
            case 3:
               var44 = 6;
               break;
            case 4:
               var44 = 84;
               break;
            case 5:
               var44 = 83;
               break;
            default:
               var44 = 107;
         }
      } else {
         var32 = 112;
         var19 = var10004;
         if (var10004 <= var10) {
            String var36 = new String(var10003).intern();
            int var25 = -1;
            a = var36;
            long var12 = 1903955597681108539L;
            long[] var17 = new long[3];
            int var14 = 0;
            String var15 = "º3A\u0015òGÎIÐ»¾&8\u0017*Oö\u008av=6\u001f\u0000\u0082";
            int var16 = "º3A\u0015òGÎIÐ»¾&8\u0017*Oö\u008av=6\u001f\u0000\u0082".length();
            byte var13 = 0;

            do {
               var25 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var25, var13).getBytes("ISO-8859-1");
               var25 = var14++;
               long var42 = (
                     ((long)var18[0] & 255L) << 56
                        | ((long)var18[1] & 255L) << 48
                        | ((long)var18[2] & 255L) << 40
                        | ((long)var18[3] & 255L) << 32
                        | ((long)var18[4] & 255L) << 24
                        | ((long)var18[5] & 255L) << 16
                        | ((long)var18[6] & 255L) << 8
                        | (long)var18[7] & 255L
                  )
                  ^ var12;
               byte var37 = -1;
               var17[var25] = var42;
            } while (var13 < var16);

            b = var17;
            d = new Integer[3];
            long var11 = 5019807124442072680L;
            long var31 = 5019807124442072988L ^ var11;
            byte var28 = -1;
            f = var31;
            k = 1;
            R = a(28175, 2179316896445360240L);
            return;
         }

         var38 = var10003;
         var10005 = var10;
         char var45 = var10003[var10];
         var10007 = 112;
         var10006 = var45;
         switch (var10 % 7) {
            case 0:
               var44 = 7;
               break;
            case 1:
               var44 = 122;
               break;
            case 2:
               var44 = 108;
               break;
            case 3:
               var44 = 6;
               break;
            case 4:
               var44 = 84;
               break;
            case 5:
               var44 = 83;
               break;
            default:
               var44 = 107;
         }
      }

      while (true) {
         var38[var10005] = (char)(var10006 ^ var10007 ^ var44);
         var10++;
         if (var32 == 0) {
            var38 = var10002;
            var10005 = var32;
            char var47 = var10002[var32];
            var10007 = var32;
            var10006 = var47;
            switch (var10 % 7) {
               case 0:
                  var44 = 7;
                  break;
               case 1:
                  var44 = 122;
                  break;
               case 2:
                  var44 = 108;
                  break;
               case 3:
                  var44 = 6;
                  break;
               case 4:
                  var44 = 84;
                  break;
               case 5:
                  var44 = 83;
                  break;
               default:
                  var44 = 107;
            }
         } else {
            if (var19 <= var10) {
               String var34 = new String(var10002).intern();
               int var21 = -1;
               a = var34;
               long var2 = 1903955597681108539L;
               long[] var8 = new long[3];
               int var5 = 0;
               String var6 = "º3A\u0015òGÎIÐ»¾&8\u0017*Oö\u008av=6\u001f\u0000\u0082";
               int var7 = "º3A\u0015òGÎIÐ»¾&8\u0017*Oö\u008av=6\u001f\u0000\u0082".length();
               byte var4 = 0;

               do {
                  var21 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
                  var21 = var5++;
                  long var41 = (
                        ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L
                     )
                     ^ var2;
                  byte var35 = -1;
                  var8[var21] = var41;
               } while (var4 < var7);

               b = var8;
               d = new Integer[3];
               long var0 = 5019807124442072680L;
               long var30 = 5019807124442072988L ^ var0;
               byte var24 = -1;
               f = var30;
               k = 1;
               R = a(28175, 2179316896445360240L);
               return;
            }

            var38 = var10002;
            var10005 = var10;
            char var46 = var10002[var10];
            var10007 = var32;
            var10006 = var46;
            switch (var10 % 7) {
               case 0:
                  var44 = 7;
                  break;
               case 1:
                  var44 = 122;
                  break;
               case 2:
                  var44 = 108;
                  break;
               case 3:
                  var44 = 6;
                  break;
               case 4:
                  var44 = 84;
                  break;
               case 5:
                  var44 = 83;
                  break;
               default:
                  var44 = 107;
            }
         }
      }
   }
}





