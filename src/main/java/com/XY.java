package com;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class XY implements SingleValueConverter {
   private static final SimpleDateFormat I;

   @Override
   public boolean canConvert(Class var1) {
      return Long.class.getCanonicalName().equals(var1.getCanonicalName());
   }

   @Override
   public String toString(Object var1) {
      return var1 == null ? "" : I.format(new Date((Long)var1));
   }

   @Override
   public Object fromString(String var1) {
      try {
         return I.parse(var1).getTime();
      } catch (Throwable var5) {
         try {
            return Long.parseLong(var1);
         } catch (Throwable var4) {
            return 0L;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "=}m:|g~ `:".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 38;
      char[] var10002 = var10003;
      int var3 = var10004;
      byte var12;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var12 = 38;
         var10006 = var1;
      } else {
         var8 = 38;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            I = new SimpleDateFormat(var2);
            return;
         }

         var10005 = var10003;
         var12 = 38;
         var10006 = var1;
      }

      while (true) {
         char var24 = var10005[var10006];
         byte var25;
         switch (var1 % 7) {
            case 0:
               var25 = 127;
               break;
            case 1:
               var25 = 63;
               break;
            case 2:
               var25 = 101;
               break;
            case 3:
               var25 = 81;
               break;
            case 4:
               var25 = 23;
               break;
            case 5:
               var25 = 111;
               break;
            default:
               var25 = 33;
         }

         var10005[var10006] = (char)(var24 ^ var12 ^ var25);
         var1++;
         if (var8 == 0) {
            var10006 = var8;
            var10005 = var10002;
            var12 = var8;
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               I = new SimpleDateFormat(var0);
               return;
            }

            var10005 = var10002;
            var12 = var8;
            var10006 = var1;
         }
      }
   }
}





