package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class VY implements MouseListener {
   public final ConnectionInfoPanel y;
   public static long a;

   public VY(ConnectionInfoPanel var1) {
      this.y = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      ConnectionInfoPanel.I();
      Object var7 = 402958598703799057L;
      Object var10002 = Ref.g(402958598703799057L, var7);
      Object var10003 = Registry.packArgs(var1.getPoint());
      long var10 = 282975181547362546L;
      Object var9 = var10003;
      var10003 = Ref.h(282975181547362546L, var9, var10);

      try {
         var29 = (Integer)var10003;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      int var3 = var29;
      Object var2 = var10002;
      Object var11 = 402958598703799057L;
      Ref.g(402958598703799057L, var11);
      Object var13 = 402958598703799057L;
      Ref.g(402958598703799057L, var13);
      Object var15 = 230619793659643674L;
      TreePath var10006 = ((ConnectionInfoPanel)Ref.g(230619793659643674L, var15)).getPathForRow(var3);
      long var18 = 294225525164644505L;
      TreePath var17 = var10006;
      Ref.s(294225525164644505L, var17, var18);
      int var30 = var3;
      byte var10007 = -1;
      if (var2 != null) {
         if (var3 == -1) {
            return;
         }

         var30 = var1.getClickCount();
         var10007 = 1;
      }

      if (var30 == var10007) {
         System.currentTimeMillis();
         Object var19 = 402958598703799057L;
         long var4 = 0 - Registry.lookupField(572181340793640435L).getLong(Ref.g(402958598703799057L, var19));
         long var32;
         VY var31 = (var32 = var4 - a) == 0L ? 0 : (var32 < 0L ? -1 : 1);
         if (var2 != null) {
            if (!(var31 > 0)) {
               return;
            }

            var31 = this;
            Object var21 = 402958598703799057L;
            Ref.g(402958598703799057L, var21);
            Object var23 = 230619793659643674L;
            ((ConnectionInfoPanel)Ref.g(230619793659643674L, var23)).getSelectionCount();
         }

         VY var6 = var31;
         if (var6 == null) {
            Object var25 = 402958598703799057L;
            Registry.lookupField(191167021799414579L).setBoolean(Ref.g(402958598703799057L, var25), true);
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      long var29;
      TreePath var73;
      int[] var2 = ConnectionInfoPanel.I();
      Object var10 = 402958598703799057L;
      ConnectionInfoPanel var10001 = (ConnectionInfoPanel)Ref.g(402958598703799057L, var10);
      if (var2 != null) {
         if (Registry.lookupField(191167021799414579L).getBoolean(var10001)) {
            Object var12 = 402958598703799057L;
            Registry.lookupField(191167021799414579L).setBoolean(Ref.g(402958598703799057L, var12), false);
         }

         var10001 = (ConnectionInfoPanel)var1.getSource();
      }

      ConnectionInfoPanel var3 = var10001;
      Object var14 = 402958598703799057L;
      Ref.g(402958598703799057L, var14);
      Object var10003 = Registry.packArgs(var1.getPoint());
      long var17 = 282975181547362546L;
      Object var16 = var10003;
      var10003 = Ref.h(282975181547362546L, var16, var17);

      try {
         var61 = (Integer)var10003;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      int var4 = var61;
      TreePath var5 = var3.getPathForRow(var4);
      var10003 = var5;
      if (var2 != null) {
         if (var5 == null) {
            return;
         }

         var10003 = (Object[])var5.getLastPathComponent();
      }

      DefaultMutableTreeNode var6;
      label197: {
         byte var10004;
         var6 = (DefaultMutableTreeNode)var10003;
         DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.getParent();
         var10003 = var1.getButton();
         var10004 = 1;
         label183:
         if (var2 != null) {
            label198: {
               label180:
               if (var10003 == null) {
                  var10003 = var6;
                  if (var2 != null) {
                     if (var6 == null) {
                        break label180;
                     }

                     var10003 = (Object[])var6.getUserObject();
                  }

                  var10003 = var10003.getClass().equals(Ck4.class);
                  if (var2 != null) {
                     if (var10003 != null) {
                        label169: {
                           Ck4 var8 = (Ck4)var6.getUserObject();
                           int var65 = var1.getClickCount();
                           var10004 = 2;
                           if (var2 != null) {
                              if (var65 == 2) {
                                 break label169;
                              }

                              var65 = var1.getClickCount();
                              var10004 = 1;
                           }

                           if (var65 == var10004) {
                           }
                        }

                        if (var2 != null) {
                           break label180;
                        }
                     }

                     var10003 = var6.getUserObject().getClass().equals(Tf4.class);
                  }

                  if (var2 == null) {
                     break label198;
                  }

                  if (var10003 != null) {
                     Tf4 var56 = (Tf4)var6.getUserObject();
                     boolean var9 = false;
                     var10003 = var1.getClickCount();
                     if (var2 != null) {
                        if (var10003 == null) {
                           var9 = true;
                           Object var18 = 402958598703799057L;
                           Ref.g(402958598703799057L, var18);
                           Object var20 = 428509894309855334L;
                           HashSet var10005 = (HashSet)Ref.g(428509894309855334L, var20);
                           String var10007 = (String)(Registry.emptyArgs());
                           long var23 = 498856411508641826L;
                           Object var22 = var10007;
                           var10007 = Ref.h(498856411508641826L, var22, var23);

                           try {
                              var10007 = (String)var10007;
                           } catch (InvocationTargetException var54) {
                              throw var54.getTargetException();
                           }

                           var56.add(var10007);
                        }

                        var10003 = var3;
                        Object[] var69 = Registry.packArgs(var6);
                        long var25 = 273277141783199649L;
                        Object[] var24 = var69;
                        Object var70 = Ref.h(273277141783199649L, var24, var25);

                        try {
                        } catch (InvocationTargetException var53) {
                           throw var53.getTargetException();
                        }
                     }

                     if (var2 != null) {
                        label154:
                        if (var10003 == null) {
                           Object var26 = 402958598703799057L;
                           Ref.g(402958598703799057L, var26);
                           Object[] var75 = Registry.packArgs(var7, var56, var5, null, true, true);
                           var29 = 523405946948830526L;
                           Object[] var28 = var75;
                           Ref.h(523405946948830526L, var28, var29);

                           try {
                              ;
                           } catch (InvocationTargetException var52) {
                              throw var52.getTargetException();
                           }

                           Object var30 = 402958598703799057L;
                           Ref.g(402958598703799057L, var30);
                           FileBrowserAddressBar var78 = (FileBrowserAddressBar)(Registry.emptyArgs());
                           long var33 = 346382751221538814L;
                           Object var32 = var78;
                           var78 = Ref.h(346382751221538814L, var32, var33);

                           try {
                              var78 = (FileBrowserAddressBar)var78;
                           } catch (InvocationTargetException var51) {
                              throw var51.getTargetException();
                           }

                           if (var2 != null) {
                              if (var78 == null) {
                                 break label154;
                              }

                              Object var34 = 402958598703799057L;
                              Ref.g(402958598703799057L, var34);
                              Object[] var10009 = Registry.emptyArgs();
                              long var37 = 346382751221538814L;
                              Object[] var36 = var10009;
                              Ref.h(346382751221538814L, var36, var37);

                              try {
                                 ;
                              } catch (InvocationTargetException var50) {
                                 throw var50.getTargetException();
                              }
                           }

                           Object[] var81 = Registry.emptyArgs();
                           long var39 = 498856411508641826L;
                           Object[] var38 = var81;
                           var81 = Registry.packArgs(Ref.h(498856411508641826L, var38, var39), true);
                           long var41 = 203282927631494339L;
                           Object[] var40 = var81;
                           Ref.h(203282927631494339L, var40, var41);

                           try {
                              ;
                           } catch (InvocationTargetException var49) {
                              throw var49.getTargetException();
                           }
                        }

                        var10003 = var1.getClickCount();
                     }

                     var10004 = 2;
                     if (var2 == null) {
                        break label183;
                     }

                     label144:
                     if (var10003 == null) {
                        ConnectionInfoPanel var66 = var3;
                        if (var2 != null) {
                           Object[] var71 = Registry.packArgs(var1.getPoint());
                           long var43 = 291447725830674516L;
                           Object[] var42 = var71;
                           Object var72 = Ref.h(291447725830674516L, var42, var43);

                           try {
                              var73 = (TreePath)var72;
                           } catch (InvocationTargetException var48) {
                              throw var48.getTargetException();
                           }

                           if (var73 != null) {
                              break label144;
                           }
                        }

                        TreePath var74 = var5;
                        if (var2 != null) {
                           if (var3.isExpanded(var5)) {
                              var3.collapseRow(var4);
                              if (var2 != null) {
                                 break label144;
                              }
                           }

                           var66 = var3;
                           var74 = var5;
                        }

                        var66.expandPath(var74);
                     }
                  }
               }

               var10003 = var1;
               if (var2 == null) {
                  break label197;
               }

               var10003 = var1.getButton();
            }

            var10004 = 3;
         }

         if (var10003 != var10004) {
            return;
         }

         var10003 = (Object[])var6.getUserObject();
      }

      Tf4 var57 = (Tf4)var10003;
      Object var44 = 402958598703799057L;
      ((ConnectionInfoPanel)Ref.g(402958598703799057L, var44)).stopEditing();
      Object var46 = 402958598703799057L;
      if (Registry.lookupField(218493194116849754L).getBoolean(Ref.g(402958598703799057L, var46))) {
         FilePermissionPanel var59 = new FilePermissionPanel(var3, var5, var57, var6);
         var59.show((Component)var1.getSource(), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 402958598703799057L;
      Registry.lookupField(191167021799414579L).setBoolean(Ref.g(402958598703799057L, var2), false);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 402958598703799057L;
      Registry.lookupField(191167021799414579L).setBoolean(Ref.g(402958598703799057L, var2), false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1350285597611114077L;
      long var10002 = 1350285597611114057L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
   private static Object var61;
}





