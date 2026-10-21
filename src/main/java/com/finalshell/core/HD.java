package com.finalshell.core;

public class HD extends Hq2 {
   public final FU N;
   public final FU y;
   public final FU p;
   final B3_2 z;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   HD(B3_2 var1, FU var2, FU var3, FU var4) {
      super(var1, null);
      this.z = var1;
      this.N = var2;
      this.y = var3;
      this.p = var4;
   }

   @Override
   public void W() {
   }

   @Override
   public void i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/HD.y Lcom/finalshell/core/FU;
      // 08: getfield com/finalshell/core/FU.E I
      // 0b: bipush -1
      // 0c: aload 1
      // 0d: ifnull 29
      // 10: if_icmpeq 37
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/HD.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/finalshell/core/HD.p Lcom/finalshell/core/FU;
      // 1e: getfield com/finalshell/core/FU.E I
      // 21: bipush -1
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/HD.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 28: athrow
      // 29: aload 1
      // 2a: ifnull 54
      // 2d: if_icmpne 46
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/HD.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 36: athrow
      // 37: new com/finalshell/core/P_5
      // 3a: dup
      // 3b: getstatic com/finalshell/core/HD.a Ljava/lang/String;
      // 3e: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 41: athrow
      // 42: invokestatic com/finalshell/core/HD.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/finalshell/core/HD.p Lcom/finalshell/core/FU;
      // 4a: getfield com/finalshell/core/FU.E I
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/HD.y Lcom/finalshell/core/FU;
      // 51: getfield com/finalshell/core/FU.E I
      // 54: isub
      // 55: istore 2
      // 56: bipush 4
      // 57: newarray 8
      // 59: dup
      // 5a: bipush 0
      // 5b: iload 2
      // 5c: sipush 26203
      // 5f: ldc2_w 5755400069355521437
      // 62: invokestatic com/finalshell/core/HD.a (IJ)I
      // 65: ishr
      // 66: i2b
      // 67: bastore
      // 68: dup
      // 69: bipush 1
      // 6a: iload 2
      // 6b: sipush 7163
      // 6e: ldc2_w 1485853274894055487
      // 71: invokestatic com/finalshell/core/HD.a (IJ)I
      // 74: ishr
      // 75: i2b
      // 76: bastore
      // 77: dup
      // 78: bipush 2
      // 79: iload 2
      // 7a: sipush 28043
      // 7d: ldc2_w 852927981213437516
      // 80: invokestatic com/finalshell/core/HD.a (IJ)I
      // 83: ishr
      // 84: i2b
      // 85: bastore
      // 86: dup
      // 87: bipush 3
      // 88: iload 2
      // 89: i2b
      // 8a: bastore
      // 8b: astore 3
      // 8c: aload 3
      // 8d: bipush 0
      // 8e: aload 0
      // 8f: getfield com/finalshell/core/HD.z Lcom/finalshell/core/B3_2;
      // 92: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 95: aload 0
      // 96: getfield com/finalshell/core/HD.N Lcom/finalshell/core/FU;
      // 99: getfield com/finalshell/core/FU.E I
      // 9c: bipush 4
      // 9d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a0: return
   }

   static FU E(HD var0) {
      return var0.y;
   }

   static FU T(HD var0) {
      return var0.p;
   }

   public static P_5 a(P_5 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9158;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "#\b\u0015~7Rj\u0012\f\u0017\u007f;G>\u0005I\u0014v>U/\u0014I\u0019b9H)\bI\u000f\u007fxS$\u0013\f\u000f0<C9\u0014\u0000\u0015q,O%\u000eI\u0014v>U/\u0014"
         .toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 33;
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
         var10007 = 33;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 65;
               break;
            case 1:
               var37 = 72;
               break;
            case 2:
               var37 = 90;
               break;
            case 3:
               var37 = 49;
               break;
            case 4:
               var37 = 121;
               break;
            case 5:
               var37 = 7;
               break;
            default:
               var37 = 107;
         }
      } else {
         var25 = 33;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 989219453243424840L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "û7Õ\r¡JÅÍ¦H\u00808ØLÎ\fJÆµè]\u00128g";
            int var13 = "û7Õ\r¡JÅÍ¦H\u00808ØLÎ\fJÆµè]\u00128g".length();
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
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 33;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 65;
               break;
            case 1:
               var37 = 72;
               break;
            case 2:
               var37 = 90;
               break;
            case 3:
               var37 = 49;
               break;
            case 4:
               var37 = 121;
               break;
            case 5:
               var37 = 7;
               break;
            default:
               var37 = 107;
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
                  var37 = 65;
                  break;
               case 1:
                  var37 = 72;
                  break;
               case 2:
                  var37 = 90;
                  break;
               case 3:
                  var37 = 49;
                  break;
               case 4:
                  var37 = 121;
                  break;
               case 5:
                  var37 = 7;
                  break;
               default:
                  var37 = 107;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 989219453243424840L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "û7Õ\r¡JÅÍ¦H\u00808ØLÎ\fJÆµè]\u00128g";
               int var5 = "û7Õ\r¡JÅÍ¦H\u00808ØLÎ\fJÆµè]\u00128g".length();
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
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 65;
                  break;
               case 1:
                  var37 = 72;
                  break;
               case 2:
                  var37 = 90;
                  break;
               case 3:
                  var37 = 49;
                  break;
               case 4:
                  var37 = 121;
                  break;
               case 5:
                  var37 = 7;
                  break;
               default:
                  var37 = 107;
            }
         }
      }
   }
}





