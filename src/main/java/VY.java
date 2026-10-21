import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class VY implements MouseListener {
   final a3 y;
   private static final long a;

   VY(a3 var1) {
      this.y = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var10000 = a3.I();
      Object var10001 = com.c.c(402958598703799057L).get(this);
      Object[] var10002 = com.c.a(var1.getPoint());
      Method var10004 = com.c.d(282975181547362546L);
      Object[] var10003 = var10002;
      var10002 = (Object[])var10001;
      var10001 = var10004;

      try {
         var11 = (Integer)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      int var3 = var11;
      int[] var2 = var10000;
      com.c.c(294225525164644505L)
         .set(com.c.c(402958598703799057L).get(this), ((a3)com.c.c(230619793659643674L).get(com.c.c(402958598703799057L).get(this))).getPathForRow(var3));
      int var8 = var3;
      byte var12 = -1;
      if (var2 != null) {
         if (var3 == -1) {
            return;
         }

         var8 = var1.getClickCount();
         var12 = 1;
      }

      if (var8 == var12) {
         long var4 = System.currentTimeMillis() - com.c.c(572181340793640435L).getLong(com.c.c(402958598703799057L).get(this));
         long var14;
         int var9 = (var14 = var4 - a) == 0L ? 0 : (var14 < 0L ? -1 : 1);
         if (var2 != null) {
            if (var9 <= 0) {
               return;
            }

            var9 = ((a3)com.c.c(230619793659643674L).get(com.c.c(402958598703799057L).get(this))).getSelectionCount();
         }

         int var6 = var9;
         if (var6 == 1) {
            com.c.c(191167021799414579L).setBoolean(com.c.c(402958598703799057L).get(this), true);
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = a3.I();
      a3 var10000 = (a3)com.c.c(402958598703799057L).get(this);
      if (var2 != null) {
         if (com.c.c(191167021799414579L).getBoolean(var10000)) {
            com.c.c(191167021799414579L).setBoolean(com.c.c(402958598703799057L).get(this), false);
         }

         var10000 = (a3)var1.getSource();
      }

      a3 var3 = var10000;
      var10000 = (a3)com.c.c(402958598703799057L).get(this);
      Object[] var10001 = com.c.a(var1.getPoint());
      Method var10003 = com.c.d(282975181547362546L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var24 = var10003;

      try {
         var25 = (Integer)var24.invoke(var10001, var10002);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      int var4 = var25;
      TreePath var5 = var3.getPathForRow(var4);
      var10000 = var5;
      if (var2 != null) {
         if (var5 == null) {
            return;
         }

         var10000 = (a3)var5.getLastPathComponent();
      }

      DefaultMutableTreeNode var6;
      label202: {
         var6 = (DefaultMutableTreeNode)var10000;
         DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.getParent();
         var27 = var1.getButton();
         var45 = 1;
         label188:
         if (var2 != null) {
            label203: {
               label185:
               if (var27 == 1) {
                  var10000 = var6;
                  if (var2 != null) {
                     if (var6 == null) {
                        break label185;
                     }

                     var10000 = (a3)var6.getUserObject();
                  }

                  var27 = var10000.getClass().equals(ck_4.class);
                  if (var2 != null) {
                     if (var27 != 0) {
                        label174: {
                           ck_4 var8 = (ck_4)var6.getUserObject();
                           int var29 = var1.getClickCount();
                           byte var46 = 2;
                           if (var2 != null) {
                              if (var29 == 2) {
                                 break label174;
                              }

                              var29 = var1.getClickCount();
                              var46 = 1;
                           }

                           if (var29 == var46) {
                           }
                        }

                        if (var2 != null) {
                           break label185;
                        }
                     }

                     var27 = var6.getUserObject().getClass().equals(tf_4.class);
                  }

                  if (var2 == null) {
                     break label203;
                  }

                  if (var27 != 0) {
                     tf_4 var19 = (tf_4)var6.getUserObject();
                     boolean var9 = false;
                     var27 = var1.getClickCount();
                     if (var2 != null) {
                        if (var27 == 2) {
                           var9 = true;
                           HashSet var30 = (HashSet)com.c.c(428509894309855334L).get(com.c.c(402958598703799057L).get(this));
                           var10002 = com.c.f();
                           Method var10004 = com.c.d(498856411508641826L);
                           Object[] var74 = var10002;
                           tf_4 var65 = var19;
                           Method var47 = var10004;

                           try {
                              var10001 = (String)var47.invoke(var65, var74);
                           } catch (InvocationTargetException var17) {
                              throw var17.getTargetException();
                           }

                           var30.add(var10001);
                        }

                        var10001 = com.c.a(var6);
                        var10003 = com.c.d(273277141783199649L);
                        var10002 = var10001;
                        a3 var50 = var3;
                        Method var31 = var10003;

                        try {
                           var27 = (Boolean)var31.invoke(var50, var10002);
                        } catch (InvocationTargetException var16) {
                           throw var16.getTargetException();
                        }
                     }

                     if (var2 != null) {
                        label159:
                        if (var27 != 0) {
                           var10000 = (a3)com.c.c(402958598703799057L).get(this);
                           var10001 = com.c.a(var7, var19, var5, null, true, true);
                           var10003 = com.c.d(523405946948830526L);
                           var10002 = var10001;
                           var10001 = var10000;
                           Method var33 = var10003;

                           try {
                              var33.invoke(var10001, var10002);
                           } catch (InvocationTargetException var15) {
                              throw var15.getTargetException();
                           }

                           var10000 = (a3)com.c.c(402958598703799057L).get(this);
                           var10001 = com.c.f();
                           var10003 = com.c.d(346382751221538814L);
                           var10002 = var10001;
                           var10001 = var10000;
                           Method var35 = var10003;

                           try {
                              var36 = (F6)var35.invoke(var10001, var10002);
                           } catch (InvocationTargetException var14) {
                              throw var14.getTargetException();
                           }

                           if (var2 != null) {
                              if (var36 == null) {
                                 break label159;
                              }

                              var10000 = (a3)com.c.c(402958598703799057L).get(this);
                              var10001 = com.c.f();
                              var10003 = com.c.d(346382751221538814L);
                              var10002 = var10001;
                              var10001 = var10000;
                              Method var38 = var10003;

                              try {
                                 var36 = (F6)var38.invoke(var10001, var10002);
                              } catch (InvocationTargetException var13) {
                                 throw var13.getTargetException();
                              }
                           }

                           var10002 = com.c.f();
                           Method var82 = com.c.d(498856411508641826L);
                           Object[] var79 = var10002;
                           tf_4 var71 = var19;
                           Method var57 = var82;

                           try {
                              var10001 = (Object[])var57.invoke(var71, var79);
                           } catch (InvocationTargetException var12) {
                              throw var12.getTargetException();
                           }

                           var10001 = com.c.a(var10001, true);
                           var10003 = com.c.d(203282927631494339L);
                           var10002 = var10001;
                           F6 var60 = var36;
                           Method var39 = var10003;

                           try {
                              var39.invoke(var60, var10002);
                           } catch (InvocationTargetException var11) {
                              throw var11.getTargetException();
                           }
                        }

                        var27 = var1.getClickCount();
                     }

                     var45 = 2;
                     if (var2 == null) {
                        break label188;
                     }

                     label149:
                     if (var27 == 2) {
                        var10000 = var3;
                        if (var2 != null) {
                           var10001 = com.c.a(var1.getPoint());
                           var10003 = com.c.d(291447725830674516L);
                           var10002 = var10001;
                           a3 var62 = var3;
                           Method var41 = var10003;

                           try {
                              var42 = (TreePath)var41.invoke(var62, var10002);
                           } catch (InvocationTargetException var10) {
                              throw var10.getTargetException();
                           }

                           if (var42 != null) {
                              break label149;
                           }

                           var10000 = var3;
                        }

                        TreePath var63 = var5;
                        if (var2 != null) {
                           if (var10000.isExpanded(var5)) {
                              var3.collapseRow(var4);
                              if (var2 != null) {
                                 break label149;
                              }
                           }

                           var10000 = var3;
                           var63 = var5;
                        }

                        var10000.expandPath(var63);
                     }
                  }
               }

               var10000 = var1;
               if (var2 == null) {
                  break label202;
               }

               var27 = var1.getButton();
            }

            var45 = 3;
         }

         if (var27 != var45) {
            return;
         }

         var10000 = (a3)var6.getUserObject();
      }

      tf_4 var20 = (tf_4)var10000;
      ((a3)com.c.c(402958598703799057L).get(this)).stopEditing();
      if (com.c.c(218493194116849754L).getBoolean(com.c.c(402958598703799057L).get(this))) {
         Wx_2 var22 = new Wx_2(var3, var5, var20, var6);
         var22.show((Component)var1.getSource(), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.c.c(191167021799414579L).setBoolean(com.c.c(402958598703799057L).get(this), false);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.c.c(191167021799414579L).setBoolean(com.c.c(402958598703799057L).get(this), false);
   }

   static {
      long var0 = 1350285597611114077L;
      long var10002 = 1350285597611114057L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





