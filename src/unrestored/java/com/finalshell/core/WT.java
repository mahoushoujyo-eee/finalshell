package com.finalshell.core;

import com.finalshell.ui.panel.Pb4;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public final class WT implements SwingConstants {
   public static long a;

   public static int r(JMenuItem var0, boolean var1) {
      int var10;
      int[] var2;
      JMenuItem var9;
      label80: {
         label79: {
            var2 = Pb4.g();
            boolean var10000 = var1;
            if (var2 != null) {
               if (!var1) {
                  break label79;
               }

               var9 = var0;
               if (var2 == null) {
                  break label80;
               }

               var10000 = var0.getParent() instanceof JPopupMenu;
            }

            if (var10000) {
               int var3 = 0;
               JPopupMenu var4 = (JPopupMenu)var0.getParent();
               int var5 = 0;

               while (true) {
                  if (var5 < var4.getComponentCount()) {
                     Component var6 = var4.getComponent(var5);
                     if (var2 != null) {
                        var10 = (var6 instanceof JMenuItem) ? 1 : 0;
                        if (var2 == null) {
                           break;
                        }

                        label56:
                        if (var10 != 0) {
                           JMenuItem var7 = (JMenuItem)var6;
                           Object var11 = var7;
                           if (var2 != null) {
                              if (var7.getIcon() != null) {
                                 var3 = Math.max(var3, var7.getIcon().getIconWidth());
                                 if (var2 != null) {
                                    break label56;
                                 }
                              }

                              var11 = var6;
                           }

                           var12 = var11 instanceof JCheckBoxMenuItem;
                           label48:
                           if (var2 != null) {
                              if (var12 == 0) {
                                 var12 = var6 instanceof JRadioButtonMenuItem;
                                 if (var2 == null) {
                                    break label48;
                                 }

                                 if (var12 == 0) {
                                    break label56;
                                 }
                              }

                              var12 = Math.max(var3, (int)a);
                           }

                           var3 = (int)(var12);
                        }

                        var5++;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  var10 = var3;
                  break;
               }

               return var10;
            }
         }

         var9 = var0;
      }

      Icon var8 = var9.getIcon();
      Icon var13 = var8;
      if (var2 != null) {
         if (var8 == null) {
            return 0;
         }

         var13 = var8;
      }

      return var13.getIconWidth();
   }

   public static String s(JMenuItem var0) {
      int[] var10000 = Pb4.g();
      KeyStroke var2 = var0.getAccelerator();
      int[] var1 = var10000;
      KeyStroke var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return FN.Y(var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4815222046804689306L;
      long var10002 = -156589686537830006L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
   private static Object var12;
}





