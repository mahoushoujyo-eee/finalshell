import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mL implements ListSelectionListener {
   final JCheckBox N;
   final zM T;
   private static final String a;

   mL(zM var1, JCheckBox var2) {
      this.T = var1;
      this.N = var2;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      com.ky_4[] var10000 = zM.I();
      String var3 = (String)((JList)com.c.c(563971228817595380L).get(com.c.c(347805637754599459L).get(this))).getSelectedValue();
      com.ky_4[] var2 = var10000;
      if (var3 != null) {
         boolean var9 = var1.getValueIsAdjusting();
         if (var2 != null) {
            if (var9) {
               return;
            }

            var9 = var3.startsWith(a);
         }

         label75: {
            label76: {
               if (var2 != null) {
                  if (var9) {
                     break label75;
                  }

                  Object[] var10 = com.c.f();
                  Method var11 = com.c.d(270389152141252877L);
                  Object[] var28 = var10;
                  Object var19 = null;

                  try {
                     var12 = (yT_3)var11.invoke(var19, var28);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var2 == null) {
                     break label76;
                  }

                  var19 = com.c.f();
                  Method var10003 = com.c.d(163462326892114024L);
                  var28 = (Object[])var19;
                  var19 = var12;
                  Method var13 = var10003;

                  try {
                     var10000 = (com.ky_4[])var13.invoke(var19, var28);
                  } catch (InvocationTargetException var7) {
                     throw var7.getTargetException();
                  }

                  var19 = com.c.f();
                  var10003 = com.c.d(133802226692684648L);
                  var28 = (Object[])var19;
                  var19 = var10000;
                  Method var15 = var10003;

                  try {
                     var9 = (Boolean)var15.invoke(var19, var28);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }
               }

               if (var9) {
                  break label75;
               }

               Object[] var16 = com.c.f();
               Method var17 = com.c.d(270389152141252877L);
               Object[] var32 = var16;
               Object var25 = null;

               try {
                  var12 = (yT_3)var17.invoke(var25, var32);
               } catch (InvocationTargetException var5) {
                  throw var5.getTargetException();
               }
            }

            Object[] var26 = com.c.f();
            Method var35 = com.c.d(248890456776257543L);
            Object[] var33 = var26;
            yT_3 var27 = var12;
            Method var18 = var35;

            try {
               var18.invoke(var27, var33);
               return;
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         com.c.c(427521949153014927L).setBoolean(com.c.c(347805637754599459L).get(this), true);
         ((JCheckBox)com.c.c(279999345447201048L).get(this)).setSelected(true);
         SwingUtilities.invokeLater(new QW(this, var3));
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "*S".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 52;
               break;
            case 1:
               var23 = 72;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 54;
               break;
            case 4:
               var23 = 79;
               break;
            case 5:
               var23 = 37;
               break;
            default:
               var23 = 70;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





