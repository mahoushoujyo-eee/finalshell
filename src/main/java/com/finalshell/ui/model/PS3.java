package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class PS3 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   PS3(String var1, int var2, int[] var3) {
      super(var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 32:
               return b(22739, 1621148388097827633L);
            case 59:
               return b(24932, 3319816252677233285L);
            case 60:
               return b(27465, 6861003163762725036L);
            case 61:
               return b(19397, 8853399796997074987L);
            case 62:
               return b(30173, 527254246849744443L);
            case 64:
               return b(28425, 4817293319986779366L);
            case 91:
               return b(11255, 6458680791600418832L);
            case 92:
               return b(18735, 11985810980582092L);
            case 93:
               return b(21086, 1486653411594217914L);
            case 94:
               return b(20978, 9211052943038130706L);
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31719;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6116269767657362602L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "ò¢Ï\u0004\u001fVÄ^E\u0007\u0010fjf\u001aMÁ3EYyE\u0004Ðg¥5éu\u009f½õÿó¤\u0096Öz&\u00907\u0081\u00adyki7R\u009d\u0019\u0081t/È\u008eë\u008aüL5¶·>D";
      int var5 = "ò¢Ï\u0004\u001fVÄ^E\u0007\u0010fjf\u001aMÁ3EYyE\u0004Ðg¥5éu\u009f½õÿó¤\u0096Öz&\u00907\u0081\u00adyki7R\u009d\u0019\u0081t/È\u008eë\u008aüL5¶·>D"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "E!\u0096´\u009f\u0001\u0000¥?ëx¤\u0081+$D";
                  var5 = "E!\u0096´\u009f\u0001\u0000¥?ëx¤\u0081+$D".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





