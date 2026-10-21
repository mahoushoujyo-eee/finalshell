import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Wf_2 extends W2 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public Wf_2() {
      Object[] var10001 = com.c.a(a);
      Method var10003 = com.c.d(241374024532053562L);
      Object[] var10002 = var10001;
      Wf_2 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   @Override
   public void O() {
      Object[] var10000 = com.c.a(com.c.c(372236004790213499L).get(this));
      Method var6 = com.c.d(492930666611970668L);
      Object[] var12 = var10000;
      Object var10 = null;

      try {
         var10000 = (String[])var6.invoke(var10, var12);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      String[] var2 = var10000;
      String var8 = W2.F();
      int var3 = 0;
      String var1 = var8;

      while (var3 < var2.length) {
         label100: {
            String var4 = var2[var3].trim();
            int var9 = var3;
            if (var1 != null) {
               if (var3 == 0) {
                  com.c.c(273077174819918348L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
            }

            int var11 = 1;
            if (var1 != null) {
               if (var9 == 1) {
                  com.c.c(229686802198140101L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = 2;
            }

            if (var1 != null) {
               if (var9 == var11) {
                  com.c.c(134193849553146860L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = 3;
            }

            if (var1 != null) {
               if (var9 == var11) {
                  com.c.c(426585214678858813L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = 4;
            }

            if (var1 != null) {
               if (var9 == var11) {
                  com.c.c(345568970084452224L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = 5;
            }

            if (var1 != null) {
               if (var9 == var11) {
                  com.c.c(360905323070155441L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = a(23747, 4153500945913195258L);
            }

            if (var1 != null) {
               if (var9 == var11) {
                  com.c.c(384957242155118038L).set(com.c.c(254384586786323749L).get(this), var4);
                  if (var1 != null) {
                     break label100;
                  }
               }

               var9 = var3;
               var11 = a(3923, 3930974507800590699L);
            }

            if (var9 == var11) {
               com.c.c(495176708386708024L).set(com.c.c(254384586786323749L).get(this), var4);
            }
         }

         var3++;
         if (var1 == null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30265;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





