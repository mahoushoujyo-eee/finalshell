import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class zX {
   ArrayList R;
   ArrayList O;
   String d;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public static void main(String[] var0) {
      PrintStream var10000 = System.out;
      zX var10001 = new zX(a);
      Object[] var10002 = com.c.a(a(11769, 3652905388264958844L));
      Method var10004 = com.c.d(416740220276092047L);
      Object[] var10003 = var10002;
      zX var4 = var10001;
      Method var2 = var10004;

      try {
         var3 = (Boolean)var2.invoke(var4, var10003);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000.println(var3);
   }

   public zX(String var1) {
      com.c.c(146154677724726531L).set(this, new ArrayList());
      com.c.c(232915715875859675L).set(this, new ArrayList());
      com.c.c(534533505321913417L).set(this, var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(382920461389417432L);
      Object[] var10002 = var10001;
      zX var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   void W() {
      String[] var10000 = F_.F();
      char var2 = 0;
      int var3 = 0;
      String[] var1 = var10000;

      while (var3 < ((String)com.c.c(534533505321913417L).get(this)).length()) {
         label48: {
            char var6 = var2;
            if (var1 != null) {
               if (var2 != 0) {
                  ((ArrayList)com.c.c(146154677724726531L).get(this)).add(var3);
                  var2 = 0;
                  if (var1 != null) {
                     break label48;
                  }
               }

               var6 = ((String)com.c.c(534533505321913417L).get(this)).charAt(var3);
            }

            char var4 = var6;
            char var7 = var4;
            if (var1 != null) {
               if (var4 == a(31120, 8152296831967166228L)) {
                  var2 = 1;
                  Object[] var10001 = com.c.a(var3);
                  Method var10003 = com.c.d(196196524577674886L);
                  Object[] var10002 = var10001;
                  zX var9 = this;
                  Method var8 = var10003;

                  try {
                     var8.invoke(var9, var10002);
                  } catch (InvocationTargetException var5) {
                     throw var5.getTargetException();
                  }

                  if (var1 != null) {
                     break label48;
                  }
               }

               var7 = 0;
            }

            var2 = var7;
         }

         var3++;
         if (var1 == null) {
            break;
         }
      }
   }

   public void m(int var1) {
      ((ArrayList)com.c.c(146154677724726531L).get(this)).add(var1);
      ((ArrayList)com.c.c(146154677724726531L).get(this)).add(var1 + 1);
      ((ArrayList)com.c.c(232915715875859675L).get(this)).add(var1);
   }

   public boolean R(int var1) {
      String[] var10000 = F_.F();
      int var3 = 0;
      Iterator var4 = ((ArrayList)com.c.c(146154677724726531L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         label26:
         if (var4.hasNext()) {
            int var5 = (Integer)var4.next();
            var6 = var1;
            if (var2 == null) {
               break;
            }

            label23: {
               if (var2 != null) {
                  if (var1 != var5) {
                     break label23;
                  }

                  var6 = 1;
               }

               var3 = var6;
               if (var2 != null) {
                  break label26;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return (boolean)var6;
   }

   public boolean q(int var1) {
      int var3 = 0;
      String[] var10000 = F_.F();
      Iterator var4 = ((ArrayList)com.c.c(232915715875859675L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         label26:
         if (var4.hasNext()) {
            int var5 = (Integer)var4.next();
            var6 = var1;
            if (var2 == null) {
               break;
            }

            label23: {
               if (var2 != null) {
                  if (var1 != var5) {
                     break label23;
                  }

                  var6 = 1;
               }

               var3 = var6;
               if (var2 != null) {
                  break label26;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return (boolean)var6;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\f/tuo,/\u001b*sbUo,".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 124;
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
         var10007 = 124;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 17;
               break;
            case 1:
               var37 = 50;
               break;
            case 2:
               var37 = 105;
               break;
            case 3:
               var37 = 104;
               break;
            case 4:
               var37 = 79;
               break;
            case 5:
               var37 = 97;
               break;
            default:
               var37 = 53;
         }
      } else {
         var25 = 124;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 4544509559427520432L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "ÿKçÔtú¨øô®0\u0093\u0011¯üÄ";
            int var13 = "ÿKçÔtú¨øô®0\u0093\u0011¯üÄ".length();
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
         var10007 = 124;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 17;
               break;
            case 1:
               var37 = 50;
               break;
            case 2:
               var37 = 105;
               break;
            case 3:
               var37 = 104;
               break;
            case 4:
               var37 = 79;
               break;
            case 5:
               var37 = 97;
               break;
            default:
               var37 = 53;
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
                  var37 = 17;
                  break;
               case 1:
                  var37 = 50;
                  break;
               case 2:
                  var37 = 105;
                  break;
               case 3:
                  var37 = 104;
                  break;
               case 4:
                  var37 = 79;
                  break;
               case 5:
                  var37 = 97;
                  break;
               default:
                  var37 = 53;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 4544509559427520432L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "ÿKçÔtú¨øô®0\u0093\u0011¯üÄ";
               int var5 = "ÿKçÔtú¨øô®0\u0093\u0011¯üÄ".length();
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
                  var37 = 17;
                  break;
               case 1:
                  var37 = 50;
                  break;
               case 2:
                  var37 = 105;
                  break;
               case 3:
                  var37 = 104;
                  break;
               case 4:
                  var37 = 79;
                  break;
               case 5:
                  var37 = 97;
                  break;
               default:
                  var37 = 53;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1668;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





