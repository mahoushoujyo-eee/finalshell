import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Jt_2 implements MouseListener {
   final int Q;
   final YB s;

   Jt_2(YB var1, int var2) {
      this.s = var1;
      this.Q = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = F6.i();
      int var10000 = var1.getClickCount();
      int var10001 = 2;
      if (var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      label151: {
         if (var2) {
            if (var10000 != var10001) {
               return;
            }

            var19 = this;
            if (!var2) {
               break label151;
            }

            var10000 = com.c.c(223296310692614241L).getInt(this);
            var10001 = com.c.c(317162390314131527L).getInt(null);
         }

         if (var10000 != var10001) {
            int var3 = ((Km_2)com.c.c(210562214105886716L).get(com.c.c(377989578805733666L).get(this))).getSelectedRow();
            label123:
            if (var3 > -1) {
               Object var20 = com.c.c(210562214105886716L).get(com.c.c(377989578805733666L).get(this));
               Object[] var41 = com.c.a(var3);
               Method var10003 = com.c.d(303488344973038628L);
               Object[] var10002 = var41;
               Object var42 = var20;
               Method var21 = var10003;

               try {
                  var22 = var21.invoke(var42, var10002);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               label145: {
                  Object var4 = var22;
                  boolean var23 = var4.getClass().equals(ck_4.class);
                  if (var2) {
                     if (var23) {
                        Object var24 = com.c.c(210562214105886716L).get(com.c.c(377989578805733666L).get(this));
                        Object[] var43 = com.c.a(var3);
                        var10003 = com.c.d(303488344973038628L);
                        var10002 = var43;
                        Object var44 = var24;
                        Method var25 = var10003;

                        try {
                           var26 = var25.invoke(var44, var10002);
                        } catch (InvocationTargetException var14) {
                           throw var14.getTargetException();
                        }

                        ck_4 var5 = (ck_4)var26;
                        Object[] var45 = com.c.f();
                        var10003 = com.c.d(605430732347023634L);
                        var10002 = var45;
                        ck_4 var46 = var5;
                        Method var27 = var10003;

                        try {
                           var28 = (String)var27.invoke(var46, var10002);
                        } catch (InvocationTargetException var13) {
                           throw var13.getTargetException();
                        }

                        label115: {
                           String var6 = var28;
                           File var7 = new File(var6);
                           if (var2) {
                              if (!var7.exists()) {
                                 break label115;
                              }

                              com.c.c(518641299092321834L).set(com.c.c(377989578805733666L).get(this), var6);
                              com.c.c(633665384138343849L).setInt(com.c.c(377989578805733666L).get(this), com.c.c(564170828581134815L).getInt(null));
                           }

                           ((YB)com.c.c(377989578805733666L).get(this)).setVisible(false);
                        }

                        if (var2) {
                           break label123;
                        }
                     }

                     var29 = var4.getClass();
                     if (!var2) {
                        break label145;
                     }

                     var23 = var29.equals(tf_4.class);
                  }

                  if (!var23) {
                     break label123;
                  }

                  Object var30 = com.c.c(210562214105886716L).get(com.c.c(377989578805733666L).get(this));
                  Object[] var47 = com.c.a(var3);
                  var10003 = com.c.d(303488344973038628L);
                  var10002 = var47;
                  Object var48 = var30;
                  Method var31 = var10003;

                  try {
                     var29 = var31.invoke(var48, var10002);
                  } catch (InvocationTargetException var12) {
                     throw var12.getTargetException();
                  }
               }

               tf_4 var16 = (tf_4)var29;
               Object[] var49 = com.c.f();
               var10003 = com.c.d(498856411508641826L);
               var10002 = var49;
               tf_4 var50 = var16;
               Method var32 = var10003;

               try {
                  var33 = (String)var32.invoke(var50, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               String var17 = var33;
               File var18 = new File(var17);
               Object[] var34 = com.c.f();
               Method var35 = com.c.d(454647487873911743L);
               var10002 = var34;
               Object var52 = null;

               try {
                  var36 = (Boolean)var35.invoke(var52, var10002);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               if (var2) {
                  if (!var36) {
                     break label123;
                  }

                  Object[] var37 = com.c.a(var18);
                  Method var38 = com.c.d(401544505347980134L);
                  var10002 = var37;
                  Object var54 = null;

                  try {
                     var36 = (Boolean)var38.invoke(var54, var10002);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }
               }

               if (var36) {
                  com.c.c(518641299092321834L).set(com.c.c(377989578805733666L).get(this), var17);
                  com.c.c(633665384138343849L).setInt(com.c.c(377989578805733666L).get(this), com.c.c(564170828581134815L).getInt(null));
                  ((YB)com.c.c(377989578805733666L).get(this)).setVisible(false);
               }
            }

            if (var2) {
               return;
            }
         }

         var19 = this;
      }

      Object var39 = com.c.c(377989578805733666L).get(var19);
      Object[] var55 = com.c.f();
      Method var70 = com.c.d(190925019033578435L);
      Object[] var65 = var55;
      Object var56 = var39;
      Method var40 = var70;

      try {
         var40.invoke(var56, var65);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





