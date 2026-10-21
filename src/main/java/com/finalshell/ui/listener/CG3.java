package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class CG3 implements KeyListener {
   public final Connection4 r;

   public CG3(Connection4 var1) {
      this.r = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = Connection4.I();
      if (var1.getModifiers() <= 0) {
         String var3 = (var1.getKeyChar() + "").toLowerCase();
         CG3 var10000 = var3.length();
         if (var2 != null) {
            if (var10000 != null) {
               return;
            }

            var10000 = this;
            Object var12 = 403838484831587097L;
            ((Connection4)Ref.g(403838484831587097L, var12)).getMinSelectionRow();
         }

         CG3 var4 = var10000;
         Object var14 = 403838484831587097L;
         int var5 = ((Connection4)Ref.g(403838484831587097L, var14)).getRowCount();
         boolean var6 = false;
         int var7 = var4 + 1;

         Object var59;
         while (var7 < var5) {
            Object var16 = 403838484831587097L;
            Ref.g(403838484831587097L, var16);
            var59 = Registry.packArgs(var7);
            long var19 = 290714206414786866L;
            Object[] var18 = (Object[])var59;
            var59 = Ref.h(290714206414786866L, var18, var19);

            try {
               var59 = (DefaultMutableTreeNode)var59;
            } catch (InvocationTargetException var43) {
               throw var43.getTargetException();
            }

            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var59;
            Object var9 = var8.getUserObject();
            String var10 = "";
            var59 = var9.getClass().equals(Ck4.class);
            if (var2 == null) {
               break;
            }

            label166: {
               label167: {
                  label168: {
                     if (var2 != null) {
                        if (var59 != null) {
                           Ck4 var11 = (Ck4)var9;
                           String var10004 = (String)(Registry.emptyArgs());
                           long var21 = 396085629172753019L;
                           Object[] var20 = var10004;
                           var10004 = Ref.h(396085629172753019L, var20, var21);

                           try {
                              var10004 = (String)var10004;
                           } catch (InvocationTargetException var45) {
                              throw var45.getTargetException();
                           }

                           var10 = var10004;
                           if (var2 != null) {
                              break label168;
                           }
                        }

                        var59 = var9.getClass().equals(Tf4.class);
                     }

                     if (var2 == null) {
                        break label167;
                     }

                     if (var59 != null) {
                        Tf4 var54 = (Tf4)var9;
                        String var62 = (String)(Registry.emptyArgs());
                        long var23 = 179612178163941306L;
                        Object[] var22 = var62;
                        var62 = Ref.h(179612178163941306L, var22, var23);

                        try {
                           var62 = (String)var62;
                        } catch (InvocationTargetException var44) {
                           throw var44.getTargetException();
                        }

                        var10 = var62;
                     }
                  }

                  var10 = var10.toLowerCase();
                  if (var2 == null) {
                     break label166;
                  }

                  var59 = var10.startsWith(var3);
               }

               if (var59 != null) {
                  var59 = this;
                  Object var24 = 403838484831587097L;
                  ((Connection4)Ref.g(403838484831587097L, var24)).setSelectionRow(var7);
                  Object var26 = 403838484831587097L;
                  ((Connection4)Ref.g(403838484831587097L, var26)).scrollRowToVisible(var7);
                  var6 = true;
                  if (var2 != null) {
                     break;
                  }
               }

               var7++;
            }

            var59 = var2;
            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            if (var59 != null) {
               return;
            }

            var59 = 0;
         }

         Object var48 = var59;

         while (var48 < var5) {
            Object var28 = 403838484831587097L;
            Ref.g(403838484831587097L, var28);
            DefaultMutableTreeNode var10005 = (DefaultMutableTreeNode)(Registry.packArgs((int)var48));
            long var31 = 290714206414786866L;
            Object[] var30 = var10005;
            var10005 = Ref.h(290714206414786866L, var30, var31);

            try {
               var10005 = (DefaultMutableTreeNode)var10005;
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }

            label172: {
               label173: {
                  String var52;
                  label174: {
                     DefaultMutableTreeNode var49 = var10005;
                     Object var50 = var49.getUserObject();
                     var52 = "";
                     var67 = var50.getClass().equals(Ck4.class);
                     if (var2 != null) {
                        if (var67) {
                           Ck4 var55 = (Ck4)var50;
                           String var10006 = (String)(Registry.emptyArgs());
                           long var33 = 396085629172753019L;
                           Object[] var32 = var10006;
                           var10006 = Ref.h(396085629172753019L, var32, var33);

                           try {
                              var10006 = (String)var10006;
                           } catch (InvocationTargetException var41) {
                              throw var41.getTargetException();
                           }

                           var52 = var10006;
                           if (var2 != null) {
                              break label174;
                           }
                        }

                        var67 = var50.getClass().equals(Tf4.class);
                     }

                     if (var2 == null) {
                        break label173;
                     }

                     if (var67) {
                        Tf4 var56 = (Tf4)var50;
                        String var70 = (String)(Registry.emptyArgs());
                        long var35 = 179612178163941306L;
                        Object[] var34 = var70;
                        var70 = Ref.h(179612178163941306L, var34, var35);

                        try {
                           var70 = (String)var70;
                        } catch (InvocationTargetException var40) {
                           throw var40.getTargetException();
                        }

                        var52 = var70;
                     }
                  }

                  var52 = var52.toLowerCase();
                  if (var2 == null) {
                     break label172;
                  }

                  var67 = var52.startsWith(var3);
               }

               if (var67) {
                  Object var36 = 403838484831587097L;
                  ((Connection4)Ref.g(403838484831587097L, var36)).setSelectionRow((int)var48);
                  Object var38 = 403838484831587097L;
                  ((Connection4)Ref.g(403838484831587097L, var38)).scrollRowToVisible((int)var48);
                  var6 = true;
                  if (var2 != null) {
                     break;
                  }
               }

               var48++;
            }

            if (var2 == null) {
               break;
            }
         }
      }
   }
}





