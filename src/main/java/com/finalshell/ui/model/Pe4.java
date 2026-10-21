package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pe4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   Pe4(String var1, int var2, int[] var3) {
      super(var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 3:
               return b(23429, 5083439511479241339L);
            case 32:
               return b(31691, 9220630586578102847L);
            case 59:
               return b(24877, 2336598270319489237L);
            case 60:
               return b(8231, 626772758956716509L);
            case 61:
               return b(3760, 2694628761231040333L);
            case 91:
               return b(22276, 2985766906043057917L);
            case 92:
               return b(1778, 6469067431472142089L);
            case 93:
               return b(16367, 3905958842665217555L);
            case 94:
               return b(4420, 7331434232707842235L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4604;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3397524793125450509L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "cÍ¸Y\u0005\u0088\u001d¢\u0086\u0097ä\u0085\u008bi,<R\u001f¶ö\u00074ùÕ£©Y\u0098'c³\u0002øÞ§\u0083TüBë\u001dÚ9·á\u0003uX\u0010IN\u0015\u008dR\u0082m";
      int var5 = "cÍ¸Y\u0005\u0088\u001d¢\u0086\u0097ä\u0085\u008bi,<R\u001f¶ö\u00074ùÕ£©Y\u0098'c³\u0002øÞ§\u0083TüBë\u001dÚ9·á\u0003uX\u0010IN\u0015\u008dR\u0082m"
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
                     d = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Z\u008e^\u0085\u0081!%\u0096ùó\u0090/7ÅÙ\u008c";
                  var5 = "Z\u008e^\u0085\u0081!%\u0096ùó\u0090/7ÅÙ\u008c".length();
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





