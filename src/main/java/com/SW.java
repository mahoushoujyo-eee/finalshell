package com;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.swing.ImageIcon;

public class SW extends Authenticator {
   public static final ImageIcon k;
   private com.DA w = null;
   private static int[] e;

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return this.D();
   }

   private PasswordAuthentication D() {
      int[] var10000 = P();
      com.dn_4 var2 = EE.S().C();
      int[] var1 = var10000;
      if (this.w != null) {
         Object var3 = null;
         if (var1 != null) {
            return (PasswordAuthentication)var3;
         }
      }

      PasswordAuthentication var8;
      label46: {
         label37: {
            label47: {
               int var5 = var2.M();
               if (var1 != null) {
                  if (var5 != 0) {
                     var8 = this.Q(var2);
                     if (var1 != null) {
                        return var8;
                     }
                  }

                  this.w = new com.DA(this, var2);
                  this.w.setVisible(true);
                  var6 = this;
                  if (var1 == null) {
                     break label47;
                  }

                  var5 = this.w.i();
               }

               if (var5 != 0) {
                  break label37;
               }

               var2.F(true);
               var2.w(this.w.p());
               var2.v(new String(this.w.p()));
               EE.f(var2, this.w.Y());
               var6 = this;
            }

            var8 = var6.Q(var2);
            if (var1 != null) {
               break label46;
            }
         }

         com.dn_4 var4 = EE.S();
         if (var4.M()) {
            var8 = this.Q(var4);
            if (var1 != null) {
               break label46;
            }
         }

         var8 = null;
      }

      this.w = null;
      return var8;
   }

   private PasswordAuthentication Q(com.dn_4 var1) {
      return new PasswordAuthentication(var1.t(), var1.X().toCharArray());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (P() == null) {
         u(new int[3]);
      }

      char[] var10003 = "\u0011<\u0002\u0016J\u0010l\r+\u0005VIQj".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 81;
      char[] var10002 = var10003;
      int var3 = var10004;
      byte var12;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var12 = 81;
         var10006 = var1;
      } else {
         var8 = 81;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            k = new ImageIcon(SW.class.getResource(var2));
            return;
         }

         var10005 = var10003;
         var12 = 81;
         var10006 = var1;
      }

      while (true) {
         char var24 = var10005[var10006];
         byte var25;
         switch (var1 % 7) {
            case 0:
               var25 = 41;
               break;
            case 1:
               var25 = 14;
               break;
            case 2:
               var25 = 60;
               break;
            case 3:
               var25 = 41;
               break;
            case 4:
               var25 = 104;
               break;
            case 5:
               var25 = 110;
               break;
            default:
               var25 = 92;
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
               k = new ImageIcon(SW.class.getResource(var0));
               return;
            }

            var10005 = var10002;
            var12 = var8;
            var10006 = var1;
         }
      }
   }

   public static void u(int[] var0) {
      e = var0;
   }

   public static int[] P() {
      return e;
   }
}





