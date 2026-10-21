package com.finalshell.ui.listener;

import com.finalshell.core.File3;
import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EnableBackgroundImage;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

public class Oi2 implements ActionListener {
   final U62 p;
   final EnableBackgroundImage c;
   public static String a;

   Oi2(EnableBackgroundImage var1, U62 var2) {
      this.c = var1;
      this.p = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var2 = EnableBackgroundImage.I();
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      if (var2 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var10 = 163462326892114024L;
         Object[] var9 = var10002;
         Ref.h(163462326892114024L, var9, var10);
         Object[] var10003 = Registry.emptyArgs();
         long var12 = 133802226692684648L;
         Object[] var11 = var10003;
         var10003 = Ref.h(133802226692684648L, var11, var12);

         try {
            var44 = (Boolean)var10003;
         } catch (InvocationTargetException var39) {
            throw var39.getTargetException();
         }

         if (var44) {
            Object var17 = 588461528726846294L;
            Ref.g(588461528726846294L, var17);
            String var10005 = (String)(Registry.emptyArgs());
            long var20 = 164139683561291111L;
            Object[] var19 = var10005;
            var10005 = Ref.h(164139683561291111L, var19, var20);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var36) {
               throw var36.getTargetException();
            }

            Object var3;
            label105: {
               label92: {
                  var3 = var10005;
                  var10005 = (Object[])var3;
                  if (var2 != null) {
                     var10005 = Registry.packArgs(var3);
                     long var21 = 330094358428833085L;
                     Object var10006 = Ref.h2(330094358428833085L, var21);

                     try {
                        var49 = (Boolean)var10006;
                     } catch (InvocationTargetException var35) {
                        throw var35.getTargetException();
                     }

                     if (!var49) {
                        break label92;
                     }

                     var10006 = (String)Registry.lookupField(149082991182987426L).get(null);
                  }

                  var3 = var10005;
                  if (var2 != null) {
                     break label105;
                  }
               }

               File var4 = new File((String)var3);
               String var48 = var4.getParent();
               if (var2 != null) {
                  if (var48 == null) {
                     break label105;
                  }

                  var48 = var4.getParent();
               }

               var3 = var48;
            }

            JFileChooser var41 = new JFileChooser((String)var3);
            var41.setDialogTitle(a);
            var41.setFileSelectionMode(0);
            var41.setMultiSelectionEnabled(false);
            var41.setFileFilter(new File3(this));
            Object var23 = 156222592412218828L;
            int var5 = this.showOpenDialog(SwingUtilities.getWindowAncestor((EnableBackgroundImage)Ref.g(156222592412218828L, var23)));
            if (var5 == 0) {
               File var6 = var41.getSelectedFile();
               Object var25 = 588461528726846294L;
               Ref.g(588461528726846294L, var25);
               Object[] var10008 = Registry.packArgs(var6.getAbsolutePath());
               long var28 = 341017293076740193L;
               Object[] var27 = var10008;
               Ref.h(341017293076740193L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var34) {
                  throw var34.getTargetException();
               }

               Object var29 = 156222592412218828L;
               Ref.g(156222592412218828L, var29);
               Object[] var10010 = Registry.packArgs(var6.getAbsolutePath());
               long var32 = 138118316736819193L;
               Object[] var31 = var10010;
               Ref.h(138118316736819193L, var31, var32);

               try {
                  ;
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }
            }

            return;
         }

         Registry.emptyArgs();
         long var13 = 270389152141252877L;
         Ref.h2(270389152141252877L, var13);

         try {
            ;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }
      }

      Object[] var42 = Registry.emptyArgs();
      long var16 = 248890456776257543L;
      Object[] var15 = var42;
      Ref.h(248890456776257543L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "送抗図父斚亢".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 107;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 107;
         var10006 = var0;
      } else {
         var6 = 107;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 107;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 99;
               break;
            case 1:
               var23 = 21;
               break;
            case 2:
               var23 = 102;
               break;
            case 3:
               var23 = 26;
               break;
            case 4:
               var23 = 118;
               break;
            case 5:
               var23 = 63;
               break;
            default:
               var23 = 114;
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





