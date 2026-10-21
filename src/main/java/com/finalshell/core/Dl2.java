package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;

public class Dl2 {
   public HashMap t = new HashMap();
   public Thread W;
   public LA3 e;
   public int q = a(24232, 5758382157581959059L);
   public int o = a(21290, 7845052718463431184L);
   public Object y = new Object();
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Dl2(LA3 var1) {
      this.e = var1;
      this.W = new com.finalshell.task.P2(this);
      this.W.start();
   }

   public void D() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/Dl2.u ()Ljava/util/Iterator;
      // 07: astore 2
      // 08: astore 1
      // 09: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c: lstore 3
      // 0d: aload 1
      // 0e: ifnonnull a2
      // 11: aload 0
      // 12: getfield com/finalshell/core/Dl2.t Ljava/util/HashMap;
      // 15: aload 2
      // 16: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e: checkcast com/finalshell/core/F92
      // 21: astore 5
      // 23: aload 5
      // 25: ifnull a2
      // 28: lload 3
      // 29: aload 5
      // 2b: invokevirtual com/finalshell/core/F92.A ()J
      // 2e: lsub
      // 2f: aload 0
      // 30: getfield com/finalshell/core/Dl2.q I
      // 33: i2l
      // 34: lcmp
      // 35: aload 1
      // 36: ifnull 49
      // 39: ifge 59
      // 3c: lload 3
      // 3d: aload 5
      // 3f: invokevirtual com/finalshell/core/F92.Y ()J
      // 42: lsub
      // 43: aload 0
      // 44: getfield com/finalshell/core/Dl2.o I
      // 47: i2l
      // 48: lcmp
      // 49: aload 1
      // 4a: ifnull a8
      // 4d: ifle a2
      // 50: aload 5
      // 52: invokevirtual com/finalshell/core/F92.I ()V
      // 55: aload 1
      // 56: ifnonnull a2
      // 59: aload 5
      // 5b: getfield com/finalshell/core/F92.U Ljava/net/InetAddress;
      // 5e: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 61: aload 5
      // 63: getfield com/finalshell/core/F92.p I
      // 66: new java/util/Date
      // 69: dup
      // 6a: invokespecial java/util/Date.<init> ()V
      // 6d: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 70: astore 7
      // 72: istore 8
      // 74: astore 9
      // 76: getstatic com/finalshell/core/Dl2.a Ljava/lang/String;
      // 79: aload 9
      // 7b: ldc ":"
      // 7d: iload 8
      // 7f: ldc " "
      // 81: aload 7
      // 83: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // 88: invokestatic com/finalshell/core/Lx4_2.u (Ljava/lang/String;)V
      // 8b: aload 0
      // 8c: getfield com/finalshell/core/Dl2.y Ljava/lang/Object;
      // 8f: dup
      // 90: astore 6
      // 92: monitorenter
      // 93: aload 5
      // 95: invokevirtual com/finalshell/core/F92.q ()V
      // 98: aload 6
      // 9a: monitorexit
      // 9b: goto a2
      // 9e: aload 6
      // a0: monitorexit
      // a1: athrow
      // a2: aload 2
      // a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a8: ifne 11
      // ab: aload 1
      // ac: ifnull a2
      // af: return
   }

   public void J(int var1) {
      this.t.remove(var1);
   }

   public Iterator u() {
      Object var1 = null;
      synchronized (this.y) {
         return new com.finalshell.ui.model.TQ(this.t.keySet().iterator());
      }
   }

   public F92 d(int var1, InetAddress var2, int var3) {
      Ky4[] var10000 = Qm2.J();
      F92 var5 = (F92)this.t.get(var1);
      Ky4[] var4 = var10000;
      F92 var8 = var5;
      if (var4 != null) {
         if (var5 == null) {
            var5 = new F92(this.e, var1, var2, var3);
            synchronized (this.y) {
               this.t.put(var1, var5);
            }
         }

         var8 = var5;
      }

      return var8;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24891;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "跜旉儞閶;V=<Q\u0019{".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 26;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 26;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 67;
               break;
            case 1:
               var37 = 37;
               break;
            case 2:
               var37 = 119;
               break;
            case 3:
               var37 = 65;
               break;
            case 4:
               var37 = 66;
               break;
            case 5:
               var37 = 32;
               break;
            default:
               var37 = 78;
         }
      } else {
         var25 = 26;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 3827733119428819545L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "40ÀõÉ\u0013Ú\u008au]S§\u001e´Ë¡";
            int var13 = "40ÀõÉ\u0013Ú\u008au]S§\u001e´Ë¡".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 26;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 67;
               break;
            case 1:
               var37 = 37;
               break;
            case 2:
               var37 = 119;
               break;
            case 3:
               var37 = 65;
               break;
            case 4:
               var37 = 66;
               break;
            case 5:
               var37 = 32;
               break;
            default:
               var37 = 78;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 67;
                  break;
               case 1:
                  var37 = 37;
                  break;
               case 2:
                  var37 = 119;
                  break;
               case 3:
                  var37 = 65;
                  break;
               case 4:
                  var37 = 66;
                  break;
               case 5:
                  var37 = 32;
                  break;
               default:
                  var37 = 78;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 3827733119428819545L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "40ÀõÉ\u0013Ú\u008au]S§\u001e´Ë¡";
               int var5 = "40ÀõÉ\u0013Ú\u008au]S§\u001e´Ë¡".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 67;
                  break;
               case 1:
                  var37 = 37;
                  break;
               case 2:
                  var37 = 119;
                  break;
               case 3:
                  var37 = 65;
                  break;
               case 4:
                  var37 = 66;
                  break;
               case 5:
                  var37 = 32;
                  break;
               default:
                  var37 = 78;
            }
         }
      }
   }
}





