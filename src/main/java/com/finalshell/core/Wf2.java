package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Wf2 extends W2 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Wf2() {
      Object[] var10001 = Registry.packArgs(a);
      long var2 = 241374024532053562L;
      Object[] var1 = var10001;
      Ref.h(241374024532053562L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void O() {
      Object var5 = 372236004790213499L;
      Registry.packArgs(Ref.g(372236004790213499L, var5));
      long var7 = 492930666611970668L;
      Object var10002 = Ref.h2(492930666611970668L, var7);

      try {
         var10002 = (String[])var10002;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      String[] var2 = (String[])var10002;
      var10002 = W2.F();
      int var3 = 0;
      String var1 = (String)var10002;

      while (var3 < var2.length) {
         label100: {
            String var4 = var2[var3].trim();
            int var44 = var3;
            if (var1 != null) {
               if (var3 == 0) {
                  Object var9 = 254384586786323749L;
                  Ref.g(254384586786323749L, var9);
                  long var12 = 273077174819918348L;
                  Ref.s(273077174819918348L, var4, var12);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
            }

            int var10003 = 1;
            if (var1 != null) {
               if (var44 == 1) {
                  Object var13 = 254384586786323749L;
                  Ref.g(254384586786323749L, var13);
                  long var16 = 229686802198140101L;
                  Ref.s(229686802198140101L, var4, var16);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = 2;
            }

            if (var1 != null) {
               if (var44 == var10003) {
                  Object var17 = 254384586786323749L;
                  Ref.g(254384586786323749L, var17);
                  long var20 = 134193849553146860L;
                  Ref.s(134193849553146860L, var4, var20);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = 3;
            }

            if (var1 != null) {
               if (var44 == var10003) {
                  Object var21 = 254384586786323749L;
                  Ref.g(254384586786323749L, var21);
                  long var24 = 426585214678858813L;
                  Ref.s(426585214678858813L, var4, var24);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = 4;
            }

            if (var1 != null) {
               if (var44 == var10003) {
                  Object var25 = 254384586786323749L;
                  Ref.g(254384586786323749L, var25);
                  long var28 = 345568970084452224L;
                  Ref.s(345568970084452224L, var4, var28);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = 5;
            }

            if (var1 != null) {
               if (var44 == var10003) {
                  Object var29 = 254384586786323749L;
                  Ref.g(254384586786323749L, var29);
                  long var32 = 360905323070155441L;
                  Ref.s(360905323070155441L, var4, var32);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = a(23747, 4153500945913195258L);
            }

            if (var1 != null) {
               if (var44 == var10003) {
                  Object var33 = 254384586786323749L;
                  Ref.g(254384586786323749L, var33);
                  long var36 = 384957242155118038L;
                  Ref.s(384957242155118038L, var4, var36);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var44 = var3;
               var10003 = a(3923, 3930974507800590699L);
            }

            if (var44 == var10003) {
               Object var37 = 254384586786323749L;
               Ref.g(254384586786323749L, var37);
               long var40 = 495176708386708024L;
               Ref.s(495176708386708024L, var4, var40);
            }
         }

         var3++;
         if (var1 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30265;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "'\u0003A~eN-!VU}a\u0003er@N(u\u0000a?\b\u0000>rUu<\fMv Cvi\u0018Nrm\u000b \u007f\u0000\u001bfn\u000fm7M\rc;\u001bn3\u0000E3-\u0007;'\u0003A~eN-="
         .toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 90;
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
         var10007 = 90;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 8;
               break;
            case 1:
               var37 = 55;
               break;
            case 2:
               var37 = 122;
               break;
            case 3:
               var37 = 73;
               break;
            case 4:
               var37 = 90;
               break;
            case 5:
               var37 = 52;
               break;
            default:
               var37 = 90;
         }
      } else {
         var25 = 90;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2645282152617454591L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "{\u0092iG\u009a\u0016\u0001\u0003I±\\¥ëàR\u0093";
            int var13 = "{\u0092iG\u009a\u0016\u0001\u0003I±\\¥ëàR\u0093".length();
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
         var10007 = 90;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 8;
               break;
            case 1:
               var37 = 55;
               break;
            case 2:
               var37 = 122;
               break;
            case 3:
               var37 = 73;
               break;
            case 4:
               var37 = 90;
               break;
            case 5:
               var37 = 52;
               break;
            default:
               var37 = 90;
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
                  var37 = 8;
                  break;
               case 1:
                  var37 = 55;
                  break;
               case 2:
                  var37 = 122;
                  break;
               case 3:
                  var37 = 73;
                  break;
               case 4:
                  var37 = 90;
                  break;
               case 5:
                  var37 = 52;
                  break;
               default:
                  var37 = 90;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2645282152617454591L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "{\u0092iG\u009a\u0016\u0001\u0003I±\\¥ëàR\u0093";
               int var5 = "{\u0092iG\u009a\u0016\u0001\u0003I±\\¥ëàR\u0093".length();
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
                  var37 = 8;
                  break;
               case 1:
                  var37 = 55;
                  break;
               case 2:
                  var37 = 122;
                  break;
               case 3:
                  var37 = 73;
                  break;
               case 4:
                  var37 = 90;
                  break;
               case 5:
                  var37 = 52;
                  break;
               default:
                  var37 = 90;
            }
         }
      }
   }
}





