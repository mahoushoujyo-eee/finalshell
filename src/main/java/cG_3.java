import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class cG_3 implements KeyListener {
   final a3 r;

   cG_3(a3 var1) {
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
      int[] var2 = a3.I();
      if (var1.getModifiers() <= 0) {
         String var3 = (var1.getKeyChar() + "").toLowerCase();
         int var10000 = var3.length();
         if (var2 != null) {
            if (var10000 != 1) {
               return;
            }

            var10000 = ((a3)com.c.c(403838484831587097L).get(this)).getMinSelectionRow();
         }

         int var4 = var10000;
         int var5 = ((a3)com.c.c(403838484831587097L).get(this)).getRowCount();
         byte var6 = 0;
         int var7 = var4 + 1;

         label153: {
            while (var7 < var5) {
               Object var28 = com.c.c(403838484831587097L).get(this);
               Object[] var10001 = com.c.a(var7);
               Method var10003 = com.c.d(290714206414786866L);
               Object[] var10002 = var10001;
               var10001 = (Object[])var28;
               Method var29 = var10003;

               try {
                  var30 = (DefaultMutableTreeNode)var29.invoke(var10001, var10002);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               DefaultMutableTreeNode var8 = var30;
               Object var9 = var8.getUserObject();
               String var10 = "";
               var31 = var9.getClass().equals(ck_4.class);
               if (var2 == null) {
                  break label153;
               }

               label166: {
                  label167: {
                     label168: {
                        if (var2 != null) {
                           if (var31 != 0) {
                              ck_4 var11 = (ck_4)var9;
                              var10001 = com.c.f();
                              var10003 = com.c.d(396085629172753019L);
                              var10002 = var10001;
                              ck_4 var46 = var11;
                              Method var32 = var10003;

                              try {
                                 var33 = (String)var32.invoke(var46, var10002);
                              } catch (InvocationTargetException var17) {
                                 throw var17.getTargetException();
                              }

                              var10 = var33;
                              if (var2 != null) {
                                 break label168;
                              }
                           }

                           var31 = var9.getClass().equals(tf_4.class);
                        }

                        if (var2 == null) {
                           break label167;
                        }

                        if (var31 != 0) {
                           tf_4 var25 = (tf_4)var9;
                           var10001 = com.c.f();
                           var10003 = com.c.d(179612178163941306L);
                           var10002 = var10001;
                           tf_4 var48 = var25;
                           Method var34 = var10003;

                           try {
                              var35 = (String)var34.invoke(var48, var10002);
                           } catch (InvocationTargetException var16) {
                              throw var16.getTargetException();
                           }

                           var10 = var35;
                        }
                     }

                     var10 = var10.toLowerCase();
                     if (var2 == null) {
                        break label166;
                     }

                     var31 = var10.startsWith(var3);
                  }

                  if (var31 != 0) {
                     ((a3)com.c.c(403838484831587097L).get(this)).setSelectionRow(var7);
                     ((a3)com.c.c(403838484831587097L).get(this)).scrollRowToVisible(var7);
                     var6 = 1;
                     if (var2 != null) {
                        break;
                     }
                  }

                  var7++;
               }

               if (var2 == null) {
                  break;
               }
            }

            var31 = var6;
         }

         if (var2 != null) {
            if (var31 != 0) {
               return;
            }

            var31 = 0;
         }

         var7 = var31;

         while (var7 < var5) {
            Object var36 = com.c.c(403838484831587097L).get(this);
            Object[] var49 = com.c.a(var7);
            Method var62 = com.c.d(290714206414786866L);
            Object[] var57 = var49;
            var49 = (Object[])var36;
            Method var37 = var62;

            try {
               var38 = (DefaultMutableTreeNode)var37.invoke(var49, var57);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            label172: {
               label173: {
                  String var23;
                  label174: {
                     DefaultMutableTreeNode var20 = var38;
                     Object var21 = var20.getUserObject();
                     var23 = "";
                     var39 = var21.getClass().equals(ck_4.class);
                     if (var2 != null) {
                        if (var39) {
                           ck_4 var26 = (ck_4)var21;
                           var49 = com.c.f();
                           var62 = com.c.d(396085629172753019L);
                           var57 = var49;
                           ck_4 var52 = var26;
                           Method var40 = var62;

                           try {
                              var41 = (String)var40.invoke(var52, var57);
                           } catch (InvocationTargetException var13) {
                              throw var13.getTargetException();
                           }

                           var23 = var41;
                           if (var2 != null) {
                              break label174;
                           }
                        }

                        var39 = var21.getClass().equals(tf_4.class);
                     }

                     if (var2 == null) {
                        break label173;
                     }

                     if (var39) {
                        tf_4 var27 = (tf_4)var21;
                        var49 = com.c.f();
                        var62 = com.c.d(179612178163941306L);
                        var57 = var49;
                        tf_4 var54 = var27;
                        Method var42 = var62;

                        try {
                           var43 = (String)var42.invoke(var54, var57);
                        } catch (InvocationTargetException var12) {
                           throw var12.getTargetException();
                        }

                        var23 = var43;
                     }
                  }

                  var23 = var23.toLowerCase();
                  if (var2 == null) {
                     break label172;
                  }

                  var39 = var23.startsWith(var3);
               }

               if (var39) {
                  ((a3)com.c.c(403838484831587097L).get(this)).setSelectionRow(var7);
                  ((a3)com.c.c(403838484831587097L).get(this)).scrollRowToVisible(var7);
                  boolean var18 = true;
                  if (var2 != null) {
                     break;
                  }
               }

               var7++;
            }

            if (var2 == null) {
               break;
            }
         }
      }
   }
}





