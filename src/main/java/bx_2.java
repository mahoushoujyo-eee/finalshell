import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

class Bx_2 extends com.Oe_2 {
   Color t;
   Border y;
   JLabel z;
   final n_2 A;
   final JR d;

   Bx_2(JR var1, n_2 var2) {
      this.d = var1;
      this.A = var2;
      Color var10001 = Color.white;
      com.c.c(283651054618121503L).set(this, var10001);
      com.c.c(494695275834458622L).set(this, BorderFactory.createEmptyBorder(0, 3, 0, 0));
      com.c.c(264155899074958124L).set(this, new Up_2(this));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      com.ky_4[] var7;
      int var8;
      label64: {
         com.ky_4[] var10000 = kA_3.y();
         ((JLabel)com.c.c(264155899074958124L).get(this)).setOpaque(true);
         var7 = var10000;
         ((JLabel)com.c.c(264155899074958124L).get(this)).setIcon(null);
         ((JLabel)com.c.c(264155899074958124L).get(this)).setForeground(Color.white);
         ((JLabel)com.c.c(264155899074958124L).get(this)).setBorder((Border)com.c.c(494695275834458622L).get(this));
         var8 = var1.convertColumnIndexToModel(var6);
         TableModel var13 = var1.getModel();
         if (var7 == null) {
            if (var13 == null) {
               break label64;
            }

            var13 = var1.getModel();
         }

         k4_2 var9 = (k4_2)var13;
         JLabel var14 = (JLabel)com.c.c(264155899074958124L).get(this);
         Object[] var10002 = com.c.a(var8);
         Method var10004 = com.c.d(366869564242274233L);
         Object[] var10003 = var10002;
         k4_2 var23 = var9;
         Method var10001 = var10004;

         try {
            var19 = (String)var10001.invoke(var23, var10003);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var14.setText(var19);
      }

      Object var15 = com.c.c(583289971016546929L).get(this);
      Object[] var20 = com.c.f();
      Method var25 = com.c.d(589871071857415373L);
      Object[] var24 = var20;
      var20 = (Object[])var15;
      var15 = var25;

      try {
         var17 = (Integer)var15.invoke(var20, var24);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      label65: {
         int var12 = var17;
         int var18 = var12;
         int var22 = com.c.c(385183684097685197L).getInt(null);
         if (var7 == null) {
            if (var12 == var22) {
               if (var8 == 0) {
                  ((JLabel)com.c.c(264155899074958124L).get(this))
                     .setBackground((Color)com.c.c(435262014696409152L).get(com.c.c(279211102447061689L).get(this)));
                  if (var7 == null) {
                     break label65;
                  }
               }

               ((JLabel)com.c.c(264155899074958124L).get(this)).setBackground((Color)com.c.c(262573955458954459L).get(com.c.c(279211102447061689L).get(this)));
               if (var7 == null) {
                  break label65;
               }
            }

            var18 = var12;
            var22 = com.c.c(259753199762599790L).getInt(null);
         }

         if (var7 == null) {
            if (var18 != var22) {
               break label65;
            }

            var18 = var8;
            var22 = 1;
         }

         if (var18 == var22) {
            ((JLabel)com.c.c(264155899074958124L).get(this)).setBackground((Color)com.c.c(435262014696409152L).get(com.c.c(279211102447061689L).get(this)));
            if (var7 == null) {
               break label65;
            }
         }

         ((JLabel)com.c.c(264155899074958124L).get(this)).setBackground((Color)com.c.c(262573955458954459L).get(com.c.c(279211102447061689L).get(this)));
      }

      com.c.c(283651054618121503L).set(this, ((JLabel)com.c.c(264155899074958124L).get(this)).getBackground());
      return (JLabel)com.c.c(264155899074958124L).get(this);
   }
}





