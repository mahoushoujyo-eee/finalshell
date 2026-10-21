package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class ZX_2 {
   ArrayList R;
   ArrayList O;
   String d;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public static void main(String[] var0) {
      ZX_2 var10001 = new ZX_2(a);
      Object[] var10002 = Registry.packArgs(a(11769, 3652905388264958844L));
      long var2 = 416740220276092047L;
      Object[] var1 = var10002;
      var10002 = Ref.h(416740220276092047L, var1, var2);

      try {
         var5 = (Boolean)var10002;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001.println(var5);
   }

   public ZX_2(String var1) {
      ArrayList var10001 = new ArrayList();
      long var3 = 146154677724726531L;
      ArrayList var2 = var10001;
      Ref.s(146154677724726531L, var2, var3);
      ArrayList var10002 = new ArrayList();
      long var5 = 232915715875859675L;
      ArrayList var4 = var10002;
      Ref.s(232915715875859675L, var4, var5);
      long var7 = 534533505321913417L;
      Ref.s(534533505321913417L, var1, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 382920461389417432L;
      Object[] var8 = var10004;
      Ref.h(382920461389417432L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   void W() {
      String[] var10000 = Backspace.F();
      ZX_2 var2 = false;
      int var3 = 0;
      String[] var1 = var10000;

      do {
         Object var5 = 534533505321913417L;
         if (!(this < ((String)Ref.g(534533505321913417L, var5)).length())) {
            break;
         }

         label48: {
            ZX_2 var10001 = var2;
            if (var1 != null) {
               if (var2 != false) {
                  Object var7 = 146154677724726531L;
                  ((ArrayList)Ref.g(146154677724726531L, var7)).add(var3);
                  var2 = false;
                  if (var1 != null) {
                     break label48;
                  }
               }

               var10001 = this;
               Object var9 = 534533505321913417L;
               ((String)Ref.g(534533505321913417L, var9)).charAt(var3);
            }

            ZX_2 var4 = var10001;
            var10001 = var4;
            if (var1 != null) {
               if (var4 == a(31120, 8152296831967166228L)) {
                  var2 = true;
                  Object[] var10002 = Registry.packArgs(var3);
                  long var12 = 196196524577674886L;
                  Object[] var11 = var10002;
                  Ref.h(196196524577674886L, var11, var12);

                  try {
                     ;
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  if (var1 != null) {
                     break label48;
                  }
               }

               var10001 = false;
            }

            var2 = var10001;
         }

         var3++;
      } while (var1 != null);
   }

   public void m(int var1) {
      Object var2 = 146154677724726531L;
      ((ArrayList)Ref.g(146154677724726531L, var2)).add(var1);
      Object var4 = 146154677724726531L;
      ((ArrayList)Ref.g(146154677724726531L, var4)).add(var1 + 1);
      Object var6 = 232915715875859675L;
      ((ArrayList)Ref.g(232915715875859675L, var6)).add(var1);
   }

   public boolean R(int var1) {
      Backspace.F();
      int var3 = 0;
      Object var6 = 146154677724726531L;
      Iterator var4 = ((ArrayList)Ref.g(146154677724726531L, var6)).iterator();
      ZX_2 var2 = this;

      int var10001;
      while (true) {
         label26:
         if (var4.hasNext()) {
            int var5 = (Integer)var4.next();
            var10001 = var1;
            if (var2 == null) {
               break;
            }

            label23: {
               if (var2 != null) {
                  if (var1 != var5) {
                     break label23;
                  }

                  var10001 = 1;
               }

               var3 = var10001;
               if (var2 != null) {
                  break label26;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001 != 0;
   }

   public boolean q(int var1) {
      int var3 = 0;
      Backspace.F();
      Object var6 = 232915715875859675L;
      Iterator var4 = ((ArrayList)Ref.g(232915715875859675L, var6)).iterator();
      ZX_2 var2 = this;

      int var10001;
      while (true) {
         label26:
         if (var4.hasNext()) {
            int var5 = (Integer)var4.next();
            var10001 = var1;
            if (var2 == null) {
               break;
            }

            label23: {
               if (var2 != null) {
                  if (var1 != var5) {
                     break label23;
                  }

                  var10001 = 1;
               }

               var3 = var10001;
               if (var2 != null) {
                  break label26;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001 != 0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1668;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
}





