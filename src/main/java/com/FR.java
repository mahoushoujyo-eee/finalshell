package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JDialog;
import javax.swing.JFrame;

class FR implements ActionListener {
   final _y_2 w;

   FR(_y_2 var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var10000 = _y_2.y();
      this.w.kj.requestFocus();
      int var2 = var10000;
      Object[] var18 = com.c.f();
      Method var19 = com.c.d(270389152141252877L);
      Object[] var61 = var18;
      Method var39 = null;

      try {
         var20 = var19.invoke(var39, var61);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      var39 = com.c.f();
      Method var10003 = com.c.d(410905379772103887L);
      var61 = (Object[])var39;
      var39 = var20;
      Method var21 = var10003;

      try {
         var22 = var21.invoke(var39, var61);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var39 = this.w.C;
      var61 = com.c.f();
      Method var10004 = com.c.d(292557478156152530L);
      Object[] var75 = var61;
      lv_4 var64 = (lv_4)var39;
      var39 = var10004;

      try {
         var39 = (Method)var39.invoke(var64, var75);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var45 = com.c.a(var39);
      var10003 = com.c.d(343419559142469673L);
      var61 = var45;
      var39 = (Method)var22;
      Method var23 = var10003;

      try {
         var24 = (lv_4)var23.invoke(var39, var61);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      lv_4 var3 = var24;
      if (var3 != null) {
         Object var25 = this.w.kD;
         if (var2 == 0) {
            Object[] var47 = com.c.f();
            var10003 = com.c.d(577438617729885268L);
            var61 = var47;
            var39 = (Method)var25;
            Method var26 = var10003;

            try {
               var27 = (Boolean)var26.invoke(var39, var61);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            if (var27) {
               U var28 = this.w.kD;
               Object[] var49 = com.c.f();
               var10003 = com.c.d(222971910568398589L);
               var61 = var49;
               U var50 = var28;
               Method var29 = var10003;

               try {
                  var29.invoke(var50, var61);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }
            }

            Object[] var30 = com.c.f();
            Method var31 = com.c.d(270389152141252877L);
            var61 = var30;
            var39 = null;

            try {
               var32 = var31.invoke(var39, var61);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            Object[] var53 = com.c.f();
            var10003 = com.c.d(271043866899908885L);
            var61 = var53;
            var39 = (Method)var32;
            Method var33 = var10003;

            try {
               var34 = var33.invoke(var39, var61);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var61 = com.c.f();
            var10004 = com.c.d(292557478156152530L);
            Object[] var80 = var61;
            lv_4 var72 = var3;
            var39 = var10004;

            try {
               var39 = (Method)var39.invoke(var72, var80);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            Object[] var57 = com.c.a(var39);
            var10003 = com.c.d(285199883764466291L);
            var61 = var57;
            var39 = (Method)var34;
            Method var35 = var10003;

            try {
               var25 = (JFrame)var35.invoke(var39, var61);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }
         }

         label125: {
            Object var4 = var25;
            Object var36 = var4;
            if (var2 == 0) {
               if (var4 == null) {
                  break label125;
               }

               var36 = var4;
            }

            km_4 var5 = (km_4)var36;
            Object[] var59 = com.c.a(true);
            var10003 = com.c.d(433716955203722428L);
            var61 = var59;
            km_4 var60 = var5;
            Method var37 = var10003;

            try {
               var37.invoke(var60, var61);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (var2 == 0) {
               return;
            }
         }

         km_4 var38;
         Object[] var84 = com.c.f();
         var10004 = com.c.d(513527511121793373L);
         Object[] var88 = var84;
         Object var87 = null;

         try {
            var86 = (JDialog)var10004.invoke(var87, var88);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var38 = new km_4(null, null, var86, var3, null);
      }
   }
}





