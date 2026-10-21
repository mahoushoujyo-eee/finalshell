package com.finalshell.core;

import com.finalshell.crypto.PingMessageReceiver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

public class A0 {
   public List p;
   public boolean t = false;
   public int w = a(2920, 6871379940283314408L);
   public int Q = a(1120, 6638462424036573154L);
   public int Y = 0;
   public int R;
   public String M = "";
   public byte[] m;
   public Socket x;
   public Socket L;
   public boolean P = false;
   public int q;
   public ArrayList g = new ArrayList();
   public Semaphore E = new Semaphore(0);
   public int V = 0;
   public int K = -1;
   public static int d;
   public static int T;
   public int B = 0;
   public Zq2_2 F;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long e;

   static {
      __vfClinit__();
   }

   public A0(Zq2_2 var1, DataInputStream var2, DataOutputStream var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, null, 0);
   }

   public A0(Zq2_2 var1, DataInputStream var2, DataOutputStream var3, int var4, int var5, byte[] var6, int var7) {
      this.F = var1;
      this.p = new Vector();
      this.Q = var5;
      this.m = var6;
      this.q = var4;
      com.finalshell.task.YS3 var8 = new com.finalshell.task.YS3(this, var6, var3, var7, var2, var5);
      PingMessageReceiver.U.execute(var8);
   }

   public void W() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 1e
      // 09: getfield com/finalshell/core/A0.t Z
      // 0c: ifne 7e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: putfield com/finalshell/core/A0.t Z
      // 22: getstatic com/finalshell/core/A0.e J
      // 25: invokestatic java/lang/Thread.sleep (J)V
      // 28: goto 2c
      // 2b: astore 2
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/A0.x Ljava/net/Socket;
      // 30: aload 1
      // 31: ifnull 62
      // 34: ifnull 53
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3d: athrow
      // 3e: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 41: new com/finalshell/task/B9
      // 44: dup
      // 45: aload 0
      // 46: invokespecial com/finalshell/task/B9.<init> (Lcom/finalshell/core/A0;)V
      // 49: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 52: athrow
      // 53: aload 0
      // 54: aload 1
      // 55: ifnull 7b
      // 58: getfield com/finalshell/core/A0.L Ljava/net/Socket;
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 61: athrow
      // 62: ifnull 7a
      // 65: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 68: new com/finalshell/task/Jv2
      // 6b: dup
      // 6c: aload 0
      // 6d: invokespecial com/finalshell/task/Jv2.<init> (Lcom/finalshell/core/A0;)V
      // 70: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/A0.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 79: athrow
      // 7a: aload 0
      // 7b: invokevirtual com/finalshell/core/A0.Y ()V
      // 7e: return
   }

   public DW f(String var1) {
      DW var3 = new DW(this);
      String var4 = null;
      String[] var10000 = PingMessageReceiver.N();
      var1 = var1.replaceAll("\r", "");
      var1 = var1.replaceAll(" ", "");
      String[] var5 = var1.split("\n");
      String[] var2 = var10000;

      for (String var6 : var5) {
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
               var3.o(var12);
               var10 = var10.substring(0, var11);
            }

            var4 = var10;
         }

         var3.B(var4);
      }

      return var3;
   }

   public void O(Yx2 var1) {
      this.p.add(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void Y() {
      String[] var1 = PingMessageReceiver.N();
      Iterator var3 = this.p.iterator();
      if (var1 == null || var3.hasNext()) {
         do {
            Yx2 var2 = (Yx2)var3.next();
            var2.X();
         } while (var3.hasNext());
      }
   }

   public int F() {
      return this.Y;
   }

   public void l(int var1) {
      this.Y = var1;
   }

   public int c() {
      return this.R;
   }

   public void M(int var1) {
      this.R = var1;
   }

   public String B$String() {
      return this.M;
   }

   public void p(String var1) {
      this.M = var1;
   }

   public Socket B$Socket() {
      return this.x;
   }

   public void E(Socket var1) {
      this.x = var1;
   }

   public Socket D() {
      return this.L;
   }

   public void g(Socket var1) {
      this.L = var1;
   }

   public int I() {
      return this.K;
   }

   public void b(int var1) {
      this.K = var1;
   }

   public int N() {
      return this.B;
   }

   public void R(int var1) {
      this.B = var1;
   }

   public Zq2_2 b() {
      return this.F;
   }

   public void Q(Zq2_2 var1) {
      this.F = var1;
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31616;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "a]:Y&".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var32 = 6;
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
         var10007 = 6;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var44 = 47;
               break;
            case 1:
               var44 = 52;
               break;
            case 2:
               var44 = 79;
               break;
            case 3:
               var44 = 43;
               break;
            case 4:
               var44 = 26;
               break;
            case 5:
               var44 = 86;
               break;
            default:
               var44 = 57;
         }
      } else {
         var32 = 6;
         var19 = var10004;
         if (var10004 <= var10) {
            String var36 = new String(var10003).intern();
            int var25 = -1;
            a = var36;
            long var12 = 3704990132045930556L;
            long[] var17 = new long[3];
            int var14 = 0;
            String var15 = "ç\u0095\nce¸\u0017\u0004Ð+\b\u0086½\u0096ÒÄ[¾\n~%Ö\u009fÞ";
            int var16 = "ç\u0095\nce¸\u0017\u0004Ð+\b\u0086½\u0096ÒÄ[¾\n~%Ö\u009fÞ".length();
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
            c = new Integer[3];
            long var11 = 6495496444793209063L;
            long var31 = 6495496444793209107L ^ var11;
            byte var28 = -1;
            e = var31;
            d = 1;
            T = a(18811, 567511245490107130L);
            return;
         }

         var38 = var10003;
         var10005 = var10;
         char var45 = var10003[var10];
         var10007 = 6;
         var10006 = var45;
         switch (var10 % 7) {
            case 0:
               var44 = 47;
               break;
            case 1:
               var44 = 52;
               break;
            case 2:
               var44 = 79;
               break;
            case 3:
               var44 = 43;
               break;
            case 4:
               var44 = 26;
               break;
            case 5:
               var44 = 86;
               break;
            default:
               var44 = 57;
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
                  var44 = 47;
                  break;
               case 1:
                  var44 = 52;
                  break;
               case 2:
                  var44 = 79;
                  break;
               case 3:
                  var44 = 43;
                  break;
               case 4:
                  var44 = 26;
                  break;
               case 5:
                  var44 = 86;
                  break;
               default:
                  var44 = 57;
            }
         } else {
            if (var19 <= var10) {
               String var34 = new String(var10002).intern();
               int var21 = -1;
               a = var34;
               long var2 = 3704990132045930556L;
               long[] var8 = new long[3];
               int var5 = 0;
               String var6 = "ç\u0095\nce¸\u0017\u0004Ð+\b\u0086½\u0096ÒÄ[¾\n~%Ö\u009fÞ";
               int var7 = "ç\u0095\nce¸\u0017\u0004Ð+\b\u0086½\u0096ÒÄ[¾\n~%Ö\u009fÞ".length();
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
               c = new Integer[3];
               long var0 = 6495496444793209063L;
               long var30 = 6495496444793209107L ^ var0;
               byte var24 = -1;
               e = var30;
               d = 1;
               T = a(18811, 567511245490107130L);
               return;
            }

            var38 = var10002;
            var10005 = var10;
            char var46 = var10002[var10];
            var10007 = var32;
            var10006 = var46;
            switch (var10 % 7) {
               case 0:
                  var44 = 47;
                  break;
               case 1:
                  var44 = 52;
                  break;
               case 2:
                  var44 = 79;
                  break;
               case 3:
                  var44 = 43;
                  break;
               case 4:
                  var44 = 26;
                  break;
               case 5:
                  var44 = 86;
                  break;
               default:
                  var44 = 57;
            }
         }
      }
   }
}





