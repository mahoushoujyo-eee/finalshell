package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class KY3 implements EU {
   public ChaChaEngine P;
   public ChaChaEngine u;
   public KeyParameter f;
   public KeyParameter D;
   public int n;
   public Poly1305 z;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public int w() {
      return a(25542, 4250405964038224850L);
   }

   @Override
   public int u() {
      return a(6407, 1745338289894048021L);
   }

   @Override
   public int j() {
      return a(8286, 3062491675511519310L);
   }

   @Override
   public void z(int var1, byte[] var2, byte[] var3) throws Exception {
      String var4 = K4.z();

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var2.length;
               if (var4 != null) {
                  break label37;
               }

               if (var10000 <= a(6407, 1745338289894048021L)) {
                  break label36;
               }
            } catch (Exception var11) {
               throw a(var11);
            }

            byte[] var5 = new byte[a(6407, 1745338289894048021L)];
            System.arraycopy(var2, 0, var5, 0, var5.length);
            var2 = var5;
         }

         var10000 = a(2491, 6247900791907045804L);
      }

      byte[] var6 = new byte[var10000];
      byte[] var7 = new byte[a(2491, 6247900791907045804L)];
      System.arraycopy(var2, a(2491, 6247900791907045804L), var6, 0, a(2491, 6247900791907045804L));
      System.arraycopy(var2, 0, var7, 0, a(2491, 6247900791907045804L));
      this.n = var1;

      try {
         this.f = new KeyParameter(var6, 0, var6.length);
         this.D = new KeyParameter(var7, 0, var7.length);
         this.P = new ChaChaEngine();
         this.u = new ChaChaEngine();
         this.z = new Poly1305();
      } catch (Exception var10) {
         this.P = null;
         this.u = null;
         this.f = null;
         this.D = null;
         throw var10;
      }

      try {
         if (Ky4.F$arrString() != null) {
            K4.Y("FRBfYb");
         }
      } catch (Exception var9) {
         throw a(var9);
      }
   }

   @Override
   public void S(int var1) throws Exception {
      String var10000 = K4.z();
      ByteBuffer var3 = ByteBuffer.allocate(a(22555, 6317735550937923594L));
      String var2 = var10000;

      int var10001;
      label49: {
         label48: {
            try {
               var3.putLong(0, (long)var1);
               var8 = this.P;
               var10001 = this.n;
               if (var2 != null) {
                  break label49;
               }

               if (this.n == 0) {
                  break label48;
               }
            } catch (Exception var7) {
               throw a(var7);
            }

            var10001 = 0;
            break label49;
         }

         var10001 = 1;
      }

      label40: {
         label39: {
            try {
               var8.init((boolean)var10001, new ParametersWithIV(this.f, var3.array(), 0, var3.array().length));
               var9 = this.u;
               var10001 = this.n;
               if (var2 != null) {
                  break label40;
               }

               if (this.n == 0) {
                  break label39;
               }
            } catch (Exception var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label40;
         }

         var10001 = 1;
      }

      var9.init((boolean)var10001, new ParametersWithIV(this.D, var3.array(), 0, var3.array().length));
      byte[] var4 = new byte[a(5250, 5089786397254503575L)];

      try {
         this.u.processBytes(var4, 0, var4.length, var4, 0);
         this.z.init(new KeyParameter(var4, 0, a(28658, 8254578760010151905L)));
         if (var2 != null) {
            Ky4.K(new String[3]);
         }
      } catch (Exception var5) {
         throw a(var5);
      }
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.P.processBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public void E(byte[] param1, int param2, int param3, byte[] param4, int param5) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/K4.z ()Ljava/lang/String;
      // 03: astore 6
      // 05: aload 0
      // 06: getfield com/finalshell/core/KY3.n I
      // 09: aload 6
      // 0b: ifnonnull 97
      // 0e: bipush 1
      // 0f: if_icmpne 7e
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/KY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: sipush 6700
      // 1c: ldc2_w 6652972783881339450
      // 1f: invokestatic com/finalshell/core/KY3.a (IJ)I
      // 22: newarray 8
      // 24: astore 7
      // 26: aload 1
      // 27: iload 3
      // 28: aload 7
      // 2a: bipush 0
      // 2b: sipush 8286
      // 2e: ldc2_w 3062491675511519310
      // 31: invokestatic com/finalshell/core/KY3.a (IJ)I
      // 34: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 37: sipush 8286
      // 3a: ldc2_w 3062491675511519310
      // 3d: invokestatic com/finalshell/core/KY3.a (IJ)I
      // 40: newarray 8
      // 42: astore 8
      // 44: aload 0
      // 45: getfield com/finalshell/core/KY3.z Lorg/bouncycastle/crypto/macs/Poly1305;
      // 48: aload 1
      // 49: iload 2
      // 4a: iload 3
      // 4b: invokevirtual org/bouncycastle/crypto/macs/Poly1305.update ([BII)V
      // 4e: aload 0
      // 4f: getfield com/finalshell/core/KY3.z Lorg/bouncycastle/crypto/macs/Poly1305;
      // 52: aload 8
      // 54: bipush 0
      // 55: invokevirtual org/bouncycastle/crypto/macs/Poly1305.doFinal ([BI)I
      // 58: pop
      // 59: aload 7
      // 5b: aload 8
      // 5d: invokestatic com/finalshell/core/KY3.k ([B[B)Z
      // 60: aload 6
      // 62: ifnonnull 97
      // 65: ifne 7e
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/KY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: new javax/crypto/AEADBadTagException
      // 72: dup
      // 73: getstatic com/finalshell/core/KY3.a Ljava/lang/String;
      // 76: invokespecial javax/crypto/AEADBadTagException.<init> (Ljava/lang/String;)V
      // 79: athrow
      // 7a: invokestatic com/finalshell/core/KY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield com/finalshell/core/KY3.u Lorg/bouncycastle/crypto/engines/ChaChaEngine;
      // 82: aload 1
      // 83: iload 2
      // 84: bipush 4
      // 85: iadd
      // 86: iload 3
      // 87: bipush 4
      // 88: isub
      // 89: aload 4
      // 8b: iload 5
      // 8d: bipush 4
      // 8e: iadd
      // 8f: invokevirtual org/bouncycastle/crypto/engines/ChaChaEngine.processBytes ([BII[BI)I
      // 92: pop
      // 93: aload 0
      // 94: getfield com/finalshell/core/KY3.n I
      // 97: aload 6
      // 99: ifnonnull c3
      // 9c: ifne c4
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/KY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5: athrow
      // a6: aload 0
      // a7: getfield com/finalshell/core/KY3.z Lorg/bouncycastle/crypto/macs/Poly1305;
      // aa: aload 4
      // ac: iload 5
      // ae: iload 3
      // af: invokevirtual org/bouncycastle/crypto/macs/Poly1305.update ([BII)V
      // b2: aload 0
      // b3: getfield com/finalshell/core/KY3.z Lorg/bouncycastle/crypto/macs/Poly1305;
      // b6: aload 4
      // b8: iload 3
      // b9: invokevirtual org/bouncycastle/crypto/macs/Poly1305.doFinal ([BI)I
      // bc: goto c3
      // bf: invokestatic com/finalshell/core/KY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: pop
      // c4: return
   }

   @Override
   public boolean Y() {
      return false;
   }

   @Override
   public boolean S() {
      return true;
   }

   @Override
   public boolean c() {
      return true;
   }

   public static boolean k(byte[] var0, byte[] var1) {
      String var2 = K4.z();
      int var10000 = var0.length;
      if (var2 == null) {
         if (var10000 != var1.length) {
            return false;
         }

         var10000 = 0;
      }

      int var3 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var0.length) {
            var3 |= var0[var4] ^ var1[var4];
            var4++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         if (var2 != null) {
            return var3 != 0;
         }

         if (var3 == 0) {
            return 1 != 0;
         }
         break;
      }

      return 0 != 0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22544;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\b\u000b|m\u0007+\u00171\u000bo.\u0002".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 78;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 78;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 18;
               break;
            case 1:
               var50 = 36;
               break;
            case 2:
               var50 = 85;
               break;
            case 3:
               var50 = 3;
               break;
            case 4:
               var50 = 36;
               break;
            case 5:
               var50 = 12;
               break;
            default:
               var50 = 42;
         }
      } else {
         var34 = 78;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3801446227395116548L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "£\u009dHõ\u000eÖ\u0006Z0$\u0093Ú2!~\u0006\u001aSÀ\u000b\u009e§¿QZ\u0012\u0098¤8AÉÅ\u0082\u009b¹v\u0095\u0011EÞß\u0015áX\u001eZ2Ó";
            int var13 = "£\u009dHõ\u000eÖ\u0006Z0$\u0093Ú2!~\u0006\u001aSÀ\u000b\u009e§¿QZ\u0012\u0098¤8AÉÅ\u0082\u009b¹v\u0095\u0011EÞß\u0015áX\u001eZ2Ó"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ÔÍ8©\u008b4¼.952Ø-\"/\u0088";
                        var13 = "ÔÍ8©\u008b4¼.952Ø-\"/\u0088".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 78;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 18;
               break;
            case 1:
               var50 = 36;
               break;
            case 2:
               var50 = 85;
               break;
            case 3:
               var50 = 3;
               break;
            case 4:
               var50 = 36;
               break;
            case 5:
               var50 = 12;
               break;
            default:
               var50 = 42;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 18;
                  break;
               case 1:
                  var50 = 36;
                  break;
               case 2:
                  var50 = 85;
                  break;
               case 3:
                  var50 = 3;
                  break;
               case 4:
                  var50 = 36;
                  break;
               case 5:
                  var50 = 12;
                  break;
               default:
                  var50 = 42;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3801446227395116548L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "£\u009dHõ\u000eÖ\u0006Z0$\u0093Ú2!~\u0006\u001aSÀ\u000b\u009e§¿QZ\u0012\u0098¤8AÉÅ\u0082\u009b¹v\u0095\u0011EÞß\u0015áX\u001eZ2Ó";
               int var5 = "£\u009dHõ\u000eÖ\u0006Z0$\u0093Ú2!~\u0006\u001aSÀ\u000b\u009e§¿QZ\u0012\u0098¤8AÉÅ\u0082\u009b¹v\u0095\u0011EÞß\u0015áX\u001eZ2Ó"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ÔÍ8©\u008b4¼.952Ø-\"/\u0088";
                           var5 = "ÔÍ8©\u008b4¼.952Ø-\"/\u0088".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 18;
                  break;
               case 1:
                  var50 = 36;
                  break;
               case 2:
                  var50 = 85;
                  break;
               case 3:
                  var50 = 3;
                  break;
               case 4:
                  var50 = 36;
                  break;
               case 5:
                  var50 = 12;
                  break;
               default:
                  var50 = 42;
            }
         }
      }
   }
}





