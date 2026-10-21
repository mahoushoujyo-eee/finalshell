import java.io.IOException;
import java.io.InputStream;

public class K6 implements Runnable {
   private Thread T;
   private InputStream C;
   private int[] W = new int[a(4878, 3477813539620822517L)];
   private int i = 0;
   private int b = 0;
   private boolean K = false;
   private boolean J = false;
   private static final String a;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;

   public K6(InputStream var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic CK.Z ()Z
      // 03: bipush -1
      // 04: istore 2
      // 05: istore 1
      // 06: aload 0
      // 07: getfield K6.J Z
      // 0a: ifne dd
      // 0d: aload 0
      // 0e: getfield K6.i I
      // 11: aload 0
      // 12: getfield K6.b I
      // 15: bipush 1
      // 16: isub
      // 17: if_icmpeq 55
      // 1a: aload 0
      // 1b: getfield K6.b I
      // 1e: iload 1
      // 1f: ifne 86
      // 22: goto 29
      // 25: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: ifne 79
      // 2c: goto 33
      // 2f: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: getfield K6.i I
      // 37: sipush 28086
      // 3a: ldc2_w 4797487385687843660
      // 3d: invokestatic K6.a (IJ)I
      // 40: iload 1
      // 41: ifne 87
      // 44: goto 4b
      // 47: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: if_icmpne 79
      // 4e: goto 55
      // 51: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: sipush 28477
      // 58: ldc2_w 4987227606813147709
      // 5b: invokestatic K6.b (IJ)J
      // 5e: invokestatic java/lang/Thread.sleep (J)V
      // 61: goto 0d
      // 64: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: astore 3
      // 69: aload 0
      // 6a: getfield K6.J Z
      // 6d: ifeq 75
      // 70: return
      // 71: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 1
      // 76: ifeq 0d
      // 79: aload 0
      // 7a: iload 1
      // 7b: ifne 8b
      // 7e: getfield K6.C Ljava/io/InputStream;
      // 81: invokevirtual java/io/InputStream.read ()I
      // 84: dup
      // 85: istore 2
      // 86: bipush -1
      // 87: if_icmpeq 98
      // 8a: aload 0
      // 8b: getfield K6.W [I
      // 8e: aload 0
      // 8f: getfield K6.i I
      // 92: iload 2
      // 93: iastore
      // 94: iload 1
      // 95: ifeq 9c
      // 98: iload 1
      // 99: ifeq dd
      // 9c: goto a8
      // 9f: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: astore 3
      // a4: iload 1
      // a5: ifeq dd
      // a8: aload 0
      // a9: dup
      // aa: getfield K6.i I
      // ad: bipush 1
      // ae: iadd
      // af: putfield K6.i I
      // b2: aload 0
      // b3: iload 1
      // b4: ifne d5
      // b7: goto be
      // ba: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bd: athrow
      // be: getfield K6.i I
      // c1: sipush 4878
      // c4: ldc2_w 3477813539620822517
      // c7: invokestatic K6.a (IJ)I
      // ca: if_icmpne 06
      // cd: goto d4
      // d0: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: aload 0
      // d5: bipush 0
      // d6: putfield K6.i I
      // d9: iload 1
      // da: ifeq 06
      // dd: return
   }

   public boolean A() {
      boolean var1 = CK.r();
      int var10000 = this.i;
      if (var1) {
         var10000 = this.i != this.b ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public int p(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic CK.Z ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield K6.J Z
      // 08: iload 3
      // 09: ifne 28
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: sipush 24935
      // 19: ldc2_w 2467544592860671903
      // 1c: invokestatic K6.a (IJ)I
      // 1f: ireturn
      // 20: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield K6.K Z
      // 28: iload 3
      // 29: ifne 59
      // 2c: ifne 55
      // 2f: goto 36
      // 32: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: new java/lang/Thread
      // 3a: dup
      // 3b: aload 0
      // 3c: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 3f: putfield K6.T Ljava/lang/Thread;
      // 42: aload 0
      // 43: getfield K6.T Ljava/lang/Thread;
      // 46: invokevirtual java/lang/Thread.start ()V
      // 49: aload 0
      // 4a: bipush 1
      // 4b: putfield K6.K Z
      // 4e: goto 55
      // 51: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual K6.A ()Z
      // 59: ifne b9
      // 5c: aload 0
      // 5d: getfield K6.J Z
      // 60: iload 3
      // 61: ifne c2
      // 64: goto 6b
      // 67: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: iload 3
      // 6c: ifne c2
      // 6f: goto 76
      // 72: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: ifne b9
      // 79: goto 80
      // 7c: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: lload 1
      // 81: lconst_1
      // 82: lsub
      // 83: dup2
      // 84: lstore 1
      // 85: iload 3
      // 86: ifne ad
      // 89: lconst_0
      // 8a: lcmp
      // 8b: ifge a4
      // 8e: goto 95
      // 91: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: new java/io/IOException
      // 98: dup
      // 99: getstatic K6.a Ljava/lang/String;
      // 9c: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 9f: athrow
      // a0: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: sipush 30081
      // a7: ldc2_w 7722954458724407424
      // aa: invokestatic K6.b (IJ)J
      // ad: invokestatic java/lang/Thread.sleep (J)V
      // b0: goto 55
      // b3: astore 4
      // b5: iload 3
      // b6: ifeq 55
      // b9: aload 0
      // ba: getfield K6.W [I
      // bd: aload 0
      // be: getfield K6.b I
      // c1: iaload
      // c2: istore 4
      // c4: aload 0
      // c5: dup
      // c6: getfield K6.b I
      // c9: bipush 1
      // ca: iadd
      // cb: putfield K6.b I
      // ce: aload 0
      // cf: getfield K6.b I
      // d2: iload 3
      // d3: ifne f7
      // d6: sipush 4878
      // d9: ldc2_w 3477813539620822517
      // dc: invokestatic K6.a (IJ)I
      // df: if_icmpne f5
      // e2: goto e9
      // e5: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e8: athrow
      // e9: aload 0
      // ea: bipush 0
      // eb: putfield K6.b I
      // ee: goto f5
      // f1: invokestatic K6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f4: athrow
      // f5: iload 4
      // f7: ireturn
   }

   public void P() {
      boolean var10000 = CK.r();
      this.J = true;
      boolean var1 = var10000;
      Thread var2 = this.T;
      if (var1) {
         if (this.T == null) {
            return;
         }

         var2 = this.T;
      }

      var2.interrupt();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ")\u001c\u0018\u0018&Yq\b\u0001".toCharArray();
      int var10004 = var10003.length;
      int var16 = 0;
      byte var44 = 43;
      char[] var10002 = var10003;
      int var31 = var10004;
      char[] var52;
      byte var60;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var52 = var10003;
         var10005 = var16;
         char var10008 = var10003[var16];
         var10007 = 43;
         var10006 = var10008;
         switch (var16 % 7) {
            case 0:
               var60 = 86;
               break;
            case 1:
               var60 = 94;
               break;
            case 2:
               var60 = 94;
               break;
            case 3:
               var60 = 86;
               break;
            case 4:
               var60 = 105;
               break;
            case 5:
               var60 = 82;
               break;
            default:
               var60 = 53;
         }
      } else {
         var44 = 43;
         var31 = var10004;
         if (var10004 <= var16) {
            String var49 = new String(var10003).intern();
            int var38 = -1;
            a = var49;
            long var24 = 2164982477651194909L;
            long[] var29 = new long[3];
            int var26 = 0;
            String var27 = "\u0012Æ\u009e\u00ad+\u000fSQf'¥Ý5|\u00adè(æ$É\t½[\u009a";
            int var28 = "\u0012Æ\u009e\u00ad+\u000fSQf'¥Ý5|\u00adè(æ$É\t½[\u009a".length();
            byte var25 = 0;

            do {
               var38 = var25;
               var25 += 8;
               byte[] var30 = var27.substring(var38, var25).getBytes("ISO-8859-1");
               var38 = var26++;
               long var57 = (
                     ((long)var30[0] & 255L) << 56
                        | ((long)var30[1] & 255L) << 48
                        | ((long)var30[2] & 255L) << 40
                        | ((long)var30[3] & 255L) << 32
                        | ((long)var30[4] & 255L) << 24
                        | ((long)var30[5] & 255L) << 16
                        | ((long)var30[6] & 255L) << 8
                        | (long)var30[7] & 255L
                  )
                  ^ var24;
               byte var50 = -1;
               var29[var38] = var57;
            } while (var25 < var28);

            c = var29;
            d = new Integer[3];
            long var17 = 995829755541878929L;
            long[] var22 = new long[2];
            int var19 = 0;
            String var20 = "HçÔ÷MÈúVfü\u0097Ë{\u001fàu";
            int var21 = "HçÔ÷MÈúVfü\u0097Ë{\u001fàu".length();
            byte var18 = 0;

            do {
               int var41 = var18;
               var18 += 8;
               byte[] var23 = var20.substring(var41, var18).getBytes("ISO-8859-1");
               var41 = var19++;
               long var58 = (
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
               byte var51 = -1;
               var22[var41] = var58;
            } while (var18 < var21);

            e = var22;
            f = new Long[2];
            return;
         }

         var52 = var10003;
         var10005 = var16;
         char var61 = var10003[var16];
         var10007 = 43;
         var10006 = var61;
         switch (var16 % 7) {
            case 0:
               var60 = 86;
               break;
            case 1:
               var60 = 94;
               break;
            case 2:
               var60 = 94;
               break;
            case 3:
               var60 = 86;
               break;
            case 4:
               var60 = 105;
               break;
            case 5:
               var60 = 82;
               break;
            default:
               var60 = 53;
         }
      }

      while (true) {
         var52[var10005] = (char)(var10006 ^ var10007 ^ var60);
         var16++;
         if (var44 == 0) {
            var52 = var10002;
            var10005 = var44;
            char var63 = var10002[var44];
            var10007 = var44;
            var10006 = var63;
            switch (var16 % 7) {
               case 0:
                  var60 = 86;
                  break;
               case 1:
                  var60 = 94;
                  break;
               case 2:
                  var60 = 94;
                  break;
               case 3:
                  var60 = 86;
                  break;
               case 4:
                  var60 = 105;
                  break;
               case 5:
                  var60 = 82;
                  break;
               default:
                  var60 = 53;
            }
         } else {
            if (var31 <= var16) {
               String var46 = new String(var10002).intern();
               int var33 = -1;
               a = var46;
               long var8 = 2164982477651194909L;
               long[] var14 = new long[3];
               int var11 = 0;
               String var12 = "\u0012Æ\u009e\u00ad+\u000fSQf'¥Ý5|\u00adè(æ$É\t½[\u009a";
               int var13 = "\u0012Æ\u009e\u00ad+\u000fSQf'¥Ý5|\u00adè(æ$É\t½[\u009a".length();
               byte var10 = 0;

               do {
                  var33 = var10;
                  var10 += 8;
                  byte[] var15 = var12.substring(var33, var10).getBytes("ISO-8859-1");
                  var33 = var11++;
                  long var55 = (
                        ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L
                     )
                     ^ var8;
                  byte var47 = -1;
                  var14[var33] = var55;
               } while (var10 < var13);

               c = var14;
               d = new Integer[3];
               long var0 = 995829755541878929L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "HçÔ÷MÈúVfü\u0097Ë{\u001fàu";
               int var5 = "HçÔ÷MÈúVfü\u0097Ë{\u001fàu".length();
               byte var2 = 0;

               do {
                  int var36 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                  var36 = var3++;
                  long var56 = (
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
                  byte var48 = -1;
                  var6[var36] = var56;
               } while (var2 < var5);

               e = var6;
               f = new Long[2];
               return;
            }

            var52 = var10002;
            var10005 = var16;
            char var62 = var10002[var16];
            var10007 = var44;
            var10006 = var62;
            switch (var16 % 7) {
               case 0:
                  var60 = 86;
                  break;
               case 1:
                  var60 = 94;
                  break;
               case 2:
                  var60 = 94;
                  break;
               case 3:
                  var60 = 86;
                  break;
               case 4:
                  var60 = 105;
                  break;
               case 5:
                  var60 = 82;
                  break;
               default:
                  var60 = 53;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3834;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 27904) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }
}





